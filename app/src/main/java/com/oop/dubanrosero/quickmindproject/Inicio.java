package com.oop.dubanrosero.quickmindproject;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.*;

import com.oop.dubanrosero.quickmindproject.Util.Constant;
import com.oop.dubanrosero.quickmindproject.models.PreguntaSinImagen;

import java.util.ArrayList;

public class Inicio extends Activity {
    ImageView imagen;
    public static ArrayList<PreguntaSinImagen> preguntasDeCiencia=new ArrayList<>();

    ImageView inicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_inicio);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        imagen = (ImageView) findViewById(R.id.un);
        inicio = (ImageView) findViewById(R.id.start);
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.rotacion);
        animation.setFillAfter(true);
        imagen.startAnimation(animation);

        ImageView configuracion= (ImageView) findViewById(R.id.conf);


        ImageView logo = (ImageView) findViewById(R.id.logo);
        Animation animation2= AnimationUtils.loadAnimation(this,R.anim.aparicion);
        animation.setFillAfter(true);
        logo.startAnimation(animation2);


        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mediaPlayer.pause();
                Intent siguiente = new Intent(Inicio.this,tema.class);
                startActivity(siguiente);
            }
        });

        configuracion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mediaPlayer.pause();
                Intent confi = new Intent(Inicio.this,Configuracion.class);
                startActivity(confi);
            }
        });

    }
}
