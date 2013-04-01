public class ConjuntoBase{
	protected String[] elementos;
	private Integer size;
	public String getE(Integer i){
		assert (i>=0 && i<elementos.length);
		return elementos[i];
	}
	public Integer getSize(){
		return this.size;
	}
	public ConjuntoBase(String[] elementos){
		this.elementos = elementos;
		this.size = this.elementos.length;
	}
}
