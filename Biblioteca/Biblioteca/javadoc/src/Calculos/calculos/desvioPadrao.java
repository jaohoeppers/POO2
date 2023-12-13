package src.Calculos.calculos;

import java.util.Map;

public class desvioPadrao extends calculoPadrao {

    public desvioPadrao(Object[][] lista ){super(lista);}

    @Override
    public double calcula() {
        return Math.sqrt(new variancia(lista).calcula());
    }

    @Override
    public Map<Double, Integer> calcula(String nada) {
        return null;
    }
}
