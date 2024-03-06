package edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model;

import lombok.Data;

@Data
public class PantalonMezclilla extends AbstractPrenda {

	public PantalonMezclilla (TipoPrenda tipoPrenda, Talla talla, Double precioCompra, Integer nPrendas) {
		super(tipoPrenda, talla, precioCompra, nPrendas);
	
	}

	public Sexo sexo() {
		
		return Sexo.HM;
	}

	public String nombrePrenda() {
		
		return "Pantalón de mezclilla";
	}
}
