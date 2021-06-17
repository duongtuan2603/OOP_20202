package com.example.oop_20202.ui.activitites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.oop_20202.R;
import com.example.oop_20202.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {
    ActivityLoginBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);
mBinding.viewConfirmLogin.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if (mBinding.edtusername.getText().toString().equals("duongmanhtuan")&&mBinding.edtpassword.getText().toString().equals("123456")){
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }
});

    }
}