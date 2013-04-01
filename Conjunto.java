public class Conjunto extends ConjuntoBase{
	private Double[] pertenencia;
	public Double getP(Integer i){
		assert (i>=0 && i<pertenencia.length);
		return pertenencia[i];
	}
	public Conjunto(String[] elementos, Double[]pertenencia){
		super(elementos);
		this.pertenencia = pertenencia;
	}
}
