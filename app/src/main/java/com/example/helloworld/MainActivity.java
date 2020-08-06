package com.example.helloworld;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Layout;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Chronometer;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    public TextView textView1;
    private ImageView[] img = new ImageView[12];
    private int[] imagePath = new int[]{
            R.mipmap.bg,R.mipmap.bg,R.mipmap.bg,R.mipmap.bg
            ,R.mipmap.bg,R.mipmap.bg,R.mipmap.bg,R.mipmap.bg
            ,R.mipmap.bg,R.mipmap.bg,R.mipmap.bg,R.mipmap.bg
    };
    Button bt;
    RadioGroup rg;
    Button btn_login;        //定义登录按钮
    Button btn_exit;        //定义取消按钮
    CheckBox checkBox1, checkBox2, checkBox3;   //定义复选框
    int year,month,day;     //定义年，月，日
    DatePicker datePicker;           //定义日期选择器
    TimePicker timePicker;            //定义时间选择器
    int hour,minute;                  //定义小时和分
    Chronometer ch;          //定义计时器

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //---------------虽然灵活，但不推荐完全在代码内进行布局控制，应结合xml使用-Start
//        FrameLayout frameLayout = new FrameLayout(this);
//        frameLayout.setBackgroundResource(R.mipmap.bg);
//        setContentView(frameLayout);
//
//        textView1 = new TextView(this);
//        textView1.setText("大威天龙");
//        textView1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
//        textView1.setTextColor(Color.rgb(17,85,114));
//
//        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(
//                ViewGroup.LayoutParams.WRAP_CONTENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT
//        );
//        params.gravity = Gravity.CENTER;
//        textView1.setLayoutParams(params);
//
//        textView1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                new AlertDialog.Builder(MainActivity.this).setTitle("系统提示") //设置提示框标题
//                .setMessage("游戏有风险，进入需谨慎")//设置对话框显示的内容
//                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        Log.i("大大大","进入");//输出消息日志
//                    }
//                }).setNegativeButton("退出", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        Log.i("小小小","退出");
////                        finish();//结束,会退出程序
//                    }
//                }).show();
//            }
//        });
//        frameLayout.addView(textView1);
        //---------------虽然灵活，但不推荐完全在代码内进行布局控制，应结合xml使用-End

        //---------------start-----------------------
//        setContentView(R.layout.activity_main);
//        //得到按钮实例
//        Button helloBtn = (Button)findViewById(R.id.hellobutton);
//        //设置监听按钮点击事件
//        helloBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //得到TextView实例
//                TextView helot = (TextView)findViewById(R.id.hellotextView);
////                //弹出Toast提示按钮被点击了
//                Toast.makeText(MainActivity.this,"被点击了",Toast.LENGTH_SHORT).show();
////                读取strings.xml定义的interact_message信息并写到TextView上
//                helot.setText(R.string.interact_message);
//            }
//        });
        //---------------end-----------------------

        //---------------start-----------------------
//        setContentView(R.layout.a_0002);
//        GridLayout layout = (GridLayout)findViewById(R.id.layout);
//        for(int i = 0 ; i <imagePath.length; i ++){
//            img[i] = new ImageView(MainActivity.this);
//            img[i].setImageResource(imagePath[i]);
//            img[i].setPadding(2,2,2,2);
//            ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(200,200);
//            img[i].setLayoutParams(params);
//            layout.addView(img[i]);
//        }
        //---------------end-----------------------

        //---------------start-----------------------
//        setContentView(R.layout.a_0003);
//        FrameLayout frameLayout=(FrameLayout)findViewById(R.id.mylayout);
//        final RabbitView rabbit = new RabbitView(this);
//        rabbit.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                rabbit.bitmapX=motionEvent.getX()-110;
//                rabbit.bitmapY=motionEvent.getY()-180;
//                rabbit.invalidate();
//                return true;
//            }
//        });
//        frameLayout.addView(rabbit);
        //---------------end-----------------------

        //---------------start-----------------------
//        setContentView(R.layout.b_0003);
//        Button button= (Button) findViewById(R.id.button1);   //通过ID获取布局按钮
//        //为按钮添加单击事件监听器
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this,"您已授权登录开心消消乐",Toast.LENGTH_SHORT).show();
//            }
//        });
        //---------------end-----------------------

        //---------------start-----------------------
//        setContentView(R.layout.b_0004);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN); //设置全屏显示
//        ImageButton st= (ImageButton) findViewById(R.id.start);      //通过ID获取布局开始游戏图片按钮
//        ImageButton sw = (ImageButton) findViewById(R.id.switch1);   //通过ID获取布局切换账号图片按钮
//        //为开始游戏图片按钮添加单击事件监听器
//        st.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this,"您单击了开始游戏按钮",Toast.LENGTH_SHORT).show();
//            }
//        });
//        //为切换账号图片按钮添加单击事件监听器
//        sw.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this,"您单击了切换账号按钮",Toast.LENGTH_SHORT).show();
//            }
//        });
        //---------------end-----------------------

        //---------------start-----------------------
