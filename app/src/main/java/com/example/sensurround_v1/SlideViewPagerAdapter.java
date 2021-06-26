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

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SlideViewPagerAdapter extends PagerAdapter {

    Context ctx;

    public SlideViewPagerAdapter(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        LayoutInflater layoutInflater= (LayoutInflater) ctx.getSystemService(ctx.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.slide_screen,container,false);


        ImageView logo=view.findViewById(R.id.logo);

        ImageView ind1=view.findViewById(R.id.ind1);
        ImageView ind2=view.findViewById(R.id.ind2);
        ImageView ind3=view.findViewById(R.id.ind3);


        TextView title=view.findViewById(R.id.title);
        TextView desc=view.findViewById(R.id.desc);

        ImageView next=view.findViewById(R.id.next);
        ImageView back=view.findViewById(R.id.back);

        Button btnGetStarted=view.findViewById(R.id.btnGetStarted);
        btnGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ctx,homeactivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK| Intent.FLAG_ACTIVITY_NEW_TASK);
                ctx.startActivity(intent);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SlideActivity.viewPager.setCurrentItem(position+1);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SlideActivity.viewPager.setCurrentItem(position-1);
            }
        });

        switch (position)
        {
            case 0://first slide screen
                //logo.setImageResource(R.drawable.logo1);
                ind1.setImageResource(R.drawable.seleted);//first dot is filled
                ind2.setImageResource(R.drawable.unselected);
                ind3.setImageResource(R.drawable.unselected);

                title.setText("Welcome to Sensurround");
                desc.setText("Hope,all your problem will solve here.");
                back.setVisibility(View.GONE);
                next.setVisibility(View.VISIBLE);
                break;
            case 1://Second slide screen
                logo.setImageResource(R.drawable.why);
                ind1.setImageResource(R.drawable.unselected);
                ind2.setImageResource(R.drawable.seleted);//Second dot is filled
                ind3.setImageResource(R.drawable.unselected);

                title.setText("Why this Application ?");//set text.
                desc.setText("Sensurround is an assistive app that helps blind and visually impaired users to find objects and read text  independently. It provides a set of digital eyes to make the physical world more accessible for the blind and low vision community.\n");
                back.setVisibility(View.VISIBLE);
                next.setVisibility(View.VISIBLE);
                break;
            case 2://Third slide screen
                logo.setImageResource(R.drawable.searchobject);
                ind1.setImageResource(R.drawable.unselected);
                ind2.setImageResource(R.drawable.unselected);
                ind3.setImageResource(R.drawable.seleted);//Third dot is filled

                title.setText("How to Use ?");
                desc.setText("Just Open the Application and swipe your smart phone to search particular object.You can also turn on/off flash by using mic button.");
                back.setVisibility(View.VISIBLE);
                next.setVisibility(View.GONE);
                break;






        }


        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
