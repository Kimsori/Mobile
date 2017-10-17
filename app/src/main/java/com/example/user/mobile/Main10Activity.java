package com.example.user.mobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;

public class Main10Activity extends AppCompatActivity {

    ViewGroup rootContainer;
    Scene scene1;
    Scene scene2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        setTitle("리뷰");

        rootContainer = (ViewGroup) findViewById(R.id.rootContainer);
        scene1 = Scene.getSceneForLayout(rootContainer, R.layout.activity_main10, this);
        scene2 = Scene.getSceneForLayout(rootContainer, R.layout.activity_main9, this);

        scene1.enter();
    }

    public void NextScene2( View vi ) {
        TransitionManager.go(scene2);
    }

    public void NextScene1( View vi ) {
        TransitionManager.go(scene1);
    }

    public void NextScene3( View vi ) {
        Intent i = new Intent(this, Main11Activity.class);
        startActivity(i);
    }

    }

