package com.example.user.mobile;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        setTitle("");

        Handler handler = new Handler() {
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                startActivity(new Intent(Main8Activity.this, Main9Activity.class));
                finish();
            }
        };
        handler.sendEmptyMessageDelayed(0, 1200);
    }


}
