package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {

	StringHelper helper;

	@Before
	public void setup() {
		helper = new StringHelper();
	}

	@Test
	public void testTruncate_In_First_Two_Position() {

		String actual = helper.truncateAInFirst2Positions("AACD");
		String expected = "CD";
		// AACD => CD ACD =>CD CDEF =>CDEF CDAA=>CDAA
		assertEquals(expected, actual);

	}

	@Test
	public void testTruncate_In_First_Position() {

		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}

	// ABCD =>FALSE ABAB=> TRUE AB=> TRUE A=> FALSE
	@Test
	public void testareFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {

		// assertEquals(false, helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}

	@Test
	public void testareFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {

		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}

}
