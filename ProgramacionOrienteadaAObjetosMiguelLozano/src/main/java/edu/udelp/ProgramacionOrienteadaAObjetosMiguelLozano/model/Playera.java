package edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model;

import lombok.Data;

@Data

public class Playera extends AbstractPrenda {

	public Playera (TipoPrenda tipoPrenda, Talla talla, Double precioCompra, Integer nPrendas) {
		super(tipoPrenda, talla, precioCompra, nPrendas);
	
	}

	public Sexo sexo() {
		
		return Sexo.M;
	}

	public String nombrePrenda() {
		
		return "Playera";
	}
}
