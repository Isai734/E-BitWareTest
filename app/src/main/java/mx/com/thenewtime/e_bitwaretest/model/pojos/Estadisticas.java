package mx.com.thenewtime.e_bitwaretest.model.pojos;

/**
 * Created by Babi-Mosso on 22/diez/2017.
 */

public class Estadisticas {
    int idEstadistica;
    String nivel;
    int acierto;
    int meta_nivel_idMeta_nivel;
    int meta_palbra_idMeta_palabra;
    String usuario_email;

    public Estadisticas(int idEstadistica, String nivel, int acierto, int meta_nivel_idMeta_nivel, int meta_palbra_idMeta_palabra, String usuario_email) {
        this.idEstadistica = idEstadistica;
        this.nivel = nivel;
        this.acierto = acierto;
        this.meta_nivel_idMeta_nivel = meta_nivel_idMeta_nivel;
        this.meta_palbra_idMeta_palabra = meta_palbra_idMeta_palabra;
        this.usuario_email = usuario_email;
    }

    public int getIdEstadistica() {
        return idEstadistica;
    }

    public void setIdEstadistica(int idEstadistica) {
        this.idEstadistica = idEstadistica;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getAcierto() {
        return acierto;
    }

    public void setAcierto(int acierto) {
        this.acierto = acierto;
    }

    public int getMeta_nivel_idMeta_nivel() {
        return meta_nivel_idMeta_nivel;
    }

    public void setMeta_nivel_idMeta_nivel(int meta_nivel_idMeta_nivel) {
        this.meta_nivel_idMeta_nivel = meta_nivel_idMeta_nivel;
    }

    public int getMeta_palbra_idMeta_palabra() {
        return meta_palbra_idMeta_palabra;
    }

    public void setMeta_palbra_idMeta_palabra(int meta_palbra_idMeta_palabra) {
        this.meta_palbra_idMeta_palabra = meta_palbra_idMeta_palabra;
    }

    public String getUsuario_email() {
        return usuario_email;
    }

    public void setUsuario_email(String usuario_email) {
        this.usuario_email = usuario_email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Estadisticas)) return false;

        Estadisticas that = (Estadisticas) o;

        if (idEstadistica != that.idEstadistica) return false;
        if (acierto != that.acierto) return false;
        if (meta_nivel_idMeta_nivel != that.meta_nivel_idMeta_nivel) return false;
        if (meta_palbra_idMeta_palabra != that.meta_palbra_idMeta_palabra) return false;
        if (nivel != null ? !nivel.equals(that.nivel) : that.nivel != null) return false;
        return usuario_email != null ? usuario_email.equals(that.usuario_email) : that.usuario_email == null;

    }

    @Override
    public int hashCode() {
        int result = idEstadistica;
        result = 31 * result + (nivel != null ? nivel.hashCode() : 0);
        result = 31 * result + acierto;
        result = 31 * result + meta_nivel_idMeta_nivel;
        result = 31 * result + meta_palbra_idMeta_palabra;
        result = 31 * result + (usuario_email != null ? usuario_email.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Estadisticas{" +
                "idEstadistica=" + idEstadistica +
                ", nivel='" + nivel + '\'' +
                ", acierto=" + acierto +
                ", meta_nivel_idMeta_nivel=" + meta_nivel_idMeta_nivel +
                ", meta_palbra_idMeta_palabra=" + meta_palbra_idMeta_palabra +
                ", usuario_email='" + usuario_email + '\'' +
                '}';
    }
}
