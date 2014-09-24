public class Queue{

    public Persona [] arreglo;
    public int first;
    public int last;
    public int size;
    public int maxSize = 1000;
    public int totalSize;

    public Queue (){
        this.arreglo = new Persona [maxSize];
        this.size = 0;
    }

    public void queue (Persona cliente){
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

    public Persona deque (){
            Persona resultado = null;
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
    
    public Persona getPersona(){
        Persona persona = arreglo [first];
        return persona;
    }

    public boolean isEmpty(){
        if (this.size == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int getSize(){
        return this.totalSize;
    }

    
    public static void main (String [] args){
        Persona hola = new Persona("melvin","mell9413@hotmail.com","D");
        Persona hola1 = new Persona("kevin","teckevin_16@gmail.com","R");
        Persona hola2 = new Persona("max","max11@hotmail.com","E");
        Persona hola3 = new Persona("pepe","pepe1008@hotmail.com","C");
        Persona hola4 = new Persona("jorge","andrespato1@gmail.com","M");
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