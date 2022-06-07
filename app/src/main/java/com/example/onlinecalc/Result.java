package com.example.onlinecalc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Button;

import java.util.ArrayList;

public class Result extends AppCompatActivity {

    ArrayList<Model> items = new ArrayList<>();
    Button homeBtn;
    Button indexBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(android.R.color.holo_green_dark)));

        setData();
        RecyclerView recyclerView = findViewById(R.id.recycleView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, items);
        recyclerView.setAdapter(adapter);

        homeBtn = findViewById(R.id.homeBtn);
        indexBtn = findViewById(R.id.indexBtn);
        homeBtn.setOnClickListener(view -> {
            Intent intent = new Intent(Result.this, MainActivity.class);
            startActivity(intent);
        });
        indexBtn.setOnClickListener(view -> {
            Intent intent = new Intent(Result.this, Index.class);
            startActivity(intent);
        });
    }

    private void setData() {
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(Result.this);
        items.add(new Model("Индекс массы тела (кг/м2)", pref.getString("one","")));
        items.add(new Model("Уровень двигательный активности (число шагов в сутки)", pref.getString("two","")));
        items.add(new Model("Коэффициент выносливости (усл. ед.)", pref.getString("three","")));
        items.add(new Model("Уровень регуляции сердечно-сосудистой системы (усл. ед.)", pref.getString("four","")));
        items.add(new Model("Жизненный индекс (мл/кг)", pref.getString("five","")));
        items.add(new Model("Циркулярно-респираторный коэффициент Скибински (усл. ед.)", pref.getString("six","")));
        items.add(new Model("Вегетативный индекс Кердо (усл. ед)", pref.getString("seven","")));
        items.add(new Model("Индекс функциональных изменений", pref.getString("eight","")));
    }
}