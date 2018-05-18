package com.example.user.niceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Main6Activity extends AppCompatActivity {
    Button btn;
    Button btn1;
    Button btn2;
    Button btn3;
    TextView tv3;
    TextView tv4;
    int number,numberguess,tries;
    Random r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        r=new Random();
        numberguess=r.nextInt(51);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        btn = (Button) findViewById(R.id.button17);
        btn1 = (Button) findViewById(R.id.button15);
        btn2 = (Button) findViewById(R.id.button16);
        btn3 = (Button) findViewById(R.id.button18);
        number=0;
        tries=0;
        tv3.setText(""+number);
        btn1.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v) {
                         if(number<50){
    number++;
}
                tv3.setText(""+number);
            }
        });
        btn2.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View v) {
                if(number>0){
                    number--;
                }
                tv3.setText(""+number);
            }

        });
        btn3.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View v) {
                if(number==numberguess){
                    tv4.setText("恭喜你猜對了!!   共猜了"+tries+"次");
                    btn1.setEnabled(false);
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                }else if(number<numberguess){
                    tv4.setText("再大一點!!");
                    tries++;
                }else if(number>numberguess){
                    tv4.setText("再小一點!!");
                    tries++;
                }

            }

        });


        btn.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Main6Activity.this, MainActivity.class);
                startActivity(intent);
                Main6Activity.this.finish();
            }

        });
    }
}
