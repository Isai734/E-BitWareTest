package mx.com.thenewtime.e_bitwaretest.model.pojos;

/**
 * Created by Babi-Mosso on 02/11/2017.
 */

public class Pregunta {

    int pregunta;
    int respuestaCorrecta;
    int respuesta1;
    int respuesta2;
    int respuesta3;
    int respuesta4;
    int imagenOpcion[] = new int[4];
    int audioResCorrecta;
    int audioRes2;
    int audioRes3;
    int audioRes4;

    public Pregunta(int pregunta, int respuestaCorrecta, int respuesta1, int respuesta2, int respuesta3, int respuesta4, int[] imagenOpcion, int audioResCorrecta, int audioRes2, int audioRes3, int audioRes4) {
        this.pregunta = pregunta;
        this.respuestaCorrecta = respuestaCorrecta;
        this.respuesta1 = respuesta1;
        this.respuesta2 = respuesta2;
        this.respuesta3 = respuesta3;
        this.respuesta4 = respuesta4;
        this.imagenOpcion = imagenOpcion;
        this.audioResCorrecta = audioResCorrecta;
        this.audioRes2 = audioRes2;
        this.audioRes3 = audioRes3;
        this.audioRes4 = audioRes4;
    }

    public int getPregunta() {
        return pregunta;
    }

    public void setPregunta(int pregunta) {
        this.pregunta = pregunta;
    }

    public int getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(int respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public int getRespuesta1() {
        return respuesta1;
    }

    public void setRespuesta1(int respuesta1) {
        this.respuesta1 = respuesta1;
    }

    public int getRespuesta2() {
        return respuesta2;
    }

    public void setRespuesta2(int respuesta2) {
        this.respuesta2 = respuesta2;
    }

    public int getRespuesta3() {
        return respuesta3;
    }

    public void setRespuesta3(int respuesta3) {
        this.respuesta3 = respuesta3;
    }

    public int getRespuesta4() {
        return respuesta4;
    }

    public void setRespuesta4(int respuesta4) {
        this.respuesta4 = respuesta4;
    }

    public int[] getImagenOpcion() {
        return imagenOpcion;
    }

    public void setImagenOpcion(int[] imagenOpcion) {
        this.imagenOpcion = imagenOpcion;
    }

    public int getAudioResCorrecta() {
        return audioResCorrecta;
    }

    public void setAudioResCorrecta(int audioResCorrecta) {
        this.audioResCorrecta = audioResCorrecta;
    }

    public int getAudioRes2() {
        return audioRes2;
    }

    public void setAudioRes2(int audioRes2) {
        this.audioRes2 = audioRes2;
    }

    public int getAudioRes3() {
        return audioRes3;
    }

    public void setAudioRes3(int audioRes3) {
        this.audioRes3 = audioRes3;
    }

    public int getAudioRes4() {
        return audioRes4;
    }

    public void setAudioRes4(int audioRes4) {
        this.audioRes4 = audioRes4;
    }

    public boolean isCorrect(int pregunta) {
        return respuestaCorrecta == pregunta;
    }
}
