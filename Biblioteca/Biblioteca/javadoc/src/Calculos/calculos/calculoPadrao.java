package src.Calculos.calculos;

import java.util.Map;

public abstract class calculoPadrao<object> {

    protected object[][] lista;

    public calculoPadrao(object[][] lista) {
        this.lista = lista;
    }

    public abstract double calcula();

    public abstract Map<Double, Integer> calcula(String nada);
}
