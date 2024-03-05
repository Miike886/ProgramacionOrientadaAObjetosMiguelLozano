package edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class Carrera {

	private String nombre;
	private List<Materia> materias;
	
	public Carrera (String carrera) {
		
		this.nombre = carrera;
		materias = new ArrayList<Materia>();
	}
	
	
	public void addMateria (Materia materia) {
		this.materias.add(materia);
	}
}









