package edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;

import java.util.List;
import java.util.ArrayList;

import edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model.Persona;
import edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.util.Archivos;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
	
		Persona p = new Persona();
		
		p.setNombre("Miguel Lozano");
		
		List <Persona> listP = new ArrayList <Persona>();
		listP.add(p);
		
		Archivos.guardaAcrhivo(Persona.class.getName(), listP);
		List <Persona> listaPersona = Archivos.leerArchivo(Persona.class.getName());
		System.out.println(listaPersona);
 		
	}
}

