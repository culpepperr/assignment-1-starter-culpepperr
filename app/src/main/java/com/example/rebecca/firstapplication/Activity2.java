package com.example.rebecca.firstapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    String pass = "";
    Context context;
    Boolean lock = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        pass = "";
    }

    public void click1(View view){
        pass = pass + "1";
    }

    public void click2(View view){
        pass = pass + "2";
    }

    public void click3(View view){
        pass = pass + "3";
    }

    public void click4(View view){
        pass = pass + "4";
    }

    public void submitClick(View view){
        passCheck(pass);
        pass = "";
    }

    public void passCheck(String password){
        if(password.equals("1234")){
            lock = false;
        }
        pass = "";
        openActivity1();
    }

    public void openActivity1(){
        Intent myIntent = new Intent(getBaseContext(), MainActivity.class);
        if(lock){
            myIntent.putExtra("value", 0);
        }
        else {
            myIntent.putExtra("value",1);
        }
        startActivity(myIntent);
    }
}
