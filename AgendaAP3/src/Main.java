import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int opc;
		do{
			System.out.println("======AGENDA TELEFONICA======");
			System.out.println("1- adicionar novo usuario");
			System.out.println("2- exibir lista telefonica");
			System.out.println("3- buscar usuario");
			System.out.println("0- terminar programa");
			
			System.out.print("\nescolha uma opção: ");
			opc=sc.nextInt();
			
			System.out.print("=============================\n");
			switch(opc){
			case 1:
				System.out.print("nome: ");
				String nomeAdc=sc.next();
				System.out.print("telefone: ");
				String telefone=sc.next();
				
				Agenda.escrita(nomeAdc, telefone);
				break;
			case 2:
				Agenda.listar();
				break;
			case 3:
				System.out.print("nome: ");
				String nomeBusca=sc.next();
				Agenda.buscar(nomeBusca);
				break;
			case 0:
				System.out.println("encerrando o programa.");
				break;
			default:
				System.out.print("opçao invalida. tente novamente.");
			}
			System.out.print("\n=============================\n");
		}while(opc!=0);
		sc.close();
	}
}
