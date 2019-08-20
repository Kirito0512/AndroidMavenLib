package com.example.androidmavenlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.androidutillib.AndroidUtil;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity_lib";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "message = " + AndroidUtil.getMessage());
        Log.d(TAG, "new message = " + AndroidUtil.getNewMessage());
    }
}
