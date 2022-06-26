public class Televisiones {
    private String marca;
    private String modelo;
    private String salidaAudio;
    private String sistemaOperativo;
    private String color;
    private String tamanio;

    public Televisiones(String pmarca, String pmodelo, String psalidaAudio, String psistemaOperativo, String pcolor, String ptamanio){
        marca=pmarca;
        modelo=pmodelo;
        salidaAudio=psalidaAudio;
        sistemaOperativo=psistemaOperativo;
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

    public String getSalidaAudio() {
        return salidaAudio;
    }

    public void setSalidaAudio(String salidaAudio) {
        this.salidaAudio = salidaAudio;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
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

    @Override
    public String toString(){
    return "la marca del televisor es: " + marca + " el modelo es: "+modelo+" la salida del audio es de: "+salidaAudio+" el sistema operativo es "+sistemaOperativo +"es de color "+color+"y mide "+tamanio;
    }
}
