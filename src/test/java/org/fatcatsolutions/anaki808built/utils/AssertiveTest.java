/**
 *
 */
package org.fatcatsolutions.anaki808built.utils;

import static org.junit.Assert.*;

import org.fatcatsolutions.anaki808built.utils.Assertive;
import org.junit.Test;

/**
 * @author andi
 */
@SuppressWarnings("static-method")
public final class AssertiveTest {

	@Test(timeout = 200L)
	public void isEmptyCharSequence() {
		final CharSequence toTest = "ABce";
		assertFalse(Assertive.isEmptyCharSequence(toTest));
		assertTrue(Assertive.isEmptyCharSequence(null));
		assertTrue(Assertive.isEmptyCharSequence("   "));
	}

	@Test(timeout = 100L)
	public void isEmptyNonNullCharSequence() {
		final CharSequence toTest = "ABce";
		assertTrue(Assertive.isEmptyNonNullCharSequence(toTest));
		assertFalse(Assertive.isEmptyNonNullCharSequence(null));
		assertFalse(Assertive.isEmptyNonNullCharSequence("   "));
	}

	@Test(timeout = 100L)
	public void isNonEmptyCharSequence() {
		final CharSequence toTest = "ABce";
		assertTrue(Assertive.isNonEmptyCharSequence(toTest));
		assertFalse(Assertive.isNonEmptyCharSequence(null));
		assertFalse(Assertive.isNonEmptyCharSequence("   "));
	}

	@Test
	public void isNull() {
		final Object object = new Object();
		assertFalse(Assertive.isNull(object));
		assertTrue(Assertive.isNull(null));
		assertTrue(Assertive.isNotNull(object));
		assertFalse(Assertive.isNotNull(null));
	}

}
