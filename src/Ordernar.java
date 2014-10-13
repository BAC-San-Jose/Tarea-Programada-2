
import java.util.Scanner; 

public class Ordernar {   
    
    private static Scanner leer = new Scanner(System.in); 
    static void tamaño(String [] nombres ){ 
        int numero = nombres.length; 
        alfabeticamente(nombres); 
    } 
    static void leer( String [] n){ 
        int tamaño = n.length; 
        for (int i = 0 ; i < tamaño ; i++ ){ 
            System.out.println(n[i]); 
            } 
    } 
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
    public static void main(String [] args){ 
        Ordernar p = new Ordernar();
        String [] Nombres={"raquel","sofia","","12"};
        p.Numeros(Nombres);
       
    }   
    public String Numeros(String [] Recibe){
        tamaño(Recibe);
        return null;
    }
}
