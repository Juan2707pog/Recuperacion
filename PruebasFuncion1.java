import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



class PruebasFuncion1 {
    static Funcion1 funcion = null;
    static int pruebasRealizadas = 0;
    @BeforeAll
    static void prepararPruebas() {
        System.out.println("Preparando Tests");
        funcion = new Funcion1();
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
	@DisplayName("Primera prueba de caja blanca, de decision")
	void test1() {
		/*Se cumple la condicion de que el numero de vocales sea menor de 18, o sea que sea falso el resultado*/
		

			boolean resultadoEsperado = false;
			boolean resultadoObtenido = funcion.funcion1("aaa");
			assertEquals(resultadoEsperado, resultadoObtenido);
			
		}
	@Test
	@DisplayName("Segunda prueba de caja blanca, de decision")
	void test2() {
		/*No se cumple la condicion de que el numero de vocales sea menor de 18, o sea que sea verdadero el resultado*/

			boolean resultadoEsperado = true;
			boolean resultadoObtenido = funcion.funcion1("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
			assertEquals(resultadoEsperado, resultadoObtenido);
		}
	
	@Test
	@DisplayName("Tercera prueba de caja blanca, de condicion")
	void test3() {
	assertEquals(true, funcion.funcion1("Illoooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooos"));
	//Decimos que es true si tiene menos vocales que mi edad
	}
	@Test
	@DisplayName("Cuarta prueba de caja blanca, de condicion")
	void test4() {
	assertEquals(false, funcion.funcion1("Illos"));
	//Decimos que es false si tiene menos vocales que mi edad
	}

	@Test
	@DisplayName("Primera prueba de caja negra, con valores limites minimo")
	void test5(){
		assertEquals(true, funcion.funcion1("jejejejejejejejejejejejejejejejejejejeje")); /* Hay más de 18  "a" por lo tanto entraria
		 dentro del true porque ha llegado al limite de la edad que es 18.*/
	}
	
	@Test
	@DisplayName("Caja NEGRA con valores limites minim -1")
	void test6(){
		assertEquals(true, funcion.funcion1("jajajajajajajajajajajajajajajajajajajajajajaja")); // Hay 23 "a" por lo tanto NO entraria
		// dentro del true porque ha BAJADO el limite de la edad que es 24.	
	}

	
	@Test
	@DisplayName("Tercera prueba de caja negra, con valor null")
	void test7() {
		assertEquals(false, funcion.funcion1("032813289352883052830283726"));
		// Doy un valor nulo puesto que debería ser de tipo string, y da false como pongo en la funcion
	}
	@Test
	@DisplayName("Cuarta prueba de caja negra, con valores equivalentes")
	void test8() {
		assertEquals(true, funcion.funcion1("Peeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeerry")); //debería dar un resultado positivo, dado que he colocad mas vocales que mi edad
	}
}
