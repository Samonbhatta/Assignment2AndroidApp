package com.example.samon.improvedversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v){
        EditText e1 = (EditText)findViewById(R.id.velocity);
        EditText e2 = (EditText)findViewById(R.id.acceleration);
        TextView e3 =(TextView)findViewById(R.id.result);
        double velo=Double.parseDouble(e1.getText().toString());
        double accn = Double.parseDouble(e2.getText().toString());
        double length = (velo*velo)/(2*accn);
        e3.setText("From the given velocity and acceleration, The calculated value for the minimum length for the runway required is " +Double.toString(length)+ " meters");

    }
}
