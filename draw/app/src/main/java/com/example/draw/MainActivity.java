package com.example.draw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyTestView View1=new MyTestView(this);
        setContentView(View1);
    }
    private  class  MyTestView extends View
    {
        Bitmap bitmap1;
        public  MyTestView(Context context)
        {
            super(context);
        }
        @Override
        protected void onDraw(Canvas convas)
        {
            Rect rect1=new Rect(0,0,1080,1600);
            bitmap1= BitmapFactory.decodeResource(getResources(),R.drawable.bg);
            //convas.drawBitmap(bitmap1,null,rect1,null);
            Rect src=new Rect(bitmap1.getWidth()/2,bitmap1.getHeight()/2,bitmap1.getWidth(),bitmap1.getHeight());
            convas.drawBitmap(bitmap1,src,rect1,null);
            Paint paint=new Paint();
            /*去锯齿*/
            paint.setAntiAlias(true);
            /*设置paint的颜色*/
            paint.setColor(Color.RED);
            /*设置paint的 style 为STROKE：空心*/
            paint.setStyle(Paint.Style.STROKE);
            /*设置paint的外框宽度*/
            paint.setStrokeWidth(8);
            /*画一个空心圆形*/
            convas.drawCircle(540, 800, 200, paint);
            paint.setStrokeWidth(8);
            convas.drawPoint(540,800,paint);//画圆心点
            /*画一个空心正方形*/
            paint.setColor(Color.BLUE);
            paint.setStrokeWidth(5);
            convas.drawRect(340, 600, 740, 1000, paint);
            //画俩条直线
            paint.setStrokeWidth(1);
            convas.drawLine(540,400,540,1200,paint);
            convas.drawLine(140,800,940,800,paint);
        }
    }
}
