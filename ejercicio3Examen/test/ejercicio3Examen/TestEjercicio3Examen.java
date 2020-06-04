package ejercicio3Examen;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestEjercicio3Examen {

	@CsvSource({
		"1, Lunes",
		"2, Martes",
		"3, Miercoles",
		"4, Jueves",
		"5, Viernes",
		"6, Sabado",
		"7, Domingo",
		"0, ERROR!",
		"8, ERROR!"
	})

	@ParameterizedTest(name = "{index} => El dia ({0}) es ({1})")
	void test_DiaSemana(int dia, String result) {
		// Arrange
		ejercicio3 e3 = new ejercicio3();
		// Act
		// Assert
		assertEquals(result, e3.diaSemana(dia));
	}


}
