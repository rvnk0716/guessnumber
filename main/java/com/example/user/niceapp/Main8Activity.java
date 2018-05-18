package com.example.user.niceapp;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main8Activity extends AppCompatActivity {
    TextView textView16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        textView16=(TextView)findViewById(R.id. textView16);
        Bundle result = this.getIntent().getExtras();
        String resultA = result.getString("spinner");
        Bundle PP = this.getIntent().getExtras();
        String PPA = PP.getString("editText3");
        Bundle food = this.getIntent().getExtras();
        String foodA = food.getString("food");
        Bundle totlamoney = this.getIntent().getExtras();
        String totlamoneyA = totlamoney.getString("totlamoney");
        Bundle movie = this.getIntent().getExtras();
        String movieA = movie.getString("movie");

        textView16.setText("你選的電影是是:"+movieA+"\n" +"你選的電影是是:"+resultA+"\n" +"電影票是"+PPA+"元"+"\n" +foodA+"\n"+"總共是"+totlamoneyA+"元" );


    }
}
