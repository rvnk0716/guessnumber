package com.example.user.niceapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class Main7Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinner2;
    Button btn21;
    CheckBox checkBox, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6;
    RadioButton radioButton7, radioButton8, radioButton9;
    RadioGroup rg1;
    EditText editText3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        btn21 = (Button) findViewById(R.id.button21);
        editText3=(EditText) findViewById(R.id. editText3);
        radioButton7 = (RadioButton) findViewById(R.id.radioButton7);
        radioButton8 = (RadioButton) findViewById(R.id.radioButton8);
        radioButton9 = (RadioButton) findViewById(R.id.radioButton9);
        rg1 = (RadioGroup) findViewById(R.id.rg1);
        addListenerOnChk();
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        btn21.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Main7Activity.this, Main8Activity.class);
                Bundle bundle = new Bundle();
                bundle.putString("spinner", spinner2.getSelectedItem().toString());
                String ed_text = editText3.getText().toString().trim();
                double w=Double.parseDouble((editText3.getText().toString()));
                double money;
                money=w*200;
                bundle.putString("editText3", String.valueOf(money));
                double foodmoney=0;
                double totlamoney=0;
                String temp = "你點了：";
                if (checkBox.isChecked()) {
                    temp += checkBox.getText().toString();
                    foodmoney+=20;
                }
                if (checkBox2.isChecked()) {
                    temp += " , ";
                    temp += checkBox2.getText().toString();
                    foodmoney+=20;
                }
                if (checkBox3.isChecked()) {
                    temp += " , ";
                    temp += checkBox3.getText().toString();
                    foodmoney+=20;
                }
                if (checkBox4.isChecked()) {
                    temp += " , ";
                    temp += checkBox4.getText().toString();
                    foodmoney+=40;
                }
                if (checkBox5.isChecked()) {
                    temp += " , ";
                    temp += checkBox5.getText().toString();
                    foodmoney+=35;
                }
                if (checkBox6.isChecked()) {
                    temp += " , ";
                    temp += checkBox6.getText().toString();
                    foodmoney+=40;
                }
                bundle.putString("food", temp);
                totlamoney=foodmoney+money;
                bundle.putString("totlamoney", String.valueOf(totlamoney));

                if (radioButton7.isChecked()){
                    String movie = "你選的影城是東南亞秀泰影城";
                    movie=radioButton7.getText().toString();
                    bundle.putString("movie", movie);
                }
                if (radioButton8.isChecked()){
                    String movie = "你選的影城是百老匯影城";
                    movie=radioButton8.getText().toString();
                    bundle.putString("movie", movie);
                }
                if (radioButton9.isChecked()){
                    String movie = "你選的影城是信義威秀影城";
                    movie=radioButton9.getText().toString();
                    bundle.putString("movie", movie);
                }

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void addListenerOnChk() {
        checkBox = (CheckBox) findViewById(R.id.checkBox);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        checkBox5 = (CheckBox) findViewById(R.id.checkBox5);
        checkBox6 = (CheckBox) findViewById(R.id.checkBox6);

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (((CheckBox) v).isChecked()) {

                    Toast.makeText(Main7Activity.this,
                            "你點了可樂$20", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Main7Activity.this,
                            "你取消了可樂$20", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (((CheckBox) v).isChecked()) {

                    Toast.makeText(Main7Activity.this,
                            "你點了雪碧$20", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Main7Activity.this,
                            "你取消了雪碧$20", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(Main7Activity.this,
                            "你點了檸檬紅茶$20", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Main7Activity.this,
                            "你取消了檸檬紅茶$20", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(Main7Activity.this,
                            "你點了熱狗$40", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Main7Activity.this,
                            "你取消了熱狗$40", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBox5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(Main7Activity.this,
                            "你點了爆米花$35", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Main7Activity.this,
                            "你取消了爆米花$35", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBox6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(Main7Activity.this,
                            "你點了吉拿棒$40", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Main7Activity.this,
                            "你取消了吉拿棒$40", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}






