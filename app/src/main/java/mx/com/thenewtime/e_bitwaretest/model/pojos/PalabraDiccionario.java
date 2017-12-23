package mx.com.thenewtime.e_bitwaretest.model.pojos;

/**
 * Created by Babi-Mosso on 21/11/2017.
 */

public class PalabraDiccionario {
    int clasificacion;
    int palabraEspaniol;
    int palabraTlapaneco;
    int sondPronunciaon;
    int imagen;
    int variante;

    public PalabraDiccionario(int clasificacion,int palabraTlapaneco, int palabraEspaniol, int sondPronunciaon, int imagen, int variante) {
        this.clasificacion = clasificacion;
        this.palabraEspaniol = palabraEspaniol;
        this.palabraTlapaneco = palabraTlapaneco;
        this.sondPronunciaon = sondPronunciaon;
        this.imagen = imagen;
        this.variante = variante;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getPalabraEspaniol() {
        return palabraEspaniol;
    }

    public void setPalabraEspaniol(int palabraEspaniol) {
        this.palabraEspaniol = palabraEspaniol;
    }

    public int getPalabraTlapaneco() {
        return palabraTlapaneco;
    }

    public void setPalabraTlapaneco(int palabraTlapaneco) {
        this.palabraTlapaneco = palabraTlapaneco;
    }

    public int getSondPronunciaon() {
        return sondPronunciaon;
    }

    public void setSondPronunciaon(int sondPronunciaon) {
        this.sondPronunciaon = sondPronunciaon;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public int getVariante() {
        return variante;
    }

    public void setVariante(int variante) {
        this.variante = variante;
    }
}
