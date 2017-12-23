package mx.com.thenewtime.e_bitwaretest.model.pojos;

import java.util.List;

/**
 * Created by Isai on 16/11/2017.
 */

public class Niveles {
    private int nivel;
    private List<Pregunta> preguntas;

    public Niveles(int nivel, List<Pregunta> preguntas) {
        this.nivel = nivel;
        this.preguntas = preguntas;
    }
}
