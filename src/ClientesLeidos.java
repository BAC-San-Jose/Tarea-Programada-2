
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ClientesLeidos {
    int a;
    int contador;
    int completo=2;
    String tipo;
    ArrayList Lprincipal = null;
    ArrayList Lsecundario = null;
    
    public ClientesLeidos(){
        Lprincipal = new ArrayList();
        Lsecundario = new ArrayList();
        
        
    }
    public int Tipo() throws IOException {
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
      
      try {
        String linea;
        for (a=0;a<5;a++){
             if (a==0){
                 tipo="Embarazadas";
             }
             if (a==1){
                 tipo="Regulares";
             }
             if (a==2){
                 tipo="Discapacitados";
             }
             if (a==3){
                 tipo="Mayores";
             }
             if (a==4){
                 tipo="Corporativos";
             }
                 
            archivo = new File ("src/Clientes/"+tipo+".txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            for(int j=0;br.readLine()!=null;j++){
                if (completo == contador ){
                    

                    
                    contador +=1;
                    completo +=6;

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
        return 0;
    }


    private String String(int contador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      //return resultado;
    
}
