import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest 
{
	@Test
	public void evaluatesExpression()
	{
		Calculator calculator = new Calculator();
		int sum = calculator.evaluate("1");
		int asd = 6;
		assertEquals(asd, sum);
	}
}
