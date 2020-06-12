package com.example.pagechange;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1;
    EditText name1,pwd1;
    //String strname,strpwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.btnchange);
        name1=(EditText)findViewById(R.id.username) ;
        pwd1=(EditText)findViewById((R.id.userpwd)) ;
        //strname=name1.getText().toString();
        //strpwd=pwd1.getText().toString();
        btn1.setOnClickListener(this);//注册监听
    }
    public void onClick(View V)
    {
        Intent intent=new Intent(this,SecondActivity.class);
        intent.putExtra("用户名",name1.getText().toString());
        intent.putExtra("密码",pwd1.getText().toString());
        startActivity(intent);//启动activity
    }

}
