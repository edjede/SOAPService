package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestError {
public com.w3schools.www.EdwindeRoos.Error error;
public String input;
public String ErrorMessage;

	public TestError(){
		input = "Weight = -80,  length = 1.80 ";
		ErrorMessage = "Inputvalues should be positive";
		error = new com.w3schools.www.EdwindeRoos.Error(input,ErrorMessage);
		
	}

	@Test
	public void testGetInput() {
		assertEquals(input,error.getInput());
		
		
		}
	
	@Test
	public void testSetInput() {
		String newInput = "test";
		error.setInput(newInput);
		assertEquals(newInput,error.getInput());
				
		}
	@Test
	public void testGetErrorMessage() {
		assertEquals(ErrorMessage,error.getErrorMessage());
			
		}
	
	@Test
	public void testSetErrorMessage() {
		String newErrorMessage = "dit is fout";
		error.setErrorMessage(newErrorMessage);
		assertEquals(newErrorMessage,error.getErrorMessage());
		
		
		}

}
