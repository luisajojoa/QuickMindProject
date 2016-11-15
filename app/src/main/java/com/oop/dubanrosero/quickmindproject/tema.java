package com.oop.dubanrosero.quickmindproject;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.oop.dubanrosero.quickmindproject.Util.Constant;

public class tema extends Activity {

    Context contexto= this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_tema);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Typeface miPropiaTypeFace = Typeface.createFromAsset(getAssets(), "fonts/fuente.ttf");

        TextView titulo = (TextView)findViewById(R.id.titulo2);
        titulo.setTypeface(miPropiaTypeFace);

        TextView Tarte = (TextView) findViewById(R.id.Tarte);
        Tarte.setTypeface(miPropiaTypeFace);

        TextView Tcencia = (TextView) findViewById(R.id.Tciencia);
        Tcencia.setTypeface(miPropiaTypeFace);

        TextView Tdeporte = (TextView) findViewById(R.id.Tdeportes);
        Tdeporte.setTypeface(miPropiaTypeFace);

        TextView Tsociales = (TextView) findViewById(R.id.Tsociales);
        Tsociales.setTypeface(miPropiaTypeFace);

        ImageView info = (ImageView) findViewById(R.id.info);

        ImageView atras = (ImageView) findViewById(R.id.atras);

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mensaje = new AlertDialog.Builder(contexto);
                mensaje.setMessage(R.string.info);
                mensaje.show();
            }
        });

        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent siguiente = new Intent(tema.this,Inicio.class);
                startActivity(siguiente);
            }
        });

        ImageView ciencia= (ImageView) findViewById(R.id.ciencia);
        ciencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mode = new Intent(tema.this,ModoJuego.class);
                mode.putExtra("TEMA", Constant.TYPE_CIENCIAS);
                startActivity(mode);
            }
        });

        ImageView sociales= (ImageView) findViewById(R.id.sociles);
        sociales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent socialMode = new Intent(tema.this,ModoJuego.class);
                socialMode.putExtra("TEMA", Constant.TYPE_SOCIALES);
                startActivity(socialMode);
            }
        });
        ImageView sport= (ImageView) findViewById(R.id.deporte);
        sport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sportMode = new Intent(tema.this,ModoJuego.class);
                sportMode.putExtra("TEMA", Constant.TYPE_DEPORTE);
                startActivity(sportMode);
            }
        });
        ImageView arte= (ImageView) findViewById(R.id.arte);
        arte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artMode = new Intent(tema.this,ModoJuego.class);
                artMode.putExtra("TEMA", Constant.TYPE_ARTES);
                startActivity(artMode);
            }
        });
    }
}
