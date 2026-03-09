import java.io.Serializable;

public class Filme implements Serializable{
	private static final long serialVersionUID=1L;
	
	private String nome;
	private transient String diretor; // exemplo de atributo transient, nao sera serializado
	private int ano;
	private int estrelas;
	
	public Filme(String nome, String diretor, int ano, int estrelas){
		this.nome=nome;
		this.diretor=diretor;
		this.ano=ano;
		this.estrelas=estrelas;
	}

	public String getNome(){return nome;}
	public void setNome(String nome){this.nome=nome;}
	public String getDiretor(){return diretor;}
	public void setDiretor(String diretor){this.diretor=diretor;}
	public int getAno(){return ano;}
	public void setAno(int ano){this.ano=ano;}
	public int getEstrelas(){return estrelas;}
	public void setEstrelas(int estrelas){this.estrelas=estrelas;}
	
	@Override
	public String toString(){
		return "filme: "+nome+" ("+ano+"), dirigido por "+diretor+". "+estrelas+"★";
	}
}
