package edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model;

public abstract class AbstractTriángulo implements Figura {

	protected Double base;
	protected Double altura;
	
	public AbstractTriángulo (Double base, Double altura) {

		this.base = base;
		this.altura = altura;
	}

	public abstract String nombreFigura();

	public void getResultado() {

		System.out.println("La figura: " + nombreFigura() + "\nLados: " + 3 + "\nPerímetro: " + perimetro() + "\nÁrea: " + area());
	}

	public Double area() { 
		return (base * altura) / 2;
	}
}
