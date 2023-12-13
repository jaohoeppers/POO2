package src.Calculos.calculos;

import java.util.HashMap;
import java.util.Map;

public class frequencia extends calculoPadrao {

    public frequencia(Object[][] lista){super(lista);}

    @Override
    public double calcula() {
        return 0;
    }

    @Override
    public Map<Object, Integer> calcula(String nada) {
        Map<Object, Integer> frequencia = new HashMap<>();
        for (Object[] array : lista) {
            for (Object valor : array) {
                frequencia.put(valor, frequencia.getOrDefault(valor, 0) + 1);
            }
        }
        return frequencia;
    }
}
