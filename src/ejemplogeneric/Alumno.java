/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplogeneric;

/**
 *
 * @author Matias
 */
public class Alumno extends Persona{
    private int legajo;
    public Alumno(String nombre,int legajo) {
        super(nombre);
        this.legajo=legajo;
              
    }

    @Override
    public String toString() {
        return super.toString() + "Alumno{" + "legajo=" + legajo + '}';
    }
    
    
}
