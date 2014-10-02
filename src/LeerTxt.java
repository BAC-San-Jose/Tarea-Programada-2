
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
 * 
 */
public class LeerTxt {
      int contador;
      String comparar;
      int leer=3;
      int nueve=0;
      int diez=0;
      int once=0;
      int una=0;
      int dos=0;
      int tres=0;
      int cuatro=0;
      int a;
      String categoria;
    public String Horas() {
      String nl = System.getProperty("line.separator");
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
      
      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         
 
         // Lectura del fichero
         String linea;
         contador =0;
         
         for (a=0;a<2;a++){
             if (a==0){
                 categoria="Embarazadas";
             }
             if (a==1){
                 categoria="Regulares";
             }
            archivo = new File ("Clientes/"+categoria+".txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            while((linea=br.readLine())!=null)
                if (leer == contador){
                    comparar = linea.substring(0, 2);
                    if ("09".equals(comparar)){
                        nueve += 1;
                        System.out.println("nueve  "+ nueve);
                    }
                    if ("10".equals(comparar)){
                        diez += 1;
                        System.out.print(diez);
                   }
                    if ("11".equals(comparar)){
                        once += 1;
                        System.out.print(once);
                   }
                    if ("01".equals(comparar)){
                        una += 1;
                        System.out.print(una);
                   }
                    if ("02".equals(comparar)){
                        dos += 1;
                        System.out.println(dos);
                   }
                    if ("03".equals(comparar)){
                        tres += 1;
                        System.out.println("tres  "+tres);
                   }
                    if ("04".equals(comparar)){
                        cuatro += 1;
                        System.out.print(cuatro);
                   }

                    contador +=1;
                    leer = leer + 5;
                    //linea = "";
                }

                else{
                    contador += 1;
                }
         }
        //LeerTxt llamando = new LeerTxt();
        //llamando.Horas("Regulares");
        
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
    public String Fecha() {
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
         archivo = new File ("Clientes/Embarazadas.txt");
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
    //prueba.Horas("Embarazadas");
    prueba.Horas();
    }
}

