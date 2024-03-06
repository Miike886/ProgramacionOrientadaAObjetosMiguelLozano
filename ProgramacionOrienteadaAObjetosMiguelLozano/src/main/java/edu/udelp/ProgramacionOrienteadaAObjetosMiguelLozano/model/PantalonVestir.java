package edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model;

import lombok.Data;

@Data
public class PantalonVestir extends AbstractPrenda {

	public PantalonVestir(TipoPrenda tipoPrenda, Talla talla, Double precioCompra, Integer nPrendas) {
		super(tipoPrenda, talla, precioCompra, nPrendas);
	
	}

	public Sexo sexo() {
		
		return Sexo.HM;
	}

	public String nombrePrenda() {
		
		return "Pantalón de vestir";
	}


}
