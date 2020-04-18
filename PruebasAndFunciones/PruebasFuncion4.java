import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebasFuncion4 extends Pruebas {
	static Funcion4 funcion = null;
	static int pruebasRealizadas = 0;
	@BeforeAll
	static void prepararPruebas() {
	    System.out.println("Preparando Tests");
	    funcion = new Funcion4();
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
	@DisplayName("Primera prueba caja negra, particiones equivalentes, entrada Valida")
	@Test
	void test1() {
		assertEquals(3, funcion.funcion4(4, 4, 4, 4, 7, 0));
		
		//Da un resultado insuficiente
	}
	@DisplayName("Segunda prueba caja negra, particiones equivalentes, entrada invalida")
	@Test
	void test2() {
		assertNotEquals(4, funcion.funcion4(4, 4, 4, 4, 7, 0));
		
		// Da un resultado insuficiente, pero no el que se espera, para cumplir la condicion del notequals
	}
	@DisplayName("Tercera prueba caja negra, valores limite inferior, con nota notable")
	@Test
	void test3() {
		assertEquals(7, funcion.funcion4(7, 7, 7, 7, 7, 7));
		
		//Usamos el valor 7 que es el limite inferior de la nota notable
	}
	@DisplayName("Cuarta prueba caja negra, valores limite inferior -1, con nota notable")
	@Test
	void test4() {
		assertEquals(6, funcion.funcion4(6, 6, 6, 6, 6, 6));
		
		// Ahora la hacemos con el limite inferior menos uno, la cual seria 6 que es un bien y no un notable
	}
	@DisplayName("Primera prueba caja blanca de decisiones, con notable")
	@Test
	void test5() {
		assertEquals(5, funcion.funcion4(9, 8, 5, 2, 1, 6));
		//Da de resultado 5 por lo tanto es falso ya que buscamos un notable
	}
	@DisplayName("Segunda prueba caja blanca de decisiones, con notable")
	@Test
	void test6() {
		assertEquals(6, funcion.funcion4(8, 7, 8, 7, 8, 0));
		
		// Da de resultado 7 por lo tanto es verdadero ya que buscamos un notable
	}
	@DisplayName("Tercera prueba caja blanca de cobertura de camino")
	@Test
	void test7() {
		assertEquals(0, funcion.funcion4(0, 0, 0, 0, 0, 0));
		
		// Vemos si el bucle se realiza una vez o mas veces
	}
	@DisplayName("Cuarta prueba caja blanca de cobertura de camino")
	@Test
	void test8() {
		assertEquals(7, funcion.funcion4(7, 7, 7, 7, 7, 7));
		
		// Comprobamos que la nota media es 7  
	}
	

}
