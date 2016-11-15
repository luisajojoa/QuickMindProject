package com.oop.dubanrosero.quickmindproject.models;

public class Pregunta {

    String[] opciones=new String[4];
    int tipo;
    String respuestaCorrecta;


    // region Getters and Setters
    public String getRespuestaCorrecta(){
        return this.respuestaCorrecta;
    }

    public void setRespuestaCorrecta(String _respuetaCorrecta){
        this.respuestaCorrecta=_respuetaCorrecta;
    }

    public String[] getOpciones(){
        return this.opciones;
    }


    public void setOpciones(String[] _opciones){
        this.opciones=_opciones;
    }

    public int getTipo(){
        return this.tipo;
    }


    public void setTipo(int _tipo){
        this.tipo=_tipo;
    }

    //endregion
}