//        setContentView(R.layout.b_0005);
//        bt = (Button)findViewById(R.id.bt);
//        rg = (RadioGroup)findViewById(R.id.rg);
//        bt.setOnClickListener(new View.OnClickListener(){
//                                  @Override
//                                  public void onClick(View v){
//                                      for(int i = 0;i<rg.getChildCount();i++){
//                                          RadioButton radioButton = (RadioButton)rg.getChildAt(i);
//                                          if(radioButton.isChecked()){
//                                              if(radioButton.getText().equals("B:100")){
//                                                  Toast.makeText(MainActivity.this,"回答正确",Toast.LENGTH_LONG).show();
//                                              }else{
//                                                  AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//                                                  builder.setMessage("回答错误，下面请看解析：当张山换完零钱之后，" +
//                                                          "给了顾客75还有价值25元的商品，自己还剩下了25元。这时，" +
//                                                          "李石来找张山要钱，张山把自己剩下的相当于是李石的25元给了李石，" +
//                                                          "另外自己掏了75元。这样张山赔了一个25元的商品和75元的人民币，" +
//                                                          "总共价值100元。");
//                                                  builder.setPositiveButton("确定",null).show();
//                                              }
//                                              break;
//                                          }
//                                      }
//                                  }
//                              }
//
//        );
        //---------------end-----------------------

        //---------------start-----------------------
//        setContentView(R.layout.b_0006);
//        btn_login = (Button) findViewById(R.id.btn_login);      //通过ID获取布局确认登录按钮
//        btn_exit = (Button) findViewById(R.id.btn_exit);      //通过ID获取布局确认取消按钮
//        checkBox1 = (CheckBox) findViewById(R.id.checkbox1);    //通过ID获取布局复选框1
//        checkBox2 = (CheckBox) findViewById(R.id.checkbox2);    //通过ID获取布局复选框2
//        checkBox3 = (CheckBox) findViewById(R.id.checkbox3);    //通过ID获取布局复选框3
//        btn_login.setOnClickListener(new View.OnClickListener() {   //为确认登录按钮
//            @Override
//            public void onClick(View v) {
//                String checked = "";           //保存选中的值
//                if (checkBox1.isChecked()) { //当第一个复选框被选中
//                    checked += checkBox1.getText().toString() ;  //输出第一个复选框内信息
//                }
//                if (checkBox2.isChecked()) { //当第二个复选框被选中
//                    checked += checkBox2.getText().toString() ;  //输出第二个复选框内信息
//                }
//                if (checkBox3.isChecked()) { //当第三个复选框被选中
//                    checked += checkBox3.getText().toString() ;  //输出第三个复选框内信息
//                }
//                //显示被选中复选框对应的信息
//                Toast.makeText(MainActivity.this, checked, Toast.LENGTH_LONG).show();
//            }
//        });
//        btn_exit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                finish();
//            }
//        });
        //---------------end-----------------------

        //---------------start-----------------------
//        setContentView(R.layout.b_0007);
//        datePicker= (DatePicker) findViewById(R.id.datePicker);    //通过ID获取布局日期选择器
//        Calendar calendar=Calendar.getInstance();
//        year=calendar.get(Calendar.YEAR);           //获取当前年
//        month=calendar.get(Calendar.MONTH)+1;         //获取当前月
//        day=calendar.get(Calendar.DAY_OF_MONTH);   //获取当前日
//        //初始化日期选择器，并且在初始化时指定监听器
//        datePicker.init(year, month, day, new DatePicker.OnDateChangedListener() {
//            @Override
//            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
//                MainActivity.this.year=year;            //改变年的参数
//                MainActivity.this.month=monthOfYear;    //改变月的参数
//                MainActivity.this.day=dayOfMonth;       //改变日的参数
//                show(year,monthOfYear,dayOfMonth);       //通过消息框显示日期
//            }
//        });
        //---------------end-----------------------

        //---------------start-----------------------
//        setContentView(R.layout.b_0008);
//        timePicker= (TimePicker) findViewById(R.id.timePicker);  //通过ID获取布局时间选择器
//        timePicker.setIs24HourView(true);                         //设置时间为24小时制
//        Calendar calendar=Calendar.getInstance();
//        hour=calendar.get(Calendar.HOUR_OF_DAY);                  //获取当前小时
//        minute=calendar.get(Calendar.MINUTE);
//        //为时间选择器设置监听器
//        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
//            @Override
//            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
//                MainActivity.this.hour=hourOfDay;          //改变小时后的参数
//                MainActivity.this.minute=minute;           //改变分钟后的参数
//                show(hourOfDay,minute);                     //通过消息框显示选择的时间
//            }
//
//            private void show(int hourOfDay, int minute) {
//                String str=hourOfDay+"时"+minute+"分";      //获取选择器设置的时间
//                Toast.makeText(MainActivity.this,str,Toast.LENGTH_SHORT).show();//显示消息提示框
//            }
//        });
        //---------------end-----------------------

        //---------------start-----------------------
        setContentView(R.layout.b_0009);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);    //设置全屏显示
        ch = (Chronometer) findViewById(R.id.ch);   //获取计时器组件
        ch.setBase(SystemClock.elapsedRealtime());  //设置起始时间
        ch.setFormat("%s");                         //设置显示时间格式
        ch.start();                                 //开启计时器
        //添加监听器
        ch.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                //判断时间计时达到60秒时
                if (SystemClock.elapsedRealtime() - ch.getBase() >= 60000) {
                    ch.stop();  //停止计时器
                }


            }
        });
        //---------------end-----------------------
    }
    private void show(int year, int monthOfYear, int dayOfMonth) {
        String str=year+"年"+monthOfYear+"月"+dayOfMonth+"日"; //获取选择器设置的日期
        Toast.makeText(MainActivity.this,str,Toast.LENGTH_SHORT).show(); //将选择的日期显示出来
    }
}