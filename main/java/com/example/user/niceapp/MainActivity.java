package com.example.user.niceapp;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    private RelativeLayout mLayout;

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        menu.add(Menu.NONE, 11, 0, "換背景(藍色)");
        menu.add(Menu.NONE, 22, 0, "換背景(灰色)");
        menu.add(Menu.NONE, 33, 0, "換背景(白色)");
        menu.add(Menu.NONE, 44, 0, "換背景(黑色)");
        menu.add(Menu.NONE, 55, 0, "離開程式");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case 11:
                mLayout.setBackgroundColor(Color.BLUE);
                Toast.makeText(this,"成功換成藍色", Toast.LENGTH_SHORT).show();
                break;
            case 22:
                mLayout.setBackgroundColor(Color.GRAY);
                Toast.makeText(this,"成功換成灰色", Toast.LENGTH_SHORT).show();
                break;
            case 33:
                mLayout.setBackgroundColor(Color.WHITE);
                Toast.makeText(this,"成功換成白色", Toast.LENGTH_SHORT).show();
                break;
            case 44:
                mLayout.setBackgroundColor(Color.BLACK);
                Toast.makeText(this,"成功換成黑色", Toast.LENGTH_SHORT).show();
                break;
            case 55:
                finish();
                Toast.makeText(this,"謝謝使用!!!", Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.mLayout);
        mLayout = (RelativeLayout) findViewById(R.id.mLayout);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn1.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Main3Activity.class);
                startActivity(intent);
                MainActivity.this.finish();
            }

        });
        btn2.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Main7Activity.class);
                startActivity(intent);
                MainActivity.this.finish();
            }

        });
        btn3.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Main2Activity.class);
                startActivity(intent);
                MainActivity.this.finish();
            }

        });
        btn4.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Main5Activity.class);
                startActivity(intent);
                MainActivity.this.finish();
            }

        });
        btn5.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View v) {
                Uri myUri = Uri.parse("http://www.shu.edu.tw");
                Intent A = new Intent(Intent.ACTION_VIEW, myUri);
                startActivity(A);
        }

        });
        btn6.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Main6Activity.class);
                startActivity(intent);
                MainActivity.this.finish();
            }

        });



    }
}
