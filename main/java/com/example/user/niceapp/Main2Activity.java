package com.example.user.niceapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    EditText edt1;
    EditText edt2;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        edt1 = (EditText) findViewById(R.id.edt1);
        edt2 = (EditText) findViewById(R.id.edt2);
        tv1 = (TextView) findViewById(R.id.tv1);
        btn1 = (Button) findViewById(R.id.button10);
        btn2 = (Button) findViewById(R.id.button11);
        btn3 = (Button) findViewById(R.id.button12);
        btn4 = (Button) findViewById(R.id.button13);
        btn5 = (Button) findViewById(R.id.button14);
        btn6 = (Button) findViewById(R.id.button);
        btn1.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View v) {
                String a=edt1.getText().toString();
                String b=edt2.getText().toString();
                int aa=Integer.parseInt(a);
                int bb=Integer.parseInt(b);
                int c=aa+bb;
                tv1.setText("等於:"+c);
            }

        });
        btn2.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View v) {
                String a=edt1.getText().toString();
                String b=edt2.getText().toString();
                int aa=Integer.parseInt(a);
                int bb=Integer.parseInt(b);
                int c=aa-bb;
                tv1.setText("等於:"+c);
            }

        });
        btn3.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View v) {
                String a=edt1.getText().toString();
                String b=edt2.getText().toString();
                int aa=Integer.parseInt(a);
                int bb=Integer.parseInt(b);
                int c=aa*bb;
                tv1.setText("等於:"+c);
            }

        });
        btn4.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View v) {
                String a=edt1.getText().toString();
                String b=edt2.getText().toString();
                int aa=Integer.parseInt(a);
                int bb=Integer.parseInt(b);
                int c=aa/bb;
                tv1.setText("等於:"+c);
            }

        });
        btn5.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View v) {
                edt1.setText("");
                edt2.setText("");
                tv1.setText("等於:");

            }

        });
        btn6.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Main2Activity.this, MainActivity.class);
                startActivity(intent);
                Main2Activity.this.finish();
            }

        });

    }
}
