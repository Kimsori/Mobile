package com.example.user.mobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        setTitle("좌석");
    }

    public void go( View vi ) {
        Intent i = new Intent(this, Main7Activity.class);
        startActivity(i);
    }

}
