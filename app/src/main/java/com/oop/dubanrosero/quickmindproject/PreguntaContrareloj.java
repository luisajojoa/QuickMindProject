package com.oop.dubanrosero.quickmindproject;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.oop.dubanrosero.quickmindproject.Util.Constant;
import com.oop.dubanrosero.quickmindproject.dao.PreguntaConTextoDao;
import com.oop.dubanrosero.quickmindproject.dao.PreguntasConImagenDao;
import com.oop.dubanrosero.quickmindproject.models.PreguntaConImagen;
import com.oop.dubanrosero.quickmindproject.models.PreguntaSinImagen;
import com.squareup.picasso.Picasso;

import java.util.Random;



public class PreguntaContrareloj extends Activity implements View.OnClickListener {
    Records records= new Records();
    TextView pregunta,crono,puntaje;
    Button respuestaUno,respuestaDos,respuestaTres,respuestaCuatro;
    ImageView corazonUno,corazonDos,imagen,corazonTres,cambioDepregunta,cincuenta,masTiempo;
    Random genradorDeRandom=new Random();
    int aux, randImText;
    int contadorPuntaje=00;
    int numeroDeVidas=3;
    int tema;
    int segundo;
    int tiempoPregunta=15000;
    PreguntaConTextoDao preguntasSinImagenDao;
    PreguntasConImagenDao preguntasConImagenDao;
    PreguntaConImagen preguntaImagenRand;
    PreguntaSinImagen preguntaTextoRand;
    int contador5050=0;
    int contadorCambioDePregunta=0;
    int contadorMasTiempo=0;
    CountDownTimer cronometro;




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
            Intent gameOver = new Intent(PreguntaContrareloj.this,FinDelJuego.class);
            gameOver.putExtra("PUNTAJE",contadorPuntaje);
            gameOver.putExtra("TEMA",tema);

            records.rectificarPuntaje(contadorPuntaje,0);
            startActivity(gameOver);
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

    public void crearPregunta(int tema) {
        TextView puntaje = (TextView) findViewById(R.id.puntaje);
        pregunta = (TextView) findViewById(R.id.pregunta);
        imagen= (ImageView) findViewById(R.id.imagen);
        pregunta.setAlpha(0);
        imagen.setImageAlpha(0);
        randImText = genradorDeRandom.nextInt(9);

        puntaje.setText(String.valueOf(contadorPuntaje));
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

            setCronometro(tiempoPregunta);

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

            setCronometro(tiempoPregunta);

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
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta_contrareloj);

        //region INTENT
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        tema = (int) bundle.get("ELTEMA");
        //endregion

        //region Traer al activity
        pregunta = (TextView) findViewById(R.id.pregunta);
        respuestaUno = (Button) findViewById(R.id.respuestaUno);
        respuestaDos= (Button) findViewById(R.id.respuestaDos);
        respuestaTres = (Button) findViewById(R.id.respuestaTres);
        respuestaCuatro = (Button) findViewById(R.id.respuestaCuatro);
        puntaje = (TextView) findViewById(R.id.puntaje);
        crono= (TextView) findViewById(R.id.cronometro);
        masTiempo= (ImageView) findViewById(R.id.masTiempo);
        //endregion

        //region cambio del tipo de letra
        Typeface TF = Typeface.createFromAsset(getAssets(),"fonts/fuente.ttf");

        puntaje.setTypeface(TF);
        crono.setTypeface(TF);
        pregunta.setTypeface(TF);
        respuestaUno.setTypeface(TF);
        respuestaDos.setTypeface(TF);
        respuestaTres.setTypeface(TF);
        respuestaCuatro.setTypeface(TF);
        //endregion



        preguntasConImagenDao = new PreguntasConImagenDao(getResources().getBoolean(R.bool.isEnglish));
        preguntasSinImagenDao = new PreguntaConTextoDao(getResources().getBoolean(R.bool.isEnglish));

        //crecion de pregunta
        crearPregunta(tema);

