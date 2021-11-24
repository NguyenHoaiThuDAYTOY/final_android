package com.example.myapptrannam;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapptrannam.MainActivity;
import com.example.myapptrannam.R;

;


public class SignUpActivity  extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_ui);
        initView();

    }

    public void onClick(View view){
        switch (view.getId()) {
            case R.id.gotosignin:
                Intent intent = new Intent();
                intent.setClass(this, MainActivity.class);
                startActivity(intent);
                break;

            default:
                break;
        }
    }

    private void initView() {
        TextView GoToSignIn = findViewById(R.id.gotosignin);
        GoToSignIn.setOnClickListener(this);
    }



}
