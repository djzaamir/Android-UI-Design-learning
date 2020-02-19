package com.example.ui_design_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Let the Screen stay on
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){

        }else{

        }
    }


    public void bringMeFood(View view) {
        Toast.makeText(this, "Thankyou so much for your order\nWe wish you a good health.", Toast.LENGTH_LONG)
             .show();
    }
}
