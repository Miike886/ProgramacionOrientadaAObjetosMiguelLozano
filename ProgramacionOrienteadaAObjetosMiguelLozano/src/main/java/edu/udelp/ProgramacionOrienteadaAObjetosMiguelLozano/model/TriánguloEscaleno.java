package edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model;

public class TriánguloEscaleno extends AbstractTriángulo {

	private Double lado1;
	private Double lado2;

	public TriánguloEscaleno (Double base, Double altura, Double lado1, Double lado2) {

		super(base, altura);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	public Double perimetro() {
		
		return base + lado1 + lado2;
	}
	
	@Override
	public String nombreFigura() {
	
		return "Triángulo Escaleno";
	}

	
	
}
