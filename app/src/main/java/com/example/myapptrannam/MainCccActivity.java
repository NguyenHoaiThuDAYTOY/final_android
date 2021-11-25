package com.example.myapptrannam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapptrannam.R;

public class MainCccActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ccc_main);
        Button button = findViewById(R.id.quizC);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainCccActivity.this, "Start Quiz", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainCccActivity.this, CQuiz.class);
                startActivity(intent);
            }
        });
    }

}

