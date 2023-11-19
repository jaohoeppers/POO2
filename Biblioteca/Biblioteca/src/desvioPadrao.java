public class desvioPadrao {

    private int[] lista;
    private variancia variancia;
    public desvioPadrao(int[] lista){
        this.lista=lista;
        new variancia(lista);
    }

    public double padrao(){
        return Math.sqrt(variancia.padrao());
    }
}
