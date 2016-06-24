package com.smyhvae.radiogrouptabdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MainActivity1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void kankan(View view){

        Intent i=new Intent(this,HomeActivity.class);
        startActivity(i);
    }
    public void zhuce(View view){

        Intent i=new Intent(this,A0_zhuce_Activity.class);
        startActivity(i);
    }
    public void denglu(View view){
        Intent i=new Intent(this,A0_denglu_Activity.class);
        startActivity(i);
    }
}
