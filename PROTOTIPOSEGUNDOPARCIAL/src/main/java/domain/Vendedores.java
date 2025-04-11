/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author kenph
 */
public class Vendedores {
    private String id_vend;
    private String nombre_vend;
    private String apellido_vend;
    private String genero_vend;
    private String direccion_vend;
    private String telefono_vend;
    private String estado_vend;
    
    public Vendedores(){
        
    }

    @Override
    public String toString() {
        return "Vendedores{" + "id_vend=" + id_vend + ", nombre_vend=" + nombre_vend + ", apellido_vend=" + apellido_vend + ", genero_vend=" + genero_vend + ", direccion_vend=" + direccion_vend + ", telefono_vend=" + telefono_vend + ", estado_vend=" + estado_vend + '}';
    }

    public String getNombre_vend() {
        return nombre_vend;
    }

    public void setNombre_vend(String nombre_vend) {
        this.nombre_vend = nombre_vend;
    }

    public String getApellido_vend() {
        return apellido_vend;
    }

    public void setApellido_vend(String apellido_vend) {
        this.apellido_vend = apellido_vend;
    }

    public String getDireccion_vend() {
        return direccion_vend;
    }

    public void setDireccion_vend(String direccion_vend) {
        this.direccion_vend = direccion_vend;
    }

    public String getEstado_vend() {
        return estado_vend;
    }

    public void setEstado_vend(String estado_vend) {
        this.estado_vend = estado_vend;
    }

    public String getGenero_vend() {
        return genero_vend;
    }

    public void setGenero_vend(String genero_vend) {
        this.genero_vend = genero_vend;
    }

    public String getId_vend() {
        return id_vend;
    }

    public void setId_vend(String id_vend) {
        this.id_vend = id_vend;
    }

    public String getTelefono_vend() {
        return telefono_vend;
    }

    public void setTelefono_vend(String telefono_vend) {
        this.telefono_vend = telefono_vend;
    }
    
    public Vendedores (String id_vend){
        this.id_vend = id_vend;
    }
    
    public Vendedores (String id_vend, String nombre_vend ) {
        this.id_vend = id_vend;
        this.nombre_vend = nombre_vend;
    }
    
    public Vendedores (String id_vend, String nombre_vend, String apellido_vend){
        this.id_vend = id_vend;
        this.nombre_vend = nombre_vend;
        this.apellido_vend = apellido_vend;
    }
    
    public Vendedores (String id_vend, String nombre_vend, String apellido_vend, String genero_vend){
        this.id_vend = id_vend;
        this.nombre_vend = nombre_vend;
        this.apellido_vend = apellido_vend;
        this.genero_vend = genero_vend;
    }
    
    public Vendedores (String id_vend, String nombre_vend, String apellido_vend, String genero_vend, String direccion_vend ){
        this.id_vend = id_vend;
        this.nombre_vend = nombre_vend;
        this.apellido_vend = apellido_vend;
        this.genero_vend = genero_vend;
        this.direccion_vend = direccion_vend;
    }
    
    public Vendedores (String id_vend, String nombre_vend, String apellido_vend, String genero_vend, String direccion_vend, String telefono_vend){
        this.id_vend = id_vend;
        this.nombre_vend = nombre_vend;
        this.apellido_vend = apellido_vend;
        this.genero_vend = genero_vend;
        this.direccion_vend = direccion_vend;
        this.telefono_vend = telefono_vend;
    }
    
    public Vendedores (String id_vend, String nombre_vend, String apellido_vend, String genero_vend, String direccion_vend, String telefono_vend, String estado_vend){
        this.id_vend = id_vend;
        this.nombre_vend = nombre_vend;
        this.apellido_vend = apellido_vend;
        this.genero_vend= genero_vend;
        this.direccion_vend = direccion_vend;
        this.telefono_vend = telefono_vend;
        this.estado_vend = estado_vend;
    }
 
}
