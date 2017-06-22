package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import com.w3schools.www.EdwindeRoos.BMIvalues;

public class TestBMIvalues {
	private BMIvalues bmi;
	private float length;
	private float weight;
	
	public TestBMIvalues(){
		length = 1.80f;
		weight = 80f;
		bmi = new BMIvalues(length,weight);
	}
	
	@Test
	public void testGetLength() {
		assertEquals(length,bmi.getLength(),0.01);
		
		
		}

	@Test
	public void testSetLength() {
		float newLength = 1.80f;
		bmi.setLength(newLength);
		assertEquals(newLength,bmi.getLength(),0.01);
				
		}
	@Test
	public void testGetWeight() {
		assertEquals(weight,bmi.getWeight(),0.01);
			
		}

	@Test
	public void testSetWeight() {
		float newWeight = 80f;
		bmi.setWeight(newWeight);
		assertEquals(newWeight,bmi.getWeight(),0.01);
		
		
		}
	
	

}
