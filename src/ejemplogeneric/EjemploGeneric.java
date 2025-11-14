package ejemplogeneric;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matias
 */
public class EjemploGeneric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        List<String> palabras = new ArrayList<>();
        List cosas = new ArrayList();
        
        
        
        personas.add(new Persona("Matias"));
        Persona p1 = personas.get(0);
        
        palabras.add("Hola");
        String plabra0 = palabras.get(0);
        
        cosas.add("");
        cosas.add(new Persona("ads"));
        String cosa0= (String) cosas.get(0);
        
        
        Caja caja = new Caja();
        caja.setO(p1);
        caja.getO();
        
        Caja<Persona> cajaPalabra= new Caja<Persona>();
        cajaPalabra.setO(new Persona("Hola"));
        Persona s = cajaPalabra.getO();
        
        Caja<Alumno> cajaNumero= new Caja<Alumno>();
        cajaNumero.setO(new Alumno("Matias",2));
        
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Matias"));
        List<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(new Alumno("Jose",123));
        
        mostraLista(listaPersonas);
        mostraLista(listaAlumnos);
        
        
       /* mostraElemenot(listaAlumnos.get(0));
        mostraElemenot(listaPersonas.get(0));*/
    }
    
    public static void mostraLista(List<? extends Persona> lista){
        for(Persona p :lista){
            System.out.println(p);
        }
    }
    
     public static void mostraElemenot(Persona p){
    
            System.out.println(p);
   
    }
    
}
