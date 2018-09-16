package com.example.rebecca.firstapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int savedExtraNumber = getIntent().getIntExtra("value",0);
        TextView myText = (TextView) findViewById(R.id.textView2);
        if(savedExtraNumber == 0){
            myText.setText(R.string.lock);
        }
        else{
            myText.setText(R.string.unlock);
        }


    }

    public void unlockClick(View view){
        openActivity2();
    }

    public void openActivity2(){
        Intent myintent = new Intent(this, Activity2.class);
        startActivity(myintent);
    }

    public void buttonClick(View v)
    {
        TextView tv = (TextView)findViewById(R.id.textView2);
        tv.setText("The App is UNLOCKED");
    }


}
