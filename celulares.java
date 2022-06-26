public class celulares {
    private String marca;
    private String modelo;
    private String almacenamiento;
    private String ram;
    private String procesador;
    private int cantCamaras;
    private String capBaterias;
    private String color;
    private String tamanio;

    public celulares(String pmarca, String pmodelo, String palmacenamiento, String pram, String pprocesador, int pcantCamaras, String pcapBaterias, String pcolor, String ptamanio ){
        marca=pmarca;
        modelo=pmodelo;
        almacenamiento=palmacenamiento;
        ram=pram;
        procesador=pprocesador;
        cantCamaras=pcantCamaras;
        capBaterias=pcapBaterias;
        color=pcolor;
        tamanio=ptamanio;
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

    public int getCantCamaras() {
        return cantCamaras;
    }

    public void setCantCamaras(int cantCamaras) {
        this.cantCamaras = cantCamaras;
    }

    public String getCapBaterias() {
        return capBaterias;
    }

    public void setCapBaterias(String capBaterias) {
        this.capBaterias = capBaterias;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    /* metodos*/
    @Override
    public String toString(){
        return "la marca del telefono es: " + marca + " el modelo es: "+modelo+" su almacenamiento es de: "+almacenamiento+"tiene "+ram+" de memoria ram, tiene un procesador de: "+procesador+"tiene: "+cantCamaras+", la capacidad de bateria es: "+capBaterias+" es de color "+color+"y mide "+tamanio;

    }
}

