package mx.com.thenewtime.e_bitwaretest.model.pojos;

import android.util.Log;

import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;


public class Palabra {

    public boolean isLocal() {
        return isLocal;
    }

    public void setLocal(boolean local) {
        isLocal = local;
    }

    private boolean isLocal;

    private static final String TAG = Palabra.class.getSimpleName();

    private Integer idPalabra;

    private String palabraespaniol;

    private byte[] imagen;

    private String imagenUrl;

    private String palabratlapaneco;

    private String sonidoUrl;

    private byte[] sonido;

    private String imagename;

    private String soundname;

    private Clasificacion clasificacionidClasificacion;

    private Nivel nivelidNivel;

    private Usuario usuarioEmail;


    public Palabra() {
    }

    public Palabra(Integer idPalabra) {
        this.idPalabra = idPalabra;
    }

    public Palabra(Integer idPalabra, String palabratlapaneco, String palabraespaniol, String imagenUrl, String sonidoUrl) {

        this.idPalabra = idPalabra;
        this.palabratlapaneco = palabratlapaneco;
        this.palabraespaniol = palabraespaniol;
        this.imagenUrl = imagenUrl;
        this.sonidoUrl = sonidoUrl;
        //setSonido
        // setSonido();
        //setImagen();
    }

    public Integer getIdPalabra() {
        return idPalabra;
    }


    public void setIdPalabra(Integer idPalabra) {
        this.idPalabra = idPalabra;
    }

    public String getPalabraespaniol() {
        return palabraespaniol;
    }

    public void setPalabraespaniol(String palabraespaniol) {
        this.palabraespaniol = palabraespaniol;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen() {
        try {
            File file = new File(imagenUrl);
            InputStream inputstream = new FileInputStream(file);
            imagen = IOUtils.toByteArray(inputstream);
        } catch (IOException e1) {
            Log.i(TAG, e1.toString());
        }
    }


    public String getPalabratlapaneco() {
        return palabratlapaneco;
    }

    public void setPalabratlapaneco(String palabratlapaneco) {
        this.palabratlapaneco = palabratlapaneco;
    }

    public byte[] getSonido() {
        return sonido;
    }

    public void setSonido() {
        try {
            File file = new File(sonidoUrl);
            InputStream inputstream = new FileInputStream(file);
            sonido = IOUtils.toByteArray(inputstream);
        } catch (IOException e1) {
            Log.i(TAG, e1.toString());
        }
    }

    public String getImagename() {
        return imagenUrl;
    }

    public void setImagename(String imagename) {
        this.imagename = imagename;
    }

    public String getSoundname() {
        return sonidoUrl;
    }

    public void setSoundname(String soundname) {
        this.soundname = soundname;
    }

    public Clasificacion getClasificacionidClasificacion() {
        return clasificacionidClasificacion;
    }

    public void setClasificacionidClasificacion(Clasificacion clasificacionidClasificacion) {
        this.clasificacionidClasificacion = clasificacionidClasificacion;
    }

    public Nivel getNivelidNivel() {
        return nivelidNivel;
    }

    public void setNivelidNivel(Nivel nivelidNivel) {
        this.nivelidNivel = nivelidNivel;
    }

    public Usuario getUsuarioEmail() {
        return usuarioEmail;
    }

    public void setUsuarioEmail(Usuario usuarioEmail) {
        this.usuarioEmail = usuarioEmail;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPalabra != null ? idPalabra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Palabra)) {
            return false;
        }
        Palabra other = (Palabra) object;
        if ((this.idPalabra == null && other.idPalabra != null) || (this.idPalabra != null && !this.idPalabra.equals(other.idPalabra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Palabra{" +
                "idPalabra=" + idPalabra +
                ", palabraespaniol='" + palabraespaniol + '\'' +
                ", imagen=" + Arrays.toString(imagen) +
                ", imagenUrl='" + imagenUrl + '\'' +
                ", palabratlapaneco='" + palabratlapaneco + '\'' +
                ", sonidoUrl='" + sonidoUrl + '\'' +
                ", sonido=" + Arrays.toString(sonido) +
                ", imagename='" + imagename + '\'' +
                ", soundname='" + soundname + '\'' +
                ", clasificacionidClasificacion=" + clasificacionidClasificacion +
                ", nivelidNivel=" + nivelidNivel +
                ", usuarioEmail=" + usuarioEmail +
                '}';
    }
}


