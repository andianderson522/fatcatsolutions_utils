/**
 * 
 */
package com.appspot.anaki808built.utils.converters;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Test;

/**
 * @author andi
 */
public final class BooleanConverterTest {

	private static final Random R = new Random();

	/**
	 * 
	 */
	@Test(timeout = 100L)
	public void convertToBooleanToBoolean() {
		final boolean result = BooleanConverter.convertToBoolean("y");
		assertTrue(result);
		assertFalse(BooleanConverter.convertToBoolean(null));
		assertFalse(BooleanConverter.convertToBoolean("n"));
		assertTrue(BooleanConverter.convertToBoolean("yEs"));
		assertFalse(BooleanConverter.convertToBoolean("no"));
		assertTrue(BooleanConverter.convertToBoolean("t"));
		assertFalse(BooleanConverter.convertToBoolean("F"));
		assertTrue(BooleanConverter.convertToBoolean("tRuE"));
		assertFalse(BooleanConverter.convertToBoolean("FaLsE"));
		assertTrue(BooleanConverter.convertToBoolean("1"));
		assertTrue(BooleanConverter.convertToBoolean(1));
		final int toConvert = R.nextInt();
		if (toConvert == 1) {
			assertTrue(BooleanConverter.convertToBoolean(toConvert));
		} else {
			assertFalse(BooleanConverter.convertToBoolean(toConvert));
		}
	}
}
