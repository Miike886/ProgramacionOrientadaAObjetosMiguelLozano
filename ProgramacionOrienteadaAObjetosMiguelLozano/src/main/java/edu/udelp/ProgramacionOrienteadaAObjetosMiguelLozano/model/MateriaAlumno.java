package edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model;

import lombok.Data;

@Data
public class MateriaAlumno extends Materia {

	
	private Double primerParcial;
	private Double segundoParcial;
	private Double proyecto;
	private Double examenFinal;
	private String idMateria;
	
	public MateriaAlumno(String semestre, String horario, String nombre, Carrera carrera, String id) {
		super(semestre, horario, nombre, carrera);
		primerParcial = null;
		segundoParcial = null;
		proyecto = null; 
		examenFinal = null;
		this.idMateria = id;
	}
	
	
	
}
