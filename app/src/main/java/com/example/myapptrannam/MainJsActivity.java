package com.example.myapptrannam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapptrannam.R;

public class MainJsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.js_main);
        Button button = findViewById(R.id.quizJs);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainJsActivity.this, "Start Quiz", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainJsActivity.this, JsQuiz.class);
                startActivity(intent);
            }
        });
    }

}

