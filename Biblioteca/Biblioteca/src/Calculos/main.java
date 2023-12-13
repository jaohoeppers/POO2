package Calculos;

import Calculos.calculos.amplitude;

public class main {
    public static void main(String[] args) {
        Integer[][] arr = {{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},};
//        Calculos<Integer> cal = new Calculos<Integer>(arr);
//        System.out.println(cal.variancia());
        amplitude med = new amplitude(arr);
        System.out.println(med.calcula());
    }



}

