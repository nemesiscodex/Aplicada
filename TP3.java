import java.util.*;
import java.text.*;
public class TP3{
	ConjuntoBase X,Y;
	Conjunto A,B;
	public void desplegarMatriz(Tnorma T){
		Integer tA,tB;
		DecimalFormat df = new DecimalFormat("#.##");
		tA = A.getSize();
		tB = B.getSize();
		System.out.println(T.getN());
		for(int i = 0; i<tB; i++){
			System.out.print("\t"+B.getE(i));
		}
		System.out.print("\n");
		for(int i = 0; i<tA; i++){
			System.out.print(A.getE(i)+"\t");
			for(int j = 0; j<tB; j++){
				System.out.print(df.format(T.tnorma(A.getP(i),B.getP(j)))+"\t");
			}
			System.out.print("\n");
		}		
	}
	public static void main(String[] args){
		TP3 tp = new TP3();
		String[] x={"1","2","3","4","5"};
		String[] y={"a","b","c","d","e","f"}; 
		tp.X = new ConjuntoBase(x);
		tp.Y = new ConjuntoBase(y);
		Double[] a ={0.2,0.5,1.0,0.7,0.4};
		Double[] b ={0.3,0.5,0.7,1.0};
		tp.A = new Conjunto(x,a);
		tp.B = new Conjunto(Arrays.copyOfRange(y,0,4),b);
		Tnorma t1,t2,t3;
		t1 = new Godel();
		t2 = new Lukasiewicz();
		t3 = new Goguen();
		tp.desplegarMatriz(t1);
		tp.desplegarMatriz(t2);
		tp.desplegarMatriz(t3);
	}
}
