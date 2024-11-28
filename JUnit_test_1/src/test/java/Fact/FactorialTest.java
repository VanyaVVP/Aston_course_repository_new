package Fact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FactorialTest {
@DisplayName("Первй тест - позитивный")
@RepeatedTest(3)
	    void testFactorialPositiveSmallNumbers() {   // Проверка ожидаемого результата 
	        assertEquals(24, Factorial.factorial(4));
	        assertEquals(120, Factorial.factorial(5));
	        assertEquals(720, Factorial.factorial(6));
	    }

@DisplayName("Пропускаем позитивный тест")
@Disabled()
@Test
   void testFactorialPositiveSmallNumbersSkip() {   // Пропуск теста без причины
       assertEquals(24, Factorial.factorial(4));
   }

@DisplayName("Третий тест - нгативный (-1)")
	 @Test
	 void testFactorialNegativeNumber(){                   // Проверка негативного кейса (-1)
	        assertNotEquals(0, Factorial.factorial(-1)); 
	    }

@DisplayName("Четвёртый тест - негативный (переполнение long)")
	 @Test
	    void testFactorialOverflow() {  //Проверка негативного кейса на переполнение long переменной
	        assertThrows(ArithmeticException.class, () -> Factorial.factorial(21)); 
	    }

@DisplayName("Пятый тест - Позитивные тесты для факториала через параметр")
@ParameterizedTest
@CsvSource({
        "0, 1",
        "1, 1",
        "2, 2",
        "3, 6",
        "4, 24",
        "5, 120",
        "6, 720"
})
void testFactorialPositive(int n, long expected) {
    assertEquals(expected, Factorial.factorial(n));
}
	}
