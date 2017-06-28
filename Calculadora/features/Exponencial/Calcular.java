/**
 * TODO description
 */
public class Calcular {
	public int exponencial(int v1, int v2){
		int valor = v1;
		
		for(int i=1;i<v2;i++){
			valor = multiplicar(valor,v1);
		}
		
		return valor;
	}

}