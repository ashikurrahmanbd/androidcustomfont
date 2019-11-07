package com.example.customfonts;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Typeface typeface1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = (TextView) findViewById(R.id.texViewId);

        try{
            typeface1 = Typeface.createFromAsset(getAssets(), "font/Marcel");

            textView.setTypeface(typeface1);
        }catch(Exception e){

            Toast.makeText(this, " "+e, Toast.LENGTH_SHORT).show();
        }


    }
}
