public class Funcion1 {

	public static boolean funcion1(String cadena) {
		if(cadena != null) {
				if(cadena !="" || cadena !=" ") {
				int contador = 0;
					for(int x=0;x<cadena.length();x++) {
						 if ((cadena.charAt(x)=='a') || (cadena.charAt(x)=='e') || (cadena.charAt(x)=='i') || (cadena.charAt(x)=='o') || (cadena.charAt(x)=='u')||(cadena.charAt(x)=='A') || (cadena.charAt(x)=='E') || (cadena.charAt(x)=='I') || (cadena.charAt(x)=='O') || (cadena.charAt(x)=='U')){ 
						    contador++;
						  }
					}if(contador>18) {
						 return true;
					 }else{
						 return false;
					 }
				}
		}
		return false;
	}
}

public class Funcion2 {
	public static void main(String[] args) {
		System.out.println(funcion2("A", "AAAA"));
	}
	public static String funcion2(String cadena1, String cadena2) {
		if(cadena1 != null) {
			if(cadena2 != null) {
				if(cadena1 !="") {
					if(cadena2 !="") {
				int contador1 = 0;
				int contador2 = 0;
					for(int x=0;x<cadena1.length();x++) {
						 if ((cadena1.charAt(x)=='a') || (cadena1.charAt(x)=='e') || (cadena1.charAt(x)=='i') || (cadena1.charAt(x)=='o') || (cadena1.charAt(x)=='u')||(cadena1.charAt(x)=='A') || (cadena1.charAt(x)=='E') || (cadena1.charAt(x)=='I') || (cadena1.charAt(x)=='O') || (cadena1.charAt(x)=='U')){ 
						    contador1++;
						 }
					}
					for(int y=0;y<cadena2.length();y++) {
						 if ((cadena2.charAt(y)=='a') || (cadena2.charAt(y)=='e') || (cadena2.charAt(y)=='i') || (cadena2.charAt(y)=='o') || (cadena2.charAt(y)=='u')||(cadena2.charAt(y)=='A') || (cadena2.charAt(y)=='E') || (cadena2.charAt(y)=='I') || (cadena2.charAt(y)=='O') || (cadena2.charAt(y)=='U')){ 
							contador2++;
						 }
					}
				if(contador1>contador2) {
					return("La primera cadena tiene más vocales");
				}else if(contador1<contador2){
					return("La segunda cadena tiene más vocales");
				}if(contador1==contador2){
					return("Las dos cadenas tienen el mismo numero de vocales");
				}
				
				}
		 }

	}
		}
		return null;

		}
}

public class Funcion3 {

	public static int funcion3(int numero1, int numero2, int numero3, int numero4, int numero5 ){
		
		int resultado = 0;
		if(numero1<=18){
			if(numero1>=9) {
			resultado = numero1;
			}
		}if(numero2<=18) {
			if(numero2>=9) {
				resultado=resultado+numero2;
			}
		}if(numero3<=18) {
			if(numero3>=9) {
				resultado=resultado+numero3;
			}
		}if(numero4<=18) {
			if(numero4>=9) {
				resultado=resultado+numero4;
			}
		}if(numero5<=18) {
			if(numero5>=9) {
				resultado=resultado+numero5;
			}
		}
		return resultado;
	
	}
}
public class Funcion4 {
	public static void main(String[] args) {
		System.out.println(funcion4(10, 7, 5, 4, 8, 10));
	}
	public static int funcion4(int numero1, int numero2, int numero3, int numero4, int numero5, int numero6 ){
		
		int resultado = 0;
		resultado= numero1+numero2+numero3+numero4+numero5+numero6;
		resultado= resultado/6;
		if(resultado<5) {
			System.out.println("Nota media insuficiente");
		}if(resultado>5 && resultado<6) {
			System.out.println("Nota media suficiente");
		}if(resultado>=6 && resultado<7) {
			System.out.println("Nota media bien");
		}if(resultado>=7 && resultado<9){
			System.out.println("Nota media notable");
		}if(resultado>=9 && resultado<=10) {
			System.out.println("Nota media sobresaliente");
		}

		return resultado;
	
	}
}
public class Funcion5 {
	public static void main(String[] args) {
		System.out.println(funcion5(10, 20,"*" ));
	}
	public static int funcion5(int numero1, int numero2, String formula) {
		int resultado = 0;
		if(formula=="+") {
			resultado=numero1+numero2;
		}else if(formula=="-"){
			resultado=numero1-numero2;
		}else if(formula=="*") {
			resultado=numero1*numero2;
		}
		return resultado;
		
	}
}
