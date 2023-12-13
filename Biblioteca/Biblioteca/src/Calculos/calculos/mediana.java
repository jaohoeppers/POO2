package src.Calculos.calculos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class mediana extends calculoPadrao {

    public mediana(Object[][] lista ){super(lista);}

    @Override
    public double calcula() {
        List<Integer> lista2 = new ArrayList<>();
        for (Object[] array : lista) {
            for (Object num : array) {
                lista2.add((Integer) num);
            }
        }
        Collections.sort(lista2);
        if (lista2.size() % 2 == 0) {
            return ((lista2.get(lista2.size()/2) + lista2.get(lista2.size()/2 - 1)) / 2.0);
        } else {
            return (double) lista2.get(lista2.size()/2);
        }
    }

    @Override
    public Map<Double, Integer> calcula(String nada) {
        return null;
    }
}