import java.util.Scanner; 
/**
 * Clase que ordena los datos de la tabla de la ventana "ListaClientes"
 */
public class Ordernar {   
    
    private static Scanner leer = new Scanner(System.in); 
    /**
     * 
     * @param nombres 
     */
    static void tamaño(String [] nombres ){ 
        int numero = nombres.length; 
        alfabeticamente(nombres); 
    } 
    /**
     * 
     * @param n 
     */
    static void leer( String [] n){ 
        int tamaño = n.length; 
        for (int i = 0 ; i < tamaño ; i++ ){ 
            System.out.println(n[i]); 
            } 
    } 
    /**
     * 
     * @param alf 
     */
    static void alfabeticamente(String [] alf){ 
        int tamaño = alf.length; 
        for(int pase = 0 ; pase < tamaño ; pase++ ){ 
            for (int i = 0 ; i < tamaño - 1 - pase ; i++ ){ 
                if( alf[i].compareTo (alf[i + 1 ])> 0){ 
                String actual; 
                actual=alf[i]; 
                alf[i]=alf[i+1]; 
                alf[i+1]=actual; 
                } 
            } 
        } 
        leer(alf); 
    } 
    /**
     * 
     * @param args 
     */
    public static void main(String [] args){ 
        Ordernar p = new Ordernar();
        String [] Nombres={"joes","asd","fefe","asdf"};
        p.Numeros(Nombres);
       
    }  
    /**
     * 
     * @param Recibe
     * @return 
     */
    public String Numeros(String [] Recibe){
        tamaño(Recibe);
        return null;
    }
}
