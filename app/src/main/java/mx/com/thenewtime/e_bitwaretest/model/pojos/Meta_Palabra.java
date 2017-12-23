package mx.com.thenewtime.e_bitwaretest.model.pojos;

/**
 * Created by Babi-Mosso on 22/diez/2017.
 */

public class Meta_Palabra {
    int idMeta_palabra;
    int palabra_idPalabra;
    int cantidad;
    int tiempo;

    public Meta_Palabra(int idMeta_palabra, int palabra_idPalabra, int cantidad, int tiempo) {
        this.idMeta_palabra = idMeta_palabra;
        this.palabra_idPalabra = palabra_idPalabra;
        this.cantidad = cantidad;
        this.tiempo = tiempo;
    }

    public int getIdMeta_palabra() {
        return idMeta_palabra;
    }

    public void setIdMeta_palabra(int idMeta_palabra) {
        this.idMeta_palabra = idMeta_palabra;
    }

    public int getPalabra_idPalabra() {
        return palabra_idPalabra;
    }

    public void setPalabra_idPalabra(int palabra_idPalabra) {
        this.palabra_idPalabra = palabra_idPalabra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Meta_Palabra)) return false;

        Meta_Palabra that = (Meta_Palabra) o;

        if (idMeta_palabra != that.idMeta_palabra) return false;
        if (palabra_idPalabra != that.palabra_idPalabra) return false;
        if (cantidad != that.cantidad) return false;
        return tiempo == that.tiempo;

    }

    @Override
    public int hashCode() {
        int result = idMeta_palabra;
        result = 31 * result + palabra_idPalabra;
        result = 31 * result + cantidad;
        result = 31 * result + tiempo;
        return result;
    }

    @Override
    public String toString() {
        return "Meta_Palabra{" +
                "idMeta_palabra=" + idMeta_palabra +
                ", palabra_idPalabra=" + palabra_idPalabra +
                ", cantidad=" + cantidad +
                ", tiempo=" + tiempo +
                '}';
    }
}
