package validators;
import java.util.Collections;
import java.util.Vector;

public class Lista extends Vector
{

	public Lista(){
	}

	public Lista(String[] elementos){
		for(int i=0;i<elementos.length;i++){
			this.add(elementos[i]);
		}
	}

	public Lista ordenar()
	{
		Lista ord = (Lista) this.clone();
		Collections.sort(ord);
		return ord;
	}

	//prueba manual
	/*
	public static void main(String[] args){
		String[] e1 = {"a","b","c","d","e"};
		Lista expected = new Lista(e1);

		String[] e2 = {"e","d","c","b","a"};
		Lista reves = new Lista(e2);
		Lista derecha = reves.ordenar();

		if(derecha.equals(expected)){
			System.out.println("correcto");
		}else{
			System.out.println("incorrecto");
		}
	}
	*/

}
