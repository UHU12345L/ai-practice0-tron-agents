package P0;
//import java.util.Scanner; igual
import java.util.*;
import P0.Entorno;

public class AgenteInteractivo{
	Scanner scanner = new Scanner(System.in);
	public String pensar(Entorno entorno) {
	 	String accion = "N"; 
	 	boolean tran=false;
	 	// codigo Alumno 
	 	//vamos a recibir entorno, pensar y retornar la accion en este mismo metodo
	 	// el primer agente es interactivo: pedir por teclado hacia donde mover
	 	//comprobar esTransitable con lo que me pasan por teclado, si lo es realizo la accion
	 	
	 	do {
	 		System.out.println("Introduce accion (N/S/E/O): ");
	 		String meter=scanner.nextLine();
	 	
	 		int af=entorno.agenteF;
	 		int ac=entorno.agenteC;
	 	
	 		if (meter.equals("N")){
	 			af--;
	 		}
	 		if (meter.equals("S")){
	 			af++;
	 		}
	 		if (meter.equals("E")){
	 			ac++;
	 		}
	 		if (meter.equals("O")){
	 			ac--;
	 		}

	 		if(!entorno.esTransitable(af, ac)) {
	 			System.out.println("Introduce otra accion: ");
	 		}
	 		else {
	 			accion=meter;
	 			tran=true;
	 		}
	 	
	 	} while (!tran); 
	 	
	 	
	 	return accion;
	 }
}
