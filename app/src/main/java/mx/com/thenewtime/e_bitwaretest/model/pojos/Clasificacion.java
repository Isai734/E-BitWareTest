package mx.com.thenewtime.e_bitwaretest.model.pojos;



public class Clasificacion {
   int idClasificacion;
   String tipo;


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Clasificacion(int idClasificacion, String tipo) {
        this.idClasificacion = idClasificacion;
        this.tipo = tipo;
    }

    public int getIdClasificacion() {
        return idClasificacion;
    }

    public void setIdClasificacion(int idClasificacion) {
        this.idClasificacion = idClasificacion;
    }

    @Override
    public String toString() {
        return "Clasificacion{" +
                "idClasificacion=" + idClasificacion +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clasificacion)) return false;

        Clasificacion that = (Clasificacion) o;

        if (idClasificacion != that.idClasificacion) return false;
        return tipo != null ? tipo.equals(that.tipo) : that.tipo == null;

    }

    @Override
    public int hashCode() {
        int result = idClasificacion;
        result = 31 * result + (tipo != null ? tipo.hashCode() : 0);
        return result;
    }
}

