public class media {

    private int[] lista;

    public media(int[] lista){
       this.lista=lista;
    }

    public double padrao(){
        double total=0;
        for (int x=0; x<lista.length; x++){
            total += lista[x];
        }
        return total/lista.length;
    }
}

