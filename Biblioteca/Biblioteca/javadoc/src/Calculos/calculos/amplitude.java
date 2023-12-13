package src.Calculos.calculos;

import java.util.Map;

public class amplitude extends calculoPadrao {

    public amplitude(Object[][] lista){super(lista);}

    @Override
    public double calcula() {
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for (Object[] array : lista) {
            for (Object valor : array) {
                switch (array.getClass().getTypeName()){
                    case "java.lang.Integer[]":
                        if(((Integer)valor).doubleValue() < min){
                            min = ((Integer)valor).doubleValue();
                        }
                        if(((Integer)valor).doubleValue() > max){
                            max = ((Integer)valor).doubleValue();
                        }
                        break;
                    case "java.lang.Double[]":
                        min = Math.min(min, (double) valor);
                        max = Math.max(max, (double) valor);
                        break;
                    default:
                        throw new IllegalArgumentException("Tipo desconhecido: " + array.getClass().getTypeName());
                }
            }
        }
        return max - min;
    }


    @Override
    public Map<Double, Integer> calcula(String nada) {
        return null;
    }
}
