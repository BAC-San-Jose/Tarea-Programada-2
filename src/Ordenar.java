import java.util.Scanner; 
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que ordena los datos de la tabla de la ventana "ListaClientes"
 */
public class Ordenar {   
    
    private Scanner leer = new Scanner(System.in); 
    ArrayList arreglo;
    
    public Ordenar (ArrayList arreglo){
        this.arreglo = arreglo;
    }
    
    /**
     * 
     * @param nombres 
     */
    public void leer( String [] n){ 
        int tamaño = n.length; 
        for (int i = 0 ; i < tamaño ; i++ ){ 
            System.out.println(n[i]); 
            } 
    }
    
    public void orden (){ 
        int tamaño = arreglo.getSize();
        for(int pase = 0 ; pase < tamaño ; pase++ ){ 
            for (int i = 0 ; i < tamaño - 1 - pase ; i++ ){ 
                try {
                    if (arreglo.getElemento(i).compareTo(arreglo.getElemento(i+1))>0){
                        String actual;
                        actual=arreglo.getElemento(i);
                        arreglo.setElemento(i, arreglo.getElemento(i+1));
                        arreglo.setElemento(i+1, actual);
                    }
                } catch (Exception ex) {
                    Logger.getLogger(Ordenar.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
        } 
        arreglo.imprimir();
    }
    
    public static void main(String [] args){
        ArrayList arreglo = new ArrayList ();
        arreglo.add ("melvin");
        arreglo.add ("max");
        arreglo.add ("kevin");
        Ordenar p = new Ordenar(arreglo);
        p.orden();
    }  
}
