package com.example.userlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button btn0,btn1;
    TextView text0,text1,text2;
    EditText edittext1,edittext2;
    ImageView imgv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgv1=(ImageView)findViewById((R.id.imgv1));
        imgv1.setImageResource(R.drawable.cat);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        text0 = (TextView) findViewById(R.id.text0) ;
        text1 = (TextView) findViewById(R.id.text1) ;
        text2= (TextView) findViewById(R.id.text2) ;
        edittext1=(EditText)findViewById((R.id.edittext1));
        edittext2=(EditText)findViewById((R.id.edittext2));
    }
}
