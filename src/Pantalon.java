public class Pantalon extends Prenda {
    
        private final static String MARCA="adidas";

        protected String marca;

        // Constructor

        public Pantalon(){

            super.precioP=Prenda.PRECIO_P;
            super.colorP=super.COLOR_P;
            super.tamañoP=this.TAMAÑO_P;
            this.marca=this.MARCA;
            //super.setPrecio(PRECIO_P);
            //super.setColor(COLOR_P);
            //super.setPrecioP(PRECIO_P);
        }    
    
        public Pantalon(Double precioP, Integer tamañoP){
            super.precioP=precioP;
            super.tamaño(tamañoP);
            super.colorP=super.COLOR_P;
            this.marca=this.MARCA;    
        }    

        public Pantalon(Double precioP, Integer tamañoP, String colorP, String marca){
            super(precioP, tamañoP, colorP);
            marca(marca);
        }

        public void marca(String marca){

            String marcas[]={"adidas", "puma", "levis"};
            boolean encontrado=false;

            for(int i=0;i<marcas.length;i++){
                if(marcas[i].equals(marca)){
                    encontrado=true;
                }
            }
            if(encontrado){
                this.marca=marca;
            }else{
                this.marca=this.MARCA;
            }
            
        }
       // public void tamaño(Integer tamañoP){
        
           // if(tamañoP>=1 && tamañoP<=6){
               // this.tamañoP=tamañoP;
           // }else{
             //   this.tamañoP=TAMAÑO_P;
         //   }
       // }

        public double precioFinal(){

            double adicion=0;
            
            switch(this.marca){
                case "adidas":
                adicion+=50;
                    break;
                case "puma":
                adicion+=30;
                    break;
                case "levis":
                adicion+=70;
                    break;  
        
            }
            return adicion+super.precioFinal();
        }

    
}
