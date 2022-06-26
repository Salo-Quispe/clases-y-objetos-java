public class prendas_superiores {

    private String tipo;
    private String marca;
    private String color;
    private String talla;
    private int modelo;

    public prendas_superiores(String ptipo, String pmarca, String pcolor, String ptalla, int pmodelo){
        tipo =ptipo;
        marca=pmarca;
        color=pcolor;
        talla=ptalla;
        modelo=pmodelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    public String toString(){
        return "El tipo de prenda es: " +tipo+ "es de la marca" +marca+" es de color "+color+" es de la talla "+talla+" y es de "+modelo;
    }
}
