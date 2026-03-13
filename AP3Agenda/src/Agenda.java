import java.io.*;

public class Agenda{
	private static final String arq="contatos.txt";
	
	public static void escrita(String nome, String telefone){
		try(BufferedWriter bw=new BufferedWriter(new FileWriter(arq, true))){
			bw.write(nome+";"+telefone);
			bw.newLine();
			System.out.println("contato adicionado com sucesso.");
		}catch(IOException e){
			e.printStackTrace();
			System.out.println("erro ao adicionar contato.");
		}
	}
	
	public static void listar(){
		try(BufferedReader br=new BufferedReader(new FileReader(arq))){
			System.out.println("======LISTA TELEFONICA======");
			String linha;
			while((linha=br.readLine())!=null){
				String[] dados=linha.split(";");
				System.out.println("nome: "+dados[0]+" (telefone: +55 (21) "+dados[1]+")");
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
			System.out.println("arquivo nao encontrado.");
		}catch(IOException e){
			e.printStackTrace();
			System.out.println("erro ao ler o arquivo.");
		}
	}
	
	public static void buscar(String nome){
		try(BufferedReader br=new BufferedReader(new FileReader(arq))){
			boolean achou=false;
			String linha;
			while((linha=br.readLine())!=null){
				String[] dados=linha.split(";");
				if(dados[0].equalsIgnoreCase(nome)){
					System.out.println("======INFORMAÇOES UNICAS======");
					System.out.println("Nome: "+dados[0]+" (Telefone: +55 (21) "+dados[1]+")");
					achou=true;
				}
			}
			if(!achou){
				System.out.println("usuário não encontrado.");
			}
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
			System.out.println("arquivo nao encontrado.");
		}catch(IOException e){
			e.printStackTrace();
			System.out.println("erro ao ler o arquivo.");
		}
	}
}
