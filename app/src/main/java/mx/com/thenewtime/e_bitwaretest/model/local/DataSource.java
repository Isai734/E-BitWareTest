package mx.com.thenewtime.e_bitwaretest.model.local;

import android.util.Log;
import java.util.LinkedList;
import java.util.List;
import mx.com.thenewtime.e_bitwaretest.model.pojos.Persona;

public class DataSource {
    private static DataSource INSTANCE;
    private static final String TAG = "DataSource";
    private Object object;
    private List<Persona> ClientesList;

    public Object getObject() {
        return object;
    }

    public void storeObject(Object object) {
        this.object = object;
    }


    private DataSource() {
    }

    public static DataSource getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DataSource();
        }
        return INSTANCE;
    }

    public List getListObject(Class clas) {
        Log.i(TAG, "Peticion de lista de : " + clas.getClass().getSimpleName());
        switch (clas.getSimpleName()) {
            case "Persona":
                Log.i(TAG, "Se retornan lista de Persona");
                return ClientesList;
        }
        return new LinkedList();
    }

    public void storeListObject(List list) {
        if (!list.isEmpty()) {
            if (list.get(0) instanceof Persona)
                this.ClientesList = list;
        }
        Log.i(TAG, "Lista vacia");
    }


}