package edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model;

import lombok.Data;

@Data
public abstract class AbstractFigura implements Figura {
	
	protected Double lado;
	
	public AbstractFigura (Double lado) {
	
		this.lado = lado;
		
	}
	
	public abstract Integer numLados();
	
	public abstract String nombreFigura();
	
	
	public void getResultado() {
		
		System.out.println("La figura: " + nombreFigura() + "\nLados: " + numLados() + "\nPerímetro: " + perimetro() + "\nÁrea: " + area());
	}

}
