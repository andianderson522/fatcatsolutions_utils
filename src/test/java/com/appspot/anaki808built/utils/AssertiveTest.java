/**
 * 
 */
package com.appspot.anaki808built.utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author andi
 */
public final class AssertiveTest {

	/**
	 */
	@Test
	public void isNull() {
		final Object object = new Object();
		assertFalse(Assertive.isNull(object));
		assertTrue(Assertive.isNull(null));
		assertTrue(Assertive.isNotNull(object));
		assertFalse(Assertive.isNotNull(null));
	}

}
