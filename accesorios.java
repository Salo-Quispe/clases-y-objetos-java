public class accesorios {

    private String accesorio;
    private String marca;
    private String precio;
    private String material;

    public accesorios(String paccesorio, String pmarca, String pprecio, String pmaterial){
        accesorio=paccesorio;
        marca=pmarca;
        precio=pprecio;
        material=pmaterial;
    }

    public String getAccesorio() {
        return accesorio;
    }

    public void setAccesorio(String accesorio) {
        this.accesorio = accesorio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    @Override
    public String toString(){
        return "El accesorio es: " + accesorio + " es de la marca "+marca+" cuesta "+precio+" esta hecho de "+material ;
    }
}
