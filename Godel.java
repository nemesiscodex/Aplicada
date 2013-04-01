public class Godel implements Tnorma{
	public String getN(){
		return "Gödel";	
	}
	public Double tnorma(Double a, Double b){
		if (a<=b) return 1.0;
		else return b;
	}
}
