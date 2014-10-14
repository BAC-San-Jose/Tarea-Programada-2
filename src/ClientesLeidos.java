
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ClientesLeidos {
    int a;
    int contador;
    int completo=2;
    String tipo;
    ArrayList listaEmbarazadas = null;
    ArrayList listaRegulares = null;
    ArrayList listaMayores = null;
    ArrayList listaDiscapacitados = null;
    ArrayList listaCorporativos = null;
    
    public ClientesLeidos(){
        listaEmbarazadas = new ArrayList();
        listaRegulares = new ArrayList();
        listaMayores = new ArrayList();
        listaDiscapacitados = new ArrayList();
        listaCorporativos = new ArrayList();
    }
    
    public ArrayList Tipo() throws IOException {
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
                 
            archivo = new File (System.getProperty("user.dir")+"/Clientes/"+tipo+".txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            linea =br.readLine();
            for(int j=0;linea!=null;j++){
                if (completo == contador ){
                    if ("Embarazadas".equals(tipo)){
                        listaEmbarazadas.add(linea);
                    }
                    if ("Discapacitados".equals(tipo)){
                        listaDiscapacitados.add(linea);
                    }
                    if ("Regulares".equals(tipo)){
                        listaRegulares.add(linea);
                    }
                    if ("Corporativos".equals(tipo)){
                        listaCorporativos.add(linea);
                    }
                    if ("Mayores".equals(tipo)){
                        listaMayores.add(linea);
                    }
                    contador +=1;
                }
                else{
                    contador += 1;
                    completo +=6;
                }
            }
            //return Lsecundario;
        }
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
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


    private String String(int contador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String [] args) throws IOException{
        ClientesLeidos prueba = new ClientesLeidos();
        prueba.Tipo();
        
    }
}
