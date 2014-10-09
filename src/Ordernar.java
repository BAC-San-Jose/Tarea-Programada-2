/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kevin Matamoros
 */
import java.util.Scanner; 

public class Ordernar {   
    
    private static Scanner leer = new Scanner(System.in); 
    static void tamaño(String [] nombres ){ 
        int numero = nombres.length; 
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
        String [] Nombres={"joes","asd","fefe","asdf"};
        p.Numeros(Nombres);
       
    }   
    public String Numeros(String [] Recibe){
        tamaño(Recibe);
        return null;
    }
}
