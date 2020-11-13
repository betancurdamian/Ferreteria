package model.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.entity.Cliente;
import model.entity.Compra;
import model.entity.ListaDePrecio;
import model.entity.Proveedor;
import model.entity.StockArticulo;
import model.entity.Venta;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-06T20:03:12")
@StaticMetamodel(Empresa.class)
public class Empresa_ { 

    public static volatile ListAttribute<Empresa, Proveedor> proveedores;
    public static volatile ListAttribute<Empresa, Compra> compras;
    public static volatile ListAttribute<Empresa, ListaDePrecio> listasDePrecios;
    public static volatile ListAttribute<Empresa, Venta> ventas;
    public static volatile SingularAttribute<Empresa, Long> id;
    public static volatile ListAttribute<Empresa, Cliente> clientes;
    public static volatile ListAttribute<Empresa, StockArticulo> stocksarticulos;

}