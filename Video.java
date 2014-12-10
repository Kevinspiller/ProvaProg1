public class Video extends Elemento implements Transformavel{
	private String name;
	public Tamanho tamanho;
	tamanho = new Tamanho();
	public void setVideo(String v){
		this.name = v;
	}

	public getVideo(){
		return this.name;
	}
}