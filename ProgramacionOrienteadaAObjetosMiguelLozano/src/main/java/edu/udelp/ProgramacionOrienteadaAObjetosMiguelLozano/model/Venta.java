package edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model;

import edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model.AbstractPrenda.Talla;
import lombok.Data;
@Data

public class Venta {

	private String idProducto; 
    private AbstractPrenda prenda;
    private Talla talla;
    private Integer cantidad;
    private Double precioVenta;
    private Double total;
    
    public Venta(String idProducto, AbstractPrenda prenda, Talla talla, Integer cantidad, Double precioVenta, Double total) {
        this.idProducto = idProducto;
        this.prenda = prenda;
        this.talla = talla;
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
        this.total = total;
    }
    
}
