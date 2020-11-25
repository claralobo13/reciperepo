package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//
       TextView splashtext=(TextView)findViewById(R.id.textView);
        Animation slideanimation= AnimationUtils.loadAnimation(this,R.anim.side_slide);
        splashtext.startAnimation(slideanimation);


         Handler handler=new Handler();
         handler.postDelayed(new Runnable() {
             @Override
             public void run() {

                 Intent intent=new Intent(SplashScreen.this, RecipeListActivity.class);
                 startActivity(intent);
                 finish();

             }
         },3000);



    }
}