package src.Calculos.calculos;

import java.util.Map;

public class media extends calculoPadrao {

    public media(Object[][] lista ){
        super(lista);
    }

    @Override
    public double calcula(){
        double total=0;
        int vals = 0;
        for (int x=0; x<lista.length; x++){
            for (int y=0; y<lista[x].length; y++) {
                total += (Integer) lista[x][y];
                vals++;
            }

        }
        return total/vals;
    }

    @Override
    public Map<Double, Integer> calcula(String nada) {
        return null;
    }

}
