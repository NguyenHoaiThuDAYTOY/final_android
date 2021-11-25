package com.example.myapptrannam;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;
import android.view.MenuInflater;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class MainContentActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main_ui);
        initView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.ex_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.dangxuat:
                Toast.makeText(this, "Đã đăng xuất", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(MainContentActivity.this, MainActivity.class);
                startActivity(intent1);
                return  true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void initView() {
        TextView btnGoToJS = findViewById(R.id.js);
        btnGoToJS.setOnClickListener(this);
        TextView btnGoToJava = findViewById(R.id.java);
        btnGoToJava.setOnClickListener(this);
        TextView btnGoToCcc = findViewById(R.id.ccc);
        btnGoToCcc.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.js:
                Toast.makeText(this, "Open JavaScript", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(MainContentActivity.this, MainJsActivity.class);
                startActivity(intent2);
                break;
            case R.id.ccc:
                Toast.makeText(this, "Open C++", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(MainContentActivity.this, MainCccActivity.class);
                startActivity(intent3);
                break;
            case R.id.java:
                Toast.makeText(this, "Open Java", Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(MainContentActivity.this, MainJavaActivity.class);
                startActivity(intent4);
                break;
            default:
                break;
        }
    }
}
