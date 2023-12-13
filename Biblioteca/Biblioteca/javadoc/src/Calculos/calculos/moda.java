package src.Calculos.calculos;

import java.util.*;

public class moda extends calculoPadrao {

    public moda(Object[][] lista ){super(lista);}

    @Override
    public double calcula(){
        List<Integer> lista2 = new ArrayList<>();
        for (Object[] array : lista) {
            for (Object num : array) {
                lista2.add((Integer) num);
            }
        }
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int i=0; i<lista2.size(); i++) {
            countMap.put( lista2.get(i), countMap.getOrDefault(lista2.get(i), 0) + 1);
        }
        return Collections.max(countMap.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    @Override
    public Map<Double, Integer> calcula(String nada) {
        return null;
    }

}
