package com.oop.dubanrosero.quickmindproject.models;

import com.oop.dubanrosero.quickmindproject.models.Pregunta;

public class PreguntaConImagen extends Pregunta {

    String imagen;

    public String getImagen() {
        return this.imagen;
    }

    public void setImagen(String _imagen) {
        this.imagen=_imagen;
    }

    public PreguntaConImagen(String _imagen, int _tipo, String[] _opciones, String _respuestaCorrecta){
        this.imagen=_imagen;
        super.setTipo(_tipo);
        super.setOpciones(_opciones);
        super.setRespuestaCorrecta(_respuestaCorrecta);
    }
}
