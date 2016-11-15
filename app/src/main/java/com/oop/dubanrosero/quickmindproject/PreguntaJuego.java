package com.oop.dubanrosero.quickmindproject;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.oop.dubanrosero.quickmindproject.dao.PreguntaConTextoDao;
import com.oop.dubanrosero.quickmindproject.dao.PreguntasConImagenDao;
import com.oop.dubanrosero.quickmindproject.models.Pregunta;
import com.oop.dubanrosero.quickmindproject.models.PreguntaConImagen;
import com.oop.dubanrosero.quickmindproject.models.PreguntaSinImagen;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PreguntaJuego extends Activity implements View.OnClickListener {
    TextView pregunta;
    Button respuestaUno,respuestaDos,respuestaTres,respuestaCuatro;
    List<PreguntaSinImagen> preguntasDeGeografia=new ArrayList<PreguntaSinImagen>();
    List<PreguntaConImagen> preguntasDeGeografiaConImagen=new ArrayList<PreguntaConImagen>();
    Random genradorDeRandom=new Random();
    int iteradorDePregunta, aux, randImText;
    int puntaje=0;
    int numeroDeVidas=3;
    ImageView corazonUno,corazonDos,corazonTres,cambioDepregunta,cincuenta,rendirse;
    ImageView imagen;
    int contador5050=0;
    int contadorCambioDePregunta=0;

    int tema;
    PreguntaConTextoDao preguntasSinImagenDao;
    PreguntasConImagenDao preguntasConImagenDao;
    PreguntaConImagen preguntaImagenRand;
    PreguntaSinImagen preguntaTextoRand;


    public void crearPregunta(int tema) {
        pregunta = (TextView) findViewById(R.id.textView2);
        imagen= (ImageView) findViewById(R.id.imagen);
        pregunta.setAlpha(0);
        imagen.setImageAlpha(0);
        randImText = genradorDeRandom.nextInt(9);

        if(randImText %3!=1){
            //PREGUNTA CON TEXTO
            aux =1;
            imagen.setImageAlpha(0);
            pregunta.setAlpha(1);
            //region Seleccion depregunta aleatoria segun el tema
            switch (tema){
                case 0:
                    preguntaTextoRand = preguntasSinImagenDao.getRandomPreguntaSinImagen(preguntasSinImagenDao.getPreguntasConTextCiencia());
                    break;
                case 1:
                    preguntaTextoRand = preguntasSinImagenDao.getRandomPreguntaSinImagen(preguntasSinImagenDao.getPreguntasConTextSociales());
                    break;
                case 2:
                    preguntaTextoRand = preguntasSinImagenDao.getRandomPreguntaSinImagen(preguntasSinImagenDao.getPreguntasConTextDeporte());
                    break;
                case 3:
                    preguntaTextoRand = preguntasSinImagenDao.getRandomPreguntaSinImagen(preguntasSinImagenDao.getPreguntasConTextArte());
                default:
                    break;
            }
             //endregion
            //region LLEVANDO PREGUNTA AL ACTIVITY

            //pregunta
            pregunta.setText(preguntaTextoRand.getPregunta());

            //respuestas
            respuestaUno= (Button) findViewById(R.id.respuestaUno);
            respuestaUno.setAlpha(1);
            respuestaUno.setText(preguntaTextoRand.getOpciones()[0]);
            respuestaDos= (Button) findViewById(R.id.respuestaDos);
            respuestaDos.setAlpha(1);
            respuestaDos.setText(preguntaTextoRand.getOpciones()[1]);
            respuestaTres= (Button) findViewById(R.id.respuestaTres);
            respuestaTres.setAlpha(1);
            respuestaTres.setText(preguntaTextoRand.getOpciones()[2]);
            respuestaCuatro= (Button) findViewById(R.id.respuestaCuatro);
            respuestaCuatro.setAlpha(1);
            respuestaCuatro.setText(preguntaTextoRand.getOpciones()[3]);

            //endregion
        }else {
            //PREGUNTA CON IMAGEN
            aux =2;
            imagen.setImageAlpha(255);
            pregunta.setAlpha(0);
            //region Seleccion depregunta aleatoria segun el tema
            switch (tema){
                case 0:
                    preguntaImagenRand = preguntasConImagenDao.getRandomPreguntaConImagen(preguntasConImagenDao.getPreguntasConImagenCiencia());
                    break;
                case 1:
                    preguntaImagenRand = preguntasConImagenDao.getRandomPreguntaConImagen(preguntasConImagenDao.getPreguntasConImagenSociales());
                    break;
                case 2:
                    preguntaImagenRand = preguntasConImagenDao.getRandomPreguntaConImagen(preguntasConImagenDao.getPreguntasConImagenDeporte());
                    break;
                case 3:
                    preguntaImagenRand = preguntasConImagenDao.getRandomPreguntaConImagen(preguntasConImagenDao.getPreguntasConImagenArtes());
                default:
                    break;

            }
            //endregion

            //region LLEVANDO PREGUNTA A ACTIVIDAD
            //IMAGEN(PREGUNTA)
            Picasso.with(this).load(preguntaImagenRand.getImagen()).into(imagen);
            //OPCIONES
            respuestaUno= (Button) findViewById(R.id.respuestaUno);
            respuestaUno.setAlpha(1);
            respuestaUno.setText(preguntaImagenRand.getOpciones()[0]);
            respuestaDos= (Button) findViewById(R.id.respuestaDos);
            respuestaDos.setAlpha(1);
            respuestaDos.setText(preguntaImagenRand.getOpciones()[1]);
            respuestaTres= (Button) findViewById(R.id.respuestaTres);
            respuestaTres.setAlpha(1);
            respuestaTres.setText(preguntaImagenRand.getOpciones()[2]);
            respuestaCuatro= (Button) findViewById(R.id.respuestaCuatro);
            respuestaCuatro.setAlpha(1);
            respuestaCuatro.setText(preguntaImagenRand.getOpciones()[3]);
            //endregion
        }
    }

    public void volverATodosBlancos(Button respuestaUno,Button respuestaDos,Button respuestaTres,Button respuestaCuatro) {
        respuestaUno.setBackgroundColor(getResources().getColor(R.color.gris));
        respuestaDos.setBackgroundColor(getResources().getColor(R.color.gris));
        respuestaTres.setBackgroundColor(getResources().getColor(R.color.gris));
        respuestaCuatro.setBackgroundColor(getResources().getColor(R.color.gris));
    }

    public void quitarCorazon(int numeroDeVidas){
        corazonTres= (ImageView) findViewById(R.id.corazon3);
        corazonDos= (ImageView) findViewById(R.id.corazon2);
        corazonUno= (ImageView) findViewById(R.id.corazon1);
        if (numeroDeVidas==0) {
            corazonTres.setAlpha(0);
            volverATodosBlancos(respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
        }
        if (numeroDeVidas==1) {
            corazonUno.setAlpha(0);
            volverATodosBlancos(respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
            crearPregunta(tema);
        }
        if (numeroDeVidas==2) {
            corazonDos.setAlpha(0);
            volverATodosBlancos(respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
            crearPregunta(tema);
        }
    }

    public void rectificarRespuestaCorrecta(PreguntaSinImagen pregunta,Button respuestaUno,Button respuestaDos,Button respuestaTres,Button respuestaCuatro) {
        if(respuestaUno.getText().equals(pregunta.getRespuestaCorrecta())) {
            respuestaUno.setBackgroundColor(getResources().getColor(R.color.verde));
        }
        if(respuestaDos.getText().equals(pregunta.getRespuestaCorrecta())) {
            respuestaDos.setBackgroundColor(getResources().getColor(R.color.verde));
        }
        if(respuestaTres.getText().equals(pregunta.getRespuestaCorrecta())) {
            respuestaTres.setBackgroundColor(getResources().getColor(R.color.verde));
        }
        if(respuestaCuatro.getText().equals(pregunta.getRespuestaCorrecta())) {
            respuestaCuatro.setBackgroundColor(getResources().getColor(R.color.verde));
        }
    }
    public void rectificarRespuestaCorrecta(PreguntaConImagen pregunta,Button respuestaUno,Button respuestaDos,Button respuestaTres,Button respuestaCuatro) {
        if(respuestaUno.getText().equals(pregunta.getRespuestaCorrecta())) {
            respuestaUno.setBackgroundColor(getResources().getColor(R.color.verde));
        }
        if(respuestaDos.getText().equals(pregunta.getRespuestaCorrecta())) {
            respuestaDos.setBackgroundColor(getResources().getColor(R.color.verde));
        }
        if(respuestaTres.getText().equals(pregunta.getRespuestaCorrecta())) {
            respuestaTres.setBackgroundColor(getResources().getColor(R.color.verde));
        }
        if(respuestaCuatro.getText().equals(pregunta.getRespuestaCorrecta())) {
            respuestaCuatro.setBackgroundColor(getResources().getColor(R.color.verde));
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_pregunta_juego);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        tema = (int) bundle.get("ELTEMA");

        Log.i("hola", String.valueOf(tema));

        preguntasConImagenDao = new PreguntasConImagenDao(getResources().getBoolean(R.bool.isEnglish));

        preguntasSinImagenDao = new PreguntaConTextoDao(getResources().getBoolean(R.bool.isEnglish));





        // preguntaRandom = preguntasConImagenDao.getRandomPreguntaConImagen(dataPreguntasImagenDeporte);

        //crecion de pregunta
        crearPregunta(tema);

        //habilitacion de eventos
        cambioDepregunta= (ImageView) findViewById(R.id.cambioDePregunta);
        cambioDepregunta.setOnClickListener(this);
        cincuenta= (ImageView) findViewById(R.id.menosDos);
        cincuenta.setOnClickListener(this);
        rendirse= (ImageView) findViewById(R.id.rendirse);
        rendirse.setOnClickListener(this);
        respuestaUno.setOnClickListener(this);
        respuestaDos.setOnClickListener(this);
        respuestaTres.setOnClickListener(this);
        respuestaCuatro.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        respuestaUno= (Button) findViewById(R.id.respuestaUno);
        respuestaDos= (Button) findViewById(R.id.respuestaDos);
        respuestaTres= (Button) findViewById(R.id.respuestaTres);
        respuestaCuatro= (Button) findViewById(R.id.respuestaCuatro);
        switch (view.getId()){
            case R.id.respuestaUno:
                if(aux==1){
                    if(respuestaUno.getText().equals(preguntaTextoRand.getRespuestaCorrecta())){
                        respuestaUno.setBackgroundColor(getResources().getColor(R.color.verde));
                        volverATodosBlancos(respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        crearPregunta(tema);
                    }else{
                        respuestaUno.setBackgroundColor(getResources().getColor(R.color.rojo));
                        numeroDeVidas--;
                        rectificarRespuestaCorrecta(preguntaTextoRand,respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        quitarCorazon(numeroDeVidas);
                    }
                }else{
                    if(respuestaUno.getText().equals(preguntaImagenRand.getRespuestaCorrecta())){
                        respuestaUno.setBackgroundColor(getResources().getColor(R.color.verde));
                        volverATodosBlancos(respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        crearPregunta(tema);
                    }else{
                        respuestaUno.setBackgroundColor(getResources().getColor(R.color.rojo));
                        numeroDeVidas--;
                        rectificarRespuestaCorrecta(preguntaImagenRand,respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        quitarCorazon(numeroDeVidas);
                    }
                }
                break;
            case R.id.respuestaDos:
                if(aux==1){
                    if(respuestaDos.getText().equals(preguntaTextoRand.getRespuestaCorrecta())){
                        respuestaDos.setBackgroundColor(getResources().getColor(R.color.verde));
                        volverATodosBlancos(respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        crearPregunta(tema);
                    }else{
                        respuestaDos.setBackgroundColor(getResources().getColor(R.color.rojo));
                        numeroDeVidas--;
                        rectificarRespuestaCorrecta(preguntaTextoRand,respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        quitarCorazon(numeroDeVidas);
                    }
                }else{
                    if(respuestaDos.getText().equals(preguntaImagenRand.getRespuestaCorrecta())){
                        respuestaDos.setBackgroundColor(getResources().getColor(R.color.verde));
                        volverATodosBlancos(respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        crearPregunta(tema);
                    }else{
                        respuestaDos.setBackgroundColor(getResources().getColor(R.color.rojo));
                        numeroDeVidas--;
                        rectificarRespuestaCorrecta(preguntaImagenRand,respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        quitarCorazon(numeroDeVidas);
                    }
                }

                break;
            case R.id.respuestaTres:
                if(aux==1){
                    if(respuestaTres.getText().equals(preguntaTextoRand.getRespuestaCorrecta())){
                        respuestaTres.setBackgroundColor(getResources().getColor(R.color.verde));
                        volverATodosBlancos(respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        crearPregunta(tema);
                    }else{
                        respuestaTres.setBackgroundColor(getResources().getColor(R.color.rojo));
                        numeroDeVidas--;
                        rectificarRespuestaCorrecta(preguntaTextoRand,respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        quitarCorazon(numeroDeVidas);
                    }
                }else{
                    if(respuestaTres.getText().equals(preguntaImagenRand.getRespuestaCorrecta())){
                        respuestaTres.setBackgroundColor(getResources().getColor(R.color.verde));
                        volverATodosBlancos(respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        crearPregunta(tema);
                    }else{
                        respuestaTres.setBackgroundColor(getResources().getColor(R.color.rojo));
                        numeroDeVidas--;
                        rectificarRespuestaCorrecta(preguntaImagenRand,respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        quitarCorazon(numeroDeVidas);
                    }
                }
                break;
            case R.id.respuestaCuatro:
                if(aux==1){
                    if(respuestaCuatro.getText().equals(preguntaTextoRand.getRespuestaCorrecta())){
                        respuestaCuatro.setBackgroundColor(getResources().getColor(R.color.verde));
                        volverATodosBlancos(respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        crearPregunta(tema);
                    }else{
                        respuestaCuatro.setBackgroundColor(getResources().getColor(R.color.rojo));
                        numeroDeVidas--;
                        rectificarRespuestaCorrecta(preguntaTextoRand,respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        quitarCorazon(numeroDeVidas);
                    }
                }else{
                    if(respuestaCuatro.getText().equals(preguntaImagenRand.getRespuestaCorrecta())){
                        respuestaCuatro.setBackgroundColor(getResources().getColor(R.color.verde));
                        volverATodosBlancos(respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        crearPregunta(tema);
                    }else{
                        respuestaCuatro.setBackgroundColor(getResources().getColor(R.color.rojo));
                        numeroDeVidas--;
                        rectificarRespuestaCorrecta(preguntaImagenRand,respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        quitarCorazon(numeroDeVidas);
                    }
                }

                break;
            case R.id.cambioDePregunta:
                if(contadorCambioDePregunta==0){
                    contadorCambioDePregunta++;
                    crearPregunta(tema);
                    ImageView bCambio= (ImageView) findViewById(R.id.cambioDePregunta);
                    bCambio.setAlpha((float) 0.5);
                }else{
                    Toast toast1 =
                    Toast.makeText(getApplicationContext(), "Comodin no disponible", Toast.LENGTH_SHORT);toast1.show();
                }

                break;
            case R.id.menosDos:
                if(contador5050==0){
                    contador5050++;
                    if(aux==1){
                        eliminarDos(preguntaTextoRand);
                    }else{
                        eliminarDos(preguntaImagenRand);
                    }
                    ImageView b5050= (ImageView) findViewById(R.id.menosDos);
                    b5050.setAlpha((float) 0.5);

                }  else {
                    Toast toast2 = Toast.makeText(getApplicationContext(), "Comodin no disponible", Toast.LENGTH_SHORT);
                    toast2.show();

                }
                break;
            case R.id.rendirse:
                Intent fin = new Intent(PreguntaJuego.this,FinDelJuego.class);
                startActivity(fin);
                break;
        }
    }
    public void eliminarDos(PreguntaSinImagen pregunta){
        int posicionRespuestaCorrecta=0;
        int pEliminar1;
        int pEliminar2;
        for(int i = 0; i < 4; i++) {
            if(pregunta.getOpciones()[i].equals(pregunta.getRespuestaCorrecta())){
                posicionRespuestaCorrecta=i;
            }
        }
        do{
            pEliminar1 = genradorDeRandom.nextInt(3);
            pEliminar2 = genradorDeRandom.nextInt(3);
        }while(pEliminar1==pEliminar2 || pEliminar1==posicionRespuestaCorrecta || pEliminar2==posicionRespuestaCorrecta);

        if(pEliminar1==0 || pEliminar2==0){
            respuestaUno.setAlpha(0);
        }
        if(pEliminar1==1 || pEliminar2==1){
            respuestaDos.setAlpha(0);
        }
        if(pEliminar1==2 || pEliminar2==2){
            respuestaTres.setAlpha(0);
        }
        if(pEliminar1==3 || pEliminar2==3){
            respuestaCuatro.setAlpha(0);
        }
    }
    public void eliminarDos(PreguntaConImagen pregunta){
        int posicionRespuestaCorrecta=0;
        int pEliminar1;
        int pEliminar2;
        for(int i = 0; i < 4; i++) {
            if(pregunta.getOpciones()[i].equals(pregunta.getRespuestaCorrecta())){
                posicionRespuestaCorrecta=i;
            }
        }
        do{
            pEliminar1 = genradorDeRandom.nextInt(3);
            pEliminar2 = genradorDeRandom.nextInt(3);
        }while(pEliminar1==pEliminar2 || pEliminar1==posicionRespuestaCorrecta || pEliminar2==posicionRespuestaCorrecta);

        if(pEliminar1==0 || pEliminar2==0){
            respuestaUno.setAlpha(0);
        }
        if(pEliminar1==1 || pEliminar2==1){
            respuestaDos.setAlpha(0);
        }
        if(pEliminar1==2 || pEliminar2==2){
            respuestaTres.setAlpha(0);
        }
        if(pEliminar1==3 || pEliminar2==3){
            respuestaCuatro.setAlpha(0);
        }
    }

}
