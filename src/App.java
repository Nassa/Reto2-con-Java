public class App {
    public static void main(String[] args) throws Exception {
        Prenda prenda = new Prenda();
        System.out.println(prenda.precioFinal());

        Prenda prenda1 = new Prenda(1500.0, 15, "rojo");
        System.out.println(prenda1.precioFinal());

        Pantalon prenda2 = new Pantalon(1500.0,3);
        
        System.out.println(prenda2.precioFinal());

        Prenda intem[]=new Prenda[5];
        intem[0]=new Prenda(150.0, 5,"cafe");
        intem[1]=new Pantalon(150.0, 5);
        intem[2]=new Sandalia(500.0, 10,"verde","exteriores");
        intem[3]=new Prenda();
        intem[4]=new Pantalon(600.0, 4, "morado", "levis");
        PrecioTotal analisis1 = new PrecioTotal(intem);
        analisis1.mostrarTotales();

        System.out.println("---------------------------------------------------");

        Prenda intem1[]=new Prenda[5];
        intem1[0]=new Prenda();
        intem1[1]=new Pantalon();
        intem1[2]=new Sandalia();
        intem1[3]=new Prenda();
        intem1[4]=new Pantalon();
        PrecioTotal analisis2 = new PrecioTotal(intem1);
        analisis2.mostrarTotales();

    }
}
