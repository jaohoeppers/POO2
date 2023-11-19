import java.util.Arrays;
public class mediana {

    private int[] lista;
    public mediana(int[] lista){
        this.lista=lista;
    }

    public double padrao(){
        Arrays.sort(lista);
        if (lista.length % 2 == 0) {
            return ((lista[lista.length/2] + lista[lista.length/2 - 1]) / 2.0);
        } else {
            return (double) lista[lista.length/2];
        }
    }
}
