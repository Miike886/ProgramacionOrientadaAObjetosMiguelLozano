package edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class Cuadrado extends AbstractFigura {

	

	public Cuadrado (Double lado) {
		
		super (lado);
	}
	
	public Double perimetro() {
		return lado * numLados();
	}

	public Double area() {
		// TODO Auto-generated method stub
		return lado * lado;
	}

	@Override
	public Integer numLados() {
		
		return 4;
	}

	@Override
	public String nombreFigura() {
		// TODO Auto-generated method stub
		return "Cuadrado";
	}
}
