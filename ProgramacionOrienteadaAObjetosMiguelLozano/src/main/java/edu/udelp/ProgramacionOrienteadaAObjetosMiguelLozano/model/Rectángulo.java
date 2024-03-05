package edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model;

import lombok.Data;

@Data
public class Rectángulo extends AbstractFigura {

	private Double altura;
	
	public Rectángulo(Double base, Double altura) {
		
		super(base);
		this.altura = altura;
		// TODO Auto-generated constructor stub
	}

	private Double perimetro;

	public Double perimetro() {
		
		return (altura * 2) + (lado * 2);
	}

	public Double area() {
		
		return lado * altura;
	}

	@Override
	public Integer numLados() {
		
		return 4;
	}

	@Override
	public String nombreFigura() {
		
		return "Rectángulo";
	}
	
	
	
}
