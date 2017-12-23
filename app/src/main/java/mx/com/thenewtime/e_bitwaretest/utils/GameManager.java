package mx.com.thenewtime.e_bitwaretest.utils;

import android.util.Log;

import com.mosso.abi.apptest.R;
import com.mosso.abi.apptest.model.pojos.PalabraJG2;
import com.mosso.abi.apptest.model.pojos.Pregunta;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;


public class GameManager {

    private static HashMap<Integer, List<Pregunta>> nivels;
    private static HashMap<Integer, List<PalabraJG2>> nivelsGM2;

    static {
        nivels = new HashMap<>();
        List<Pregunta> preguntasAnimales = new LinkedList();

        preguntasAnimales.add(new Pregunta(R.string.preguntaN1_1, R.string.conejoT, R.string.conejoT, R.string.cangrejoT, R.string.avispaT, R.string.garrapataT,
                new int[]{R.drawable.conejito, R.drawable.caramaroncito, R.drawable.garrapatita, R.drawable.perrito},
                R.raw.conejo, R.raw.camaron, R.raw.perro, R.raw.garrapata));

        preguntasAnimales.add(new Pregunta(R.string.preguntaN1_2, R.string.cangrejoT, R.string.conejoT, R.string.cangrejoT, R.string.camaronT, R.string.mariposaT,
                new int[]{R.drawable.conejito, R.drawable.cangrejito, R.drawable.caramaroncito, R.drawable.mariposita},
                R.raw.conejo, R.raw.cangrejo, R.raw.camaron, R.raw.mariposa));

        preguntasAnimales.add(new Pregunta(R.string.preguntaN1_3, R.string.polloT, R.string.hormigaT, R.string.lagartijaT, R.string.cangrejoT, R.string.polloT,
                new int[]{R.drawable.hormiga, R.drawable.lagartijita, R.drawable.conejito, R.drawable.pollito},
                R.raw.hormiga, R.raw.lagartija, R.raw.conejo, R.raw.pollo));

        preguntasAnimales.add(new Pregunta(R.string.preguntaN1_4, R.string.gatoT, R.string.camaronT, R.string.zorroT, R.string.garrapataT, R.string.gatoT,
                new int[]{R.drawable.caramaroncito, R.drawable.zorrito, R.drawable.garrapatita, R.drawable.gatito},
                R.raw.camaron, R.raw.zorro, R.raw.garrapata, R.raw.gato));

        preguntasAnimales.add(new Pregunta(R.string.preguntaN1_5, R.string.mariposaT, R.string.avispaT, R.string.zorroT, R.string.mariposaT, R.string.garrapataT,
                new int[]{R.drawable.avispita, R.drawable.zorrito, R.drawable.mariposita, R.drawable.garrapatita},
                R.raw.avispa, R.raw.zorro, R.raw.mariposa, R.raw.garrapata));


        preguntasAnimales.add(new Pregunta(R.string.preguntaN1_6, R.string.pescadoT, R.string.conejoT, R.string.pescadoT, R.string.avispaT, R.string.perroT,
                new int[]{R.drawable.conejito, R.drawable.pecesito, R.drawable.avispita, R.drawable.perrito},
                R.raw.conejo, R.raw.pescado, R.raw.avispa, R.raw.perro));

        preguntasAnimales.add(new Pregunta(R.string.preguntaN1_7, R.string.garrapataT, R.string.camaronT, R.string.garrapataT, R.string.lagartijaT, R.string.zorroT,
                new int[]{R.drawable.caramaroncito, R.drawable.garrapatita, R.drawable.lagartijita, R.drawable.zorrito},
                R.raw.camaron, R.raw.garrapata, R.raw.lagartija, R.raw.zorro));

        preguntasAnimales.add(new Pregunta(R.string.preguntaN1_8, R.string.perroT, R.string.hormigaT, R.string.perroT, R.string.mariposaT, R.string.zorroT,
                new int[]{R.drawable.hormiga, R.drawable.perrito, R.drawable.mariposita, R.drawable.zorrito},
                R.raw.hormiga, R.raw.perro, R.raw.mariposa, R.raw.zorro));

        preguntasAnimales.add(new Pregunta(R.string.preguntaN1_9, R.string.zancudoT, R.string.perroT, R.string.camaronT, R.string.avispaT, R.string.zancudoT,
                new int[]{R.drawable.perrito, R.drawable.caramaroncito, R.drawable.avispita, R.drawable.zancudito},
                R.raw.perro, R.raw.camaron, R.raw.avispa, R.raw.zancudo));

        preguntasAnimales.add(new Pregunta(R.string.preguntaN1_10, R.string.avispaT, R.string.avispaT, R.string.camaronT, R.string.lagartijaT, R.string.garrapataT,
                new int[]{R.drawable.avispita, R.drawable.caramaroncito, R.drawable.lagartijita, R.drawable.garrapatita},
                R.raw.avispa, R.raw.camaron, R.raw.lagartija, R.raw.garrapata));

        nivels.put(R.string.nivel1, preguntasAnimales);

        //Otro Nivel
        List<Pregunta> preguntasNumeros = new LinkedList();

        preguntasNumeros.add(new Pregunta(R.string.preguntaN2_1, R.string.unoT, R.string.diezT, R.string.tresT, R.string.unoT, R.string.cuatroT,
                new int[]{R.drawable.diez, R.drawable.tres, R.drawable.uno, R.drawable.cuatro},
                R.raw.diez, R.raw.tres, R.raw.uno, R.raw.cuatro));
        preguntasNumeros.add(new Pregunta(R.string.preguntaN2_2, R.string.dosT, R.string.dosT, R.string.sieteT, R.string.ochoT, R.string.cuatroT,
                new int[]{R.drawable.dos, R.drawable.siete, R.drawable.ocho, R.drawable.cuatro},
                R.raw.dos, R.raw.siete, R.raw.ocho, R.raw.cuatro));
        preguntasNumeros.add(new Pregunta(R.string.preguntaN2_3, R.string.tresT, R.string.diezT, R.string.tresT, R.string.unoT, R.string.cuatroT,
                new int[]{R.drawable.diez, R.drawable.tres, R.drawable.uno, R.drawable.cuatro},
                R.raw.diez, R.raw.tres, R.raw.uno, R.raw.cuatro));
        preguntasNumeros.add(new Pregunta(R.string.preguntaN2_4, R.string.cuatroT, R.string.ochoT, R.string.cuatroT, R.string.cincoT, R.string.unoT,
                new int[]{R.drawable.ocho, R.drawable.cuatro, R.drawable.cinco, R.drawable.uno},
                R.raw.ocho, R.raw.cuatro, R.raw.cinco, R.raw.uno));
        preguntasNumeros.add(new Pregunta(R.string.preguntaN2_5, R.string.cincoT, R.string.unoT, R.string.dosT, R.string.cincoT, R.string.tresT,
                new int[]{R.drawable.uno, R.drawable.dos, R.drawable.cinco, R.drawable.tres},
                R.raw.uno, R.raw.dos, R.raw.cinco, R.raw.tres));
        preguntasNumeros.add(new Pregunta(R.string.preguntaN2_6, R.string.seisT, R.string.ochoT, R.string.nueveT, R.string.unoT, R.string.seisT,
                new int[]{R.drawable.ocho, R.drawable.nueve, R.drawable.uno, R.drawable.seis},
                R.raw.ocho, R.raw.nueve, R.raw.uno, R.raw.seis));
        preguntasNumeros.add(new Pregunta(R.string.preguntaN2_7, R.string.sieteT, R.string.diezT, R.string.sieteT, R.string.nueveT, R.string.cincoT,
                new int[]{R.drawable.diez, R.drawable.siete, R.drawable.nueve, R.drawable.cinco},
                R.raw.diez, R.raw.siete, R.raw.nueve, R.raw.cinco));
        preguntasNumeros.add(new Pregunta(R.string.preguntaN2_8, R.string.ochoT, R.string.cincoT, R.string.sieteT, R.string.ochoT, R.string.dosT,
                new int[]{R.drawable.cinco, R.drawable.siete, R.drawable.ocho, R.drawable.dos},
                R.raw.cinco, R.raw.siete, R.raw.ocho, R.raw.dos));
        preguntasNumeros.add(new Pregunta(R.string.preguntaN2_9, R.string.nueveT, R.string.nueveT, R.string.dosT, R.string.dosT, R.string.unoT,
                new int[]{R.drawable.nueve, R.drawable.seis, R.drawable.dos, R.drawable.uno},
                R.raw.nueve, R.raw.seis, R.raw.dos, R.raw.uno));
        preguntasNumeros.add(new Pregunta(R.string.preguntaN2_10, R.string.diezT, R.string.dosT, R.string.seisT, R.string.diezT, R.string.cuatroT,
                new int[]{R.drawable.dos, R.drawable.seis, R.drawable.diez, R.drawable.cuatro},
                R.raw.dos, R.raw.seis, R.raw.diez, R.raw.cuatro));
        nivels.put(R.string.nivel2, preguntasNumeros);
        //otraspreguntas
        List<Pregunta> preguntasCuerpo = new LinkedList();

        preguntasCuerpo.add(new Pregunta(R.string.preguntaN3_1, R.string.cuelloT, R.string.cuelloT, R.string.caraT, R.string.pieT, R.string.pielT,
                new int[]{R.drawable.cuello, R.drawable.cara, R.drawable.pie, R.drawable.piel},
                R.raw.cuello, R.raw.cara, R.raw.pie, R.raw.piel));

        preguntasCuerpo.add(new Pregunta(R.string.preguntaN3_2, R.string.ojoT, R.string.caraT, R.string.manoT, R.string.ojoT, R.string.peloT,
                new int[]{R.drawable.cara, R.drawable.mano, R.drawable.ojo, R.drawable.pelo},
                R.raw.cara, R.raw.mano, R.raw.ojo, R.raw.pelo));
        preguntasCuerpo.add(new Pregunta(R.string.preguntaN3_3, R.string.pielT, R.string.estomagoT, R.string.espaldaT, R.string.pieT, R.string.pielT,
                new int[]{R.drawable.estomago, R.drawable.espalda, R.drawable.pie, R.drawable.piel},
                R.raw.estomago, R.raw.espalda, R.raw.pie, R.raw.piel));

        preguntasCuerpo.add(new Pregunta(R.string.preguntaN3_4, R.string.higadoT, R.string.dienteT, R.string.higadoT, R.string.narizT, R.string.pielT,
                new int[]{R.drawable.diente, R.drawable.higado, R.drawable.nariz, R.drawable.piel},
                R.raw.diente, R.raw.higado, R.raw.nariz, R.raw.piel));
        preguntasCuerpo.add(new Pregunta(R.string.preguntaN3_5, R.string.pieT, R.string.manoT, R.string.narizT, R.string.pieT, R.string.ojoT,
                new int[]{R.drawable.mano, R.drawable.nariz, R.drawable.pie, R.drawable.ojo},
                R.raw.mano, R.raw.nariz, R.raw.pie, R.raw.ojo));

        preguntasCuerpo.add(new Pregunta(R.string.preguntaN3_6, R.string.manoT, R.string.pielT, R.string.dienteT, R.string.ojoT, R.string.manoT,
                new int[]{R.drawable.piel, R.drawable.diente, R.drawable.ojo, R.drawable.mano},
                R.raw.piel, R.raw.diente, R.raw.ojo, R.raw.mano));

        preguntasCuerpo.add(new Pregunta(R.string.preguntaN3_7, R.string.narizT, R.string.narizT, R.string.caraT, R.string.pieT, R.string.espaldaT,
                new int[]{R.drawable.nariz, R.drawable.cara, R.drawable.pie, R.drawable.espalda},
                R.raw.nariz, R.raw.cara, R.raw.pie, R.raw.espalda));

        preguntasCuerpo.add(new Pregunta(R.string.preguntaN3_8, R.string.espaldaT, R.string.estomagoT, R.string.espaldaT, R.string.manoT, R.string.orejaT,
                new int[]{R.drawable.estomago, R.drawable.espalda, R.drawable.mano, R.drawable.oreja},
                R.raw.estomago, R.raw.espalda, R.raw.mano, R.raw.oreja));

        preguntasCuerpo.add(new Pregunta(R.string.preguntaN3_9, R.string.dienteT, R.string.caraT, R.string.pielT, R.string.dienteT, R.string.peloT,
                new int[]{R.drawable.cara, R.drawable.piel, R.drawable.diente, R.drawable.pelo},
                R.raw.cara, R.raw.piel, R.raw.diente, R.raw.pelo));

        preguntasCuerpo.add(new Pregunta(R.string.preguntaN3_10, R.string.caraT, R.string.caraT, R.string.espaldaT, R.string.manoT, R.string.narizT,
                new int[]{R.drawable.cara, R.drawable.espalda, R.drawable.mano, R.drawable.nariz},
                R.raw.cara, R.raw.espalda, R.raw.mano, R.raw.nariz));

        nivels.put(R.string.nivel3, preguntasCuerpo);
        setNivelsGM2();
    }

