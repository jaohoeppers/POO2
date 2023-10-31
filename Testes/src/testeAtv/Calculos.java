package testeAtv;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class Calculos {

    public double media(int[] lista){
        double total=0;
        for (int x=0; x<lista.length; x++){
            total += lista[x];
        }
        return total/lista.length;
    }

    public Integer moda(int[] lista){
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int i=0; i<lista.length; i++) {
            countMap.put( lista[i], countMap.getOrDefault(lista[i], (0)) + 1);
        }
        return Collections.max(countMap.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public Double mediana(int[] lista){
        Arrays.sort(lista);
        if (lista.length % 2 == 0) {
            return ((lista[lista.length/2] + lista[lista.length/2 - 1]) / 2.0);
        } else {
            return (double) lista[lista.length/2];
        }
    }

    public Double variancia(int[] lista){
        double sum = 0.0;
        for(int i=0; i<lista.length; i++) {
            sum += Math.pow(lista[i] - media(lista), 2);
        }
        return (sum/lista.length);
    }

    public Double desvioPadrao(int[] lista){
        return Math.sqrt(variancia(lista));
    }
}
