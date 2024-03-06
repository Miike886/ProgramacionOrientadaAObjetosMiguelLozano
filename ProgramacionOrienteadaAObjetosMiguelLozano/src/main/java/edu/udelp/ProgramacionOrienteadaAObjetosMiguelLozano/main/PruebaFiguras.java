package edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.main;

import edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model.AbstractFigura;
import edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model.AbstractTriángulo;
import edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model.Cuadrado;
import edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model.Figura;
import edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model.Rectángulo;
import edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model.TriánguloEquilátero;
import edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model.TriánguloEscaleno;
import edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model.TriánguloIsóceles;

public class PruebaFiguras {

	public static void main(String[] args) {

		AbstractFigura fl = new Cuadrado (3D);
		fl.getResultado();
		
		fl = new Rectángulo(10D, 2D);
		fl.getResultado();
		
		
		
		
		AbstractTriángulo ft = new TriánguloEquilátero (3D, 5D);
		ft.getResultado();
		
		ft = new TriánguloIsóceles (3D, 5D, 5D);
		ft.getResultado();
		
		ft = new TriánguloEscaleno (3D, 5D, 5D, 7D);
		ft.getResultado();
	}

}
