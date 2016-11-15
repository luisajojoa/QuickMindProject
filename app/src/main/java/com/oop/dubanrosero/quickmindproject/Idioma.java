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

public class Idioma extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature (Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_idioma);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        ImageView backlanguage = (ImageView) findViewById(R.id.backlanguage);
        backlanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();}
        });
        ImageView idiom2 = (ImageView) findViewById(R.id.idiom2) ;
        Animation animation3= AnimationUtils.loadAnimation(this,R.anim.aparicion);
        animation3.setFillAfter(true);
        idiom2.startAnimation(animation3);

        Typeface mifuente = Typeface.createFromAsset(getAssets(), "fonts/fuente.ttf");

        TextView languages = (TextView)findViewById(R.id.languages1);
        languages.setTypeface(mifuente);

        TextView text = (TextView)findViewById(R.id.textidioma);
        text.setTypeface(mifuente);

        TextView español = (TextView)findViewById(R.id.spanishtext);
        español.setTypeface(mifuente);

        TextView ingles = (TextView)findViewById(R.id.englishtext);
        ingles.setTypeface(mifuente);

        TextView aleman = (TextView)findViewById(R.id.germantext);
        aleman.setTypeface(mifuente);
    }
}
