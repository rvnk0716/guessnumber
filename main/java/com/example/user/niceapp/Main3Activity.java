package com.example.user.niceapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Button btn,btn19;
    TextView tv7;
    String A[]={"您選擇的是體育新聞","您選擇的是娛樂新聞","您選擇的是財金新聞","您選擇的是社會新聞","您選擇的是國際新聞"};
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tv7=(TextView)findViewById(R.id.tv7) ;
        btn = (Button) findViewById(R.id.button7);
        btn19 = (Button) findViewById(R.id.button19);
        spinner=(Spinner)findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);
        btn.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Main3Activity.this, MainActivity.class);
                startActivity(intent);
                Main3Activity.this.finish();
            }

        });
    }


    public void abc(View v) {
        int position=spinner.getSelectedItemPosition();
        switch (position)
        {
            case 0:
                Uri myUri = Uri.parse("http://www.appledaily.com.tw/appledaily/article/sports");
                Intent A = new Intent(Intent.ACTION_VIEW, myUri);
                startActivity(A);
                break;
            case 1:
                Uri myUri1 = Uri.parse("http://ent.appledaily.com.tw/enews/headline");
                Intent B = new Intent(Intent.ACTION_VIEW, myUri1);
                startActivity(B);
                break;
            case 2:
                Uri myUri2 = Uri.parse("http://www.appledaily.com.tw/appledaily/article/finance");
                Intent C = new Intent(Intent.ACTION_VIEW, myUri2);
                startActivity(C);
                break;
            case 3:
                Uri myUri3 = Uri.parse("http://www.appledaily.com.tw/appledaily/article/headline");
                Intent D = new Intent(Intent.ACTION_VIEW, myUri3);
                startActivity(D);
                break;
            case 4:
                Uri myUri4 = Uri.parse("http://ent.appledaily.com.tw/enews/international");
                Intent E = new Intent(Intent.ACTION_VIEW, myUri4);
                startActivity(E);
                break;
        }
    }





    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        int select=spinner.getSelectedItemPosition();
        tv7.setText(String.valueOf(A[select]));


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
