/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import domain.Pacientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author kenph
 */
public class PacientesDAO {
   
    private static final String SQL_SELECT = "SELECT id_paci, nombre_paci, apellido_paci, genero_paci, direccion_paci, telefono_paci, estado_paci FROM pacientes";
    private static final String SQL_INSERT = "INSERT INTO pacientes(id_paci, nombre_paci, apellido_paci, genero_paci, direccion_paci, telefono_paci, estado_paci ) VALUES(?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE pacientes SET nombre_paci=?, apellido_paci=?, genero_paci=?, direccion_paci=?, telefono_paci=?, estado_paci=?  WHERE id_paci= ?";
    private static final String SQL_DELETE = "DELETE FROM pacientes WHERE id_paci=?";
    private static final String SQL_QUERY = "SELECT id_paci, nombre_paci, apellido_paci, genero_paci, direccion_paci, telefono_paci, estado_paci FROM pacientes WHERE id_paci = ?";

    public List<Pacientes> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Pacientes paciente = null;
        List<Pacientes> pacientes = new ArrayList<Pacientes>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String codigo = rs.getString("id_paci");
                String nombre = rs.getString("nombre_paci");
                String apellido = rs.getString("apellido_paci");
                String genero = rs.getString("genero_paci");
                String direccion = rs.getString("direccion_paci");
                String telefono = rs.getString("telefono_paci");
                String estatus = rs.getString("estado_paci");
                
                paciente = new Pacientes();
                paciente.setId_paci(codigo);
                paciente.setNombre_paci(nombre);
                paciente.setApellido_paci(apellido);
                paciente.setGenero_paci(genero);
                paciente.setDireccion_paci(direccion);
                paciente.setTelefono_paci(telefono);
                paciente.setEstado_paci(estatus);
                
                pacientes.add(paciente);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return pacientes;
    }

    public int insert(Pacientes paciente) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, paciente.getId_paci());
            stmt.setString(2, paciente.getNombre_paci());
            stmt.setString(3, paciente.getApellido_paci());
            stmt.setString(4, paciente.getGenero_paci());
            stmt.setString(5, paciente.getDireccion_paci());
            stmt.setString(6, paciente.getTelefono_paci());
            stmt.setString(7, paciente.getEstado_paci());
            System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    public int update(Pacientes paciente) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, paciente.getNombre_paci());
            stmt.setString(2, paciente.getApellido_paci());
            stmt.setString(3, paciente.getGenero_paci());
            stmt.setString(4, paciente.getDireccion_paci());
            stmt.setString(5, paciente.getTelefono_paci());
            stmt.setString(6, paciente.getEstado_paci());
            stmt.setString(7, paciente.getId_paci());

            rows = stmt.executeUpdate();
            System.out.println("Registros actualizado:" + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    public int delete(Pacientes paciente) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setString(1, paciente.getId_paci());
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

//    public List<Persona> query(Persona vendedor) { // Si se utiliza un ArrayList
    public Pacientes query(Pacientes paciente) {    
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_QUERY);
            stmt = conn.prepareStatement(SQL_QUERY);
            stmt.setString(1, paciente.getId_paci());
            rs = stmt.executeQuery();
            while (rs.next()) {
                String codigo = rs.getString("id_paci");
                String nombre = rs.getString("nombre_paci");
                String apellido = rs.getString("apellido_paci");
                String genero = rs.getString("genero_paci");
                String direccion = rs.getString("direccion_paci");
                String telefono = rs.getString("telefono_paci");
                String estatus = rs.getString("estado_paci");
                
                paciente = new Pacientes();
                paciente.setId_paci(codigo);
                paciente.setNombre_paci(nombre);
                paciente.setApellido_paci(apellido);
                paciente.setGenero_paci(genero);
                paciente.setDireccion_paci(direccion);
                paciente.setTelefono_paci(telefono);
                paciente.setEstado_paci(estatus);
        
            }
            //System.out.println("Registros buscado:" + vendedor);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return paciente;
    }
        
}
