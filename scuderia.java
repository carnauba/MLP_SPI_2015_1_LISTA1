package ferrari;
import java.util.Scanner;

public class scuderia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan= new Scanner(System.in);

Carro carro = new Carro();
 
System.out.print(" digite cor do carro ");String fcor=scan.next();
carro.setCor(fcor);

System.out.print(" digite modelo do carro ");String fmodelo=scan.next();
carro.setModelo(fmodelo);

System.out.print(" para ligar o carro digite [ on ] ");String flig=scan.next();

System.out.printf(" carro %s \n ", carro.getLigar(flig));

carro.setVelocMaxima(250);//velocidade maxima  do carro é 250.

System.out.printf("velocidade maxima do carro = %s  \n",  carro.getVelocMaxima());


System.out.print(" digite a velocidade ate o limite da velocidade máxima");int fvelocidade=scan.nextInt();	
carro.setVelocAtual(fvelocidade);

System.out.printf("velocidade Atual = %s  \n",  carro.getVelocAtual());

System.out.print(" digite o quanto deseja acelerar ou desacelerar ");
System.out.print("(obs: se o valor exceder a velocidade máxima o valor será desconsiderado) ");
int  facelerar=scan.nextInt();	
carro.acelerar(facelerar);	
	
System.out.printf(" velocidade atualizada = %s  \n",  carro.getVelocAtual());	
	
System.out.print(" para desligar o carro digite [ off ] "); flig=scan.next();

System.out.printf(" carro %s \n ", carro.getLigar(flig));	
	
	}

}
