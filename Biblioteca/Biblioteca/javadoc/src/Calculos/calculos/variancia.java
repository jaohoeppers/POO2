package src.Calculos.calculos;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class variancia extends calculoPadrao {

    public variancia(Object[][] lista ){super(lista);}

    @Override
    public double calcula() {
        List<Integer> lista2 = new ArrayList<>();
        for (Object[] array : lista) {
            for (Object num : array) {
                lista2.add((Integer) num);
            }
        }
        double sum = 0.0;
        double media = new media(lista).calcula();
        for(int i=0; i<lista2.size(); i++) {
            sum += Math.pow(lista2.get(i) - media, 2);
        }
        return (sum/lista2.size());
    }

    @Override
    public Map<Double, Integer> calcula(String nada) {
        return null;
    }
}
