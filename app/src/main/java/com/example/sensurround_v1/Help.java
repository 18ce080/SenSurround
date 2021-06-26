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

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Help extends AppCompatActivity {
    MediaPlayer sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        getSupportActionBar().hide();//hided actionbar

        sound = MediaPlayer.create(Help.this, R.raw.play);
        sound.start();//play Content of help screen


        TextView TitleWindow = (TextView) findViewById(R.id.title);
        TextView MessageWindow = (TextView) findViewById(R.id.message);
        TextView LayoutWindow = (TextView) findViewById(R.id.layout);
        TextView Message1Window = (TextView) findViewById(R.id.message1);
        TextView TitleWindow1 = (TextView) findViewById(R.id.title1);
        TextView MessageWindow2 = (TextView) findViewById(R.id.message2);
        TextView TitleWindow2 = (TextView) findViewById(R.id.title2);
        TextView MessageWindow3 = (TextView) findViewById(R.id.message3);

        TextView TitleWindow3 = (TextView) findViewById(R.id.title3);
        TextView MessageWindow4 = (TextView) findViewById(R.id.message4);

        //Content Of Help Screen
        TitleWindow.setText("Sen Surround Help Screen");


        MessageWindow.setText("Thank You for downloading SenSurround. We are very excited to have You Here.");
        LayoutWindow.setText("The Layout Of the Application");
        Message1Window.setText("SenSurround is a Scanner App made for blind and visually impaired users." +
                "The app uses rear camera of your smartphone to scan the physical things that you want. "
        );

        TitleWindow1.setText("How to use ?");
        MessageWindow2.setText("Just open the Application Wait for Splash Screen and Simply Swipe down your smart phone to search Particuar object.You can Turn " +
                "on/off flash using mic button which is placed on center down of main screen.");

        TitleWindow2.setText("How it Works ?");
        MessageWindow3.setText("If any object will detect in your back camera , It will vibrate and speak the particular object name");

        TitleWindow3.setText("Flash ON/OFF ");
        MessageWindow4.setText("If you want to turn on/off flash of your mobile phone , just click on mic button.The mic button is in middle bottom of main screen");





    }
//when you go back sound of hekp screen will stop.Doesn't effect any other activity
    @Override
    protected void onPause() {
        super.onPause();
        sound.start();
        finish();
    }
}