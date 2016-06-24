package com.smyhvae.radiogrouptabdemo;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;

/**
 * Created by Administrator on 2016/6/20.
 */
public class Layout1 extends Activity implements GestureDetector.OnGestureListener {
    ImageView iv;
    int []data={R.drawable.a3,R.drawable.a4,R.drawable.a5,R.drawable.a6,R.drawable.a7,R.drawable.a8};
    GestureDetector detector;
    Matrix matrix;
    int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);
        iv= (ImageView) findViewById(R.id.image);
        iv.setImageResource(data[index]);
        detector = new GestureDetector(this,this);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return detector.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        float x1 = e1.getX();
        float x2 = e2.getX();
        if (x2-x1>=50){
            if(index>0)
            {
                iv.setImageResource(data[--index]);
            }
        }else if (x2-x1<=-50){
            if(index<data.length-1)
            {
                iv.setImageResource(data[++index]);
            }else if (index==data.length-1){
                Intent i=new Intent(this,MainActivity1.class);
                startActivity(i);
            }
        }
        return true;
    }
}
