package edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.main;

import java.util.Scanner;

import edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model.AbstractPrenda;
import edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model.Carrera;
import edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model.Estudiante;
import edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model.Materia;
import edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model.AbstractPrenda.Talla;
import edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model.AbstractPrenda.TipoPrenda;
import edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model.Persona.Sexo;
import edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model.PantalonMezclilla;
import edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.model.PantalonVestir;
import edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.process.ProcesosControlEscolar;
import edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.process.ProcesosPersona;
import edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.process.ProcesosTiendaRopa;
import edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.util.Archivos;
import edu.udelp.ProgramacionOrienteadaAObjetosMiguelLozano.validations.Validaciones;

public class TiendaRopa {

	public static void main(String[] args) {


		Scanner leer = new Scanner (System.in);
		
		Validaciones validaciones = new Validaciones();
		
		ProcesosTiendaRopa funciones = new ProcesosTiendaRopa();
		
		String auxiliar, opcion, id, opcionAuxiliar = "";
		
		boolean repetir = true, salir = false;
		
		int opcionEntero, opcionTipoPrenda, opcionTalla, unidades;
		
		TipoPrenda tipoPrenda = null;
		Talla talla = null;
		Double precioCompra, totalVenta, ventaActual;
		
		
		do
		{
			System.out.println("\t\tMenú\n1. Dar de alta prendas\n2. MostrarPrendas"
					+ "\n3. Hacer venta\n4. Mostrar Ventas\n5. Salir");
			do
			{
				opcion = leer.nextLine();

				if (validaciones.validaEntero(opcion))
				{
					opcionEntero = Integer.parseInt(opcion);
					switch(opcionEntero)
					{
					case 1:

						System.out.println("Seleccionaste dar de alta una prenda\nIngresa el número del tipo de prenda a ingresar\n1) Pantalón de vestir\n2) Pantalón de mezclilla\n3) Camisa\n4) Falda\n5) Blusa\n6) Playera");

						do
						{

							opcionTipoPrenda = leer.nextInt();

							if(opcionTipoPrenda > 0 && opcionTipoPrenda < 7)
							{
								
								if (opcionTipoPrenda == 1)
								{
									tipoPrenda = TipoPrenda.PantalonVestir;
								}
								else if (opcionTipoPrenda == 2)
								{
									tipoPrenda = TipoPrenda.PantalonMezclilla;
								}
								else if (opcionTipoPrenda == 3)
								{
									tipoPrenda = TipoPrenda.Camisa;
								}
								else if (opcionTipoPrenda == 4)
								{
									tipoPrenda = TipoPrenda.Falda;
								}
								else if (opcionTipoPrenda == 5)
								{
									tipoPrenda = TipoPrenda.Blusa;
								}
								else if (opcionTipoPrenda == 6)
								{
									tipoPrenda = TipoPrenda.Playera;
								}
								
								System.out.println("Selecciona la talla\n1) Chica\n2) Mediana\n3) Grande\n4) Extra Grande");

								do
								{
									opcionTalla = leer.nextInt();

									if(opcionTalla > 0 && opcionTalla < 5)
									{
										
										if (opcionTalla == 1)
										{
											talla = Talla.CH;
										}
										else if (opcionTalla == 2)
										{
											talla = Talla.M;
										}
										else if (opcionTalla == 3)
										{
											talla = Talla.G;
										}
										else if (opcionTalla == 4)
										{
											talla = Talla.EX;
										}
										
										System.out.println("Ingresa el precio de compra");
										
										do
										{
											
											auxiliar = leer.nextLine();
											
											if(validaciones.validaFlotante(auxiliar))
											{
												precioCompra = Double.parseDouble(auxiliar);
												
												System.out.println("Ingresa el número de unidades");
												
												do
												{
													
													auxiliar = leer.nextLine();
													
													if(validaciones.validaEntero(auxiliar))
													{
														unidades = Integer.parseInt(auxiliar);
														
														funciones.altaDePrendas(tipoPrenda, talla, precioCompra, unidades);
														System.out.println("Se ha ingresado la prenda con éxito\n" + funciones.mostrarPrendas());
													}
													else
													{
														System.out.println("Debes ingresar un número entero");
													}
													
												} while (!validaciones.validaFlotante(auxiliar));
												
											}
											else
											{
												System.out.println("Ingresa un precio válido");
											}
											
											
										} while (!validaciones.validaFlotante(auxiliar));
										
									}
									else
									{
										System.out.println("Ingresa una opción válida entre 1 - 4");
									}
								} while(opcionTalla < 1 || opcionTalla > 4);
							}
							else
							{
								System.out.println("Selecciona una opción válida entre 1 - 6");
							}

						} while (opcionTipoPrenda < 1 || opcionTipoPrenda > 6);

						break;

					case 2: 
						
						if (funciones.listaPrendas.size() == 0)
						{
							System.out.println("No se ha agregado ninguna prenda, intenta de nuevo");
						}
						else
						{
							System.out.println("Seleccionaste mostrar prendas: \n" + funciones.mostrarPrendas());
						}
						break;

					
					case 3: 
						totalVenta = 0D;
						if (funciones.listaPrendas.size() == 0)
						{
							System.out.println("No se ha agregado ninguna prenda, intenta de nuevo");
						}
						else
						{
							System.out.println("Seleccionaste hacer venta");

							do {
								System.out.println("Ingresa el id del producto:\n" + funciones.mostrarPrendas()); 
								id = leer.nextLine();

								if (funciones.buscarPrendaPorId(id) != -1) {
									do {
										System.out.println("Ingresa la cantidad de unidades del producto que deseas vender:"); 
										auxiliar = leer.nextLine();
										unidades = Integer.parseInt(auxiliar);

										if (funciones.listaPrendas.get(funciones.buscarPrendaPorId(id)).getNPrendas() >= unidades) {
											ventaActual = funciones.ventaPrenda(id, unidades);
											totalVenta += ventaActual;

											System.out.println("El total a pagar es " + totalVenta + "\n¿Deseas agregar otro producto?\n 1) Sí\nCualquier otra tecla: No");
											opcionAuxiliar = leer.nextLine();

											if(!opcionAuxiliar.equals("1")) {
												break;
											}
										} else {
											System.out.println("No hay unidades suficientes del producto, intenta de nuevo");
										}
									} while (funciones.listaPrendas.get(funciones.buscarPrendaPorId(id)).getNPrendas() < unidades);
								} else {
									System.out.println("Debes ingresar un id válido");
								}
							} while(opcionAuxiliar.equals("1"));

							opcionAuxiliar = "1"; 
						}
						break;


					case 4: 
						if (funciones.listaVentas.size() == 0)
						{
							System.out.println("No se ha agregado ninguna venta, intenta de nuevo");
						}
						else
						{
							System.out.println("Seleccionaste mostrar ventas: \n" + funciones.mostrarVentas());	
						}
						break;
						
						
					case 5:
						repetir = false;
						System.out.println("Saliendo del programa...");
						break;
						
					default:
						System.out.println("El número entero ingresado debe de estar dentro del rango establecido");
					} 
				}
				else
				{
					System.out.println("El valor ingresado debe ser un número entero");
				}
			} while (!validaciones.validaEntero(opcion));

		}while(repetir);
		
	}

}
