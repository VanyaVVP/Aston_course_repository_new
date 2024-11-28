package Aston_Unit.Lesson_14_testng;

import org.testng.Assert;import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class FactorialTest {
    @Test(description = "Первый тест - позитивный", invocationCount = 3)    
    public void testFactorialPositiveSmallNumbers() {
        Assert.assertEquals(24, Factorial.factorial(4));        
        Assert.assertEquals(120, Factorial.factorial(5));
        Assert.assertEquals(720, Factorial.factorial(6));    }
    @Test(description = "Пропускаем позитивный тест", enabled = false)
    public void testFactorialPositiveSmallNumbersSkip() {        
    	Assert.assertEquals(24, Factorial.factorial(4));
    }
    @Test(description = "Третий тест - негативный (-1)")    
    public void testFactorialNegativeNumber() {
        Assert.assertNotEquals(0, Factorial.factorial(-1));    }
    @Test(description = "Четвертый тест - негативный (переполнение long)")
    public void testFactorialOverflow() {        
    	Assert.expectThrows(ArithmeticException.class, () -> Factorial.factorial(21));
    }
    @Test(description = "Пятый тест - Позитивные тесты для факториала через параметр", dataProvider = "factorialData")   
    public void testFactorialPositive(int n, long expected) {
        Assert.assertEquals(expected, Factorial.factorial(n));    }
    @DataProvider(name = "factorialData")
    public Object[][] factorialDataProvider() {        
    	return new Object[][] {
        {0, 1},
        {1, 1}, 
         {2, 2},
         {3, 6},
         {4, 24},
         {5, 120},
         {6, 720}
        };   
    }
}
