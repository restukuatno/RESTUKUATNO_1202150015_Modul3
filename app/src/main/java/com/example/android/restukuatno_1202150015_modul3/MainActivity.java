package com.example.android.restukuatno_1202150015_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public TextView mUser, mPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUser = (TextView)findViewById(R.id.textUsername);
        mPass = (TextView)findViewById(R.id.textPassword);
    }

    public void loginCheck(){
        String strUser,strPass;
        strUser = mUser.getText().toString();
        strPass = mPass.getText().toString();
        if(!(strUser.equals("EAD") && strPass.equals("MOBILE"))){
            Toast.makeText(this,"Username / Password Anda Salah",Toast.LENGTH_SHORT).show();
            return;
        }else{
            Toast.makeText(this,"Anda Berhasil Login",Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this,DaftarMenu.class));
        }
    }

    public void login(View v){
        loginCheck();
    }
}
