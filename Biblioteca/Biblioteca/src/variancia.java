public class variancia {

    private int[] lista;
    private media media;

    public variancia(int[] lista){
        this.lista=lista;
        media = new media(lista);
    }

    public double padrao(){
        double sum = 0.0;
        for(int i=0; i<lista.length; i++) {
            sum += Math.pow(lista[i] - media.padrao(), 2);
        }
        return (sum/lista.length);
    }
}
