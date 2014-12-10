public class Figura extends Elemento implements Rotacionavel,Transformavel{
	private String nome;
	public Tamanho tamanho;
	tamanho = new Tamanho();
	public void setFigura(String f){
		this.nome = f;
	}

	public getFigura(){
		return this.nome;
	}

}