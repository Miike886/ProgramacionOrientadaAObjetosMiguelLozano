package edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model;

import lombok.Data;

@Data

public class Camisa extends AbstractPrenda {

	public Camisa (TipoPrenda tipoPrenda, Talla talla, Double precioCompra, Integer nPrendas) {
		super(tipoPrenda, talla, precioCompra, nPrendas);
	
	}

	public Sexo sexo() {
		
		return Sexo.HM;
	}

	public String nombrePrenda() {
		
		return "Camisa";
	}
}
