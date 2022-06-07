package com.example.onlinecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        btn = findViewById(R.id.btnP);

        btn.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Index.class);
            startActivity(intent);
        });
    }
}