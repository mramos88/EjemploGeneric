package ejemplogeneric;

/**
 *
 * @author Matias
 */
public class Caja<T extends Persona> {
    private T o;
    
    
	//NUevo comentario
    public T getO() {
        return o;
    }

    public void setO(T o) {
        this.o = o;
    }
    
    
    
    
}
