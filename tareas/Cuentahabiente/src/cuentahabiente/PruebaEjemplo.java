
package cuentahabiente;


public class PruebaEjemplo {

    public static void main(String[] args) {
        Cuentahabiente [] cliente=new Cuentahabiente[5];
        cliente[0]=new Cuentahabiente("A10001","Josue Manzano Ponce", 250000);
        cliente[1]=new Cuentahabiente("B20002","Javier Hernández Ponce", 500);
        cliente[2]=new Cuentahabiente("C30003","Abraham Nodal Sanchez", 1550.50f);
        cliente[3]=new Cuentahabiente("D40004","Mayra Guzman Sanchéz", 432100);
        cliente[4]=new Cuentahabiente("E50005","Alberto Dominguez Alavez", 88000.50f);
        
        cliente[0].retirarDinero(500);
        cliente[4].retirarDinero(8000.5f);
        
        for(Cuentahabiente i:cliente){
            System.out.println(i.getNombre()+" es "+i.evaluarNivelCliente()+" "+i);
        }
        
    }
    
}
