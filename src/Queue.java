public class Queue{

    public Persona [] arreglo;
    public int first;
    public int last;
    public int size;
    public int maxSize = 1000;

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
        }
        else{
            System.out.println("La cola esta llena");
        }
    }

    public void deque (){
            if (this.isEmpty()==true){
                System.out.println("La cola no posee elementos");
            }
            else{
                size--;
                Persona resultado = arreglo [first];
                first = (first+1) % maxSize;
                System.out.println(resultado.getNombre());
            }
    }

    public boolean isEmpty(){
        if (this.size == 0){
            return true;
        }
        else{
            return false;
        }
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
        cola.deque();
        cola.deque();
        cola.deque();
    }
}