class Batiment{
	private String numero;
	private String cellule;
	private String etage;
	private String surface;
	private double price;
	public Batiment(String numero,String cellule,String etage,String surface,double price){
		setNumero(numero);
		setCellule(cellule);
		setEtage(etage);
		setSurface(surface);
		setPrice(price);
	}


public void setNumero(String numero){
	this.numero=numero;
}
public void setCellule(String cellule){
	this.cellule=cellule;
}
public void setEtage(String etage){
	this.etage=etage;
}
public void setSurface(String surface){
	this.surface=surface;
}
public void setPrice(double price){
	this.price=price;
}
public String getNumero(String numero){
	return numero;
}
public String getCellule(String cellule){
	return cellule;
}
public String getEtage(String etage){
	return etage;
}
public String getSurface(String surface){
	return surface;
}
public double getPrice(double price){
	return price;
}



public String getInfo(){
	return "numero="+numero+"cellule="+cellule+"etage="+etage+"surface="+surface+"price="+price;




}

}

public class TestBatiment
{
	public static void main(String[] args){
		System.out.println(new Batiment("84930218","chengduxiaoqu","4","110",8000000).getInfo());


	}



}