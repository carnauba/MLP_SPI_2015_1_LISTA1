package loja;

public class Fatura {

private String numero;
private String descriçao;
private int quantComprada;
private double preçoItem;
private double valordaFatura;

public String getNumero(){
	return numero;
}	
public void setNumero(String numero){
	this.numero=numero;	
}
public String getDescriçao(){
	return descriçao;
}	
public void setDescriçao(String descriçao){
	this.descriçao=descriçao;	
}
public int getQuantComprada(){
	return quantComprada;
}	
public void setQuantComprada(int quantComprada){
	this.quantComprada=quantComprada;	
}
public double getPreçoItem(){
	return preçoItem;
}	
public void setPreçoItem(double preçoItem){
	if(preçoItem<0){ preçoItem= 0;}else{
	this.preçoItem=preçoItem;}	
}	


public double getValordaFatura() {
	valordaFatura=(preçoItem* quantComprada);if(valordaFatura<0){valordaFatura=0;}
	return  valordaFatura;}

}
	
