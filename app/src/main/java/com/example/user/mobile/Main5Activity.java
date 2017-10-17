package com.example.user.mobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.attr.data;

public class Main5Activity extends AppCompatActivity {

    ArrayList<String> arraylist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        setTitle("예약 시간");



        //스피너

        Spinner spinner = (Spinner)findViewById(R.id.spinner);



        //어댑터 생성

        //이 예제 같은 경우 string,xml에 리스트를 추가해 놓고 그 리스트를 불러온다.

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.Time, android.R.layout.simple_spinner_item);



        //스피너와 어댑터 연결

        spinner.setAdapter(adapter);



    }
    public void go( View vi ) {
        Intent i = new Intent(this, Main6Activity.class);
        startActivity(i);
    }


}




