import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 * Clase ArrayLit para gestionar la lista de reproduccion
 */
class ArrayList {
    /**
     * Declaracion de variables a utilizar
     */
    private int size;
    private int maxSize;
    private String[] arreglo;
    private final int MAX_SIZE = 777;

    /**
     * Constructor de la clase
     * Se declara el valor de las variables que hacen falta 
     */
    public ArrayList () {
            
	this.size = 0;
	this.maxSize = MAX_SIZE;
	this.arreglo = new String[this.maxSize];
    }
    /**
     * Agregar elementos al arreglo con la condición sea menor al maximo la lista, sino que tire error
     * @param Dato
     */
    public void add (String Dato) {

	if (this.size < this.maxSize) {
		this.arreglo [this.size] = Dato;
		this.size ++;
	}
	else {
		System.out.println ("Error");
	}
    }
    /**
     * Obtener un elemento a travez de un indice mientras que el indice
     * se mantenga en la condicion que sea mayor o igual a 0 y indice sea 
     * menor o igual a size
     * 
     * 
     * @param indice seleccion en la Playlist
     * @return elemento que se encuentra en el indice
     * @throws Exception 
     */
    public String getElemento (int indice) throws Exception {
                        
	if ((indice >= 0 ) && (indice <= this.size)){
            System.out.println(this.arreglo [indice]);
            return this.arreglo [indice];
        }
        if (indice == 0) {
            JOptionPane.showMessageDialog (null," Es la ultima canción","Error",ERROR_MESSAGE);
        }
        return null;
    }
        
    /**
     * Borra un elemento de el arreglo, recibe un indice y en esa posicion lo 
     * compara un for y el indice que ingreso.
     * @param seleccion 
     */
    public void delete (int seleccion) {
	for (int i=0; i <= this.size; i++) {
		if (arreglo[i] == arreglo[seleccion]) {
                        arreglo[seleccion] = arreglo[++i];
                        --this.size;
			}
		}
	}
}