public class Formatacao{
	private boolean italico;
	private boolean negrito;
	private boolean sublinhado;

	public void setItalico(boolean i){
		this.italico = i;
	}

	public void setNegrito(boolean n){
		this.negrito = n;
	}

	public void setSublinhado(boolean s){
		this.sublinhado = s;
	}

	public getItalico(){
		return this.italico;
	}

	public getNegrito(){
		return this.negrito;
	}

	public getSublinhado(){
		return this.sublinhado;
	}
}