package mx.com.thenewtime.e_bitwaretest.model.pojos;

/**
 * Created by isai.castro on 12/5/2017.
 */

public class PalabraJG2 {
    int palabra;
    int palabraEspañol;
    int audio;
    int imagen;

    public PalabraJG2(int palabra, int palabraEspañol, int audio) {
        this.palabra = palabra;
        this.palabraEspañol = palabraEspañol;
        this.audio = audio;
    }

    public PalabraJG2(int palabra, int palabraEspañol, int audio, int imagen) {
        this.palabra = palabra;
        this.palabraEspañol = palabraEspañol;
        this.audio = audio;
        this.imagen = imagen;
    }

    public int getPalabra() {
        return palabra;
    }

    public void setPalabra(int palabra) {
        this.palabra = palabra;
    }

    public int getPalabraEspañol() {
        return palabraEspañol;
    }

    public void setPalabraEspañol(int palabraEspañol) {
        this.palabraEspañol = palabraEspañol;
    }

    public int getAudio() {
        return audio;
    }

    public void setAudio(int audio) {
        this.audio = audio;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
