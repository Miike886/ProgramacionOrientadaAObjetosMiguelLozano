package edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.process;

import java.util.ArrayList;
import java.util.List;

import edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model.AbstractPrenda;
import edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model.Blusa;
import edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model.Camisa;
import edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model.Falda;
import edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model.PantalonMezclilla;
import edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model.PantalonVestir;
import edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model.Playera;
import edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model.Venta;

public class ProcesosTiendaRopa {

	public List<AbstractPrenda> listaPrendas = new ArrayList<AbstractPrenda>();
	public List<Venta> listaVentas = new ArrayList<Venta>();
	
	public void altaDePrendas (AbstractPrenda.TipoPrenda tipoPrenda, AbstractPrenda.Talla talla, Double precioCompra, Integer nUnidades) {
		
		AbstractPrenda prenda = null;
		
		switch (tipoPrenda)
		{
		case PantalonVestir:
			prenda = new PantalonVestir (tipoPrenda, talla, precioCompra, nUnidades);
			break;
			
		case PantalonMezclilla:
			prenda = new PantalonMezclilla (tipoPrenda, talla, precioCompra, nUnidades);
			break;
			
		case Camisa:
			prenda = new Camisa (tipoPrenda, talla, precioCompra, nUnidades);
			break;
		
		case Falda:
			prenda = new Falda (tipoPrenda, talla, precioCompra, nUnidades);
			break;
			
		case Blusa:
			prenda = new Blusa (tipoPrenda, talla, precioCompra, nUnidades);
			break;
			
		case Playera:
			prenda = new Playera (tipoPrenda, talla, precioCompra, nUnidades);
			break;
		
		}
		listaPrendas.add(prenda);
	}

	public String mostrarPrendas () {

		String cadena = "Id\t|\tNombrePrenda\t|\tTalla\t|\tCantidad\t|\tPrecioCompra\t|\tPrecioVenta\n";

		for (int i = 0; i < listaPrendas.size(); i++)
		{
			cadena += listaPrendas.get(i).getDatos();
		}

		return cadena;
	}
	
	public String mostrarVentas () {

		String cadena = "Id\t|\tNombrePrenda\t|\tTalla\t|\tCantidad\t|\tPrecioCompra\t|\tPrecioVenta\n";

		for (int i = 0; i < listaPrendas.size(); i++)
		{
			cadena += listaVentas.get(i).getIdProducto() + "\t||\t" + listaVentas.get(i).getPrenda().getTipoPrenda() + "\t||\t" + listaVentas.get(i).getTalla() + "\t||\t" +  listaVentas.get(i).getCantidad() + "\t||\t" +  listaVentas.get(i).getPrecioVenta() + "\t||\t" +  listaVentas.get(i).getTotal() + "\n";
		}

		return cadena;
	}
	
	public Integer buscarPrendaPorId (String id) {

		for (int i = 0; i < listaPrendas.size(); i++)
		{
			if (listaPrendas.get(i).getId().equals(id))
			{
				return i;
			}
		}
		return -1;
	}

	public Double ventaPrenda (String id, Integer cantidad) {

		Double total = 0D; 

		Integer indice = buscarPrendaPorId(id);
		AbstractPrenda prenda = listaPrendas.get(indice);
		Double precioVenta = prenda.getPrecioVenta();
		Integer nPrendasIniciales = prenda.getNPrendas();

		total = precioVenta * cantidad;

		prenda.setNPrendas(nPrendasIniciales - cantidad);

		boolean ventaExistente = false;
		for (int i = 0; i < listaVentas.size(); i++) 
		{
			Venta venta = listaVentas.get(i);
			if (venta.getIdProducto().equals(id)) 
			{
				ventaExistente = true;
				
				venta.setCantidad(venta.getCantidad() + cantidad);
				venta.setTotal(venta.getTotal() + total);
				
				listaVentas.set(i, venta); 
				break;
			}
		}

		
		if (!ventaExistente) 
		{
			Venta nuevaVenta = new Venta(id, prenda, prenda.getTalla(), cantidad, prenda.getPrecioVenta(), total); 
			listaVentas.add(nuevaVenta);
		}


		return total;
	}
}
