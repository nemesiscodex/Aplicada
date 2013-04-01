public class Lukasiewicz implements Tnorma{
	public String getN(){
		return "Lukasiewicz";
	}
	public Double tnorma(Double a, Double b){
		return Math.min(1,1-a+b);
	}
}
