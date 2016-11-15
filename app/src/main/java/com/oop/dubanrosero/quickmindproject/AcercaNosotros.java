package com.oop.dubanrosero.quickmindproject;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class AcercaNosotros extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature (Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_acerca_nosotros);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        ImageView logo = (ImageView) findViewById(R.id.logo) ;
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.rotacion);
        animation.setFillAfter(true);
        logo.startAnimation(animation);

        ImageView helpabout = (ImageView) findViewById(R.id.helpabout) ;
        Animation animation2= AnimationUtils.loadAnimation(this,R.anim.aparicion);
        animation2.setFillAfter(true);
        helpabout.startAnimation(animation2);

        ImageView backabout = (ImageView) findViewById(R.id.backabout);
        backabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();}
        });

        Typeface mifuente = Typeface.createFromAsset(getAssets(), "fonts/fuente.ttf");

        TextView about = (TextView)findViewById(R.id.aboutwindow);
        about.setTypeface(mifuente);

        TextView textabout = (TextView)findViewById(R.id.textabout);
        textabout.setTypeface(mifuente);

    }
}
