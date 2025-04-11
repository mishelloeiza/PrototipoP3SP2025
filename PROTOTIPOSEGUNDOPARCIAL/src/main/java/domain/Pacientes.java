/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author kenph
 */
public class Pacientes {
    private String id_paci;
    private String nombre_paci;
    private String apellido_paci;
    private String genero_paci;
    private String direccion_paci;
    private String telefono_paci;
    private String estado_paci;
    
    public Pacientes(){
        
    }

    @Override
    public String toString() {
        return "Pacientes{" + "id_paci=" + id_paci + ", nombre_paci=" + nombre_paci + ", apellido_paci=" + apellido_paci + ", genero_paci=" + genero_paci + ", direccion_paci=" + direccion_paci + ", telefono_paci=" + telefono_paci + ", estado_paci=" + estado_paci + '}';
    }

    public String getNombre_paci() {
        return nombre_paci;
    }

    public void setNombre_paci(String nombre_paci) {
        this.nombre_paci = nombre_paci;
    }

    public String getApellido_paci() {
        return apellido_paci;
    }

    public void setApellido_paci(String apellido_paci) {
        this.apellido_paci = apellido_paci;
    }

    public String getDireccion_paci() {
        return direccion_paci;
    }

    public void setDireccion_paci(String direccion_paci) {
        this.direccion_paci = direccion_paci;
    }

    public String getEstado_paci() {
        return estado_paci;
    }

    public void setEstado_paci(String estado_paci) {
        this.estado_paci = estado_paci;
    }

    public String getGenero_paci() {
        return genero_paci;
    }

    public void setGenero_paci(String genero_paci) {
        this.genero_paci = genero_paci;
    }

    public String getId_paci() {
        return id_paci;
    }

    public void setId_paci(String id_paci) {
        this.id_paci = id_paci;
    }

    public String getTelefono_paci() {
        return telefono_paci;
    }

    public void setTelefono_paci(String telefono_paci) {
        this.telefono_paci = telefono_paci;
    }
    
    public Pacientes (String id_paci){
        this.id_paci = id_paci;
    }
    
    public Pacientes (String id_paci, String nombre_paci ) {
        this.id_paci = id_paci;
        this.nombre_paci = nombre_paci;
    }
    
    public Pacientes (String id_paci, String nombre_paci, String apellido_paci){
        this.id_paci = id_paci;
        this.nombre_paci = nombre_paci;
        this.apellido_paci = apellido_paci;
    }
    
    public Pacientes (String id_paci, String nombre_paci, String apellido_paci, String genero_paci){
        this.id_paci = id_paci;
        this.nombre_paci = nombre_paci;
        this.apellido_paci = apellido_paci;
        this.genero_paci = genero_paci;
    }
    
    public Pacientes (String id_paci, String nombre_paci, String apellido_paci, String genero_paci, String direccion_paci ){
        this.id_paci = id_paci;
        this.nombre_paci = nombre_paci;
        this.apellido_paci = apellido_paci;
        this.genero_paci = genero_paci;
        this.direccion_paci = direccion_paci;
    }
    
    public Pacientes (String id_paci, String nombre_paci, String apellido_paci, String genero_paci, String direccion_paci, String telefono_paci){
        this.id_paci = id_paci;
        this.nombre_paci = nombre_paci;
        this.apellido_paci = apellido_paci;
        this.genero_paci = genero_paci;
        this.direccion_paci = direccion_paci;
        this.telefono_paci = telefono_paci;
    }
    
    public Pacientes (String id_paci, String nombre_paci, String apellido_paci, String genero_paci, String direccion_paci, String telefono_paci, String estado_paci){
        this.id_paci = id_paci;
        this.nombre_paci = nombre_paci;
        this.apellido_paci = apellido_paci;
        this.genero_paci = genero_paci;
        this.direccion_paci = direccion_paci;
        this.telefono_paci = telefono_paci;
        this.estado_paci = estado_paci;
    }
 
}
