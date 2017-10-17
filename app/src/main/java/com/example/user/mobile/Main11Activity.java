package com.example.user.mobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main11Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
    }

    public void NextScene3( View vi ) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

}
