package com.example.rodolpho.davidallagnol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void startt (View v){
        Intent i = new Intent (this, p1.class);
        startActivity(i);
    }

    public void scoree (View v){
        Intent i = new Intent (
                this, points.class);
        startActivity(i);
    }

    public void about (View v){
        Intent i = new Intent (
                this, info.class);
        startActivity(i);
    }
}
