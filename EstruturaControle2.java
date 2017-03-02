import java.util.Scanner;

public class EstruturaControle2 {

	public static void main(String[] args) {
		int numero;
		int i;
		Scanner leitor = new Scanner(System.in);
		
		for(i=1;i<=10;i++){
			System.out.println("Digite o "+i+" numero: ");
			numero = leitor.nextInt();
			
			if(numero%2==0){
				System.out.println("Par!\n");
			}else{
				System.out.println("Impar!\n");
			}
		}
		leitor.close();
	}

}
