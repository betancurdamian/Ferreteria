/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.dao.Conexion;
import model.entity.Cliente;

/**
 *
 * @author Ariel
 */
public class Main {
    @SuppressWarnings("ResultOfObjectAllocationIgnored")
    public static void main(String[] args) {
        
        new Conexion();
        ClienteController controladorCliente = new ClienteController();
        
        for (Cliente cAux : controladorCliente.listarTodosLosClientes()) {
            System.out.println("id: "+ cAux.getId());
        }
        
        controladorCliente.eliminarCliente(4l);
        
        Cliente c = new Cliente();
        c.setNombre("Diego");
        c.setApellido("Caceres");
        c.setDni("40.000.000");
        
        System.out.println("id: " + c.getId());
        
        controladorCliente.crearCliente(c);
        
        System.out.println("id: " + c.getId());
    }
}
