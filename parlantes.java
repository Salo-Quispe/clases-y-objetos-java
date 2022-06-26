public class parlantes {
    private String marca;
    private String modelo;
    private String potencia;
    private String material;
    private String color;
    private String tamanio;

    public parlantes(String pmarca, String pmodelo, String ppotencia, String pmaterial, String pcolor, String ptamanio) {
        marca = pmarca;
        modelo = pmodelo;
        potencia = ppotencia;
        material = pmaterial;
        color = pcolor;
        tamanio = ptamanio;
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

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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
        return "la marca del parlante es: " + marca + " el modelo es: "+modelo+" tiene una potencia de: "+potencia+" esta elavorado en "+material+"es de color "+color+"y mide "+tamanio;
    }
}
