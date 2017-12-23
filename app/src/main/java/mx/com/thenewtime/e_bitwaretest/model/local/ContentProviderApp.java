package mx.com.thenewtime.e_bitwaretest.model.local;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;

/**
 * Content Provider personalizado para las actividades
 */
public class ContentProviderApp extends ContentProvider {
    /**
     * Nombre de la base de datos
     */
    private static final String DATABASE_NAME = "mephaa.db";
    /**
     * Versión actual de la base de datos
     */
    private static final int DATABASE_VERSION = 1;
    /**
     * Instancia del administrador de BD
     */
    private DatabaseHelper databaseHelper;

    @Override
    public boolean onCreate() {
        // Inicializando gestor BD
        databaseHelper = new DatabaseHelper(
                getContext(),
                DATABASE_NAME,
                null,
                DATABASE_VERSION
        );
        return true;
    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        int match = ContractDB.uriMatcher.match(uri);
        switch (match) {
            // Consultando todos los registros
            case ContractDB.CLASIFICACIONES:
                return query(ContractDB.CONTENT_URI_CLASIFICACION, ContractDB.CLASIFICACION, projection, selection, selectionArgs, sortOrder);
            case ContractDB.ESTADISTICAS:
                return query(ContractDB.CONTENT_URI_ESTADISTICA, ContractDB.ESTADISTICA, projection, selection, selectionArgs, sortOrder);
            case ContractDB.META_NIVELES:
                return query(ContractDB.CONTENT_URI_META_NIVEL, ContractDB.META_NIVEL, projection, selection, selectionArgs, sortOrder);
            case ContractDB.META_PALABRAS:
                return query(ContractDB.CONTENT_URI_META_PALABRA, ContractDB.META_PALABRA, projection, selection, selectionArgs, sortOrder);
            case ContractDB.NIVELES:
                return query(ContractDB.CONTENT_URI_NIVEL, ContractDB.NIVEL, projection, selection, selectionArgs, sortOrder);
            case ContractDB.PALABRAS:
                return query(ContractDB.CONTENT_URI_PALABRA, ContractDB.PALABRA, projection, selection, selectionArgs, sortOrder);
            case ContractDB.USUARIOS:
                return query(ContractDB.CONTENT_URI_USUARIO, ContractDB.USUARIO, projection, selection, selectionArgs, sortOrder);
            case ContractDB.VARIANTES:
                return query(ContractDB.CONTENT_URI_VARIANTES, ContractDB.VARIANTE, projection, selection, selectionArgs, sortOrder);

            // Consultando registros por el _id
            case ContractDB.CLASICACIONES_ID:
                return idQuery(uri, ContractDB.CONTENT_URI_CLASIFICACION, ContractDB.CLASIFICACION, projection, selectionArgs, sortOrder);
            case ContractDB.ESTADISTICAS_ID:
                return idQuery(uri, ContractDB.CONTENT_URI_ESTADISTICA, ContractDB.ESTADISTICA, projection, selectionArgs, sortOrder);
            case ContractDB.META_NIVELES_ID:
                return idQuery(uri, ContractDB.CONTENT_URI_META_NIVEL, ContractDB.META_NIVEL, projection, selectionArgs, sortOrder);
            case ContractDB.META_PALABRAS_ID:
                return idQuery(uri, ContractDB.CONTENT_URI_META_PALABRA, ContractDB.META_PALABRA, projection, selectionArgs, sortOrder);
            case ContractDB.NIVELES_ID:
                return idQuery(uri, ContractDB.CONTENT_URI_NIVEL, ContractDB.NIVEL, projection, selectionArgs, sortOrder);
            case ContractDB.PALABRAS_ID:
                return idQuery(uri, ContractDB.CONTENT_URI_PALABRA, ContractDB.PALABRA, projection, selectionArgs, sortOrder);
            case ContractDB.USUARIOS_ID:
                return idQuery(uri, ContractDB.CONTENT_URI_USUARIO, ContractDB.USUARIO, projection, selectionArgs, sortOrder);
            case ContractDB.VARIATES_ID:
                return idQuery(uri, ContractDB.CONTENT_URI_VARIANTES, ContractDB.VARIANTE, projection, selectionArgs, sortOrder);
            default:
                throw new IllegalArgumentException("URI no soportada: " + uri);
        }
    }

