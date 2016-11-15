package com.oop.dubanrosero.quickmindproject;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ModoJuego extends Activity {

    TextView title;
    Button normalMode, timeTrialMode, records;
    ImageButton returnButton;
    ImageView normalModeImage, timeTrialImage, recordsImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_modo_juego);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Intent intent =  getIntent();
        Bundle elTema = intent.getExtras();
        final int tema = (int) elTema.get("TEMA");
        //ASIGNAR VALORES

        //TEXTVIEW

        title= (TextView) findViewById(R.id.title1);

        //BUTTON AND IMAGEBUTTON

        normalMode= (Button) findViewById(R.id.nomalModeText);
        timeTrialMode= (Button) findViewById(R.id.timeTrialModeText);
        records= (Button) findViewById(R.id.recordText);
        returnButton= (ImageButton) findViewById(R.id.returnButton);

        //IMAGEVIEW

        normalModeImage= (ImageView) findViewById(R.id.normalModeImage);
        timeTrialImage= (ImageView) findViewById(R.id.timeTrialModeImage);
        recordsImage= (ImageView) findViewById(R.id.recordsImage);

        //CHANGE TYPE OF LETTER

        String font_path = "font/newFontType.ttf";
        Typeface TF = Typeface.createFromAsset(getAssets(),"fonts/fuente.ttf");

        title.setTypeface(TF);
        normalMode.setTypeface(TF);
        timeTrialMode.setTypeface(TF);
        records.setTypeface(TF);

        //AVAILABLE LISTENER

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           onBackPressed();
            }
        });

        records.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent record = new Intent(ModoJuego.this,Records.class);
                startActivity(record);
            }
        });
        recordsImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent records = new Intent(ModoJuego.this,Records.class);
                startActivity(records);
            }
        });

        normalMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent juegonormal = new Intent(ModoJuego.this,PreguntaJuego.class);
                juegonormal.putExtra("ELTEMA",tema);
                startActivity(juegonormal);
            }
        });
        normalModeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent juegoNormal = new Intent(ModoJuego.this,PreguntaJuego.class);
                juegoNormal.putExtra("ELTEMA",tema);
                startActivity(juegoNormal);
            }
        });


        timeTrialMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent juegoreloj = new Intent(ModoJuego.this,Records.class);
                juegoreloj.putExtra("ELTEMA",tema);
                startActivity(juegoreloj);
            }
        });

        timeTrialImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent juegoReloj = new Intent(ModoJuego.this,Records.class);
                juegoReloj.putExtra("ELTEMA",tema);
                startActivity(juegoReloj);
            }
        });

    }


}
