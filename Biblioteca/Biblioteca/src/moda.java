import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class moda {

    private int[] lista;
    public moda(int[] lista){
        this.lista=lista;
    }

    public double padrao(){
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int i=0; i<lista.length; i++) {
            countMap.put( lista[i], countMap.getOrDefault(lista[i], (0)) + 1);
        }
        return Collections.max(countMap.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
