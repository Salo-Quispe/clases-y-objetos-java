public class computadoras {
    private String marca;
    private String modelo;
    private String almacenamiento;
    private String ram;
    private String procesador;
    private String color;
    private String sistemaOperativo;

    public computadoras(String pmarca, String pmodelo, String palmacenamiento, String pram, String pprocesador, String pcolor, String psistemaOperativo){
        marca=pmarca;
        modelo=pmodelo;
        almacenamiento=palmacenamiento;
        ram=pram;
        procesador=pprocesador;
        color=pcolor;
        sistemaOperativo=psistemaOperativo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
    @Override
    public String toString(){
        return "la marca de la computadora es: " + marca + " el modelo es: "+modelo+" su almacenamiento es de: "+almacenamiento+"tiene "+ram+" de memoria ram, tiene un procesador de: "+procesador+" es de color "+color+" y tiene "+sistemaOperativo;
    }
}
