package com.oop.dubanrosero.quickmindproject.models;

import com.oop.dubanrosero.quickmindproject.models.Pregunta;

public class PreguntaSinImagen extends Pregunta {
    String pregunta;

    public String getPregunta() {
        return this.pregunta;
    }


    public void setPregunta(String _prgunta) {
        this.pregunta=_prgunta;
    }

    public PreguntaSinImagen(String _pregunta, int _tipo, String[] _opciones, String _respuestaCorrecta) {
        this.pregunta = _pregunta;
        super.setTipo(_tipo);
        super.setOpciones(_opciones);
        super.setRespuestaCorrecta(_respuestaCorrecta);
    }
}
