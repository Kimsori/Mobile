package com.example.user.mobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TabHost;
import android.widget.TextView;

import static com.example.user.mobile.R.id.textView7;
import static com.example.user.mobile.R.id.textView;

public class Main3Activity extends AppCompatActivity {

    int a = 100, b = 200, aa = 100, bb = 200, aaa = 100, bbb = 200;
    Button b1, b11, b12,  m, m1, m2, mm, mm1, mm2,  p, p1,  p2, pp, pp1, pp2;
    SeekBar sb1, sb11, sb12;
    View.OnClickListener cl, cl1, cl2;
    SeekBar.OnSeekBarChangeListener sl, sl1, sl2;
    TabHost s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        setTitle("뮤지컬");

        s1 = (TabHost) findViewById(R.id.s1);
        s1.setup();

        TabHost.TabSpec L = s1.newTabSpec("L").setContent(R.id.L).setIndicator("Les_miserables");
        TabHost.TabSpec Ma = s1.newTabSpec("Ma").setContent(R.id.Ma).setIndicator("Mamma_Mia");
        TabHost.TabSpec Ph = s1.newTabSpec("Ph").setContent(R.id.Ph).setIndicator("Phantom_of_the_opear");

        s1.addTab(L);
        s1.addTab(Ma);
        s1.addTab(Ph);

        b1 = (Button) findViewById(R.id.b1);
        m = (Button) findViewById(R.id.m);
        mm = (Button) findViewById(R.id.mm);
        p = (Button) findViewById(R.id.p);
        pp = (Button) findViewById(R.id.pp);
        sb1 = (SeekBar) findViewById(R.id.sb1);
        sb1.setMax(300);
        sb1.setProgress(a);

        b1.setText(a + "");
        cl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.m:
                        a = a - 5;
                        b = b - 5;
                        sb1.setProgress(a);
                        break;
                    case R.id.mm:
                        a = a - 10;
                        b = b - 10;
                        sb1.setProgress(a);
                        break;
                    case R.id.p:
                        a = a + 5;
                        b = b + 5;
                        sb1.setProgress(a);
                        break;
                    case R.id.pp:
                        a = a + 10;
                        b = b + 10;
                        sb1.setProgress(a);
                        break;
                }
            }
        };
        sl = new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                switch (seekBar.getId()) {
                    case R.id.sb1:
                        a = progress;
                        b1.setText(a + "");
                        sb1.setProgress(a);
                        break;
                }
            }
        };
        b1.setOnClickListener(cl);
        m.setOnClickListener(cl);
        mm.setOnClickListener(cl);
        p.setOnClickListener(cl);
        pp.setOnClickListener(cl);
        sb1.setOnSeekBarChangeListener(sl);









        b11 = (Button) findViewById(R.id.b11);
        m1 = (Button) findViewById(R.id.m1);
        mm1 = (Button) findViewById(R.id.mm1);
        p1 = (Button) findViewById(R.id.p1);
        pp1 = (Button) findViewById(R.id.pp1);
        sb11 = (SeekBar) findViewById(R.id.sb11);
        sb11.setMax(300);
        sb11.setProgress(aa);

        b11.setText(aa + "");
        cl1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.m1:
                        aa = aa - 5;
                        bb = bb - 5;
                        sb11.setProgress(aa);
                        break;
                    case R.id.mm1:
                        aa = aa - 10;
                        bb = bb - 10;
                        sb11.setProgress(aa);
                        break;
                    case R.id.p1:
                        aa = aa + 5;
                        bb = bb + 5;
                        sb11.setProgress(aa);
                        break;
                    case R.id.pp1:
                        aa = aa + 10;
                        bb = bb + 10;
                        sb11.setProgress(aa);
                        break;
                }
            }
        };
        sl1 = new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                switch (seekBar.getId()) {
                    case R.id.sb11:
                        aa = progress;
                        b1.setText(aa + "");
                        sb11.setProgress(aa);
                        break;
                }
            }
        };
        b11.setOnClickListener(cl1);
        m1.setOnClickListener(cl1);
        mm1.setOnClickListener(cl1);
        p1.setOnClickListener(cl1);
        pp1.setOnClickListener(cl1);
        sb11.setOnSeekBarChangeListener(sl1);










        b12 = (Button) findViewById(R.id.b12);
        m2 = (Button) findViewById(R.id.m2);
        mm2 = (Button) findViewById(R.id.mm2);
        p2 = (Button) findViewById(R.id.p2);
        pp2 = (Button) findViewById(R.id.pp2);
        sb12 = (SeekBar) findViewById(R.id.sb12);
        sb12.setMax(300);
        sb12.setProgress(aaa);

        b12.setText(aaa + "");
        cl2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.m2:
                        aaa = aaa - 5;
                        bbb = bbb - 5;
                        sb12.setProgress(a);
                        break;
                    case R.id.mm2:
                        aaa = aaa - 10;
                        bbb = bbb - 10;
                        sb12.setProgress(aaa);
                        break;
                    case R.id.p2:
                        aaa = aaa + 5;
                        bbb = bbb + 5;
                        sb12.setProgress(aaa);
                        break;
                    case R.id.pp2:
                        aaa = aaa + 10;
                        bbb = bbb + 10;
                        sb12.setProgress(aaa);
                        break;
                }
            }
        };
        sl2 = new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                switch (seekBar.getId()) {
                    case R.id.sb12:
                        aaa = progress;
                        b12.setText(aaa + "");
                        sb12.setProgress(aaa);
                        break;
                }
            }
        };
        b12.setOnClickListener(cl2);
        m2.setOnClickListener(cl2);
        mm2.setOnClickListener(cl2);
        p2.setOnClickListener(cl2);
        pp2.setOnClickListener(cl2);
        sb12.setOnSeekBarChangeListener(sl2);




    }







    public void NextScene( View vi ) {
        Intent i = new Intent(this, Main4Activity.class);
        startActivity(i);
    }

}






