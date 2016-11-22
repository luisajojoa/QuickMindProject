package com.oop.dubanrosero.quickmindproject;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.oop.dubanrosero.quickmindproject.Util.Constant;

public class FinDelJuego extends Activity {
    ImageView exit,restart;
    int tema;
    int puntajeJugador;

    @Override
    public void onBackPressed(){
        Intent restart = new Intent(FinDelJuego.this,ModoJuego.class);
        restart.putExtra("TEMA",tema);
        startActivity(restart);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature (Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_fin_del_juego);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        exit= (ImageView) findViewById(R.id.exit);
        restart= (ImageView)findViewById(R.id.reiniciar);

        Typeface miPropiaTypeFace = Typeface.createFromAsset(getAssets(), "fonts/fuente.ttf");

        TextView mensajePuntaje = (TextView) findViewById(R.id.mensajePuntaje);
        mensajePuntaje.setTypeface(miPropiaTypeFace);

        TextView puntaje = (TextView) findViewById(R.id.puntaje);
        puntaje.setTypeface(miPropiaTypeFace);

        Intent intent =  getIntent();
        Bundle bundle= intent.getExtras();
        puntajeJugador = (int) bundle.get("PUNTAJE");
        tema= (int) bundle.get("TEMA");

        puntaje.setText(String.valueOf(puntajeJugador));



        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mediaPlayer.pause();
                Intent restart = new Intent(FinDelJuego.this,Inicio.class);
                startActivity(restart);
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restart = new Intent(FinDelJuego.this,ModoJuego.class);
                restart.putExtra("TEMA",tema);
                startActivity(restart);
            }
        });






    }
}
