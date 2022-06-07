package com.example.onlinecalc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.preference.PreferenceManager;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Index extends AppCompatActivity {

    public int numberTest = 0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button allBtn;
    Spinner spinner;
    Button homeBtn;
    Button resultbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        getSupportActionBar().hide();
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(android.R.color.holo_green_dark)));
        Bundle argument = getIntent().getExtras();
        btn1 = findViewById(R.id.Btn1);
        btn2 = findViewById(R.id.Btn2);
        btn3 = findViewById(R.id.Btn3);
        btn4 = findViewById(R.id.Btn4);
        btn5 = findViewById(R.id.Btn5);
        btn6 = findViewById(R.id.Btn6);
        btn7 = findViewById(R.id.Btn7);
        btn8 = findViewById(R.id.Btn8);
        allBtn = findViewById(R.id.AllBtn);
        spinner = findViewById(R.id.SpinnerAge);
        homeBtn = findViewById(R.id.homeBtn);
        resultbtn = findViewById(R.id.resultBtn);
        String [] data = {"16-28 лет","29-34 года","35-45 лет","45-55 лет","старше 55 лет"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, data);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        btn1.setOnClickListener(view -> {
                numberTest = 1;
                Intent intent = new Intent(Index.this, Test.class);
                intent.putExtra("test", numberTest);
                intent.putExtra("all", false);
                startActivity(intent);
        });
        btn2.setOnClickListener(view -> {
                numberTest = 2;
                Intent intent = new Intent(Index.this, Test.class);
                intent.putExtra("test", numberTest);
                intent.putExtra("all", false);
                startActivity(intent);
        });
        btn3.setOnClickListener(view -> {
                numberTest = 3;
                Intent intent = new Intent(Index.this, Test.class);
                intent.putExtra("test", numberTest);
                intent.putExtra("all", false);
                startActivity(intent);
        });
        btn4.setOnClickListener(view -> {
                numberTest = 4;
                Intent intent = new Intent(Index.this, Test.class);
                intent.putExtra("test", numberTest);
                intent.putExtra("all", false);
                startActivity(intent);
        });
        btn5.setOnClickListener(view -> {
                numberTest = 5;
                Intent intent = new Intent(Index.this, Test.class);
                intent.putExtra("test", numberTest);
                intent.putExtra("all", false);
                startActivity(intent);
        });
        btn6.setOnClickListener(view -> {
                numberTest = 6;
                Intent intent = new Intent(Index.this, Test.class);
                intent.putExtra("test", numberTest);
                intent.putExtra("all", false);
                startActivity(intent);
        });
        btn7.setOnClickListener(view -> {
                numberTest = 7;
                Intent intent = new Intent(Index.this, Test.class);
                intent.putExtra("test", numberTest);
                intent.putExtra("all", false);
                startActivity(intent);
        });
        btn8.setOnClickListener(view -> {
                numberTest = 8;
                Intent intent = new Intent(Index.this, Test.class);
                intent.putExtra("test", numberTest);
                intent.putExtra("all", false);
                startActivity(intent);
        });
        allBtn.setOnClickListener(view -> {
                numberTest = 1;
                Intent intent = new Intent(Index.this, Test.class);
                intent.putExtra("test", numberTest);
                intent.putExtra("all", true);
                startActivity(intent);
        });

        homeBtn.setOnClickListener(view -> {
            Intent intent = new Intent(Index.this, MainActivity.class);
            startActivity(intent);
        });
        resultbtn.setOnClickListener(view -> {
            Intent intent = new Intent(Index.this, Result.class);
            startActivity(intent);
        });
    }
}