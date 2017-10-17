package com.example.user.mobile;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v4.content.IntentCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        setTitle("");

        Handler handler = new Handler() {
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                startActivity(new Intent(Main7Activity.this, Main8Activity.class));
                finish();
            }
        };
        handler.sendEmptyMessageDelayed(0, 3000);
    }
}

