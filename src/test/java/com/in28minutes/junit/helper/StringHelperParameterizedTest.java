package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//1st  step
@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

	StringHelper helper = new StringHelper();
	
	//3rd step
	private String input;
	private String expectedOutput;
	
	//4th step
	public StringHelperParameterizedTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	// 2nd step
	@Parameters
	public static Collection<String[]> testCondition() {
		String[][] expectedOutputs={{"AACD","CD"},{"ACD","CD"}};
		return Arrays.asList(expectedOutputs);
	}
	
	@Test
	public void testTruncate_In_First_Two_Position() {

		String actual = helper.truncateAInFirst2Positions(input);
		
		// AACD => CD ACD =>CD CDEF =>CDEF CDAA=>CDAA
		assertEquals(expectedOutput, actual);

	}

	@Test
	public void testTruncate_In_First_Position() {

		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
	}

	
	

}
