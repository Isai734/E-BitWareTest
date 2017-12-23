package mx.com.thenewtime.e_bitwaretest.utils;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.mosso.abi.apptest.R;
import com.mosso.abi.apptest.model.local.ContractDB;
import com.mosso.abi.apptest.model.pojos.Clasificacion;
import com.mosso.abi.apptest.model.pojos.PalabraDiccionario;
import com.mosso.abi.apptest.utils.prefs.SessionPreferences;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Babi-Mosso on 21/11/2017.
 */

public class DiccionarioManager {

    private Context context;
    SQLiteDatabase database;
    static List<PalabraDiccionario> palabras;
    private List<Clasificacion> clasificacions;

    static {
        palabras = new LinkedList();

        palabras.add(new PalabraDiccionario(R.string.animales, R.string.cangrejoT, R.string.cangrejoE, R.raw.cangrejo, R.drawable.cangrejito, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.polloT, R.string.polloE, R.raw.pollo, R.drawable.pollito, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.gatoT, R.string.gatoE, R.raw.gato, R.drawable.gatito, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.mariposaT, R.string.mariposaE, R.raw.mariposa, R.drawable.mariposita, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.pescadoT, R.string.pescadoE, R.raw.pescado, R.drawable.pecesito, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.garrapataT, R.string.garrapataE, R.raw.garrapata, R.drawable.garrapatita, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.lagartijaT, R.string.lagartijaE, R.raw.lagartija, R.drawable.lagartijita, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.perroT, R.string.perroE, R.raw.perro, R.drawable.perrito, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.avispaT, R.string.avispaE, R.raw.avispa, R.drawable.avispita, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.camaronT, R.string.camaronE, R.raw.camaron, R.drawable.caramaroncito, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.conejoT, R.string.conejoE, R.raw.conejo, R.drawable.conejito, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.hormigaT, R.string.hormigaE, R.raw.hormiga, R.drawable.hormiga, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.tigreT, R.string.tigreE, R.raw.tigre, R.drawable.tigrito, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.zorroT, R.string.zorroE, R.raw.zorro, R.drawable.zorrito, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.pajaroT, R.string.pajaroE, R.raw.pajaro, R.drawable.pajarito, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.zancudoT, R.string.zancudoE, R.raw.zancudo, R.drawable.zancudito, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.murcielagoT, R.string.murcielagoE, R.raw.murcielago, R.drawable.murcielago, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.resT, R.string.resE, R.raw.res, R.drawable.vaca, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.venadoT, R.string.venadoE, R.raw.venado, R.drawable.venado, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.zorrilloT, R.string.zorrilloE, R.raw.zorrillo, R.drawable.zorrillo, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.viboraT, R.string.viboraE, R.raw.vibora, R.drawable.vivora, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.marranoT, R.string.marranoE, R.raw.marrano, R.drawable.marrano, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.jabaliT, R.string.jabaliE, R.raw.jabali, R.drawable.jabali, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.chicatanaT, R.string.chicatanaE, R.raw.chicatana, R.drawable.chicatana, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.aguilaT, R.string.aguilaE, R.raw.aguila, R.drawable.aguila, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.armadilloT, R.string.armadilloE, R.raw.armadillo, R.drawable.armadilloo, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.ranaT, R.string.ranaE, R.raw.rana, R.drawable.rana, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.galloT, R.string.galloE, R.raw.gallo, R.drawable.gallo, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.gallinaT, R.string.gallinaE, R.raw.gallina, R.drawable.gallina, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.moscaT, R.string.moscaE, R.raw.mosca, R.drawable.mosca, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.gusanoT, R.string.gusanoE, R.raw.gusano, R.drawable.gusanoo, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.ratonT, R.string.ranaE, R.raw.raton, R.drawable.rata, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.tlacuacheT, R.string.tlacuacheE, R.raw.tlacuache, R.drawable.tlacuache, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.piojoT, R.string.piojoE, R.raw.piojo, R.drawable.piojo, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.animalT, R.string.animalE, R.raw.animal, R.drawable.animal, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.animales, R.string.burroT, R.string.burroE, R.raw.burro, R.drawable.burro, R.string.variante));


        palabras.add(new PalabraDiccionario(R.string.numerosT, R.string.unoT, R.string.unoE, R.raw.uno, R.drawable.uno, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.numerosT, R.string.dosT, R.string.dosE, R.raw.dos, R.drawable.dos, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.numerosT, R.string.tresT, R.string.tresE, R.raw.tres, R.drawable.tres, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.numerosT, R.string.cuatroT, R.string.cuatroE, R.raw.cuatro, R.drawable.cuatro, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.numerosT, R.string.cincoT, R.string.cincoE, R.raw.cinco, R.drawable.cinco, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.numerosT, R.string.seisT, R.string.seisE, R.raw.seis, R.drawable.seis, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.numerosT, R.string.sieteT, R.string.sieteE, R.raw.siete, R.drawable.siete, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.numerosT, R.string.ochoT, R.string.ochoE, R.raw.ocho, R.drawable.ocho, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.numerosT, R.string.nueveT, R.string.nueveE, R.raw.nueve, R.drawable.nueve, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.numerosT, R.string.diezT, R.string.diezE, R.raw.diez, R.drawable.diez, R.string.variante));

        palabras.add(new PalabraDiccionario(R.string.cosasCasa, R.string.ollaT, R.string.ollaE, R.raw.olla, R.drawable.olla, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.cosasCasa, R.string.hiloT, R.string.hiloE, R.raw.hilo, R.drawable.hilo, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.cosasCasa, R.string.limpioT, R.string.limpioE, R.raw.limpio, R.drawable.limpio, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.cosasCasa, R.string.buleT, R.string.buleE, R.raw.bule, R.drawable.bule, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.cosasCasa, R.string.humoT, R.string.humoE, R.raw.humo, R.drawable.humo, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.cosasCasa, R.string.mielT, R.string.mielE, R.raw.miel, R.drawable.miel, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.cosasCasa, R.string.calT, R.string.calE, R.raw.cal, R.drawable.cal, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.cosasCasa, R.string.puertaT, R.string.puertaE, R.raw.puerta, R.drawable.puerta, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.cosasCasa, R.string.cucharaT, R.string.cucharaE, R.raw.cuchara, R.drawable.cuchara, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.cosasCasa, R.string.macheteT, R.string.macheteE, R.raw.machete, R.drawable.machere, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.cosasCasa, R.string.cuchilloT, R.string.cuchilloE, R.raw.cuchillo, R.drawable.cuchillo, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.cosasCasa, R.string.servilletaT, R.string.servilletaE, R.raw.servilleta, R.drawable.servilleta, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.cosasCasa, R.string.tortillaT, R.string.tortillaE, R.raw.tortilla, R.drawable.tortilla, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.cosasCasa, R.string.casaT, R.string.casaE, R.raw.casa, R.drawable.casa, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.cosasCasa, R.string.atoleT, R.string.atoleE, R.raw.atole, R.drawable.atole, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.cosasCasa, R.string.nixtamalT, R.string.nixtamalE, R.raw.nixtamal, R.drawable.nixtamal, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.cosasCasa, R.string.ocoteT, R.string.ocoteE, R.raw.ocote, R.drawable.ocote, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.cosasCasa, R.string.sillaT, R.string.sillaE, R.raw.silla, R.drawable.silla, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.cosasCasa, R.string.platoT, R.string.platoE, R.raw.plato, R.drawable.plato, R.string.variante));


        palabras.add(new PalabraDiccionario(R.string.frutVeLe, R.string.frijolT, R.string.frijolE, R.raw.frijol, R.drawable.frijol, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.frutVeLe, R.string.cebollaT, R.string.cebollaE, R.raw.cebolla, R.drawable.cebolla, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.frutVeLe, R.string.semillaT, R.string.servilletaE, R.raw.semilla, R.drawable.semilla, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.frutVeLe, R.string.jitomateT, R.string.jitomateE, R.raw.jitomate, R.drawable.jitomate, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.frutVeLe, R.string.pinaE, R.string.pinaE, R.raw.pinia, R.drawable.pinia, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.frutVeLe, R.string.caniaT, R.string.caniaE, R.raw.cania, R.drawable.cania, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.frutVeLe, R.string.guayabaT, R.string.guayabaE, R.raw.guayaba, R.drawable.gayaba, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.frutVeLe, R.string.chileT, R.string.chileE, R.raw.chile, R.drawable.chilee, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.frutVeLe, R.string.eloteT, R.string.eloteE, R.raw.elote, R.drawable.elote, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.frutVeLe, R.string.jicamaT, R.string.jicamaT, R.raw.jicama, R.drawable.jicama, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.frutVeLe, R.string.maizT, R.string.maizE, R.raw.maiz, R.drawable.maiz, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.frutVeLe, R.string.naranjaT, R.string.naranjaE, R.raw.naranja, R.drawable.naranjaa, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.frutVeLe, R.string.aguacateT, R.string.aguacateE, R.raw.aguacate, R.drawable.aguacate, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.frutVeLe, R.string.calabazaT, R.string.calabazaE, R.raw.calabaza, R.drawable.calabaza, R.string.variante));

        palabras.add(new PalabraDiccionario(R.string.general, R.string.muchachoT, R.string.muchachoE, R.raw.muchacho, R.drawable.muchacho, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.escalofrioT, R.string.escalofrioE, R.raw.escalofrio, R.drawable.escalofrio, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.arbolT, R.string.arbolE, R.raw.arbol, R.drawable.arbol, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.chicoT, R.string.chicoE, R.raw.chico, R.drawable.chico, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.gruesoT, R.string.gruesoE, R.raw.grueso, R.drawable.grueso, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.enfermedadT, R.string.muchachoE, R.raw.muchacho, R.drawable.muchacho, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.mecateT, R.string.mecateE, R.raw.mecate, R.drawable.mecate, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.muyT, R.string.muyE, R.raw.muy, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.hayT, R.string.hayE, R.raw.hay, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.senorT, R.string.senorE, R.raw.senior, R.drawable.senior, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.medicinaT, R.string.medicinaE, R.raw.medicina, R.drawable.medicina, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.terminadoT, R.string.terminadoE, R.raw.terminado, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.diaT, R.string.diaE, R.raw.dia, R.drawable.dia, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.palmaT, R.string.palmaE, R.raw.palma, R.drawable.palma, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.personaT, R.string.personaE, R.raw.persona, R.drawable.persona, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.tempranoT, R.string.tempranoE, R.raw.temprano, R.drawable.temprano, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.huaracheT, R.string.huaracheE, R.raw.huarache, R.drawable.huarache, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.vinisteT, R.string.vinisteE, R.raw.veniste, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.hacesT, R.string.hacesE, R.raw.haces, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.correT, R.string.correE, R.raw.corre, R.drawable.corre, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.piedraT, R.string.piedraE, R.raw.piedra, R.drawable.piedra, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.mujerT, R.string.mujerE, R.raw.mujer, R.drawable.mujer, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.lunaT, R.string.lunaE, R.raw.luna, R.drawable.luna, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.sentadoT, R.string.sentadoE, R.raw.sentado, R.drawable.sentado, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.mananaT, R.string.mananiaE, R.raw.manana, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.florT, R.string.florE, R.raw.flor, R.drawable.flor, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.largoT, R.string.largoE, R.raw.largo, R.drawable.largo, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.calienteT, R.string.calienteE, R.raw.caliente, R.drawable.calientee, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.ninioT, R.string.ninoE, R.raw.nino, R.drawable.ninio, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.hijoT, R.string.hijoE, R.raw.hijo, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.lumbreT, R.string.lumbreE, R.raw.lumbre, R.drawable.fuego, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.cancionT, R.string.cancionE, R.raw.cancion, R.drawable.cancion, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.calzonT, R.string.calzonE, R.raw.calzon, R.drawable.calzon, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.cuentoT, R.string.cuentoE, R.raw.cuento, R.drawable.cuento, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.petateT, R.string.petateE, R.raw.petate, R.drawable.petate, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.raizT, R.string.raizT, R.raw.raiz, R.drawable.raiz, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.solT, R.string.solE, R.raw.sol, R.drawable.sol, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.morralT, R.string.morralE, R.raw.morral, R.drawable.morral, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.tioT, R.string.tioE, R.raw.tio, R.drawable.tio, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.levantateT, R.string.levantaE, R.raw.levantate, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.graciasT, R.string.graciasE, R.raw.gracias, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.sacerdoteT, R.string.sacerdoteE, R.raw.sacerdote, R.drawable.sacerdote, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.muchachaT, R.string.muchachaE, R.raw.muchacha, R.drawable.muchacha, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.mioT, R.string.mioE, R.raw.mio, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.sobrinoT, R.string.sobrinoE, R.raw.sobrino, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.fuerteT, R.string.fuerteE, R.raw.fuerte, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.aquiT, R.string.aquiE, R.raw.aqui, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.carcelT, R.string.carcelE, R.raw.carcel, R.drawable.carcel, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.aireT, R.string.aireE, R.raw.aire, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.tieneT, R.string.tieneE, R.raw.tiene, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.primeroT, R.string.primeroE, R.raw.primero, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.diabloT, R.string.diabloE, R.raw.diablo, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.mananiaT, R.string.mananiaE, R.raw.manana, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.extranioT, R.string.extranoE, R.raw.extranio, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.muchoT, R.string.muchoE, R.raw.mucho, R.drawable.mucho, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.duroT, R.string.duroE, R.raw.duro, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.escribirT, R.string.escribirE, R.raw.escribir, R.drawable.escribir, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.dicenT, R.string.dicenE, R.raw.dicen, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.aguaT, R.string.aguaE, R.raw.agua, R.drawable.aguaa, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.camisaT, R.string.camisaE, R.raw.camisa, R.drawable.camisa, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.cerroT, R.string.cerroE, R.raw.cerro, R.drawable.cerro, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.tiernoT, R.string.tierraE, R.raw.tierra, R.drawable.tierra, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.bonitoT, R.string.bonitoE, R.raw.bonito, R.drawable.bonito, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.pocoT, R.string.pocoE, R.raw.poco, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.tQuieroT, R.string.tQuieroE, R.raw.tequiero, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.abiertoT, R.string.abiertoE, R.raw.abierto, R.drawable.abierto, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.morireT, R.string.morireE, R.raw.morire, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.ayudarT, R.string.ayudaraE, R.raw.ayudar, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.iliatencoT, R.string.iliatencoE, R.raw.iliatenco, R.drawable.iliatenco, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.golpearT, R.string.golpearE, R.raw.golpear, R.drawable.golpear, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.darasT, R.string.darasE, R.raw.daras, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.levantaras, R.string.levantarasE, R.raw.levantaras, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.habraT, R.string.habraE, R.raw.habra, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.pisaraT, R.string.pisaraE, R.raw.pisara, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.harasT, R.string.harasE, R.raw.haces, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.noHarasT, R.string.noHarasE, R.raw.noharas, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.viviraT, R.string.viviraE, R.raw.vivira, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.soloT, R.string.soloE, R.raw.solo, R.drawable.solo, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.cadaT, R.string.cadaE, R.raw.cada, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.buscaraT, R.string.buscaraE, R.raw.buscara, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.alratoT, R.string.alratoE, R.raw.alrato, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.nombreT, R.string.nombreE, R.raw.nombre, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.nocheT, R.string.nocheE, R.raw.noche, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.otraVezT, R.string.otraVezE, R.raw.otravez, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.comerT, R.string.comerE, R.raw.comer, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.cieloT, R.string.cieloE, R.raw.cielo, R.drawable.cielo, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.esPobreT, R.string.esPobreE, R.raw.espobre, R.drawable.pobre, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.picosoT, R.string.picosoE, R.raw.picoso, R.drawable.picoso, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.daninoT, R.string.dañinoE, R.raw.malo, R.drawable.mal, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.secoT, R.string.secoE, R.raw.seco, R.drawable.seco, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.bordadoT, R.string.bordadoE, R.raw.bordado, R.drawable.bordado, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.duermeT, R.string.duermeE, R.raw.duerme, R.drawable.duerme, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.sedT, R.string.sedE, R.raw.sed, R.drawable.sed, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.voyT, R.string.voyE, R.raw.voy, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.dueleT, R.string.dueleE, R.raw.duele, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.senoraT, R.string.senoraE, R.raw.seniora, R.drawable.mujer, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.quieresT, R.string.quieresE, R.raw.quieres, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.quieroT, R.string.quieroE, R.raw.quiero, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.basuraT, R.string.basuraE, R.raw.basura, R.drawable.basura, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.digoT, R.string.digoE, R.raw.digo, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.hablaT, R.string.hablaE, R.raw.habla, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.tiemblaT, R.string.tiemblaE, R.raw.tiembla, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.noEstaT, R.string.noEstaE, R.raw.noesta, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.cigarroT, R.string.cigarroE, R.raw.cigarro, R.drawable.cigarro, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.queT, R.string.queE, R.raw.que, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.platanoT, R.string.platanoE, R.raw.platano, R.drawable.platano, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.dificilT, R.string.dificilE, R.raw.dificil, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.pobreT, R.string.pobreE, R.raw.espobre, R.drawable.pobre, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.cuantoT, R.string.cuantoE, R.raw.cuanto, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.frioT, R.string.frioE, R.raw.frio, R.drawable.frio, R.string.variante));
        //palabras.add(new PalabraDiccionario(R.string.general, R.string.bajoT, R.string.bajoE, R.raw.bajo, R.drawable.holi,R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.seTiroT, R.string.seTiroE, R.raw.setiro, R.drawable.setiro, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.voloT, R.string.voloE, R.raw.volo, R.drawable.volar, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.ningunoT, R.string.ningunoE, R.raw.ninguno, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.nuevoT, R.string.nuevoE, R.raw.nuevo, R.drawable.nuevo, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.pagarT, R.string.pagarE, R.raw.pagar, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.mundoT, R.string.mundoE, R.raw.mundo, R.drawable.mundo, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.trabajoT, R.string.trabajoE, R.raw.trabajo, R.drawable.trabajo, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.ayerT, R.string.ayerE, R.raw.ayer, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.delgadoT, R.string.delgadoE, R.raw.delgado, R.drawable.delgado, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.quienSabeT, R.string.quienSabeE, R.raw.quiensabe, R.drawable.quiensabe, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.altoT, R.string.altoE, R.raw.alto, R.drawable.alto, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.dulceT, R.string.dulceE, R.raw.dulce, R.drawable.dulce, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.suaveT, R.string.suaveE, R.raw.suave, R.drawable.suave, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.muertoT, R.string.muertoE, R.raw.muerto, R.drawable.muerto, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.saludoTardeT, R.string.saludoTardeE, R.raw.buenastardes, R.drawable.amanecer, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.salidoMananaT, R.string.salidoMananaE, R.raw.buenosdias, R.drawable.dia, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.hombreT, R.string.hombreE, R.raw.hombre, R.drawable.senior, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.silencioT, R.string.silencioE, R.raw.silencio, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.abueloT, R.string.abueloE, R.raw.abuelo, R.drawable.abuelo, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.feoT, R.string.feoE, R.raw.feo, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.huevoT, R.string.huevoE, R.raw.huevo, R.drawable.huevo, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.cascadaT, R.string.cascadaE, R.raw.cascada, R.drawable.cascada, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.telaT, R.string.telaE, R.raw.ropa, R.drawable.tela, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.espanolT, R.string.espaniolE, R.raw.espaniol, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.puebloT, R.string.puebloE, R.raw.pueblo, R.drawable.iliatenco, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.lecheT, R.string.lecheE, R.raw.leche, R.drawable.leche, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.vozT, R.string.vozE, R.raw.voz, R.drawable.holi, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.chilpacingoT, R.string.chilpacingoE, R.raw.chilpancingo, R.drawable.chilpancingo, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.tiernoT, R.string.tiernoE, R.raw.tierno, R.drawable.tiernoo, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.hinchazonT, R.string.hinchazonE, R.raw.hinchazon, R.drawable.hinchazon, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.mojadoT, R.string.mojadoE, R.raw.mojado, R.drawable.mojado, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.mantecaT, R.string.mantecaE, R.raw.manteca, R.drawable.manteca, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.general, R.string.dineroT, R.string.dineroE, R.raw.dinero, R.drawable.dinero, R.string.variante));


        palabras.add(new PalabraDiccionario(R.string.cuerpo, R.string.cuelloT, R.string.cuelloE, R.raw.cuello, R.drawable.cuello, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.cuerpo, R.string.sangreT, R.string.sangreE, R.raw.sangre, R.drawable.sangre, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.cuerpo, R.string.ojoT, R.string.ojoE, R.raw.ojo, R.drawable.ojo, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.cuerpo, R.string.pielT, R.string.pielE, R.raw.piel, R.drawable.piel, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.cuerpo, R.string.higadoT, R.string.higadoE, R.raw.higado, R.drawable.higado, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.cuerpo, R.string.gargantaT, R.string.gargantaE, R.raw.garganta, R.drawable.garganta, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.cuerpo, R.string.estomagoT, R.string.estomagoE, R.raw.estomago, R.drawable.estomago, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.cuerpo, R.string.pieT, R.string.pieE, R.raw.pie, R.drawable.pie, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.cuerpo, R.string.manoT, R.string.manoE, R.raw.mano, R.drawable.mano, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.cuerpo, R.string.orejaT, R.string.orejaE, R.raw.oreja, R.drawable.oreja, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.cuerpo, R.string.narizT, R.string.narizE, R.raw.nariz, R.drawable.nariz, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.cuerpo, R.string.espaldaT, R.string.espaldaE, R.raw.espalda, R.drawable.espalda, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.cuerpo, R.string.peloT, R.string.peloE, R.raw.pelo, R.drawable.pelo, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.cuerpo, R.string.dienteT, R.string.dienteE, R.raw.diente, R.drawable.diente, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.cuerpo, R.string.huesoT, R.string.huesoE, R.raw.hueso, R.drawable.hueso, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.cuerpo, R.string.caraT, R.string.caraE, R.raw.cara, R.drawable.cara, R.string.variante));


        palabras.add(new PalabraDiccionario(R.string.colores, R.string.negroT, R.string.negroE, R.raw.negro, R.drawable.negro, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.colores, R.string.violetaT, R.string.violetaE, R.raw.violeta, R.drawable.violeta, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.colores, R.string.blancoT, R.string.blancoE, R.raw.blanco, R.drawable.blanco, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.colores, R.string.rojoT, R.string.rojoE, R.raw.rojo, R.drawable.rojo, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.colores, R.string.verdeT, R.string.verdeE, R.raw.verde, R.drawable.verde, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.colores, R.string.amarilloT, R.string.amarilloE, R.raw.amarillo, R.drawable.amarillo, R.string.variante));
        palabras.add(new PalabraDiccionario(R.string.colores, R.string.cafeT, R.string.cafeE, R.raw.cafe, R.drawable.cafe, R.string.variante));

        //Clasificaciones


    }

