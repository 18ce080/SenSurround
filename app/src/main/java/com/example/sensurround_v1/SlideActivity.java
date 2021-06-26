//**************************************************************************************************
//SENSURROUND : A DIFFERENT WAY OF LIFE
//Sensurround is an assistive app that helps blind and visually impaired users to find objects
//independently. It provides a set of digital eyes to make the physical world more accessible for
//the blind and low vision community.

//CURRENT VERSION 1.10

//APIs USED GOOGLE'S SPEECH RECOGNITION, ML TOOLKIT CUSTOM MODEL(model.tflite) FOR OBJECT DETECTION,
//DEFAULT ML TOOLKIT FOR TEXT RECOGNITION AND INBUILT TEXT-TO-SPEECH.

//CREATED BY : MEET PATEL(18CE079)
//             MEET PATEL(18CE080)
//             NIRMIT PATEL(18CE083)
//             KARAN PRADHAN(18CE092)

//GUIDED BY : PROF. RONAK PATEL
//**************************************************************************************************

//THIS IS THE OBJECT DETECTION ACTIVITY WHICH IS REFERRED AS HOMEACTIVITY BECAUSE OBJECT DETECTION
//IS THE COMPONENT WHICH WILL BE RUNNING FIRST BY DEFAULT.
package com.example.sensurround_v1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


public class SlideActivity extends AppCompatActivity {

    public static ViewPager viewPager;
    SlideViewPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);
        getSupportActionBar().hide();//hide action bar

        viewPager=findViewById(R.id.viewpager);
        adapter=new SlideViewPagerAdapter(this);
        viewPager.setAdapter(adapter);
//        if (isOpenAlread())//only 1st time slideavtivity will show
//        {
//            Intent intent=new Intent(SlideActivity.this,homeactivity.class);//go to the slideactivity to homeavtivity
//            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK| Intent.FLAG_ACTIVITY_NEW_TASK);
//            startActivity(intent);
//            finish();
//        }
//        else
//        {
//            SharedPreferences.Editor editor=getSharedPreferences("slide",MODE_PRIVATE).edit();
//            editor.putBoolean("slide",true);
//            editor.commit();
//        }


    }

    private boolean isOpenAlread() {

        SharedPreferences sharedPreferences=getSharedPreferences("slide",MODE_PRIVATE);
        boolean result=sharedPreferences.getBoolean("slide",false);
        return result;

    }
}