    //Static del segun GameFragment
    public static void setNivelsGM2() {
        nivelsGM2 = new HashMap<>();

        List<PalabraJG2> palabraAnimales = new LinkedList();
        palabraAnimales.add(new PalabraJG2(R.string.conejoT, R.string.conejoE, R.raw.conejo, R.drawable.conejito));
        palabraAnimales.add(new PalabraJG2(R.string.cangrejoT, R.string.cangrejoE, R.raw.cangrejo, R.drawable.cangrejito));
        palabraAnimales.add(new PalabraJG2(R.string.ranaT, R.string.ranaE, R.raw.rana, R.drawable.rana));
        palabraAnimales.add(new PalabraJG2(R.string.perroT, R.string.perroE, R.raw.perro, R.drawable.perrito));
        palabraAnimales.add(new PalabraJG2(R.string.polloT, R.string.polloE, R.raw.pollo, R.drawable.pollito));
        palabraAnimales.add(new PalabraJG2(R.string.aguilaT, R.string.aguilaE, R.raw.aguila, R.drawable.aguila));
        palabraAnimales.add(new PalabraJG2(R.string.armadilloT, R.string.armadilloE, R.raw.armadillo, R.drawable.armadillo));
        palabraAnimales.add(new PalabraJG2(R.string.mariposaT, R.string.mariposaE, R.raw.mariposa, R.drawable.mariposita));
        palabraAnimales.add(new PalabraJG2(R.string.hormigaT, R.string.hormigaE, R.raw.hormiga, R.drawable.hormiga));
        palabraAnimales.add(new PalabraJG2(R.string.pajaroT, R.string.pajaroE, R.raw.pajaro, R.drawable.pajarito));
        nivelsGM2.put(R.string.nivel1, palabraAnimales);

        List<PalabraJG2> palabraNmeros = new LinkedList();
        palabraNmeros.add(new PalabraJG2(R.string.unoT, R.string.unoE, R.raw.uno, R.drawable.uno));
        palabraNmeros.add(new PalabraJG2(R.string.dosT, R.string.dosE, R.raw.dos, R.drawable.dos));
        palabraNmeros.add(new PalabraJG2(R.string.tresT, R.string.tresE, R.raw.tres, R.drawable.tres));
        palabraNmeros.add(new PalabraJG2(R.string.cuatroT,R.string.cuatroE, R.raw.cuatro, R.drawable.cuatro));
        palabraNmeros.add(new PalabraJG2(R.string.cincoT, R.string.polloE, R.raw.pollo, R.drawable.pollito));
        palabraNmeros.add(new PalabraJG2(R.string.seisT, R.string.seisE, R.raw.seis, R.drawable.seis));
        palabraNmeros.add(new PalabraJG2(R.string.sieteT, R.string.sieteE, R.raw.siete, R.drawable.siete));
        palabraNmeros.add(new PalabraJG2(R.string.ochoT, R.string.ochoE, R.raw.ocho, R.drawable.ocho));
        palabraNmeros.add(new PalabraJG2(R.string.nueveT, R.string.nueveE, R.raw.nueve, R.drawable.nueve));
        palabraNmeros.add(new PalabraJG2(R.string.diezT, R.string.diezE, R.raw.diez, R.drawable.diez));
        nivelsGM2.put(R.string.nivel2, palabraNmeros);

        List<PalabraJG2> palabraCuerpo = new LinkedList();
        palabraCuerpo.add(new PalabraJG2(R.string.cuelloT, R.string.cuelloE, R.raw.cuello, R.drawable.cuello));
        palabraCuerpo.add(new PalabraJG2(R.string.sangreT, R.string.sangreE, R.raw.sangre, R.drawable.sangre));
        palabraCuerpo.add(new PalabraJG2(R.string.ojoT, R.string.ojoE, R.raw.ojo, R.drawable.ojo));
        palabraCuerpo.add(new PalabraJG2(R.string.gargantaT, R.string.gargantaE, R.raw.garganta, R.drawable.garganta));
        palabraCuerpo.add(new PalabraJG2(R.string.pielT, R.string.pielE, R.raw.piel, R.drawable.piel));
        palabraCuerpo.add(new PalabraJG2(R.string.higadoT, R.string.higadoE, R.raw.higado, R.drawable.higado));
        palabraCuerpo.add(new PalabraJG2(R.string.pieT, R.string.pieE, R.raw.pie, R.drawable.pie));
        palabraCuerpo.add(new PalabraJG2(R.string.narizT, R.string.narizE, R.raw.nariz, R.drawable.nariz));
        palabraCuerpo.add(new PalabraJG2(R.string.espaldaT, R.string.espaldaE, R.raw.espalda, R.drawable.espalda));
        palabraCuerpo.add(new PalabraJG2(R.string.caraT, R.string.caraE, R.raw.cara, R.drawable.cara));
        nivelsGM2.put(R.string.nivel3, palabraCuerpo);


    }

    public static PalabraJG2 getJG2(int nivel, int pregunta) {
        Log.i("GameManager", "PreguntaGm2 requerida :" + pregunta);
        return nivelsGM2.get(nivel).get(pregunta - 1);
    }

    public static Pregunta get(int nivel, int pregunta) {
        Log.i("GameManager", "Pregunta requerida :" + pregunta);
        return nivels.get(nivel).get(pregunta);
    }
}
