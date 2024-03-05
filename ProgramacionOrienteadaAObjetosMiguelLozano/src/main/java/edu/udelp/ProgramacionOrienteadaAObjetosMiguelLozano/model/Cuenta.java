package edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model;

import lombok.Data;

@Data
public class Cuenta {
	
	private String titular;
	private Double cantidad;
	
	public Cuenta ()
	{
		this.cantidad = 0D;
	}
	
	public Cuenta (String titular, Double cantidad)
	{
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	public Cuenta (String titular)
	{
		this.titular = titular;
		cantidad = 0D;
	}

	@Override
	public String toString() 
	{
		return "Cuenta [titular =" + titular + ", cantidad =" + cantidad + "]";
	}

	
}
