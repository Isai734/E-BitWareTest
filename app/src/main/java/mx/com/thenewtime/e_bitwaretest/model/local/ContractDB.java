package mx.com.thenewtime.e_bitwaretest.model.local;

import android.content.UriMatcher;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Contract Class entre el provider y las aplicaciones
 */
public class ContractDB {
    /**
     * Autoridad del Content Provider
     */
    public final static String AUTORIDAD = "com.mosso.abi.apptest";
    /**
     * Representaci�n de las tablas a consultar
     */

    public static final String CLASIFICACION = "clasificacion";
    public static final String ESTADISTICA = "estadisca";
    public static final String META_NIVEL = "meta_nivel";
    public static final String META_PALABRA = "meta_palabra";
    public static final String NIVEL = "nivel";
    public final static String PALABRA = "palabra";
    public final static String USUARIO = "usuario";
    public final static String VARIANTE = "variantes";
    /**
     * Tipo MIME que retorna la consulta de una sola fila
     */

    public final static String SIMPLE_MIME_CLASIFICACION =
            "vnd.android.cursor.item/vnd." + AUTORIDAD + CLASIFICACION;
    public final static String SIMPLE_MIME_ESTADISTICA =
            "vnd.android.cursor.item/vnd." + AUTORIDAD + ESTADISTICA;
    public final static String SIMPLE_MIME_META_NIVEL =
            "vnd.android.cursor.item/vnd." + AUTORIDAD + META_NIVEL;
    public final static String SIMPLE_MIME_META_PALABRA =
            "vnd.android.cursor.item/vnd." + AUTORIDAD + META_PALABRA;
    public final static String SIMPLE_MIME_PALABRA =
            "vnd.android.cursor.item/vnd." + AUTORIDAD + PALABRA;
    public final static String SIMPLE_MIME_USUARIO =
            "vnd.android.cursor.item/vnd." + AUTORIDAD + USUARIO;
    public final static String SIMPLE_MIME_NIVEL =
            "vnd.android.cursor.item/vnd." + AUTORIDAD + NIVEL;
    public final static String SIMPLE_MIME_VARIANTE =
            "vnd.android.cursor.item/vnd." + AUTORIDAD + VARIANTE;
    /**
     * Tipo MIME que retorna la consulta de {@link }
     */
    public final static String MULTIPLE_MIME_PALABRA =
            "vnd.android.cursor.dir/vnd." + AUTORIDAD + PALABRA;

    public final static String MULTIPLE_MIME_CLASIFICACION =
            "vnd.android.cursor.dir/vnd." + AUTORIDAD + CLASIFICACION;

    public final static String MULTIPLE_MIME_ESTADISTICA =
            "vnd.android.cursor.dir/vnd." + AUTORIDAD + ESTADISTICA;

    public final static String MULTIPLE_MIME_META_NIVEL =
            "vnd.android.cursor.dir/vnd." + AUTORIDAD + META_NIVEL;

    public final static String MULTIPLE_MIME_META_PALABRA =
            "vnd.android.cursor.dir/vnd." + AUTORIDAD + META_PALABRA;

    public final static String MULTIPLE_MIME_NIVEL =
            "vnd.android.cursor.dir/vnd." + AUTORIDAD + NIVEL;

    public final static String MULTIPLE_MIME_USUARIO =
            "vnd.android.cursor.dir/vnd." + AUTORIDAD + USUARIO;

    public final static String MULTIPLE_MIME_VARIANTE =
            "vnd.android.cursor.dir/vnd." + AUTORIDAD + VARIANTE;
    /**
     * URI de contenido principal
     */
    public final static Uri CONTENT_URI_PALABRA =
            Uri.parse("content://" + AUTORIDAD + "/" + PALABRA);

    public final static Uri CONTENT_URI_CLASIFICACION =
            Uri.parse("content://" + AUTORIDAD + "/" + CLASIFICACION);

    public final static Uri CONTENT_URI_ESTADISTICA =
            Uri.parse("content://" + AUTORIDAD + "/" + ESTADISTICA);

    public final static Uri CONTENT_URI_META_NIVEL =
            Uri.parse("content://" + AUTORIDAD + "/" + META_NIVEL);

    public final static Uri CONTENT_URI_META_PALABRA =
            Uri.parse("content://" + AUTORIDAD + "/" + META_PALABRA);

    public final static Uri CONTENT_URI_NIVEL =
            Uri.parse("content://" + AUTORIDAD + "/" + NIVEL);

    public final static Uri CONTENT_URI_USUARIO =
            Uri.parse("content://" + AUTORIDAD + "/" + USUARIO);

    public final static Uri CONTENT_URI_VARIANTES =
            Uri.parse("content://" + AUTORIDAD + "/" + VARIANTE);
    /**
     * Comparador de URIs de contenido
     */
    public static final UriMatcher uriMatcher;
    /**
     * C�digo para URIs de multiples registros
     */
    public static final int CLASIFICACIONES = 1;
    public static final int ESTADISTICAS = 2;
    public static final int USUARIOS = 3;
    public static final int PALABRAS = 15;
    public static final int VARIANTES = 16;
    public static final int META_PALABRAS = 4;
    public static final int NIVELES = 5;
    public static final int META_NIVELES = 13;

    /**
     * CLASIFICACION = "clasificacion";
     ESTADISTICA = "estadisca";
     META_NIVEL = "meta_nivel";
     META_PALABRA = "meta_palabra";
     NIVEL = "nivel";
     PALABRA = "palabra";
     USUARIO = "usuario";
     VARIANTES = "variantes";
     */

