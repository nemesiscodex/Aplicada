public class Goguen implements Tnorma{
	public String getN(){
		return "Goguen";
	}
	public Double tnorma(Double a, Double b){
		if(a<=b) return 1.0;
		else return (b/a);
	}
}
