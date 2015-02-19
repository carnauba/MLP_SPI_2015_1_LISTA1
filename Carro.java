package ferrari;

public class Carro {

	private String cor;
private String modelo;
private int velocAtual;
private int velocMaxima;
private String ligar;

public String getCor(){
	return cor;
}
public void setCor(String cor){
	this.cor=cor;
}
	
public String getmodelo(){
	return modelo;
}
public void setModelo(String modelo){
	this.modelo=modelo;
}
public int getVelocAtual(){
	if( velocAtual>velocMaxima){System.out.printf("velocidade maxima excedida");}
	
	return velocAtual;
}
public void setVelocAtual(int velocAtual){
	this.velocAtual=velocAtual;
}

public int getVelocMaxima(){
	
	return velocMaxima;
}
public void setVelocMaxima(int velocMaxima){
	this.velocMaxima=velocMaxima;
}

public String getLigar(String lig){
if (lig.equalsIgnoreCase("off")){ligar="desligado";}
else{ 
	if(lig.equalsIgnoreCase("on")){ligar="ligado";}}
return ligar;
}

public void acelerar(int acelerador){
	if((velocAtual+acelerador)>velocMaxima)
	
	{System.out.print("velocidade máxima excedida ");
	
	}else{this.velocAtual=this.velocAtual+ acelerador;}
}
	
}
