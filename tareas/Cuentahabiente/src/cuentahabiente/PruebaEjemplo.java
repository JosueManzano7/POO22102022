
package cuentahabiente;


public class PruebaEjemplo {


    public static void main(String[] args) {
        
        Cuentahabiente [] cliente=new Cuentahabiente[5];
        cliente[0]=new Cuentahabiente(10001,"Josue Manzano Ponce", 250000);
        cliente[1]=new Cuentahabiente(10002,"Javier Hernandez Ponce", 500);
        cliente[2]=new Cuentahabiente(10003,"Abraham Nodal Iniestra", 1550.50f);
        cliente[3]=new Cuentahabiente(10004,"Mayra Guzman Sanchez", 432100);
        cliente[4]=new Cuentahabiente(10005,"Alberto Dominguez Alavez", 88000.50f);
        
        cliente[0].retirarDinero(500);
        cliente[4].retirarDinero(8000.50f);
        
        for(Cuentahabiente i:cliente){
            System.out.println(i.getNombre()+" es "+i.evaluarCliente()+" "+i);
        }
    }
    
}







