package edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Estudiante extends Persona {
	
	private Integer semestre;
	private List<MateriaAlumno> materias;
	private String generacion;
	private Carrera carrera;
	
	public Estudiante (String nombre, String fechaNacimiento, Sexo sexo, Integer semestre, String generacion) {
		super(nombre, fechaNacimiento, sexo);
		this.materias = new ArrayList<MateriaAlumno>();
		this.semestre = semestre; 
		this.generacion = generacion;
		carrera = null;
		id = generaId();
	}
	
	
	public void addMateria (MateriaAlumno materia) {
		this.materias.add(materia);
	}
}
