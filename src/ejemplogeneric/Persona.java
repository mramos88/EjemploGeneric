/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplogeneric;

import java.util.Objects;

/**
 *
 * @author Matias
 */
public class Persona {
    
    private String nombre;
    private int dni;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return this.getNombre();
    }

    @Override
    public boolean equals(Object o){
        if(o==null){
            return false;
        }
        if(this.getClass().equals(o.getClass())){
            //Son de la misma clase
            Persona persona = (Persona)o;
            if(this.getNombre().equals(persona.getNombre())){
                //Son de la misma clase y tiene el mismo nombre
                return true;
            }else{
                //Son de la misma clase, pero no tiene el mimso nombre
                return false;
            }
        }else{
            //NO son de la misma clase
            return false;
        }
    }
    @Override
    public int hashCode(){
        return this.getNombre().hashCode();
    }
    
    
}
