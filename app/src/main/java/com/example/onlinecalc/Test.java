package com.example.onlinecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Test extends AppCompatActivity {

    LinearLayout ll;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    EditText editText1;
    EditText editText2;
    EditText editText3;
    EditText editText4;
    EditText editText5;
    EditText editText6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Bundle argument = getIntent().getExtras();
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(android.R.color.holo_green_dark)));
        if (argument.get("test").toString().equals("1")) {
            ll = findViewById(R.id.l1);
            editText1 = findViewById(R.id.editF1);
            editText2 = findViewById(R.id.editF2);
            getSupportActionBar().setTitle("Индекс массы тела (кг/м2)");
        }
        if (argument.get("test").toString().equals("2")) {
            ll = findViewById(R.id.l2);
            editText1 = findViewById(R.id.editS1);
            getSupportActionBar().setTitle("Уровень двигательный активности (число шагов в сутки)");
        }
        if (argument.get("test").toString().equals("3")) {
            ll = findViewById(R.id.l3);
            editText1 = findViewById(R.id.editT1);
            editText2 = findViewById(R.id.editT2);
            editText3 = findViewById(R.id.editT3);
            getSupportActionBar().setTitle("Коэффициент выносливости (усл. ед.)");
        }
        if (argument.get("test").toString().equals("4")) {
            ll = findViewById(R.id.l4);
            editText1 = findViewById(R.id.editFo1);
            editText2 = findViewById(R.id.editFo2);
            getSupportActionBar().setTitle("Уровень регуляции сердечно-сосудистой системы (усл. ед.)");
        }
        if (argument.get("test").toString().equals("5")) {
            ll = findViewById(R.id.l5);
            editText1 = findViewById(R.id.editFi1);
            editText2 = findViewById(R.id.editFi2);
            getSupportActionBar().setTitle("Жизненный индекс (мл/кг)");
        }
        if (argument.get("test").toString().equals("6")) {
            ll = findViewById(R.id.l6);
            editText1 = findViewById(R.id.editSi1);
            editText2 = findViewById(R.id.editSi2);
            editText3 = findViewById(R.id.editSi3);
            getSupportActionBar().setTitle("Циркулярно-респираторный коэффициент Скибински (усл. ед.)");
        }
        if (argument.get("test").toString().equals("7")) {
            ll = findViewById(R.id.l7);
            editText1 = findViewById(R.id.editSe1);
            editText2 = findViewById(R.id.editSe2);
            getSupportActionBar().setTitle("Вегетативный индекс Кердо (усл. ед)");
        }
        if (argument.get("test").toString().equals("8")) {
            ll = findViewById(R.id.l8);
            editText1 = findViewById(R.id.editE1);
            editText2 = findViewById(R.id.editE2);
            editText3 = findViewById(R.id.editE3);
            editText4 = findViewById(R.id.editE4);
            editText5 = findViewById(R.id.editE5);
            editText6 = findViewById(R.id.editE6);
            getSupportActionBar().setTitle("Индекс функциональных изменений");
        }

        ll.setVisibility(View.VISIBLE);
        btn1 = findViewById(R.id.Btn1);
        btn2 = findViewById(R.id.Btn2);
        btn3 = findViewById(R.id.Btn3);
        btn4 = findViewById(R.id.Btn4);
        btn5 = findViewById(R.id.Btn5);
        btn6 = findViewById(R.id.Btn6);
        btn7 = findViewById(R.id.Btn7);
        btn8 = findViewById(R.id.Btn8);


        btn1.setOnClickListener(view -> {
            if (!editText1.getText().toString().equals("") && !editText2.getText().toString().equals("")) {
                Intent intent = new Intent(Test.this, EndTest.class);
                int rezult = 0;
                try {
                    rezult = (int) (Double.parseDouble(editText2.getText().toString()) / Math.pow(Double.parseDouble(editText1.getText().toString()) / 100, 2));
                }catch (Exception ignored){}
                intent.putExtra("test", String.valueOf(argument.get("test")));
                intent.putExtra("rezult", String.valueOf(rezult));
                intent.putExtra("all", Boolean.valueOf(argument.get("all").toString()));
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(view -> {
            if (!editText1.getText().toString().equals("")) {
                Intent intent = new Intent(Test.this, EndTest.class);
                int rezult = 0;
                try{
                rezult = Integer.parseInt(editText1.getText().toString());
                }catch (Exception ignored){}
                intent.putExtra("test", String.valueOf(argument.get("test")));
                intent.putExtra("rezult", String.valueOf(rezult));
                intent.putExtra("all", Boolean.valueOf(argument.get("all").toString()));
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(view -> {
            if (!editText1.getText().toString().equals("") && !editText2.getText().toString().equals("") && !editText3.getText().toString().equals("")) {
                Intent intent = new Intent(Test.this, EndTest.class);
                int rezult = 0;
                try{
                rezult = (Integer.parseInt(editText1.getText().toString())*10)/(Integer.parseInt(editText2.getText().toString())-Integer.parseInt(editText3.getText().toString()));
                }catch (Exception ignored){}
                intent.putExtra("test", argument.get("test").toString());
                intent.putExtra("rezult", String.valueOf(rezult));
                intent.putExtra("all", Boolean.valueOf(argument.get("all").toString()));
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(view -> {
            if (!editText1.getText().toString().equals("") && !editText2.getText().toString().equals("")) {
                Intent intent = new Intent(Test.this, EndTest.class);
                int rezult = 0;
                try{
                rezult = (Integer.parseInt(editText1.getText().toString())*Integer.parseInt(editText2.getText().toString()))/100;
                }catch (Exception ignored){}
                intent.putExtra("test", argument.get("test").toString());
                intent.putExtra("rezult", String.valueOf(rezult));
                intent.putExtra("all", Boolean.valueOf(argument.get("all").toString()));
                startActivity(intent);
            }
        });

        btn5.setOnClickListener(view -> {
            if (!editText1.getText().toString().equals("") && !editText2.getText().toString().equals("")) {
                Intent intent = new Intent(Test.this, EndTest.class);
                int rezult = 0;
                try{
                rezult = Integer.parseInt(editText1.getText().toString())/Integer.parseInt(editText2.getText().toString());
                }catch (Exception ignored){}
                intent.putExtra("test", argument.get("test").toString());
                intent.putExtra("rezult", String.valueOf(rezult));
                intent.putExtra("all", Boolean.valueOf(argument.get("all").toString()));
                startActivity(intent);
            }
        });

        btn6.setOnClickListener(view -> {
            if (!editText1.getText().toString().equals("") && !editText2.getText().toString().equals("") && !editText3.getText().toString().equals("")) {
                Intent intent = new Intent(Test.this, EndTest.class);
                int rezult = 0;
                try{
                rezult = (Integer.parseInt(editText1.getText().toString())/100*Integer.parseInt(editText2.getText().toString()))/Integer.parseInt(editText3.getText().toString());
                }catch (Exception ignored){}
                intent.putExtra("test", argument.get("test").toString());
                intent.putExtra("rezult", String.valueOf(rezult));
                intent.putExtra("all", Boolean.valueOf(argument.get("all").toString()));
                startActivity(intent);
            }
        });

        btn7.setOnClickListener(view -> {
            if (!editText1.getText().toString().equals("") && !editText2.getText().toString().equals("")) {
                Intent intent = new Intent(Test.this, EndTest.class);
                double rezult = 0;
                try{
                rezult = 100*(1-(Double.parseDouble(editText1.getText().toString())/Double.parseDouble(editText2.getText().toString())));
                }catch (Exception ignored){}
                intent.putExtra("test", argument.get("test").toString());
                intent.putExtra("rezult", String.valueOf(rezult));
                intent.putExtra("all", Boolean.valueOf(argument.get("all").toString()));
                startActivity(intent);
            }
        });

        btn8.setOnClickListener(view -> {
            if (!editText1.getText().toString().equals("") && !editText2.getText().toString().equals("") && !editText3.getText().toString().equals("")
                    && !editText4.getText().toString().equals("") && !editText5.getText().toString().equals("")&&!editText6.getText().toString().equals("")) {
                Intent intent = new Intent(Test.this, EndTest.class);
                String rezult = "0";
                try{
                rezult = String.valueOf(0.011*Double.parseDouble(editText1.getText().toString())+0.014*Double.parseDouble(editText2.getText().toString())+0.008*Double.parseDouble(editText3.getText().toString())+0.014*Double.parseDouble(editText6.getText().toString())+0.009*Double.parseDouble(editText4.getText().toString())-0.009*Double.parseDouble(editText5.getText().toString())-0.27);
                }catch (Exception ignored){}
                intent.putExtra("test", argument.get("test").toString());
                intent.putExtra("rezult", rezult);
                intent.putExtra("all", Boolean.valueOf(argument.get("all").toString()));
                startActivity(intent);
            }
        });
    }
}