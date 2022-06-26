public class pantalones {
    private String tipo;
    private String color;
    private String talla;
    private int modelo;

    public pantalones(String ptipo, String pcolor, String ptalla, int pmodelo) {
        tipo = ptipo;
        color = pcolor;
        talla = ptalla;
        modelo = pmodelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        return "El tipo de pantalon es: " +tipo+ " es de color "+color+" es de la talla "+talla+" yb es de "+modelo;
    }
}
