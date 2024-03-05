package edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data


public class TriánguloIsóceles extends AbstractTriángulo {

	private Double lado; 

	public TriánguloIsóceles (Double base, Double altura, Double lado) {

		super(base, altura);
		this.lado = lado;
	}
	
	public Double perimetro() {
		
		return (lado * 2) + base;
	}
	
	@Override
	public String nombreFigura() {
	
		return "Triángulo Isóceles";
	}
}
