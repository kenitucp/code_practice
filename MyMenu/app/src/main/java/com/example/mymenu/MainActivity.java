package com.example.mymenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn0;
    TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=(TextView) findViewById(R.id.text1);
        btn0 = (Button) findViewById(R.id.btn0);
        this.registerForContextMenu(btn0);//t1注册为上下文菜单
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        //getMenuInflater().inflate(R.menu.option,menu);
        menu.add(Menu.NONE,Menu.FIRST+1,1,"选项一");
        SubMenu sub1=menu.addSubMenu(Menu.NONE,Menu.FIRST+2,2,"选项二");
        sub1.add(Menu.FIRST+2,201,1,"子菜单1");
        sub1.add(Menu.FIRST+2,202,2,"子菜单2");
        sub1.add(Menu.FIRST+2,203,3,"子菜单3");
        menu.add(Menu.NONE,Menu.FIRST+3,3,"选项三");
           return true;
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View source, ContextMenu.ContextMenuInfo menuInfo)
    {
            menu.add(0,1,1,"上下文菜单1");
            menu.add(0,2,2,"上下文菜单2");
            menu.add(0,3,3,"上下文菜单3");
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem mi)
    {
        switch (mi.getItemId())
        {
            //case R.id.opt1:
            case Menu.FIRST+1:
                Toast.makeText(MainActivity.this,"选项一被选中",Toast.LENGTH_LONG).show();
                    break;
           //case R.id.opt2:
            case Menu.FIRST+2:
                Toast.makeText(MainActivity.this,"选项二被选中",Toast.LENGTH_LONG).show();
                break;
            //case R.id.opt3:
            case Menu.FIRST+3:
                Toast.makeText(MainActivity.this,"选项三被选中",Toast.LENGTH_LONG).show();
                break;
        }
        switch (mi.getItemId())
        {
            case 201:
                Toast.makeText(MainActivity.this,"子菜单1被选中",Toast.LENGTH_LONG).show();
                break;
            case 202:
                Toast.makeText(MainActivity.this,"子菜单2被选中",Toast.LENGTH_LONG).show();
                break;
            case 203:
                Toast.makeText(MainActivity.this,"子菜单3被选中",Toast.LENGTH_LONG).show();
                break;
        }
        return true;
    }
    @Override
    public boolean onContextItemSelected(MenuItem mi)
    {
        switch (mi.getItemId())
        {
            case 1:
                Toast.makeText(MainActivity.this,"上下文菜单1被选中",Toast.LENGTH_LONG).show();
                break;
            case 2:
                Toast.makeText(MainActivity.this,"上下文菜单2被选中",Toast.LENGTH_LONG).show();
                break;
            case 3:
                Toast.makeText(MainActivity.this,"上下文菜单3被选中",Toast.LENGTH_LONG).show();
                break;
        }
        return true;
    }
}
