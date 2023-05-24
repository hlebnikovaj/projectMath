package com.example.projectmath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Здесь нужно выполнить переход на следующую активность:
                Intent intent = new Intent(SecondActivity.this, DifficultyActivity.class);
                startActivity(intent);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Здесь нужно выполнить переход на следующую активность:
                Intent intent = new Intent(SecondActivity.this, DifficultyActivity.class);
                startActivity(intent);
            }
        });
    }
}

