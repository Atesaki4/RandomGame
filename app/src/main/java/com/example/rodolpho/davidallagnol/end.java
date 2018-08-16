package com.example.rodolpho.davidallagnol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class end extends AppCompatActivity {
    private TextView fPoints;
    public int point;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        fPoints = (TextView) findViewById(R.id.finalpointss);
        point = getIntent().getIntExtra("pointt",0);
        fPoints.setText(point+" points!");
    }

    public void savee(View v){
        Intent i = new Intent(this, Menu.class);
        startActivity(i);
    }

}
