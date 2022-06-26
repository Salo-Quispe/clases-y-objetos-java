public class calzado {
    private int talla;
    private String tipo;
    private String color;
    private String plantilla;
    private String marca;
    private int modelo;


    public calzado (int ptalla,String ptipo, String pcolor, String pplantilla,String pmarca, int pmodelo) {
        talla = ptalla;
        tipo = ptipo;
        color = pcolor;
        plantilla = pplantilla;
        marca = pmarca;
        modelo = pmodelo;
    }
    public int getTalla() {
        return talla;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public String getPlantilla() {
        return plantilla;
    }

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

    @Override
    public String toString(){
        return "El modelo del zapato es "+modelo+" la talla del zapato es "+ talla+ " es de tipo "+tipo+" y color "+color;}
}
