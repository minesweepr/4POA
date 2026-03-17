package model;

public class Filme{
	private String nome;
	private int anoLancamento;
	private int duracao;
	private String genero;
	private String sinopse;
	private String[] plataformas;
	private String diretor;
	
	public Filme(String nome, int anoLancamento, int duracao, String genero, 
			     String sinopse, String[] plataformas, String diretor){
		super();
		this.nome=nome;
		this.anoLancamento=anoLancamento;
		this.duracao=duracao;
		this.genero=genero;
		this.sinopse=sinopse;
		this.plataformas=plataformas;
		this.diretor=diretor;
	}

	public String getNome(){return nome;}
	public void setNome(String nome){this.nome=nome;}

	public int getAnoLancamento(){return anoLancamento;}
	public void setAnoLancamento(int anoLancamento){this.anoLancamento=anoLancamento;}

	public int getDuracao(){return duracao;}
	public void setDuracao(int duracao){this.duracao=duracao;}

	public String getGenero(){return genero;}
	public void setGenero(String genero){this.genero=genero;}

	public String getSinopse(){return sinopse;}
	public void setSinopse(String sinopse){this.sinopse=sinopse;}

	public String[] getPlataformas(){return plataformas;}
	public void setPlataformas(String[] plataformas){this.plataformas=plataformas;}

	public String getDiretor(){return diretor;}
	public void setDiretor(String diretor){this.diretor=diretor;}
}
