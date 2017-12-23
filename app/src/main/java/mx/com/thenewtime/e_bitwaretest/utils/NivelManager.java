package mx.com.thenewtime.e_bitwaretest.utils;

import android.content.Context;

import com.mosso.abi.apptest.R;
import com.mosso.abi.apptest.model.pojos.Nivel;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Babi-Mosso on 27/11/2017.
 */

public class NivelManager {
    private Context context;
    static List<Nivel> niveles;

    static {
        niveles = new LinkedList();
        niveles.add(new Nivel(R.string.unoT, R.string.unoE, R.string.nivel1, R.drawable.animales));
        niveles.add(new Nivel(R.string.dosT, R.string.dosE, R.string.nivel2, R.drawable.numeros));
        niveles.add(new Nivel(R.string.tresT, R.string.tresE, R.string.nivel3, R.drawable.cuerpo));
        niveles.add(new Nivel(R.string.cuatroT, R.string.cuatroE, R.string.nivel1, R.drawable.animales));
        niveles.add(new Nivel(R.string.cincoT, R.string.cincoE, R.string.nivel2, R.drawable.numeros));
        niveles.add(new Nivel(R.string.seisT, R.string.seisE, R.string.nivel3, R.drawable.cuerpo));
    }

    public static List<Nivel> getData() {
        return niveles;
    }


}
