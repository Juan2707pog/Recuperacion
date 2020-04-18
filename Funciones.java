
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