    private DiccionarioManager(Context context, SQLiteDatabase database) {
        this.context = context;
        this.database = database;
    }

    @SuppressLint("StaticFieldLeak")
    private static DiccionarioManager INSTANCE;

    public static DiccionarioManager get(Context context, SQLiteDatabase database) {
        if (INSTANCE == null) {
            INSTANCE = new DiccionarioManager(context, database);
        }
        return INSTANCE;
    }

    public void createInitDatabase() {
        insert();
        insertCategorias();
    }

    private void insert() {
        for (PalabraDiccionario palabra : palabras) {
            save(palabra);
        }
    }

    private void save(PalabraDiccionario palabra) {
        ContentValues values = new ContentValues();
        values.put(ContractDB.ColumnasPalabra.PALABRA_TLAPANECO, palabra.getPalabraTlapaneco());
        values.put(ContractDB.ColumnasPalabra.LOCAL, "S");
        values.put(ContractDB.ColumnasPalabra.PALABRA_ESPANIOL, context.getResources().getString(palabra.getPalabraEspaniol()));
        values.put(ContractDB.ColumnasPalabra.IMAGE_NAME, palabra.getImagen());
        values.put(ContractDB.ColumnasPalabra.SONIDO_NAME, palabra.getSondPronunciaon());
        values.put(ContractDB.ColumnasPalabra.CLASIFICACION_IDCLASIFICACION, context.getResources().getString(palabra.getClasificacion()));
        values.put(ContractDB.ColumnasPalabra.USUARIO_EMAIL, SessionPreferences.get(context).getEmailCliente());
        database.insert(ContractDB.PALABRA, null, values);
    }

