public class Prenda {
//  Constantes

    protected static final Double PRECIO_P=100.0;
    protected static final Integer TAMAÑO_P=1;
    protected static final String COLOR_P="negro";
  

//  Atributos

    protected  Double precioP;
    protected  Integer tamañoP;
    protected  String colorP; 
    

// Constructores

    public Prenda(){
        
        this.precioP=this.PRECIO_P;
        this.tamañoP=this.TAMAÑO_P;
        this.colorP=this.COLOR_P;

    }

    public Prenda(Double precioP, Integer tamanoP){

        this.precioP=precioP;
        tamaño(tamañoP);
        this.colorP=this.COLOR_P;
    }    
    public Prenda(Double precioP, Integer tamañoP, String colorP){ 

        this.precioP=precioP;
        tamaño(tamañoP);
        color(colorP);

    } 

public void color(String colorP){

    String colores[]={"negro", "cafe", "blanco", "rojo"};
    boolean encontrado=false;
    for(int i=0;i<colores.length;i++){
        if(colores[i].equals(colorP)){
            encontrado=true;
        }
    }
    if(encontrado){
        this.colorP=colorP;
    }else{
        this.colorP=this.COLOR_P;
    }
    
}
public void tamaño(Integer tamañoP){

    if(tamañoP>=1 && tamañoP<=6){
        this.tamañoP=tamañoP;
    }else{
        this.tamañoP=TAMAÑO_P;
    }
}

public double precioFinal(){
    double adicion=0;
    switch(this.colorP){
        case "negro":
        adicion+=100;
            break;
        case "cafe":
        adicion+=80;
            break;
        case "blanco":
        adicion+=70;
            break;  
        case "rojo":
        adicion+=50;
             break;  
    }

    if(this.tamañoP==1){
        adicion+=200;
    }
    else if (tamañoP==2){
        adicion+=300;
    }
    else if (tamañoP==3){
        adicion+=400;
    }
    else if (tamañoP==4){
        adicion+=500;
    }
    else if (tamañoP==5){
        adicion+=600;
    }
    else if (tamañoP==6){
        adicion+=700;
    }
    return this.precioP+adicion;
    
}

public static String getCOlorP() {
    return COLOR_P;
}

public static Double getPRecioP() {
    return PRECIO_P;
}

public static Integer getTAmañoP() {
    return TAMAÑO_P;
}

public String getColorP() {
    return colorP;
}

public void setColorP(String colorP) {
    this.colorP = colorP;
}

public Double getPrecioP() {
    return precioP;
}

public void setPrecioP(Double precioP) {
    this.precioP = precioP;
}

public Integer getTamañoP() {
    return tamañoP;
}

public void setTamañoP(Integer tamañoP) {
    this.tamañoP = tamañoP;
}


    
    
}
