import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebasFuncion3  {
	static Funcion3 funcion = null;
	static int pruebasRealizadas = 0;
	@BeforeAll
	static void prepararPruebas() {
	    System.out.println("Preparando Tests");
	    funcion = new Funcion3();
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
	@DisplayName("Priemra prueba caja negra, con valores limite inferior")
	@Test
	void test1() {
        assertEquals(55, funcion.funcion3(9, 10, 11, 12, 13)); 
        // Probamos el limite inferior que es 9 que entraria en la suma y he puesto numero que siguen a 9 para que se sumen
	}

	@Test
	@DisplayName("Segunda prueba caja negra, con valores limite inferior -1")
	void test2() {
        assertEquals(9, funcion.funcion3(9, 8, 7, 6, 5));
        // Probamos los numeros de abajo del limite inferior que es 9, de tal modo que el resultado de la suma sera 9
	}

	@Test
	@DisplayName("Tercera prueba caja negra, con valores limite superior")
	void test3() {
        assertEquals(80, funcion.funcion3(18, 17, 16, 15, 14));
        
        // Probamos el numero superior que es 18 y sumamos numeros dentro del rango 
	}

	@Test
	@DisplayName("Cuarta prueba caja negra, con valores limite superior +1")
	void test4() {
        assertEquals(18, funcion.funcion3(18, 19, 20, 21, 22));
     // Probamos el numero superior que es 18 y sumamos numeros por encima de 18 para ver que el resultado es 18
	}

	@Test
	@DisplayName("Primera prueba caja blanca, cobertura de sentencia")
	void test5() {
        assertEquals(75, funcion.funcion3(16, 17, 15, 13, 14));
        // Vemos que los numeros 16, 17, 15, 13 y 14 estan dentro del rango por lo tanto todos se utilizaran en la suma
	}

	@Test
	@DisplayName("Segunda prueba caja blanca, cobertura de condiciones")
	void test6() {
        assertEquals(0, funcion.funcion3(4, 6, 22, 2, 32));
        
        //Queremos hacer una decision en la que ningun valor entre dentro del rango
	}

	@Test
	@DisplayName("Tercera prueba, cobertura de condiciones")
	void test7() {
        assertEquals(16, funcion.funcion3(3, 16, 32, 90, 100));
        
        //Hacemos una condicion en la que  no entran en el rango 3, pero si entra el numero 16.
	}

	@Test
	@DisplayName("Cuarta prueba, cobertura de condiciones")
	void test8() {
        assertEquals(0, funcion.funcion3(0, 0, 0, 0, 0));
        //Hacemos una condicion en la que los numeros colocados le pongamos 0
	}

}
