    public class Sandalia extends Prenda {
    
        private final static String USO="doble";

        protected String uso;

        // Constructor

        public Sandalia(){

            super.precioP=Prenda.PRECIO_P;
            super.colorP=COLOR_P;
            super.tamañoP=TAMAÑO_P;
            this.uso=this.USO;
            //super.setPrecio(PRECIO_P);
            //super.setColor(COLOR_P);
            //super.setPrecioP(PRECIO_P);
        }    
    
        public Sandalia (Double precioP, String colorP){

            super.precioP=precioP;
            super.tamaño(tamañoP);
            super.colorP=super.COLOR_P;
            this.uso=this.USO;    
        }    

        public Sandalia (Double precioP, Integer tamañoP, String colorP, String uso){
            super(precioP, tamañoP, colorP);
            uso(uso);
        }

        public void uso(String uso){

            String usos[]={"exteriores", "interiores", "doble"};
            boolean encontrado=false;

            for(int i=0;i<usos.length;i++){
                if(usos[i].equals(uso)){
                    encontrado=true;
                }
            }
            if(encontrado){
                this.uso=uso;
            }else{
                this.uso=this.USO;
            }
            
        }
        // public void tamaño(Integer tamañoP){
        
        //    if(tamañoP>=1 && tamañoP<=6){
        //         this.tamañoP=tamañoP;
        //     }else{
        //         this.tamañoP=TAMAÑO_P;
        //    }
        // }

        public double precioFinal(){

            double adicion=0;
            
            switch(this.uso){
                case "exteriores":
                adicion+=50;
                    break;
                case "interiores":
                adicion+=30;
                    break;
                case "doble":
                adicion+=70;
                    break;  
        
            }
            return adicion+super.precioFinal();
        }

    
}
    

