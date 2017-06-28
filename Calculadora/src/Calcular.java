/**
 * TODO description
 */
public   class  Calcular {
	
	int somar(int v1, int v2){
		return v1+v2;
		
	}

	
	int subtrair(int v1, int v2){
		return v1-v2;
		
	}

	
	public int multiplicar(int v1, int v2){
		return v1*v2;
		
	}

	
	public int dividir(int v1, int v2){
		return v1/v2;
	}

	
	public int exponencial(int v1, int v2){
		int valor = v1;
		
		for(int i=1;i<v2;i++){
			valor = multiplicar(valor,v1);
		}
		
		return valor;
	}


}
