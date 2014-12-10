public class Palavra extends Elemento implements Rotacionavel {
	private String palavra;
	public Formatacao formatacao;
	formatacao = new Formatacao();
	public void setPalavra(String p){
		this.palavra = p;
	}

	public String getPalavra(){
		return this.palavra;
	}

}