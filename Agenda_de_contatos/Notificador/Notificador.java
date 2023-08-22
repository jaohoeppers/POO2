package Notificador;

public class Notificador {

    public String notificarW(Whatsapp fonte){
        return "mensagem enviada por"+ fonte.notificacao();
    }

    public String notificarE(Email fonte){
        return "mensagem enviada por"+ fonte.notificacao();
    }

    public String notificarS(SMS fonte){
        return "mensagem enviada por"+ fonte.notificacao();
    }
}



