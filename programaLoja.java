package loja;
import java.util.Scanner;
public class programaLoja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan= new Scanner(System.in);
	
		 Fatura fatura= new Fatura();
	
		 System.out.print(" dig numero  ");String fnumero=scan.next();
		 System.out.print(" dig descrição do produto ");String fdescriçao=scan.next();
		 System.out.print(" dig quantidade do produto ");int fquantidade=scan.nextInt();
		 System.out.print(" dig preço do item ");double fpreçoItem=scan.nextDouble();
		 
		 fatura.setNumero(fnumero);
	fatura.setDescriçao(fdescriçao);
	fatura.setQuantComprada(fquantidade);
	fatura.setPreçoItem(fpreçoItem);
	
	System.out.printf(" numero da fatura = %s \n ",  fatura.getNumero());
	System.out.printf(" descriçao do produto = %s \n ",  fatura.getDescriçao());
	System.out.printf(" quantidade comprada = %s \n ",  fatura.getQuantComprada());
	System.out.printf(" preço do item = %.2f \n ",  fatura.getPreçoItem());
	
	System.out.printf(" valor da fatura = %.2f \n ",  fatura.getValordaFatura());
	
	
	}

}
