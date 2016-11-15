package com.oop.dubanrosero.quickmindproject;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class FinDelJuego extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature (Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_fin_del_juego);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Typeface miPropiaTypeFace = Typeface.createFromAsset(getAssets(), "fonts/fuente.ttf");

        TextView mensajePuntaje = (TextView) findViewById(R.id.mensajePuntaje);
        mensajePuntaje.setTypeface(miPropiaTypeFace);

        TextView puntaje = (TextView) findViewById(R.id.puntaje);
        puntaje.setTypeface(miPropiaTypeFace);

    }
}
