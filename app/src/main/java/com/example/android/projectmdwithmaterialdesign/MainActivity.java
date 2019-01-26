package com.example.android.projectmdwithmaterialdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button ctl; //continue to login page

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotologinactivity(View view)
    {
        ctl = (Button)findViewById(R.id.continuetologinbutton);
        Intent i1 = new Intent(this, LoginActivity.class);
        startActivity(i1);
    }
}