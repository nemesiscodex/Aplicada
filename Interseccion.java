public class Interseccion implements Tnorma{
	public String getN(){
		return "Interseccion Drastica";
	}
	public Double tnorma(Double a,Double b){
		if(b==1)return a;
		else if(a==1)return b;
		else return 0.0;
	}
}
