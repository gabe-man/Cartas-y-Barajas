package models;

public class Carta {
	private int numero;
	private int palo;
	
	public Carta(int numero, int palo) {
		super();
		this.numero = numero;
		this.palo = palo;
	}
	
	public Carta(int id) {
		super();
		if (id%10==0)
		{
			this.numero=10;
		}
		else
		{
			this.numero = id%10;
		}
		if(id==40)
		{
			this.palo=3;
		}
		else
		{
			this.palo=id/10;
		}
	}

	public int getNumero() {
		return numero;
	}

	public int getPalo() {
		return palo;
	}
	
	public int ID()
	{
		int ID;
		ID=(this.palo*10)+this.numero;
		return ID;
	}
	
	public String getNombreNumero()
	{
		String NombreNumero = null;
		switch (this.numero) {
		case 1:
			NombreNumero="as";
			break;
		case 2:
			NombreNumero="dos";
			break;
		case 3:
			NombreNumero="tres";
			break;
		case 4:
			NombreNumero="cuatro";
			break;
		case 5:
			NombreNumero="cinco";
			break;
		case 6:
			NombreNumero="seis";
			break;
		case 7:
			NombreNumero="siete";
			break;
		case 8:
			NombreNumero="sota";
			break;
		case 9:
			NombreNumero="caballo";
			break;
		case 10:
			NombreNumero="rey";
			break;
		default:
			break;
		}
		return NombreNumero;
	}
	
	public String getNombrePalo()
	{
		String NombrePalo = null;
		switch (this.palo) {
		case 0:
			NombrePalo="oros";
			break;
		case 1:
			NombrePalo="copas";
			break;
		case 2:
			NombrePalo="espadas";
			break;
		case 3:
			NombrePalo="bastos";
			break;
		default:
			break;
		}
		return NombrePalo;
	}
	
	public String getNombreCarta()
	{
		String Numero=getNombreNumero();
		String Palo=getNombrePalo();
		String NombreCarta=(Numero + " de " + Palo);
		return NombreCarta;
	}
	
	public int getValorMus()
	{
		int valor=0;
		if (this.numero==1 || this.numero==2)
		{
			valor=1;
		}
		else if(this.numero==3||this.numero==8||this.numero==9||this.numero==10)
		{
			valor=10;
		}
		else
		{
			valor=this.numero;
		}
		
		return valor;
	}
	
	public double getValor7ymedia()
	{
		double valor=0;
		if(this.numero==8 || this.numero==9 || this.numero==10)
		{
			valor=0.5;
		}
		else
		{
			valor=this.numero;
		}
		
		return valor;
	}
}
