package src.Calculos;

import src.Calculos.calculos.*;

import java.util.Locale;

public class factoryCalculaPadrao {
    public static calculoPadrao criar(String tipo, Object[][] lista) {
        switch (tipo.toLowerCase(Locale.ROOT)) {
            case "media":
                return new media(lista);
            case "mediana":
                return new mediana(lista);
            case "moda":
                return new moda(lista);
            case "variancia":
                return new variancia(lista);
            case "desvio padrao":
                return new desvioPadrao(lista);
            case "frequencia":
                return new frequencia(lista);
            case "amplitude":
                return new amplitude(lista);
            default:
                throw new IllegalArgumentException("Tipo desconhecido: " + tipo);
        }
    }
}
