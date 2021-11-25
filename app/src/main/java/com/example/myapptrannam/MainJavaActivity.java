package com.example.myapptrannam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapptrannam.R;

public class MainJavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_main);
        Button button = findViewById(R.id.quizJava);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainJavaActivity.this, "Start Quiz", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainJavaActivity.this, JavaQuiz.class);
                startActivity(intent);
            }
        });
    }

}

