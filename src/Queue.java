/**
 * Clase encargada de manejar las colas
 */
public class Queue{
    
    /**
     * Declaracion de variables
     */
    public Clientes [] arreglo;
    public int first;
    public int last;
    public int size;
    public int maxSize = 1000;
    public int totalSize;
    /**
     * Metodo constructor de la clase
     */
    public Queue (){
        this.arreglo = new Clientes [maxSize];
        this.size = 0;
    }
    /**
     * agrega elementos a la cola
     * @param cliente 
     */
    public void queue (Clientes cliente){
        if (this.size < this.maxSize){
            if (isEmpty()){
                this.arreglo [0] = cliente;
                this.first = this.last = 0;
            }
            else{
                last = (last + 1) % maxSize;
                arreglo [last] = cliente;
            }
            size++;
            totalSize++;
        }
        else{
            System.out.println("La cola esta llena");
        }
    }
    
    /**
     * Saca el primer resultado de la cola
     * @return el elemento sacado de la cola
     */
    public Clientes deque (){
            Clientes resultado = null;
            if (this.isEmpty()==true){
                System.out.println("La cola no posee más personas");
            }
            else{
                size--;
                resultado = arreglo [first];
                first = (first+1) % maxSize;
            }
            return resultado;
    }
    
    /**
     * Obtiene el dato del nombre del cliente
     * @return nombre cliente
     */
    public Clientes getPersona(){
        Clientes persona = arreglo [first];
        return persona;
    }
    
    /**
     * Funcion que busca un indice en la cola y regresa lo que se encuentre en esa posicion
     * @param indice
     * @return elemento en el indice inroducido
     */
    public Clientes recorrerCola(int indice){
        Clientes persona = arreglo [indice];
        return persona;
    }
    
    /**
     * Retorna true si la cola esta vacia o false si no lo esta
     * @return si la cola esta vacia o no
     */
    public boolean isEmpty(){
        if (this.size == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    /**
     * Funcion que retorna el tamaño total de la cola
     * @return Tamaño total de la cola
     */
    public int getTotalSize(){
        return this.totalSize;
    }
    
    /**
     * Funcion que retorna el tamaño de la cola
     * @return tamaño de la cola
     */
    public int getSize(){
        return this.size;
    }
    
    /**
     * 
     * @param args 
     */
    public static void main (String [] args){
        Clientes hola = new Clientes("melvin","mell9413@hotmail.com","D","27/09/2014","10:00");
        Clientes hola1 = new Clientes("kevin","teckevin_16@gmail.com","R","27/09/2014","1:00");
        Clientes hola2 = new Clientes("max","max11@hotmail.com","E","27/09/2014","4:00");
        Clientes hola3 = new Clientes("pepe","pepe1008@hotmail.com","C","27/09/2014","8:00");
        Clientes hola4 = new Clientes("jorge","andrespato1@gmail.com","M","27/09/2014","6:00");
        Queue cola = new Queue();
        cola.queue(hola);
        cola.queue(hola1);
        cola.queue(hola2);
        cola.queue(hola3);
        cola.queue(hola4);
        System.out.println(cola.deque().getNombre());
        System.out.println(cola.deque().getNombre());
        cola.deque();
        cola.deque();
    }
}