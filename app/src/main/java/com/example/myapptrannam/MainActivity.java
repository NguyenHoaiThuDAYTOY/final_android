package com.example.myapptrannam;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import com.huawei.hmf.tasks.Task;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.support.account.AccountAuthManager;
import com.huawei.hms.support.account.request.AccountAuthParams;
import com.huawei.hms.support.account.request.AccountAuthParamsHelper;
import com.huawei.hms.support.account.result.AuthAccount;
import com.huawei.hms.support.account.service.AccountAuthService;



public class MainActivity extends AppCompatActivity{
    EditText edtusername, edtpassword;
    Button btnsignin;
    TextView creataccount;
    String ten, matkhau;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        ControlButton();
    }

    private void ControlButton() {
        creataccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setCancelable(false);
                dialog.setContentView(R.layout.signup_ui);
                EditText edtusernamesignup = dialog.findViewById(R.id.edtusernamesignup);
                EditText btnemailsigup = dialog.findViewById(R.id.btnemailsigup);
                EditText edtpasswordsignup = dialog.findViewById(R.id.edtpasswordsignup);
                EditText edtconfirmpasswordsignup = dialog.findViewById(R.id.edtconfirmpasswordsignup);
                Button btnsignup = dialog.findViewById(R.id.btnsignup);
                TextView gotosignin = dialog.findViewById(R.id.gotosignin);
                btnsignup.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ten = edtusernamesignup.getText().toString().trim();
                        matkhau = edtpasswordsignup.getText().toString().trim();

                        edtusername.setText(ten);
                        edtpassword.setText(matkhau);

                        dialog.cancel();
                    }
                });
                gotosignin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.cancel();
                    }
                });
                dialog.show();
            }
        });

        btnsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtusername.getText().length() != 0 && edtpassword.getText().length() != 0){
                    if (edtusername.getText().toString().equals(ten) && edtpassword.getText().toString().equals(matkhau)){
                        Toast.makeText(MainActivity.this, "Bạn đã đăng nhập thành công", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, MainContentActivity.class);
                        startActivity(intent);
                    } else if(edtusername.getText().toString().equals("Hoai Thu") && edtpassword.getText().toString().equals("1005")){
                        Toast.makeText(MainActivity.this, "Bạn đã đăng nhập thành công", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, MainContentActivity.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(MainActivity.this, "Đăng nhập thất bại", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(MainActivity.this, "Mời bạn nhập đủ thông tin", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void Anhxa() {
        edtusername = findViewById(R.id.edtusername);
        edtpassword = findViewById(R.id.edtpassword);
        btnsignin = findViewById(R.id.btnsignin);
        creataccount = findViewById(R.id.creataccount);

    }

}