package edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model;

import java.util.Random;

import lombok.Data;

@Data


public abstract class AbstractPrenda implements Prenda {

	protected TipoPrenda tipoPrenda;
	protected Talla talla;
	protected Double precioCompra;
	protected String id;
	protected Integer nPrendas;
	protected Double precioVenta;
	
	public AbstractPrenda (TipoPrenda tipoPrenda, Talla talla, Double precioCompra, Integer nPrendas) {
	
		this.tipoPrenda = tipoPrenda;
		this.talla = talla;
		this.precioCompra = precioCompra;
		this.nPrendas = nPrendas;
		id = generaId();
		precioVenta = calculaPrecioVenta(talla);
		
	}
	
	private Double calculaPrecioVenta(Talla talla) {

		Double precioVenta;
		if (talla == Talla.CH || talla == Talla.M)
		{
			precioVenta = precioCompra * 1.1;
		}
		else
		{
			precioVenta = precioCompra * 1.2;
		}

		return precioVenta;

	}
	
	private String generaId () {
		
		Random aleatorio = new Random();
		int numeroAleatorio = 0;
		
		
		String id = "";
		
		for (int i = 0; i < 8; i++)
		{
			numeroAleatorio  = aleatorio.nextInt(10);
			id  +=  numeroAleatorio;
		}
		
		return id;
	}
	
	public String getDatos() {

		return(id + "\t||\t" + nombrePrenda() + "\t||\t" + talla + "\t||\t" + nPrendas + "\t||\t" + precioCompra + "\t||\t" + precioVenta + "\n");
	}

	public enum TipoPrenda
	{
		PantalonVestir, PantalonMezclilla, Camisa, Falda, Blusa, Playera
	}
	
	public enum Sexo 
	{
		HM, M
	}
	
	public enum Talla
	{
		CH, M, G, EX;
		
	}
}
