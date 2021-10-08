public class PrecioTotal {
    //Atributos
    private double totalPrenda;
    private double totalPantalon;
    private double totalSandalia;
    private Prenda[] listaprendas;

        //Constructor

    public PrecioTotal (Prenda[] listaprendas){
        this.totalPantalon=0;
        this.totalPrenda=0;
        this.totalSandalia=0;
        this.listaprendas=listaprendas;

    }

    
        //Metodos
    
    public void mostrarTotales() {

        for(int i=0;i<listaprendas.length;i++){

            if (listaprendas[i] instanceof Prenda){
                totalPrenda+=listaprendas[i].precioFinal();
            
            }
            if(listaprendas[i] instanceof Pantalon){
                totalPantalon+=listaprendas[i].precioFinal();
            }

            if(listaprendas[i] instanceof Sandalia){
                totalSandalia+=listaprendas[i].precioFinal();
            }
        }

        System.out.println("La suma del precio de las Prendas es de "+totalPrenda);
        System.out.println("La suma del precio de los Pantalones es de "+ totalPantalon);
        System.out.println("La suma del precio de las SAndalias es de "+totalSandalia);   
    }   
    
}
