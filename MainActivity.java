package com.ares.henry.showintent;

import android.app.*;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("MainAcitivity","------onCreate-----");
        Button button1 =(Button)findViewById(R.id.button1);

        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }
    public void other(View v){
        Toast.makeText(this,"you clicked button1",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent();
       // intent.setClass(this,Activity.class);
       // intent.setClassName(this,"com.ares.henry.showintent.Activity");
        intent.setClassName(getPackageName(),"com.ares.henry.showintent.Activity");
        startActivity(intent);
    }

}