        //habilitacion de eventos
        cambioDepregunta= (ImageView) findViewById(R.id.cambioDePregunta);
        cambioDepregunta.setOnClickListener(this);
        cincuenta= (ImageView) findViewById(R.id.menosDos);
        cincuenta.setOnClickListener(this);
        masTiempo.setOnClickListener(this);
        respuestaUno.setOnClickListener(this);
        respuestaDos.setOnClickListener(this);
        respuestaTres.setOnClickListener(this);
        respuestaCuatro.setOnClickListener(this);
    }

    @Override
    public void onBackPressed(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(R.string.estasSeguro).setTitle(R.string.advertencia).setPositiveButton(R.string.aceptar, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent rendirse = new Intent(PreguntaContrareloj.this,FinDelJuego.class);
                rendirse.putExtra("PUNTAJE",contadorPuntaje);
                rendirse.putExtra("TEMA",tema);
                startActivity(rendirse);
                records.rectificarPuntaje(contadorPuntaje,0);
                dialogInterface.cancel();
            }
        }).setNegativeButton(R.string.cancelar, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                dialogInterface.cancel();
            }
        });
        AlertDialog dialog= builder.create();
        dialog.show();
    }

    @Override
    public void onClick(View view) {
        respuestaUno= (Button) findViewById(R.id.respuestaUno);
        respuestaDos= (Button) findViewById(R.id.respuestaDos);
        respuestaTres= (Button) findViewById(R.id.respuestaTres);
        respuestaCuatro= (Button) findViewById(R.id.respuestaCuatro);

        switch (view.getId()){

            //region respuestas
            case R.id.respuestaUno:
                if(aux==1){
                    if(respuestaUno.getText().equals(preguntaTextoRand.getRespuestaCorrecta())){
                        respuestaUno.setBackgroundColor(getResources().getColor(R.color.verde));
                        volverATodosBlancos(respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        Toast toastBien= Toast.makeText(getApplicationContext(), R.string.respuestaCorrecta, Toast.LENGTH_SHORT);
                        toastBien.show();

                        contadorPuntaje+=5;
                        cronometro.cancel();
                        crearPregunta(tema);
                    }else{
                        respuestaUno.setBackgroundColor(getResources().getColor(R.color.rojo));
                        numeroDeVidas--;
                        Toast toastMal= Toast.makeText(getApplicationContext(), R.string.respuestaIncorrecta, Toast.LENGTH_SHORT);
                        toastMal.show();
                        contadorPuntaje--;
                        rectificarRespuestaCorrecta(preguntaTextoRand,respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        cronometro.cancel();
                        quitarCorazon(numeroDeVidas);
                    }
                }else{
                    if(respuestaUno.getText().equals(preguntaImagenRand.getRespuestaCorrecta())){
                        respuestaUno.setBackgroundColor(getResources().getColor(R.color.verde));
                        volverATodosBlancos(respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        Toast toastBien= Toast.makeText(getApplicationContext(), R.string.respuestaCorrecta, Toast.LENGTH_SHORT);
                        toastBien.show();
                        contadorPuntaje+=5;
                        cronometro.cancel();

                        crearPregunta(tema);
                    }else{
                        respuestaUno.setBackgroundColor(getResources().getColor(R.color.rojo));
                        numeroDeVidas--;
                        Toast toastMal= Toast.makeText(getApplicationContext(), R.string.respuestaIncorrecta, Toast.LENGTH_SHORT);
                        toastMal.show();
                        contadorPuntaje--;
                        rectificarRespuestaCorrecta(preguntaImagenRand,respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        cronometro.cancel();
                        quitarCorazon(numeroDeVidas);
                    }
                }
                break;

            case R.id.respuestaDos:
                if(aux==1){
                    if(respuestaDos.getText().equals(preguntaTextoRand.getRespuestaCorrecta())){
                        respuestaDos.setBackgroundColor(getResources().getColor(R.color.verde));
                        volverATodosBlancos(respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        Toast toastBien= Toast.makeText(getApplicationContext(), R.string.respuestaCorrecta, Toast.LENGTH_SHORT);
                        toastBien.show();

                        contadorPuntaje+=5;
                        cronometro.cancel();
                        crearPregunta(tema);
                    }else{
                        respuestaDos.setBackgroundColor(getResources().getColor(R.color.rojo));
                        numeroDeVidas--;
                        Toast toastMal= Toast.makeText(getApplicationContext(), R.string.respuestaIncorrecta, Toast.LENGTH_SHORT);
                        toastMal.show();
                        contadorPuntaje--;
                        rectificarRespuestaCorrecta(preguntaTextoRand,respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        cronometro.cancel();
                        quitarCorazon(numeroDeVidas);
                    }
                }else{
                    if(respuestaDos.getText().equals(preguntaImagenRand.getRespuestaCorrecta())){
                        respuestaDos.setBackgroundColor(getResources().getColor(R.color.verde));
                        volverATodosBlancos(respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        Toast toastBien= Toast.makeText(getApplicationContext(), R.string.respuestaCorrecta, Toast.LENGTH_SHORT);
                        toastBien.show();

                        contadorPuntaje+=5;
                        cronometro.cancel();
                        crearPregunta(tema);
                    }else{
                        respuestaDos.setBackgroundColor(getResources().getColor(R.color.rojo));
                        numeroDeVidas--;
                        Toast toastMal= Toast.makeText(getApplicationContext(), R.string.respuestaIncorrecta, Toast.LENGTH_SHORT);
                        toastMal.show();
                        contadorPuntaje--;
                        rectificarRespuestaCorrecta(preguntaImagenRand,respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        cronometro.cancel();
                        quitarCorazon(numeroDeVidas);
                    }
                }

                break;
            case R.id.respuestaTres:
                if(aux==1){
                    if(respuestaTres.getText().equals(preguntaTextoRand.getRespuestaCorrecta())){
                        respuestaTres.setBackgroundColor(getResources().getColor(R.color.verde));
                        volverATodosBlancos(respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        Toast toastBien= Toast.makeText(getApplicationContext(), R.string.respuestaCorrecta, Toast.LENGTH_SHORT);
                        toastBien.show();
                        contadorPuntaje+=5;
                        cronometro.cancel();
                        crearPregunta(tema);
                    }else{
                        respuestaTres.setBackgroundColor(getResources().getColor(R.color.rojo));
                        numeroDeVidas--;
                        Toast toastMal= Toast.makeText(getApplicationContext(), R.string.respuestaIncorrecta, Toast.LENGTH_SHORT);
                        toastMal.show();
                        contadorPuntaje--;
                        rectificarRespuestaCorrecta(preguntaTextoRand,respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        cronometro.cancel();
                        quitarCorazon(numeroDeVidas);
                    }
                }else{
                    if(respuestaTres.getText().equals(preguntaImagenRand.getRespuestaCorrecta())){
                        respuestaTres.setBackgroundColor(getResources().getColor(R.color.verde));
                        volverATodosBlancos(respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        Toast toastBien= Toast.makeText(getApplicationContext(), R.string.respuestaCorrecta, Toast.LENGTH_SHORT);
                        toastBien.show();
                        contadorPuntaje+=5;
                        cronometro.cancel();
                        crearPregunta(tema);
                    }else{
                        respuestaTres.setBackgroundColor(getResources().getColor(R.color.rojo));
                        numeroDeVidas--;
                        Toast toastMal= Toast.makeText(getApplicationContext(), R.string.respuestaIncorrecta, Toast.LENGTH_SHORT);
                        toastMal.show();
                        contadorPuntaje--;
                        rectificarRespuestaCorrecta(preguntaImagenRand,respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        cronometro.cancel();
                        quitarCorazon(numeroDeVidas);
                    }
                }
                break;
            case R.id.respuestaCuatro:
                if(aux==1){
                    if(respuestaCuatro.getText().equals(preguntaTextoRand.getRespuestaCorrecta())){
                        respuestaCuatro.setBackgroundColor(getResources().getColor(R.color.verde));
                        volverATodosBlancos(respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        Toast toastBien= Toast.makeText(getApplicationContext(), R.string.respuestaCorrecta, Toast.LENGTH_SHORT);
                        toastBien.show();
                        contadorPuntaje+=5;
                        cronometro.cancel();
                        crearPregunta(tema);
                    }else{
                        respuestaCuatro.setBackgroundColor(getResources().getColor(R.color.rojo));
                        numeroDeVidas--;
                        Toast toastMal= Toast.makeText(getApplicationContext(), R.string.respuestaIncorrecta, Toast.LENGTH_SHORT);
                        toastMal.show();
                        contadorPuntaje--;
                        rectificarRespuestaCorrecta(preguntaTextoRand,respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        cronometro.cancel();
                        quitarCorazon(numeroDeVidas);
                    }
                }else{
                    if(respuestaCuatro.getText().equals(preguntaImagenRand.getRespuestaCorrecta())){
                        respuestaCuatro.setBackgroundColor(getResources().getColor(R.color.verde));
                        volverATodosBlancos(respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        Toast toastBien= Toast.makeText(getApplicationContext(), R.string.respuestaCorrecta, Toast.LENGTH_SHORT);
                        toastBien.show();
                        contadorPuntaje+=5;
                        cronometro.cancel();
                        crearPregunta(tema);
                    }else{
                        respuestaCuatro.setBackgroundColor(getResources().getColor(R.color.rojo));
                        numeroDeVidas--;
                        Toast toastMal= Toast.makeText(getApplicationContext(), R.string.respuestaIncorrecta, Toast.LENGTH_SHORT);
                        toastMal.show();
                        contadorPuntaje--;
                        rectificarRespuestaCorrecta(preguntaImagenRand,respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        cronometro.cancel();
                        quitarCorazon(numeroDeVidas);
                    }
                }

                break;
            // endregion

            //region COMODINES
            case R.id.cambioDePregunta:
                if(contadorCambioDePregunta==0){
                    contadorCambioDePregunta++;
                    cronometro.cancel();
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

            case R.id.masTiempo:
                if(contadorMasTiempo==0) {
                    contadorMasTiempo++;
                    int tiempoActual = segundo * 1000;
                    cronometro.cancel();
                    setCronometro(tiempoActual + 8000);
                    masTiempo.setAlpha((float) 0.5);
                }else {
                    Toast toast2 = Toast.makeText(getApplicationContext(), "Comodin no disponible", Toast.LENGTH_SHORT);
                    toast2.show();
                }

                break;
            //endregion
            default:
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
    public void setCronometro(int tiempo){
        //region CRONOMETRO
        //el primer numero es el tiempo de duración
        cronometro =  new CountDownTimer(tiempo, 500) {
            public void onTick(long millisUntilFinished) {
                segundo = (int) (millisUntilFinished/1000);

                //region COLORES NUMEROS
                if (segundo<=5) {
                    if (segundo%2==1){
                        crono.setTextColor(crono.getContext().getResources().getColor(R.color.red));
                        crono.setText("" + segundo);
                        crono.setTextSize(crono.getContext().getResources().getDimension(R.dimen.crono2));
                    }else {
                        crono.setTextColor(crono.getContext().getResources().getColor(R.color.red));
                        crono.setText("" + segundo);
                        crono.setTextSize(crono.getContext().getResources().getDimension(R.dimen.crono3));
                    }
                }else {
                    crono.setText("" + segundo);
                    crono.setTextSize(crono.getContext().getResources().getDimension(R.dimen.crono));
                    crono.setTextColor(crono.getContext().getResources().getColor(R.color.colorPrimaryDark));
                }
                //endregion
            }
            public void onFinish() {
                numeroDeVidas--;
                contadorPuntaje--;
                quitarCorazon(numeroDeVidas);
            }
        }.start();
        //endregion
    }
}
