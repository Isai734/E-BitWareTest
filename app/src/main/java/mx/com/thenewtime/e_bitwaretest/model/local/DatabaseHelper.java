package mx.com.thenewtime.e_bitwaretest.model.local;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.mosso.abi.apptest.utils.DiccionarioManager;

/**
 * Clase envoltura para el gestor de Bases de datos
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    private Context context;

    public DatabaseHelper(Context context,
                          String name,
                          SQLiteDatabase.CursorFactory factory,
                          int version) {
        super(context, name, factory, version);
        this.context = context;
    }

    public void onCreate(SQLiteDatabase database) {

        //Crear tabla CLASIFICACION
        String cmd = "CREATE TABLE " + ContractDB.CLASIFICACION + " (" +
                ContractDB.ColumnasClasificacion._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ContractDB.ColumnasClasificacion.TIPO + " TEXT)";
        database.execSQL(cmd);

        //Crear tabla AESTADISTICA
        cmd = "CREATE TABLE " + ContractDB.ESTADISTICA + " (" +
                ContractDB.ColumnasEstadistica._ID + " INTEGER, " +
                ContractDB.ColumnasEstadistica.NIVEL + " TEXT," +
                ContractDB.ColumnasEstadistica.ACIERTO + " INTEGER," +
                ContractDB.ColumnasEstadistica.META_NIVEL_IDMETA_NIVEL + " INTEGER," +
                ContractDB.ColumnasEstadistica.META_PALABRA_IDMETA_PALABRA + " INTEGER," +
                ContractDB.ColumnasEstadistica.USUARIO_EMAIL + " TEXT)";
        database.execSQL(cmd);

        //Crear tabla ME_NIVEL
        cmd = "CREATE TABLE " + ContractDB.META_NIVEL + " (" +
                ContractDB.ColumnasMeta_nivel._ID + " INTEGER, " +
                ContractDB.ColumnasMeta_nivel.NIVEL_IDNIVEL + " INTEGER, " +
                ContractDB.ColumnasMeta_nivel.CANTIDAD + " INTEGER)";
        database.execSQL(cmd);

        //Crear tabla META_PALABRA
        cmd = "CREATE TABLE " + ContractDB.META_PALABRA + " (" +
                ContractDB.ColumnasMeta_Palabra._ID + " INTEGER, " +
                ContractDB.ColumnasMeta_Palabra.PALABRA_IDPALABRA + " INTEGER, " +
                ContractDB.ColumnasMeta_Palabra.CANTIDAD + " INTEGER, " +
                ContractDB.ColumnasMeta_Palabra.TIEMPO + " INTEGER)";
        database.execSQL(cmd);

        //Crear tabla NIVEL
        cmd = "CREATE TABLE " + ContractDB.NIVEL + " (" +
                ContractDB.ColumnasNivel._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ContractDB.ColumnasNivel.NUMERO + " INTEGER," +
                ContractDB.ColumnasNivel.DIFICULTAD + " TEXT)";
        database.execSQL(cmd);

        // crear tabla palabra
        cmd = "CREATE TABLE " + ContractDB.PALABRA + " (" +
                ContractDB.ColumnasPalabra._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ContractDB.ColumnasPalabra.LOCAL + " TEXT," +
                ContractDB.ColumnasPalabra.PALABRA_ESPANIOL + " TEXT," +
                ContractDB.ColumnasPalabra.PALABRA_TLAPANECO + " TEXT," +
                ContractDB.ColumnasPalabra.IMAGE_NAME + " TEXT," +
                ContractDB.ColumnasPalabra.SONIDO_NAME + " TEXT," +
                ContractDB.ColumnasPalabra.CLASIFICACION_IDCLASIFICACION + " TEXT," +
                ContractDB.ColumnasPalabra.NIVEL_IDNIVEL + " INTEGER," +
                ContractDB.ColumnasPalabra.USUARIO_EMAIL + " TEXT)";

        database.execSQL(cmd);

        //CREANDO TABLA USUARIO
        cmd = "CREATE TABLE " + ContractDB.USUARIO + " (" +
                ContractDB.ColumnasUsuarios.EMAIL + " TEXT," +
                ContractDB.ColumnasUsuarios.NOMBRE + " TEXT," +
                ContractDB.ColumnasUsuarios.PASSWORD + " TEXT)";
        database.execSQL(cmd);

        //CREANDO TABLA VARIANTES
        cmd = "CREATE TABLE " + ContractDB.VARIANTE + " (" +
                ContractDB.ColumnasVariantes._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                ContractDB.ColumnasVariantes.NOMBREVARIANTES + " TEXT," +
                ContractDB.ColumnasVariantes.PALABRASIDPALABRA + " INTEGER)";
        database.execSQL(cmd);

        createTable(database);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Actualizaciones
    }

    /**
     * Crear tabla en la base de datos
     *
     * @param database Instancia de la base de datos
     */
    private void createTable(SQLiteDatabase database) {
        DiccionarioManager.get(context, database).createInitDatabase();
    }

    /**
     * Carga datos de ejemplo en la tabla
     * @param database Instancia de la base de datos
     */

}
