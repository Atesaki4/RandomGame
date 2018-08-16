package com.example.rodolpho.davidallagnol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public class points extends AppCompatActivity {
    RecyclerView listt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_points);
        listt = (RecyclerView) findViewById(R.id.listt);
    }


}
