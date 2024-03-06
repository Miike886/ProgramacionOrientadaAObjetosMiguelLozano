package edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.util;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model.Persona;

public class Archivos {

	private final static String PATH = "C:\\archivos_json\\";
	
	public static void guardarArchivo (String nombre, List lista) {
		
		String filePath = PATH + nombre + ".json";
		
		FileWriter writer=null;

		try 
		{
			writer=new FileWriter(filePath);
			Gson builder=new GsonBuilder().create();
			builder.toJson(lista, writer);

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				if(null!=writer) 
				{
					writer.close();
				}
			}
			catch(Exception e) 
			{

			}
		}
	}
	
	public static List leerArchivo (String nombre) {
		
		List list = new ArrayList();
		Gson gson = new Gson();
		FileReader fReader = null;
		try
		{
			String filePath = PATH + nombre + ".json";
			fReader = new FileReader(filePath);
			list = gson.fromJson(fReader,List.class);
		
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if (null != fReader)
				{
					fReader.close();
				}
			} 
			catch (Exception ex)
			{
				
			}
		}
		
		return list;
	}
} 