    public Cursor query(Uri contenUri, String tabla, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        SQLiteDatabase db = databaseHelper.getWritableDatabase();
        Cursor c;
        c = db.query(tabla, projection, selection, selectionArgs, null, null, sortOrder);
        c.setNotificationUri(
                getContext().getContentResolver(), contenUri
        );
        return c;
    }

    public Cursor queryView(Uri contenUri, String tabla, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        SQLiteDatabase db = databaseHelper.getWritableDatabase();
        Cursor c;
        c = db.query(tabla, projection, selection, selectionArgs, null, null, sortOrder);
        c.setNotificationUri(
                getContext().getContentResolver(), contenUri
        );
        return c;
    }


    public Cursor idQuery(Uri uri, Uri contenUri, String tabla, String[] projection, String[] selectionArgs, String sortOrder) {
        SQLiteDatabase db = databaseHelper.getWritableDatabase();
        Cursor c;
        long videoID = ContentUris.parseId(uri);
        c = db.query(tabla, projection,
                ContractDB.ColumnasUsuarios._ID + " = " + videoID, selectionArgs, null, null, sortOrder
        );
        c.setNotificationUri(
                getContext().getContentResolver(), contenUri
        );
        return c;
    }

    @Override
    public String getType(Uri uri) {
        switch (ContractDB.uriMatcher.match(uri)) {
            case ContractDB.CLASIFICACIONES:
                return ContractDB.MULTIPLE_MIME_CLASIFICACION;
            case ContractDB.ESTADISTICAS:
                return ContractDB.MULTIPLE_MIME_ESTADISTICA;
            case ContractDB.META_NIVELES:
                return ContractDB.MULTIPLE_MIME_META_NIVEL;
            case ContractDB.META_PALABRAS:
                return ContractDB.MULTIPLE_MIME_META_PALABRA;
            case ContractDB.NIVELES:
                return ContractDB.MULTIPLE_MIME_NIVEL;
            case ContractDB.PALABRAS:
                return ContractDB.MULTIPLE_MIME_PALABRA;
            case ContractDB.USUARIOS:
                return ContractDB.MULTIPLE_MIME_USUARIO;
            case ContractDB.VARIANTES:
                return ContractDB.MULTIPLE_MIME_VARIANTE;




            //mime por id
            case ContractDB.META_NIVELES_ID:
                return ContractDB.SIMPLE_MIME_META_NIVEL;

            case ContractDB.META_PALABRAS_ID:
                return ContractDB.SIMPLE_MIME_META_PALABRA;

            case ContractDB.CLASICACIONES_ID:
                return ContractDB.SIMPLE_MIME_CLASIFICACION;
            case ContractDB.ESTADISTICAS_ID:
                return ContractDB.SIMPLE_MIME_ESTADISTICA;
            case ContractDB.NIVELES_ID:
                return ContractDB.SIMPLE_MIME_NIVEL;
            case ContractDB.USUARIOS_ID:
                return ContractDB.SIMPLE_MIME_USUARIO;
            case ContractDB.PALABRAS_ID:
                return ContractDB.SIMPLE_MIME_PALABRA;
           case ContractDB.VARIATES_ID:
                return ContractDB.SIMPLE_MIME_VARIANTE;
            default:
                throw new IllegalArgumentException("Tipo de tabla desconocida: " + uri);
        }
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {
        // Validar la uri
        switch (ContractDB.uriMatcher.match(uri)) {
            case ContractDB.CLASIFICACIONES:
                return insert(uri, ContractDB.CLASIFICACION, ContractDB.CONTENT_URI_CLASIFICACION, values);
            case ContractDB.ESTADISTICAS:
                return insert(uri, ContractDB.ESTADISTICA, ContractDB.CONTENT_URI_ESTADISTICA, values);
            case ContractDB.META_NIVELES:
                return insert(uri, ContractDB.META_NIVEL, ContractDB.CONTENT_URI_META_NIVEL, values);
            case ContractDB.META_PALABRAS:
                return insert(uri, ContractDB.META_PALABRA, ContractDB.CONTENT_URI_META_PALABRA, values);
            case ContractDB.USUARIOS:
                return insert(uri, ContractDB.USUARIO, ContractDB.CONTENT_URI_USUARIO, values);
            case ContractDB.VARIANTES:
                return insert(uri, ContractDB.VARIANTE, ContractDB.CONTENT_URI_VARIANTES, values);
            case ContractDB.PALABRAS:
                return insert(uri, ContractDB.PALABRA, ContractDB.CONTENT_URI_PALABRA, values);
            case ContractDB.NIVELES:
                return insert(uri, ContractDB.NIVEL, ContractDB.CONTENT_URI_NIVEL, values);
            default:
                throw new SQLException("Falla al insertar fila en : " + uri);
        }
    }

    private Uri insert(Uri uri, String tabla, Uri contentUri, ContentValues values) {
        ContentValues contentValues;
        if (values != null) {
            contentValues = new ContentValues(values);
        } else {
            contentValues = new ContentValues();
        }
        // Si es necesario, verifica los valores
        // Inserci�n de nueva fila
        SQLiteDatabase db = databaseHelper.getWritableDatabase();
        long rowId = db.insert(tabla, null, contentValues);
        if (rowId > 0) {
            Uri uri_actividad = ContentUris.withAppendedId(contentUri, rowId);
            getContext().getContentResolver().notifyChange(uri_actividad, null);
            Log.i("ContentProviderApp","Se insetrtaron :"+rowId);
            return uri_actividad;
        }
        return null;
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        int match = ContractDB.uriMatcher.match(uri);
        switch (match) {
            case ContractDB.CLASIFICACIONES:
                return delete(ContractDB.CLASIFICACION, selection, selectionArgs);
            case ContractDB.ESTADISTICAS:
                return delete(ContractDB.PALABRA, selection, selectionArgs);
            case ContractDB.META_NIVELES:
                return delete(ContractDB.META_NIVEL, selection, selectionArgs);
            case ContractDB.META_PALABRAS:
                return delete(ContractDB.META_PALABRA, selection, selectionArgs);
            case ContractDB.NIVELES:
                return delete(ContractDB.NIVEL, selection, selectionArgs);
            case ContractDB.PALABRAS:
                return delete(ContractDB.PALABRA, selection, selectionArgs);
            case ContractDB.USUARIOS:
                return delete(ContractDB.USUARIO, selection, selectionArgs);
            case ContractDB.VARIANTES:
                return delete(ContractDB.VARIANTE, selection, selectionArgs);
            //eliminar por id
            case ContractDB.META_NIVELES_ID:
                return idDelete(ContractDB.NIVEL, uri, selection, selectionArgs);
            case ContractDB.CLASICACIONES_ID:
                return idDelete(ContractDB.CLASIFICACION, uri, selection, selectionArgs);
            case ContractDB.ESTADISTICAS_ID:
                return idDelete(ContractDB.ESTADISTICA, uri, selection, selectionArgs);
            case ContractDB.NIVELES_ID:
                return idDelete(ContractDB.META_PALABRA, uri, selection, selectionArgs);
            case ContractDB.USUARIOS_ID:
                return idDelete(ContractDB.NIVEL, uri, selection, selectionArgs);
            case ContractDB.PALABRAS_ID:
                return idDelete(ContractDB.PALABRA, uri, selection, selectionArgs);
             case ContractDB.VARIATES_ID:
                return idDelete(ContractDB.USUARIO, uri, selection, selectionArgs);
             case ContractDB.META_PALABRAS_ID:
                return idDelete(ContractDB.META_PALABRA, uri, selection, selectionArgs);
            default:
                throw new IllegalArgumentException("Elemento desconocido: " +
                        uri);
        }
    }

    public int delete(String tabla, String selection, String[] selectionArgs) {
        SQLiteDatabase db = databaseHelper.getWritableDatabase();
        int affected = db.delete(tabla, selection, selectionArgs);
        return affected;
    }

    public int idDelete(String tabla, Uri uri, String selection, String[] selectionArgs) {
        SQLiteDatabase db = databaseHelper.getWritableDatabase();
        long videoId = ContentUris.parseId(uri);
        int affected = db.delete(tabla, ContractDB.ColumnasMeta_nivel._ID + "=" + videoId
                + (!TextUtils.isEmpty(selection) ? " AND (" + selection + ')' : ""), selectionArgs);
        // Notificar cambio asociado a la uri
        getContext().getContentResolver().notifyChange(uri, null);
        return affected;
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {

        SQLiteDatabase db = databaseHelper.getWritableDatabase();
        int affected;
        switch (ContractDB.uriMatcher.match(uri)) {

            case ContractDB.CLASIFICACIONES:
                return update(ContractDB.CLASIFICACION, uri, values, selection, selectionArgs);
            case ContractDB.ESTADISTICAS:
                return update(ContractDB.ESTADISTICA, uri, values, selection, selectionArgs);
            case ContractDB.META_NIVELES:
                return update(ContractDB.META_NIVEL, uri, values, selection, selectionArgs);
            case ContractDB.META_PALABRAS:
                return update(ContractDB.META_PALABRA, uri, values, selection, selectionArgs);
            case ContractDB.NIVELES:
                return update(ContractDB.NIVEL, uri, values, selection, selectionArgs);
            case ContractDB.PALABRAS:
                return update(ContractDB.PALABRA, uri, values, selection, selectionArgs);
            case ContractDB.USUARIOS:
                return update(ContractDB.USUARIO, uri, values, selection, selectionArgs);
            case ContractDB.VARIANTES:
                return update(ContractDB.VARIANTE, uri, values, selection, selectionArgs);

            //eliminar por id
            case ContractDB.CLASICACIONES_ID:
                return idUpdate(ContractDB.CLASIFICACION, uri, values, selection, selectionArgs);
            case ContractDB.ESTADISTICAS_ID:
                return idUpdate(ContractDB.ESTADISTICA, uri, values, selection, selectionArgs);
            case ContractDB.META_PALABRAS_ID:
                return idUpdate(ContractDB.META_PALABRA, uri, values, selection, selectionArgs);
            case ContractDB.META_NIVELES_ID:
                return idUpdate(ContractDB.META_NIVEL, uri, values, selection, selectionArgs);
            case ContractDB.NIVELES_ID:
                return idUpdate(ContractDB.NIVEL, uri, values, selection, selectionArgs);
            case ContractDB.PALABRAS_ID:
                return idUpdate(ContractDB.PALABRA, uri, values, selection, selectionArgs);
            case ContractDB.USUARIOS_ID:
                return idUpdate(ContractDB.USUARIO, uri, values, selection, selectionArgs);
            case ContractDB.VARIATES_ID:
                return idUpdate(ContractDB.VARIANTE, uri, values, selection, selectionArgs);
            default:
                throw new IllegalArgumentException("URI desconocida: " + uri);
        }
    }

    public int update(String tabla, Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        SQLiteDatabase db = databaseHelper.getWritableDatabase();
        int affected = db.update(tabla, values, selection, selectionArgs);
        getContext().getContentResolver().notifyChange(uri, null);
        return affected;
    }

    public int idUpdate(String tabla, Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        SQLiteDatabase db = databaseHelper.getWritableDatabase();
        int affected;
        String videoId = uri.getPathSegments().get(1);
        affected = db.update(tabla, values, ContractDB.ColumnasUsuarios._ID + "=" + videoId
                        + (!TextUtils.isEmpty(selection) ?
                        " AND (" + selection + ')' : ""),
                selectionArgs);
        getContext().getContentResolver().notifyChange(uri, null);
        return affected;
    }
}

