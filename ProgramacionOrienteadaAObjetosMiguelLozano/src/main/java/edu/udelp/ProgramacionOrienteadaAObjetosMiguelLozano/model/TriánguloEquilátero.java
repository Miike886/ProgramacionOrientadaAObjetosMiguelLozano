package edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data


public class TriánguloEquilátero extends AbstractTriángulo {

	
	public TriánguloEquilátero (Double base, Double altura) {

		super(base, altura);
	}
	
	
	public Double perimetro() {

		return base * 3;
	}
	

	@Override
	public String nombreFigura() {
	
		return "Triángulo Equilátero";
	}
	
}
