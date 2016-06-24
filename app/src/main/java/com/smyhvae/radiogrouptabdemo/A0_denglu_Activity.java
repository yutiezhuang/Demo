package com.smyhvae.radiogrouptabdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * Created by Administrator on 2016/6/21.
 */
public class A0_denglu_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a0_denglu_layout);
        getSupportActionBar().setTitle("登录");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent i = new Intent(this, MainActivity1.class);
                startActivity(i);
                break;
        }
        return true;
    }
}
