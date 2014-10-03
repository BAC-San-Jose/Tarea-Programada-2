
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
      int contador=0;
      String comparar;
      String comparar1;
      int leerHora=4;
      int leerFecha=5;
      int nueve=0;
      int diez=0;
      int once=0;
      int una=0;
      int dos=0;
      int tres=0;
      int cuatro=0;
      int a;
      int Fecha=0;
      int d1=0;
      int d2=0;
      int d3=0;
      int d4=0;
      int d5=0;
      int d6=0;
      int d7=0;
      int d8=0;
      int d9=0;
      int d10=0;
      int d11=0;
      int d12=0;
      int d13=0;
      int d14=0;
      int d15=0;
      int d16=0;
      int d17=0;
      int d18=0;
      int d19=0;
      int d20=0;
      int d21=0;
      int d22=0;
      int d23=0;
      int d24=0;
      int d25=0;
      int d26=0;
      int d27=0;
      int d28=0;
      int d29=0;
      int d30=0;
      int d31=0;
      String errorFecha;
      String categoria;
      
    public void Horas() {
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
      
      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         
 
         // Lectura del fichero
         String linea;
         
         for (a=0;a<5;a++){
             if (a==0){
                 categoria="Embarazadas";
             }
             if (a==1){
                 categoria="Regulares";
             }
             if (a==2){
                 categoria="Discapacitados";
             }
             if (a==3){
                 categoria="Mayores";
             }
             if (a==4){
                 categoria="Corporativos";
             }
            archivo = new File ("Clientes/"+categoria+".txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            while((linea=br.readLine())!=null)
                if (leerHora == contador){
                    comparar = linea.substring(0, 2);
                    if ("09".equals(comparar)){
                        nueve++;
                        System.out.println(nueve);
                    }
                    if ("10".equals(comparar)){
                        diez++;
                   }
                    if ("11".equals(comparar)){
                        once++;
                   }
                    if ("01".equals(comparar)){
                        una++;
                   }
                    if ("02".equals(comparar)){
                        dos++;
                   }
                    if ("03".equals(comparar)){
                        tres++;
                   }
                    if ("04".equals(comparar)){
                        cuatro++;
                   }
                    contador +=1;
                    leerHora = leerHora + 5;
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
    }
    
    
   public void Fecha() throws FileNotFoundException, IOException {
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
      
      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         // Lectura del fichero
         String linea;
         
         for (a=0;a<5;a++){
             if (a==0){
                 categoria="Embarazadas";
             }
             if (a==1){
                 categoria="Regulares";
             }
             if (a==2){
                 categoria="Discapacitados";
             }
             if (a==3){
                 categoria="Mayores";
             }
             if (a==4){
                 categoria="Corporativos";
             }
            archivo = new File ("Clientes/"+categoria+".txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            while((linea=br.readLine())!=null){
                if (leerFecha == contador){
                    errorFecha = linea.substring(1, 2);
                    if (errorFecha.equals("/")){
                        comparar = linea.substring(0, 1);
                        
                        if ("1".equals(comparar)){
                            d1++;
                        }
                        if ("2".equals(comparar)){
                            d2++;
                        }
                        if ("3".equals(comparar)){
                            d3++;
                        }
                        if ("4".equals(comparar)){
                            d4++;
                        }
                        if ("5".equals(comparar)){
                            d5++;
                        }
                        if ("6".equals(comparar)){
                            d6++;
                        }
                        if ("7".equals(comparar)){
                            d7++;
                        }
                        if ("8".equals(comparar)){
                            d8++;
                        }
                        if ("9".equals(comparar)){
                            d9++;
                        }
                    }       
                    else{
                        comparar1=linea.substring(0, 2);
                         if ("10".equals(comparar1)){
                            d10++;
                         }
                         if ("11".equals(comparar1)){
                            d11++;
                         }
                         if ("12".equals(comparar1)){
                            d12++;
                         }
                         if ("13".equals(comparar1)){
                            d13++;
                         }
                         if ("14".equals(comparar1)){
                            d14++;
                         }
                         if ("15".equals(comparar1)){
                            d15++;
                         }
                         if ("16".equals(comparar1)){
                            d16++;
                         }
                         if ("17".equals(comparar1)){
                            d17++;
                         }
                         if ("18".equals(comparar1)){
                            d18++;
                         }
                         if ("19".equals(comparar1)){
                            d19++;
                         }
                         if ("20".equals(comparar1)){
                            d20++;
                         }
                         if ("21".equals(comparar1)){
                            d21++;
                         }
                         if ("22".equals(comparar1)){
                            d22++;
                         }
                         if ("23".equals(comparar1)){
                            d23++;
                         }
                         if ("24".equals(comparar1)){
                            d24++;
                         }
                         if ("25".equals(comparar1)){
                            d25++;
                         }
                         if ("26".equals(comparar1)){
                            d26++;
                         }
                         if ("27".equals(comparar1)){
                            d27++;
                         }
                         if ("28".equals(comparar1)){
                            d28++;
                         }
                         if ("29".equals(comparar1)){
                            d29++;
                         }
                         if ("30".equals(comparar1)){
                            d30++;
                         }
                         if ("31".equals(comparar1)){
                            d31++;
                         }
                         
                    }
                    leerFecha+=5;
                    contador += 1;
                }
                
                else{
                    contador += 1;
                    
                    
                }
            }
            
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
    }
   
    public static void main(String [] args) throws IOException{
    LeerTxt prueba = new LeerTxt();
    prueba.Fecha();
    }
}

