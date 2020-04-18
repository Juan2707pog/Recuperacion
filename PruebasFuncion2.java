import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebasFuncion2  {	   
	static Funcion2 funcion = null;
	static int pruebasRealizadas = 0;
	@BeforeAll
	static void prepararPruebas() {
	    System.out.println("Preparando Tests");
	    funcion = new Funcion2();
	}
	@BeforeEach
	private void preparaPruebaEjecutar() {
	    pruebasRealizadas++;
	    System.out.println("Ejecutando test " + pruebasRealizadas);
	}
	@AfterEach
	private void terminadaPrueba() {
	    System.out.println("Se ha ejecutado el test: " + pruebasRealizadas);
	}
	@AfterAll
	static void terminarPruebas() {
	    System.out.println("Se ha terminado de ejecutar todas las pruebas");
	    funcion = null;
	}
	@Test
	@DisplayName("Primera prueba de caja negra con valores equivalentes, dando a ninguna como cadena mas larga")
	void test1(){
		assertEquals("Las dos cadenas tienen el mismo numero de vocales", funcion.funcion2("Draven", "Draven")); 
		// En el caso de tener el mismo numero de vocales nos lo dira el programa
	}

	@Test
	@DisplayName("Segunda prueba de caja negra, con resultados equivalentes, dando como mas larga la primera cadena")
	void test2() {
		assertEquals("La primera cadena tiene más vocales", funcion.funcion2("Limon", "E")); //
		//Buscamos que el resultado de como mas larga la primera
	}
	
	@Test
	@DisplayName("Tercera prueba de caja negra, con resultados equivalentes, dando como mas larga la segunda cadena")
	void test3() {
		assertEquals("La segunda cadena tiene más vocales", funcion.funcion2("Limon", "Antonio")); //
		//Buscamos que el resultado de como mas larga la segunda
	}
	
	@Test
	@DisplayName("Cuarta prueba de caja negra, con valores vacios")
	void test4() {
		assertEquals(null, funcion.funcion2("", "")); //
		//Prueba de caja negra con espacios que nos saldria null.
	}
	
	@Test
	@DisplayName("Primera prueba de caja blanca, de cobertura de caminos")
	void test5() {
		assertEquals("Las dos cadenas tienen el mismo numero de vocales", funcion.funcion2("Hey", "Hey")); //
		//Las dos cadenas al ser iguales tienen el mismo numero de vocales
	}
	
	@Test
	@DisplayName("Segunda prueba de caja blanca, de cobertura de caminos")
	void test6() {
		assertEquals("La primera cadena tiene más vocales", funcion.funcion2("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE", "EEEE")); //
		//La primera cadena tiene mas vocales que la segunda
	}
	@Test
	@DisplayName("Tercera prueba de caja blanca, de cobertura de caminos")
	void test7() {
		assertEquals("La segunda cadena tiene más vocales", funcion.funcion2("AAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA")); //
		//La segunda cadena tiene mas vocales que la primera
	}
	
	@Test
	@DisplayName("Cuarta prueba de caja blanca, de cobertura de decisiones ")
	void test8() {
		assertEquals("La segunda cadena tiene más vocales", funcion.funcion2("Betis", "España"));
		// Buscamos la decision de que la segunda cadena tiene mas vocales
		
	}
}
