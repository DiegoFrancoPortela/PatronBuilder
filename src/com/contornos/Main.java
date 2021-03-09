package com.contornos;

public class Main {

    public static void main(String[] args) {
        //--------------------------------------------------------
        //Pizza pi = new Pizza();
        //Pizza especial = new Pizza("Fina", false, 2,true,"Tomate",false,true,true,false,false,true);
        //------------------------------------------------------

        Pizza baseBuilder = new BuilderPizzas()
                .setMasa("pan")
                .setRelleno(true)
                .build();

        Pizza rellenita = new BuilderPizzas()
                .setRelleno(true)
                .build();

        Pizza base = new BuilderPizzas().build();

        System.out.println(baseBuilder);
    }
}