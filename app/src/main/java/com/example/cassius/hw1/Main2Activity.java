package com.example.cassius.hw1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    public TextView textView;
    public String buttonText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = (TextView) findViewById(R.id.textView);
        Intent startThisActivity = getIntent();
        if(startThisActivity.hasExtra(Intent.EXTRA_TEXT)){
            buttonText = startThisActivity.getStringExtra("ButtonText");
            String extraText = buttonText+" : "+startThisActivity.getStringExtra(Intent.EXTRA_TEXT);
            textView.setText(extraText);
        }
    }
}
