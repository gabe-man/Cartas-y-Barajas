package MainApp;

import models.Carta;

import models.Baraja;

import java.util.Scanner;

public class mainapp {

	public static void main(String[] args) {
		Baraja Baraja1=new Baraja(1, true);
		char quiere='n';
		Scanner sc=new Scanner(System.in);
		double puntuacionUsuario=0;
		double puntuacionOrdenador=0;
		Carta carta;
		int cont=1;
		
		
		do {
			quiere='n';
			carta=Baraja1.Robar();
			puntuacionUsuario+=carta.getValor7ymedia();
			System.out.println("Has robado la carta:" + carta.getNombreCarta());
			System.out.println("Su puntuacion es: " + puntuacionUsuario);
			
			if(puntuacionUsuario>7.5)
			{
				System.out.println("Usted se ha pasado. Ha perdido");
			}
			else if(puntuacionUsuario==7.5)
			{
				System.out.println("¡Siete y media! Usted gana el doble de lo apostado");
			}
			else
			{
				System.out.println("¿Quiere otra carta?(s/n)");
				quiere=sc.nextLine().charAt(0);
				while(quiere !='s' && quiere !='n')
				{
					System.out.println("Esa no es una opcion valida. Intentalo de nuevo");
					System.out.println("¿Quiere otra carta?(s/n)");
					quiere=sc.nextLine().charAt(0);
				}
			}
		}while(quiere == 's');
	}

}