    private void insertCategorias() {
        clasificacions = new LinkedList<>();
        clasificacions.add(new Clasificacion(R.string.frutVeLe, context.getResources().getString(R.string.frutVeLe)));
        clasificacions.add(new Clasificacion(R.string.animales, context.getResources().getString(R.string.animales)));
        clasificacions.add(new Clasificacion(R.string.numerosT, context.getResources().getString(R.string.numerosT)));
        clasificacions.add(new Clasificacion(R.string.cosasCasa, context.getResources().getString(R.string.cosasCasa)));
        clasificacions.add(new Clasificacion(R.string.frutVeLe, context.getResources().getString(R.string.frutVeLe)));
        clasificacions.add(new Clasificacion(R.string.general, context.getResources().getString(R.string.general)));
        clasificacions.add(new Clasificacion(R.string.cuerpo, context.getResources().getString(R.string.cuerpo)));
        clasificacions.add(new Clasificacion(R.string.colores, context.getResources().getString(R.string.colores)));

        for (Clasificacion clasificacion : clasificacions) {
            ContentValues values = new ContentValues();
            values.put(ContractDB.ColumnasClasificacion._ID, clasificacion.getIdClasificacion());
            values.put(ContractDB.ColumnasClasificacion.TIPO, clasificacion.getTipo());
            database.insert(ContractDB.CLASIFICACION, null, values);
        }
    }
}

