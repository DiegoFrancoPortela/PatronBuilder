package com.contornos;

public class BuilderPizzas {
    Pizza _pizza;

    //Método que devuelve el objeto terminado
    public Pizza build(){
        return _pizza;
    }

    //Constructor
    public BuilderPizzas() {
        _pizza = new Pizza();
    }

    public BuilderPizzas setMasa(String tipoMasa) {
        _pizza.setMasa(tipoMasa);
        return this;
    }

    public BuilderPizzas setRelleno(boolean relleno){
        _pizza.setRelleno(relleno);
        return this;
    }

}
