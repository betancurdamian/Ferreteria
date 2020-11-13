/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dao.ClienteJpaController;
import model.dao.Conexion;
import model.dao.EmpresaJpaController;
import model.dao.exceptions.NonexistentEntityException;
import model.entity.Cliente;

/**
 *
 * @author Ariel
 */
public class ClienteController {

    private final ClienteJpaController clienteDAO;
    private final EmpresaJpaController empresaDAO;
    
    public ClienteController() {
        this.empresaDAO = new EmpresaJpaController(Conexion.getEmf());
        this.clienteDAO = new ClienteJpaController(Conexion.getEmf());
    }
    
    public List<Cliente> listarTodosLosClientes(){        
        return clienteDAO.findClienteEntities();
    }
    
    public void eliminarCliente(Long id){
    
        try {
            if (clienteDAO.findCliente(id)!= null) {
                clienteDAO.destroy(id);
            }else{
                System.out.println("El cliente a eliminar no existe");
            }
            
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Cliente crearCliente (Cliente c){
        Cliente clienteAux = null;
        c.setUnaEmpresaCliente(empresaDAO.findEmpresa(1l));
        clienteDAO.create(c);
        clienteAux = c;
        return clienteAux;
    }
    
}
