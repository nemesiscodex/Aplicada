import java.util.*;

public class TP3{
	ConjuntoBase X,Y;
	Conjuntos A,B;
	public static void main(){
		TP3 tp = new TP3();
		String[] x={"1","2","3","4","5"};
		String[] y={"a","b","c","d","e","f"}; 
		tp.X = new ConjuntoBase(x);
		tp.Y = new ConjuntoBase(y);
		Double[] a ={0.2,0.5,1.0,0.7,0.4};
		Double[] b ={0.3,0.5,0.7,1.0};
		tp.A = new Conjuntos(x,a);
		tp.B = new Conjuntos(Arrays.copyOfRange(y,0,3),b);
	}
}
