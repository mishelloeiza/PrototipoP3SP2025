/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import domain.Vendedores;
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
public class VendedoresDAO {
   
    private static final String SQL_SELECT = "SELECT id_vend, nombre_vend, apellido_vend, genero_vend, direccion_vend, telefono_vend, estado_vend FROM vendedores";
    private static final String SQL_INSERT = "INSERT INTO vendedores(id_vend, nombre_vend, apellido_vend, genero_vend, direccion_vend, telefono_vend, estado_vend) VALUES(?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE vendedores SET nombre_vend=?, apellido_vend=?, genero_vend=?, direccion_vend=?, telefono_vend=?, estado_vend=?  WHERE id_vend= ?";
    private static final String SQL_DELETE = "DELETE FROM vendedores WHERE id_vend=?";
    private static final String SQL_QUERY = "SELECT id_vend, nombre_vend, apellido_vend, genero_vend, direccion_vend, telefono_vend, estado_vend FROM vendedores WHERE id_vend = ?";

    public List<Vendedores> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Vendedores vendedor = null;
        List<Vendedores> vendedores = new ArrayList<Vendedores>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String codigo = rs.getString("id_vend");
                String nombre = rs.getString("nombre_vend");
                String apellido = rs.getString("apellido_vend");
                String genero = rs.getString("genero_vend");
                String direccion = rs.getString("direccion_vendi");
                String telefono = rs.getString("telefono_vend");
                String estatus = rs.getString("estado_vend");
                
                vendedor = new Vendedores();
               vendedor.setId_vend(codigo);
                vendedor.setNombre_vend(nombre);
               vendedor.setApellido_vend(apellido);
                vendedor.setGenero_vend(genero);
                vendedor.setDireccion_vend(direccion);
                vendedor.setTelefono_vend(telefono);
                vendedor.setEstado_vend(estatus);
                
                vendedores.add(vendedor);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return vendedores;
    }

    public int insert(Vendedores vendedor) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, vendedor.getId_vend());
            stmt.setString(2, vendedor.getNombre_vend());
            stmt.setString(3, vendedor.getApellido_vend());
            stmt.setString(4, vendedor.getGenero_vend());
            stmt.setString(5, vendedor.getDireccion_vend());
            stmt.setString(6, vendedor.getTelefono_vend());
            stmt.setString(7, vendedor.getEstado_vend());
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

    public int update(Vendedores vendedor) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, vendedor.getNombre_vend());
            stmt.setString(2, vendedor.getApellido_vend());
            stmt.setString(3,vendedor.getGenero_vend());
            stmt.setString(4, vendedor.getDireccion_vend());
            stmt.setString(5, vendedor.getTelefono_vend());
            stmt.setString(6, vendedor.getEstado_vend());
            stmt.setString(7, vendedor.getId_vend());

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

    public int delete(Vendedores vendedor) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setString(1, vendedor.getId_vend());
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
    public Vendedores query(Vendedores vendedor) {    
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_QUERY);
            stmt = conn.prepareStatement(SQL_QUERY);
            stmt.setString(1, vendedor.getId_vend());
            rs = stmt.executeQuery();
            while (rs.next()) {
                String codigo = rs.getString("id_vend");
                String nombre = rs.getString("nombre_vend");
                String apellido = rs.getString("apellido_vend");
                String genero = rs.getString("genero_paci");
                String direccion = rs.getString("direccion_vend");
                String telefono = rs.getString("telefono_vend");
                String estatus = rs.getString("estado_vend");
                
                vendedor = new Vendedores();
               vendedor.setId_vend(codigo);
                vendedor.setNombre_vend(nombre);
                vendedor.setApellido_vend(apellido);
                vendedor.setGenero_vend(genero);
                vendedor.setDireccion_vend(direccion);
                vendedor.setTelefono_vend(telefono);
               vendedor.setEstado_vend(estatus);
        
            }
            //System.out.println("Registros buscado:" + vendedor);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return vendedor;
    }
        
}