    /**
     * C�digo para URIS de un solo registro
     */
    public static final int CLASICACIONES_ID = 6;
    public static final int ESTADISTICAS_ID = 7;
    public static final int META_NIVELES_ID = 8;
    public static final int META_PALABRAS_ID = 14;
    public static final int NIVELES_ID = 9;
    public static final int PALABRAS_ID = 10;
    public static final int USUARIOS_ID = 12;
    public static final int VARIATES_ID = 11;

    // AsignaciÓn de URIs
    static {
        uriMatcher = new UriMatcher(UriMatcher.NO_MATCH);
        uriMatcher.addURI(AUTORIDAD, CLASIFICACION, CLASIFICACIONES);
        uriMatcher.addURI(AUTORIDAD, CLASIFICACION + "/#", CLASICACIONES_ID);

        uriMatcher.addURI(AUTORIDAD, ESTADISTICA, ESTADISTICAS);
        uriMatcher.addURI(AUTORIDAD, ESTADISTICA + "/#", ESTADISTICAS_ID);

        uriMatcher.addURI(AUTORIDAD, META_NIVEL, META_NIVELES);
        uriMatcher.addURI(AUTORIDAD, META_NIVEL + "/#", META_NIVELES_ID);

        uriMatcher.addURI(AUTORIDAD, META_PALABRA, META_PALABRAS);
        uriMatcher.addURI(AUTORIDAD, META_PALABRA + "/#", META_PALABRAS_ID);

        uriMatcher.addURI(AUTORIDAD, NIVEL, NIVELES);
        uriMatcher.addURI(AUTORIDAD, NIVEL + "/#", NIVELES_ID);

        uriMatcher.addURI(AUTORIDAD, PALABRA, PALABRAS);
        uriMatcher.addURI(AUTORIDAD, PALABRA + "/#", PALABRAS_ID);

        uriMatcher.addURI(AUTORIDAD, USUARIO, USUARIOS);
        uriMatcher.addURI(AUTORIDAD, USUARIO + "/#", USUARIOS_ID);

        uriMatcher.addURI(AUTORIDAD, VARIANTE, VARIANTES);
        uriMatcher.addURI(AUTORIDAD, USUARIO + "/#", VARIATES_ID);
    }


    /**
     * Estructura de la tabla CLASIFICACION
     */
    public static class ColumnasClasificacion implements BaseColumns {
        private ColumnasClasificacion() {
        }

        public final static String ID_CLASIFICACION = "id_clasificacion";
        public final static String TIPO = "tipo";

    }


    /**
     * Estructura de la tabla ESTADISTICA
     */
    public static class ColumnasEstadistica implements BaseColumns {
        private ColumnasEstadistica() {
        }

        //NO SABIA  SI VA  TAMBIEN LA LLAVE PRIMARIA
        //public final static String ID_ESTADISTICA= "id_estadistica";
        public final static String NIVEL = "nivel";
        public final static String ACIERTO = "acierto";
        public final static String META_NIVEL_IDMETA_NIVEL = "Meta_Nivel_idMeta_Nivel";
        public final static String META_PALABRA_IDMETA_PALABRA = "Meta_palabra_idMeta_palabra";
        public final static String USUARIO_EMAIL = "usuario_Email";

    }


    /**
     * Estructura de la tabla META_NIVEL
     */
    public static class ColumnasMeta_nivel implements BaseColumns {
        private ColumnasMeta_nivel() {
        }

        public final static String IDMETA_NIVEL = "idMeta_Nivel";
        public final static String NIVEL_IDNIVEL = "Nivel_idNivel";
        public final static String CANTIDAD = "Cantidad";
    }

    /**
     * Estructura de la tabla META_PALABRA
     */
    public static class ColumnasMeta_Palabra implements BaseColumns {
        private ColumnasMeta_Palabra() {
        }

        public final static String ID_META_PALABRA = "idMeta_palabra";
        public final static String PALABRA_IDPALABRA = "Palabra_idPalabra";
        public final static String CANTIDAD = "Cantidad";
        public final static String TIEMPO = "Tiempo";

    }

    /**
     * Estructura de la tabla NIVEL
     */
    public static class ColumnasNivel implements BaseColumns {
        private ColumnasNivel() {
        }

        public final static String ID_NIVEL = "idNivel";
        public final static String NUMERO = "Numero";
        public final static String DIFICULTAD = "Dificultad";

    }

    /**
     * Estructura de la tabla PALABRA
     */
    public static class ColumnasPalabra implements BaseColumns {
        private ColumnasPalabra() {
        }

        public final static String ID_PALABRA = "id_palabra";
        public final static String LOCAL = "is_locaL";
        public final static String PALABRA_ESPANIOL = "Palabra_espaniol";
        public final static String PALABRA_TLAPANECO = "palabra_tlapaneco";
        public final static String IMAGEN = "imagen";
        public final static String SONIDO_NAME = "Sound_name";
        public final static String IMAGE_NAME = "Image_name";
        public final static String SONIDO = "sonido";
        public final static String CLASIFICACION_IDCLASIFICACION = "clasificacion_idClasificacion";
        public final static String NIVEL_IDNIVEL = "nivel_idNivel";
        public final static String USUARIO_EMAIL = "usuario_Email";
    }


    /// tabla usuarios
    public static class ColumnasUsuarios implements BaseColumns {
        private ColumnasUsuarios() {
        }

        public final static String EMAIL = "Email";
        public final static String NOMBRE = "Nombre";
        public final static String PASSWORD = "Password";

    }
    //tabla variantes

    public static class ColumnasVariantes implements BaseColumns {
        private ColumnasVariantes() {

        }

        public final static String IDVARIANTES = "idVariantes";
        public final static String NOMBREVARIANTES = "Nombre_variante";
        public final static String PALABRASIDPALABRA = "Palabra_idPalabra";

    }


}
