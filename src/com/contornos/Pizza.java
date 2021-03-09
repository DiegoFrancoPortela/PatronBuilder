package com.contornos;

public class Pizza {
    private String masa;
    private boolean relleno;
    private int tipo;
    private boolean salsa;
    private String tipo_salsa;
    private boolean cebolla;
    private boolean sinGluten;
    private boolean extraQueso;
    private boolean pinha;
    private boolean champinhones;
    private boolean jamon;
    //
    private String tipoTamaño;

    public Pizza() {
        String masa = "fina";
        boolean relleno = true;
        int tipo = 2;
        boolean salsa = true;
        String tipo_salsa = "Tomate";
        boolean cebolla = true;
        boolean sinGluten = false;
        boolean extraQueso = true;
        boolean pinha = false;
        boolean champinhones = false;
        boolean jamon = true;
    }

    public Pizza(String masa, boolean relleno, int tipo, boolean salsa, String tipo_salsa, boolean cebolla, boolean sinGluten, boolean extraQueso, boolean pinha, boolean champinhones, boolean jamon) {
        this.masa = masa;
        this.relleno = relleno;
        this.tipo = tipo;
        this.salsa = salsa;
        this.tipo_salsa = tipo_salsa;
        this.cebolla = cebolla;
        this.sinGluten = sinGluten;
        this.extraQueso = extraQueso;
        this.pinha = pinha;
        this.champinhones = champinhones;
        this.jamon = jamon;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
        switch (tipo){
            case 1:
                tipoTamaño="Familiar";
                break;
            case 2:
                tipoTamaño="Mediana";
                break;
            case 3:
                tipoTamaño="Pequeña";
                break;
        }
    }

    public boolean isSalsa() {
        return salsa;
    }

    public void setSalsa(boolean salsa) {
        this.salsa = salsa;
    }

    public String getTipo_salsa() {
        return tipo_salsa;
    }

    public void setTipo_salsa(String tipo_salsa) {
        this.tipo_salsa = tipo_salsa;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public boolean isSinGluten() {
        return sinGluten;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }

    public boolean isExtraQueso() {
        return extraQueso;
    }

    public void setExtraQueso(boolean extraQueso) {
        this.extraQueso = extraQueso;
    }

    public boolean isPinha() {
        return pinha;
    }

    public void setPinha(boolean pinha) {
        this.pinha = pinha;
    }

    public boolean isChampinhones() {
        return champinhones;
    }

    public void setChampinhones(boolean champinhones) {
        this.champinhones = champinhones;
    }

    public boolean isJamon() {
        return jamon;
    }

    public void setJamon(boolean jamon) {
        this.jamon = jamon;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "masa='" + masa + '\'' +
                ", relleno=" + relleno +
                ", tipo=" + tipoTamaño +
                ", salsa=" + salsa +
                ", tipo_salsa='" + tipo_salsa + '\'' +
                ", cebolla=" + cebolla +
                ", sinGluten=" + sinGluten +
                ", extraQueso=" + extraQueso +
                ", pinha=" + pinha +
                ", champinhones=" + champinhones +
                ", jamon=" + jamon +
                '}';
    }
}