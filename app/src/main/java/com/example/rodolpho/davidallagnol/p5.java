package com.example.rodolpho.davidallagnol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class p5 extends AppCompatActivity {
    int point = getIntent().getIntExtra("pointt",0) ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p5);
    }
public void onee (View v){
    Intent i = new Intent (this, end.class);
    i.putExtra("pointt",point);
    startActivity(i);

}
    public void secondd (View v){
        Intent i = new Intent (this, end.class);
        i.putExtra("pointt",point);
        startActivity(i);

    }
    public void thirdd (View v){
        Intent i = new Intent (this, end.class);
        point ++;
        i.putExtra("pointt",point);
        startActivity(i);

    }
    public void fourth (View v){
        Intent i = new Intent (this, end.class);
        i.putExtra("pointt",point);
        startActivity(i);

    }
}

