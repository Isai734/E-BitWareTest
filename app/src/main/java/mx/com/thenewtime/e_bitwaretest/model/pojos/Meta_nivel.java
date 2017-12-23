package mx.com.thenewtime.e_bitwaretest.model.pojos;

/**
 * Created by Babi-Mosso on 22/diez/2017.
 */

public class Meta_nivel {
   int idMeta_Nivel;
    int nivel_idNivel;
    int cantidad;

    public Meta_nivel(int idMeta_Nivel, int nivel_idNivel, int cantidad) {
        this.idMeta_Nivel = idMeta_Nivel;
        this.nivel_idNivel = nivel_idNivel;
        this.cantidad = cantidad;
    }

    public int getIdMeta_Nivel() {
        return idMeta_Nivel;
    }

    public void setIdMeta_Nivel(int idMeta_Nivel) {
        this.idMeta_Nivel = idMeta_Nivel;
    }

    public int getNivel_idNivel() {
        return nivel_idNivel;
    }

    public void setNivel_idNivel(int nivel_idNivel) {
        this.nivel_idNivel = nivel_idNivel;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Meta_nivel)) return false;

        Meta_nivel that = (Meta_nivel) o;

        if (idMeta_Nivel != that.idMeta_Nivel) return false;
        if (nivel_idNivel != that.nivel_idNivel) return false;
        return cantidad == that.cantidad;

    }

    @Override
    public int hashCode() {
        int result = idMeta_Nivel;
        result = 31 * result + nivel_idNivel;
        result = 31 * result + cantidad;
        return result;
    }

    @Override
    public String toString() {
        return "Meta_nivel{" +
                "idMeta_Nivel=" + idMeta_Nivel +
                ", nivel_idNivel=" + nivel_idNivel +
                ", cantidad=" + cantidad +
                '}';
    }

}
