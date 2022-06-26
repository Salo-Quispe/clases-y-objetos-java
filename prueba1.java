public class prueba1 {
    public static void main(String[] args) {

        System.out.println("                        Tematica #1: Tecnologia");

        System.out.println ("                           *CELULARES*");

        celulares celular1=new celulares ( "Samsung",  "A 20","32 Gb",  "3 Gb", "Exynos 7884 GPU Mali-G71",  3,  "4000 mAh", "negro", "6.4 pulgadas" );
        celulares celular2=new celulares ( "Xiaomi",  "Redmi Note 9",  "120 Gb",  "4 Gb", "Mediatec Helio G85 Octa-Core2.0",  5,  "5020 mAh", "verde",  "6.53 pulgadas" );
        celulares celular3=new celulares ("Huawei",  "P 20 Lite",  "32 Gb",  "4 Gb",  "Kirin 659",  2,  "3000 mAh", "blanco",  "5.84 pulgadas" );
        System.out.println(celular1.toString());
        System.out.println(celular2.toString());
        System.out.println(celular3.toString());

        System.out.println ("                           *TELEVISIONES*");

        Televisiones Televisiones1=new Televisiones( "LG",  "Lg ultra HD Smart Tv","20 w",  "WebOS 3.5", "negro", "43 pulgadas" );
        Televisiones Televisiones2=new Televisiones( "SAMSUNG",  "AU 8200 crystal","20 w",  "Tyzen", "negro", "75 pulgadas" );
        Televisiones Televisiones3=new Televisiones( "RIVIERA",  "RLED-AND 58 chg7if","20 w",  "Android 9.0", "negro", "58 pulgadas" );
        System.out.println(Televisiones1.toString());
        System.out.println(Televisiones2.toString());
        System.out.println(Televisiones3.toString());

        System.out.println ("                           *PARLANTES*");

        parlantes parlantes1=new parlantes( "Beta 3",  "N15A","300 w RMS", "plastico en fibra de ABS", "negro", "15 pulgadas");
        parlantes parlantes2=new parlantes( "ENGLAND SOUND",  "Sound ES-118W-DJ-PR-W","500 w", "madera-bate piedra", "negro", "18 pulgadas");
        parlantes parlantes3=new parlantes( "BAZZUKA", "BZK-115N","80000 w", "fibra celulosa", "negro", "15 pulgadas");
        System.out.println(parlantes1.toString());
        System.out.println(parlantes2.toString());
        System.out.println(parlantes3.toString());

        System.out.println ("                           *LAPTOPS*");

        laptops laptops1=new laptops( "ASUS",  "VIVOBOOK X556UK","1 Tb", "16 Gb", "Intel core i5", "Windows 10", "plomo", "15.6 pulgadas");
        laptops laptops2=new laptops( "HP",  "NoteBook Hp 240 G7","1 Tb", "8 Gb", "Intel core i7", "Windows 10 pro", "negro", "14 pulgadas");
        laptops laptops3=new laptops( "LENOVO",  "80TF0004LM","500 Gb", "2 Gb", "Intel Celerom N3350", "Windows 10 Home", "plomo", "14 pulgadas");
        System.out.println(laptops1.toString());
        System.out.println(laptops2.toString());
        System.out.println(laptops3.toString());

        System.out.println ("                           *COMPUTADORAS*");

        computadoras computadoras1=new computadoras( "DELL",  "Dell studio XPS 9000","24 Gb", "2 Gb", "Intel core i7", "negro", "Windows");
        computadoras computadoras2=new computadoras( "SAMSUNG",  "DP 300A2A-B02MX","500 Gb", "4 Gb", "Pentium G645T", "negro", "Windows 8");
        computadoras computadoras3=new computadoras( "LENOVO",  "57302192","500 Gb", "2 Gb", "Intel Atom", "plomo", "Windows 7");
        System.out.println(computadoras1.toString());
        System.out.println(computadoras2.toString());
        System.out.println(computadoras3.toString());

        System.out.println("                        Tematica #2: Moda");

        System.out.println ("                           *CALZADO*");

        calzado calzado1 = new calzado(40,"deportivo","negro","Ortopedica", "Adidas",2022);
        calzado calzado2 = new calzado(44,"casual","cafe","normal", "Tomy",2022);
        calzado calzado3 = new calzado(44,"Tacos","blanco","normal", "Prada",2022);
        System.out.println(calzado1.toString());
        System.out.println(calzado2.toString());
        System.out.println(calzado3.toString());

        System.out.println ("                           *ACCESORIOS*");

        accesorios accesorios1 = new accesorios("reloj","Rolex","$14.95","plata");
        accesorios accesorios2 = new accesorios("cadena","GRAFF","$348.00","oro");
        accesorios accesorios3 = new accesorios("gorra","Adidas","$20.99","Algodon");
        System.out.println(accesorios1.toString());
        System.out.println(accesorios2.toString());
        System.out.println(accesorios3.toString());

        System.out.println ("                           *PANTALONES*");

        pantalones pantalones1 = new pantalones("jean","azul","S", 2021);
        pantalones pantalones2 = new pantalones("calentador","Belge","M",2020);
        pantalones pantalones3 = new pantalones("Vaquero","cafe","XL",2019);
        System.out.println(pantalones1.toString());
        System.out.println(pantalones2.toString());
        System.out.println(pantalones3.toString());

        System.out.println ("                           *PRENDAS DEL TORSO*");

        prendas_superiores prendas_superiores1 = new prendas_superiores("blusa", "Zara", "blanco","S", 2021);
        prendas_superiores prendas_superiores2 = new prendas_superiores("sueter","Adidas", "cafe","XL", 2019);
        prendas_superiores prendas_superiores3 = new prendas_superiores("camiseta", "Tommy", "cafe","XL", 2019);
        System.out.println(prendas_superiores1.toString());
        System.out.println(prendas_superiores2.toString());
        System.out.println(prendas_superiores3.toString());

        System.out.println ("                           *PRENDAS DEPORTIVAS*");

        deportivo deportivo1 = new deportivo("licra","Nike","rojo", "S", 2019);
        deportivo deportivo2 = new deportivo("chompa", "Adidas", "camuflado","X",2022);
        deportivo deportivo3 = new deportivo("camisetilla deportiva", "Reebook", "blanco","M",2018);
        System.out.println(deportivo1.toString());
        System.out.println(deportivo2.toString());
        System.out.println(deportivo3.toString());
    }
}
