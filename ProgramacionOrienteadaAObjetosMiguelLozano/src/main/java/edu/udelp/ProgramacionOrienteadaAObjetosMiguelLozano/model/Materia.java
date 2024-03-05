package edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model;

import java.util.Random;

import lombok.Data;

@Data
public class Materia {
	
	private String id;
	private String semestre;
	private String horario;
	private String nombre;
	private Carrera carrera;
	
	public Materia (String semestre, String horario, String nombre, Carrera carrera) {
		
		id = generaId();
		this.semestre = semestre;
		this.horario = horario;
		this.nombre = nombre; 
		this.carrera = carrera;
	}
	

	private String generaId () {
		
		Random aleatorio = new Random();
		int numeroAleatorio = 0;
		
		
		String id = "";
		
		for (int i = 0; i < 8; i++)
		{
			numeroAleatorio  = aleatorio.nextInt(10);
			id  +=  numeroAleatorio;
		}
		
		return id;
	}
		
}
