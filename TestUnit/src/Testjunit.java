import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Testjunit 
{
	String message = "Hello World";
	Message mess = new Message(message);
	
	@Test
	public void testPrintMessage()
	{
		assertEquals(message, mess.printMessage());
	}
}
