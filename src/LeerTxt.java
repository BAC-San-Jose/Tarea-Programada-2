
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kevin Matamoros
 */
public class LeerTxt {
    
    public String HoraEmbarazadas(String direccion) {
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
      int contador;
      String variable = "";
      int leer=4;
      int size = 0;
      
      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("Clientes/"+direccion+".txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
 
         // Lectura del fichero
         String linea;
         contador =0;
         while((linea=br.readLine())!=null)
             if (leer == contador){
                 linea = linea.substring(0, 2);
                 System.out.print(linea);
                 contador +=1;
                 leer = leer + 6;
             }
             else{
                 contador += 1;
             }
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
        return null;
    }
    public String FechaEmbarazadas(String direccion) {
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
      int contador;
      String variable = "";
      String Fecha;
      int leer=5;
      int size = 0;
      
      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("Clientes/"+direccion+".txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
 
         // Lectura del fichero
         String linea;
         contador =0;
         while((linea=br.readLine())!=null)
             if (leer == contador){
                 linea = linea.substring(0, 2);
                 System.out.print(linea);
                 contador +=1;
                 leer = leer + 6;
             }
             else{
                 contador += 1;
             }
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
        return null;
    }
    public static void main(String [] args){
    LeerTxt prueba = new LeerTxt();
    prueba.FechaEmbarazadas("Embarazadas");
    }
}

