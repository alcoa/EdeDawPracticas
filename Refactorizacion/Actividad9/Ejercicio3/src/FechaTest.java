import junit.framework.TestCase;
import org.junit.Test;


public class FechaTest extends TestCase {
	/* Escribe las pruebas para comprobar:
	* - Para una fecha correcta
	* - Pon dos meses que est�n mal
	* - Pon dos d�as que est�n mal
	* - Que el m�s de noviembre tiene d�a 31
	* - Que el m�s de diciembre tiene d�a 31
	* - Que el mes de febrero tiene d�a 30
	* - Que el 29 de febrero existe para 2008 (que es bisiesto)
	* - Que el 29 de febrero no existe para un a�o que no sea
	bisiesto
	* - Comprobar que el a�o 1900 es bisiesto
	*/
	
	private Fecha fechaCorrecta = new Fecha(17,5,2017);
	private Fecha mesIncorrecto1 = new Fecha(17,5,2017);
	private Fecha mesIncorrecto2 = new Fecha(17,5,2017);
	
	
	
	
	@Test
	public void testValida() {
	/* Para cada una de las fechas creadas anteriormente, hacer
	las comprobaciones
	* utilizando el m�todo m�s adecuado para el caso
	*/
		assertTrue(fechaCorrecta.valida());
		
	}
}
