import java.util.*;
import java.text.*;
public class TP3{
	ConjuntoBase X,Y;
	Conjunto A,B,Aprima;
	//Ejercicio 1
	public Double[][] desplegarMatriz(Tnorma T){
		Integer tA,tB;
		Double valor;	
		Double[][] ret;	
		DecimalFormat df = new DecimalFormat("#.##");
		tA = A.getSize();
		tB = B.getSize();
		ret = new Double[tA][tB];
		System.out.println(T.getN());
		for(int i = 0; i<tB; i++){
			System.out.print("\t"+B.getE(i));
		}
		System.out.print("\n");
		
		for(int i = 0; i<tA; i++){
			System.out.print(A.getE(i)+"\t");
			for(int j = 0; j<tB; j++){
				valor = T.tnorma(A.getP(i),B.getP(j));
				System.out.print(df.format(valor)+"\t");
				ret[i][j]=valor;
			}
			System.out.print("\n");
		}		
		return ret;
	}
	//Ejercicio 2
	public void maxt(Double[][] mat, Tnorma T){
		Integer tf,tc;
		Double mayor;
		tf = mat.length;
		tc = mat[0].length;
		System.out.println(T.getN());		
		for(int i = 0; i<tc; i++){
			mayor = 0.0;
			for(int j = 0; j<tf; j++){
				mayor = Math.max(mayor,T.tnorma(mat[j][i],Aprima.getP(j)));
			}
			System.out.print("\t"+mayor+"/"+B.getE(i));
		}
		System.out.print("\n");
	}
	public static void main(String[] args){
		Double[][] mt1,mt2,mt3;		
		Tnorma t1,t2,t3,t4,t5,t6;
		
		TP3 tp = new TP3();
		String[] x={"1","2","3","4","5"};
		String[] y={"a","b","c","d","e","f"}; 
		Double[] a ={0.2,0.5,1.0,0.7,0.4};
		Double[] aprima ={0.5,1.0,0.7,0.5,0.3};
		Double[] b ={0.3,0.5,0.7,1.0};
		tp.X = new ConjuntoBase(x);
		tp.Y = new ConjuntoBase(y);
		tp.A = new Conjunto(x,a);
		tp.B = new Conjunto(Arrays.copyOfRange(y,0,4),b);
		tp.Aprima = new Conjunto(x,aprima);
		t1 = new Godel();
		t2 = new Lukasiewicz();
		t3 = new Goguen();
		t4 = new Minimo();
		t5 = new Producto();
		t6 = new Interseccion();
		//Ejercicio 1
		mt1 = tp.desplegarMatriz(t1);
		mt2 = tp.desplegarMatriz(t2);
		mt3 = tp.desplegarMatriz(t3);
		tp.maxt(mt1,t4);
		tp.maxt(mt2,t5);
		tp.maxt(mt3,t6);
	}
}
