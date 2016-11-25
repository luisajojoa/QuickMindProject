package com.oop.dubanrosero.quickmindproject;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.oop.dubanrosero.quickmindproject.Util.Constant;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

public class Records extends Activity {
    int puntajeActual=0;
    static TextView normal1;
    TextView normal2;
    TextView normal3;
    TextView reloj1;
    TextView reloj2;
    TextView reloj3;
    int[] normalRecords = {0,0,0,0};
    int[] relojRecords = {0,0,0,0};


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

    public void guardarPuntaje(int[] puntaje, int modo){

        if(modo==1) {
            Constant.altoNormal=puntaje[0];

            Log.i("puntaje", String.valueOf(Constant.altoNormal));
            normal1.setText(String.valueOf(puntaje[0]));

             //region MODO NORMAL RECORDS
            /*try
            {
                FileWriter writer= new FileWriter("recordsNormal.txt");
                writer.write(String.valueOf(puntaje[0])+
                        "\n"+String.valueOf(puntaje[1])+"\n"+
                        String.valueOf(puntaje[2]));
                writer.close();
                Log.i("Records","HOLAAAAAAAAA SIIII FUNCIONA");
            }
            catch (Exception ex)
            {
                Log.e("Ficheros", String.valueOf(ex));
            }
*/

            //endregion
        }else{
/*
            try
            {
                FileWriter writer1= new FileWriter("recordsReloj.csv");
                OutputStreamWriter relojRecords=
                        new OutputStreamWriter(
                                openFileOutput("recordsReloj.csv", Context.MODE_PRIVATE));

                relojRecords.write(String.valueOf(puntaje[0])+
                        "\n"+String.valueOf(puntaje[1])+"\n"+
                        String.valueOf(puntaje[2]));
                relojRecords.close();
                Log.i("Records","HOLAAAAAAAAA SIIII FUNCIONA");
            }
            catch (Exception ex)
            {
                Log.e("Ficheros", "Error al escribir fichero a memoria interna");
            }*/
        }
    }




    public void rectificarPuntaje(int puntajeNuevo, int modo){


        int aux=0;

        if(modo==1){
            //pregunta modo normal
            normalRecords[3]=puntajeNuevo;
            //region Organizando arreglo
            for (int i=0; i< 4;i++){
                for (int j=0; j<4;j++){
                    if (normalRecords[i]>normalRecords[j]){
                        aux=normalRecords[i];
                        normalRecords[i]=normalRecords[j];
                        normalRecords[j]=aux;
                    }
                }
            }
            //endregion
            guardarPuntaje(normalRecords,modo);

        }else{
            //pregunta contrareloj
            relojRecords[3]=puntajeNuevo;
            //region Organizando arreglo
            for (int i=0; i< 4;i++){
                for (int j=0; j<4;j++){
                    if (relojRecords[i]>relojRecords[j]){
                        aux=relojRecords[i];
                        relojRecords[i]=relojRecords[j];
                        relojRecords[j]=aux;
                    }
                }
            }
            //endregion

            guardarPuntaje(relojRecords,modo);
        }
        Log.i("holi", String.valueOf(puntajeNuevo));
//        normal1.setText(String.valueOf(puntajeNuevo));
    }

}
