/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Ariel
 */
@Entity
public class Empresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String razonSocial;
    
    @OneToMany(mappedBy = "unaEmpresaCliente", cascade = CascadeType.ALL)
    private List<Cliente> clientes;
    
    @OneToMany(mappedBy = "unaEmpresaCompra", cascade = CascadeType.ALL)
    private List<Compra> compras;
    
    @OneToMany(mappedBy = "unaEmpresaListaDePrecio", cascade = CascadeType.ALL)
    private List<ListaDePrecio> listasDePrecios;
    
    @OneToMany(mappedBy = "unaEmpresaProveedor", cascade = CascadeType.ALL)
    private List<Proveedor> proveedores;
    
    @OneToMany(mappedBy = "unaEmpresaStockArticulo", cascade = CascadeType.ALL)
    private List<StockArticulo> stocksarticulos;
    
    @OneToMany(mappedBy = "unaEmpresaVenta", cascade = CascadeType.ALL)
    private List<Venta> ventas;

    public Empresa() {
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresa)) {
            return false;
        }
        Empresa other = (Empresa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Empresa[ id=" + id + " ]";
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

    public List<ListaDePrecio> getListasDePrecios() {
        return listasDePrecios;
    }

    public void setListasDePrecios(List<ListaDePrecio> listasDePrecios) {
        this.listasDePrecios = listasDePrecios;
    }

    public List<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(List<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    public List<StockArticulo> getStocksarticulos() {
        return stocksarticulos;
    }

    public void setStocksarticulos(List<StockArticulo> stocksarticulos) {
        this.stocksarticulos = stocksarticulos;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    
}
