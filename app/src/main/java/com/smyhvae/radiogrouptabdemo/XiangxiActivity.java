package com.smyhvae.radiogrouptabdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Administrator on 2016/6/24.
 */
public class XiangxiActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xiangxi);
        getSupportActionBar().setTitle("详细信息");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
