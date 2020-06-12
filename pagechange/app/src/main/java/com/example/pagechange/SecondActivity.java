package com.example.pagechange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn2;
    String usrname,usrpwd;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent it1=getIntent();
        usrname=it1.getStringExtra("用户名");
        usrpwd=it1.getStringExtra("密码");
        txt=(TextView)findViewById(R.id.txt);
        txt.setText(txt.getText()+"\n用户名:"+usrname+"\n用户密码："+usrpwd);
        btn2=(Button)findViewById(R.id.btnend);
        btn2.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        finish();//结束activity
    }
}
