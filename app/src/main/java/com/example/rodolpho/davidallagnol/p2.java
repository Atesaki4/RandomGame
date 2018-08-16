package com.example.rodolpho.davidallagnol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class p2 extends AppCompatActivity {
    int point;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p1);
        point = getIntent().getIntExtra("pointt",0);
    }

    public void onee (View v){
        Intent i = new Intent (this, p3.class);
        i.putExtra("pointt",point);
        startActivity(i);
    }

    public void secondd (View v){
        Intent i = new Intent (this, p3.class);
        i.putExtra("pointt",point);
        startActivity(i);
    }

    public void thirdd (View v){
        Intent i = new Intent (this, p3.class);
        i.putExtra("pointt",point);
        startActivity(i);
    }

    public void fourth (View v){
        Intent i = new Intent (this, p3.class);
        point++;
        i.putExtra("pointt",point);
        startActivity(i);
    }

}

