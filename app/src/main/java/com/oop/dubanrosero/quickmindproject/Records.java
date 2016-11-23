package com.oop.dubanrosero.quickmindproject;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class Records extends Activity {
    int puntajeActual=0;
    static TextView normal1;
    TextView normal2;
    TextView normal3;
    TextView reloj1;
    TextView reloj2;
    TextView reloj3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_records);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        normal1= (TextView) findViewById(R.id.record1);
        Button volver= (Button) findViewById(R.id.volver);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    public static void rectificarPuntaje(int puntajeNuevo){
//        normal1.setText(String.valueOf(puntajeNuevo));
    }

}
