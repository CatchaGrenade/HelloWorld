package com.example.helloworld;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

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
        setContentView(R.layout.b_0005);
        bt = (Button)findViewById(R.id.bt);
        rg = (RadioGroup)findViewById(R.id.rg);
        bt.setOnClickListener(new View.OnClickListener(){
                                  @Override
                                  public void onClick(View v){
                                      for(int i = 0;i<rg.getChildCount();i++){
                                          RadioButton radioButton = (RadioButton)rg.getChildAt(i);
                                          if(radioButton.isChecked()){
                                              if(radioButton.getText().equals("B:100")){
                                                  Toast.makeText(MainActivity.this,"回答正确",Toast.LENGTH_LONG).show();
                                              }else{
                                                  AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                                                  builder.setMessage("回答错误，下面请看解析：当张山换完零钱之后，" +
                                                          "给了顾客75还有价值25元的商品，自己还剩下了25元。这时，" +
                                                          "李石来找张山要钱，张山把自己剩下的相当于是李石的25元给了李石，" +
                                                          "另外自己掏了75元。这样张山赔了一个25元的商品和75元的人民币，" +
                                                          "总共价值100元。");
                                                  builder.setPositiveButton("确定",null).show();
                                              }
                                              break;
                                          }
                                      }
                                  }
                              }

        );
        //---------------end-----------------------

    }
}