package ContaBanco;
import java.util.Scanner;

public class ContaTerminal {
		
		public int numero;
		public String agencia;
		public String nomeCliente;
		public float saldo;
		
		
		
		public ContaTerminal(int numero, String agencia, String nomeCliente, float saldo) {
			super();
			this.numero = numero;
			this.agencia = agencia;
			this.nomeCliente = nomeCliente;
			this.saldo = saldo;
		}

		 public void exibirDetalhesConta() {
		        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " 
		                           + agencia + ", conta número " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
		    }
		 
		  public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        
		        System.out.println("Digite o número da conta: ");
		        int numero = Integer.parseInt(scanner.nextLine());
		        System.out.println("Digite o número da agência: ");
		        String agencia = scanner.nextLine();
		        System.out.println("Digite seu nome: ");
		        String nomeCliente = scanner.nextLine();
		        System.out.println("Digite o saldo: ");
		        float saldo = Float.parseFloat(scanner.nextLine());
		        
		        
		        ContaTerminal conta = new ContaTerminal(numero, agencia, nomeCliente, saldo);
		        
		        
		        conta.exibirDetalhesConta();

		        
		        scanner.close();
		
	}

}
