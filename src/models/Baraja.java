package models;

import java.util.ArrayList;

public class Baraja {
	public ArrayList<Carta> lista_cartas;

	public Baraja() {
		super();
		lista_cartas=new ArrayList<Carta>();
	}
	
	public Baraja(int tipobaraja) {
		super();
		lista_cartas=new ArrayList<Carta>();
		if(tipobaraja==1)
		{
			for (int i = 0; i < 40; i++) {
				this.lista_cartas.add(new Carta(i+1));
			}
		}
		if(tipobaraja==2)
		{
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 40; j++) {
					this.lista_cartas.add(new Carta(i+1));
				}
			}
		}
	}
	
	public Baraja(int tipobaraja, boolean barajar) {
		super();
		lista_cartas=new ArrayList<Carta>();
		if(tipobaraja==1)
		{
			for (int i = 0; i < 40; i++) {
				this.lista_cartas.add(new Carta(i+1));
			}
		}
		if(tipobaraja==2)
		{
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 40; j++) {
					this.lista_cartas.add(new Carta(i+1));
				}
			}
		}
		if(barajar)
		{
			Barajar();
		}
	}
	
	public void Barajar()
	{
		ArrayList<Carta> aux=new ArrayList<Carta>();
		int posicion;
		int j=this.lista_cartas.size();
		for (int i = 0; i < j; i++) {
			posicion=(int)(Math.random()*(this.lista_cartas.size()));
			aux.add(this.lista_cartas.get(posicion));
			this.lista_cartas.remove(posicion);
		}
		for (int i = 0; i < aux.size(); i++) {
			this.lista_cartas.add(aux.get(i));
		}
	}
	
	public void Cortar(int posicion)
	{
		ArrayList<Carta> aux=new ArrayList<Carta>();
		for (int i = 0; i < posicion; i++) {
			aux.add(this.lista_cartas.get(i));
			this.lista_cartas.remove(i);
		}
		this.lista_cartas.addAll(aux);
	}
	
	public Carta Robar()
	{
		Carta carta;
		carta=this.lista_cartas.get(0);
		this.lista_cartas.remove(0);
		return carta;
	}
	
	public void InsertaCartaFinal(int id_carta)
	{
		this.lista_cartas.add(new Carta(id_carta));
	}
	
	public void InsertaCartaPricipio(int id_carta)
	{
		this.lista_cartas.add(0, new Carta(id_carta));
	}
	
	public void InsertaCartaFinal(Carta carta)
	{
		this.lista_cartas.add(carta);
	}
	
	public void InsertaCartaPrincipio(Carta carta)
	{
		this.lista_cartas.add(0, carta);
	}
	
	public void getNumeroCartas()
	{
		int cont=0;
		for (int i = 0; i < this.lista_cartas.size(); i++) {
			cont++;
		}
		if(cont>0)
		{
			System.out.println("Quedan " + cont + " carta(s) en la baraja");
		}
		else
		{
			System.out.println("La baraja esta vacia");
		}
	}
	
	public boolean isVacia()
	{
		int cont=0;
		boolean vacio=false;
		for (int i = 0; i < this.lista_cartas.size(); i++) {
			cont++;
		}
		if (cont==0)
		{
			vacio=true;
		}
		return vacio;
	}

	@Override
	public String toString() {
		return "Baraja [lista_cartas=" + lista_cartas + "]";
	}
	
	
}
