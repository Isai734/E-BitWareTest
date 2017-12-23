package mx.com.thenewtime.e_bitwaretest.model.local;

import android.util.Log;

import com.mosso.abi.apptest.model.pojos.Palabra;
import com.mosso.abi.apptest.model.pojos.Usuario;

import java.util.LinkedList;
import java.util.List;


public class DataSource {
    private static DataSource INSTANCE;
    private static final String TAG = "DataSource";
    private Object object;
    private List<Usuario> UsersList;
    private List<Palabra> PalabrasList;

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
            case "Login":
                Log.i(TAG, "Se retornan lista de Login");
                return UsersList;
        }
        return new LinkedList();
    }

    public void storeListObject(List list) {
        if (!list.isEmpty()) {
            if (list.get(0) instanceof Usuario)
                this.UsersList = list;

        }
        if (!list.isEmpty()) {
            if (list.get(0) instanceof Palabra)
                this.PalabrasList = list;
        }
        Log.i(TAG, "Lista vacia");
    }


}