import java.io.*;

public class Main{
	public static void main(String[] args) {
		Filme filme=new Filme("Farewell My Concubine", "Chen Kaige", 1993, 5);
		
		try{
			ObjectOutputStream oSer=new ObjectOutputStream(new FileOutputStream("filme.ser"));
			oSer.writeObject(filme);
			oSer.close();

			System.out.println("INFORMACOES ORIGINAIS");
			System.out.println(filme);
			System.out.println("================================================================\n");

			filme.setEstrelas(3);
			
			System.out.println("DEPOIS DE ALTERAR");
			System.out.println(filme);
			System.out.println("================================================================\n");

			ObjectInputStream oDes=new ObjectInputStream(new FileInputStream("filme.ser"));
			filme=(Filme) oDes.readObject();
			oDes.close();
			
			System.out.println("DEPOIS DE RECUPERAR OS VALORES");
			System.out.println(filme);
			System.out.println("================================================================\n");
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
			System.out.println("arquivo nao encontrado.");
		}catch(IOException e){
			e.printStackTrace();
			System.out.println("erro ao ler o arquivo.");
		}catch (ClassNotFoundException e){
			System.out.println("classe nao encontrada.");
			e.printStackTrace();
		}
	}
}
