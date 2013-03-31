public class Lukasiewicz implements Tnorma{
	public Double tnorma(Double a, Double b){
		return Math.min(1,1-a+b);
	}
}
