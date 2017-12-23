package mx.com.thenewtime.e_bitwaretest.model.pojos;



public class Nivel {
    int numeroTlpa;
    int numero;
    int cadegoria;
    int imagen;
    boolean isLocal = false;

    public Nivel(int numeroTlpa,int numero, int cadegoria, int imagen) {
        this.numero = numero;
        this.cadegoria = cadegoria;
        this.imagen = imagen;
        this.numeroTlpa = numeroTlpa;
    }

    public boolean isLocal() {
        return isLocal;
    }

    public void setLocal(boolean local) {
        isLocal = local;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCadegoria() {
        return cadegoria;
    }

    public void setCadegoria(int cadegoria) {
        this.cadegoria = cadegoria;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public int getNumeroTlpa() {
        return numeroTlpa;
    }

    public void setNumeroTlpa(int numeroTlpa) {
        this.numeroTlpa = numeroTlpa;
    }
}
