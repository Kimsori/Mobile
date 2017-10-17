package com.example.user.mobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main12Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        setTitle("소개");
    }

    public void Back( View vi ) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
