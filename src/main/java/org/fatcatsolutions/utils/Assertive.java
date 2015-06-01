/**
 *
 */
package org.fatcatsolutions.utils;

import static org.fatcatsolutions.utils.strings.StringUtils.isNotBlank;

/**
 * @author andi
 */
public final class Assertive {

	private Assertive() {
		// hide utility class
	}

	/**
	 * @param toTest
	 *            {@link CharSequence}
	 * @return boolean true if toTest contains only spaces or is null
	 */
	public static boolean isEmptyCharSequence(final CharSequence toTest) {
		return !isNonEmptyCharSequence(toTest);
	}

	/**
	 * @param toTest
	 *            {@link CharSequence}
	 * @return true if toTest contains only spaces and is not null
	 */
	public static boolean isEmptyNonNullCharSequence(final CharSequence toTest) {
		if (toTest == null) {
			return false;
		}
		return isNotBlank(toTest);
	}

	/**
	 * @param toCheck
	 *            long
	 * @return boolean true if number is negative, and not zero
	 */
	public static boolean isNegativeNonZeroNumber(final long toCheck) {
		return toCheck < 0;
	}

	/**
	 * @param toCheck
	 *            {@link Number}
	 * @return boolean true if number is non null, negative, and not zero
	 */
	public static boolean isNegativeNonZeroNumber(final Number toCheck) {
		if (toCheck == null) {
			return false;
		}
		return toCheck.doubleValue() < 0;
	}

	/**
	 * @param toTest
	 *            {@link CharSequence}
	 * @return true if toTest is not null and contains characters besides spaces
	 */
	public static boolean isNonEmptyCharSequence(final CharSequence toTest) {
		return isNotBlank(toTest);
	}

	/**
	 * @param object
	 *            toTest
	 * @return whether the toTest is null or not
	 */
	public static boolean isNotNull(final Object object) {
		return !isNull(object);
	}

	/**
	 * @param object
	 *            toTest
	 * @return whether the toTest object is null or not
	 */
	public static boolean isNull(final Object object) {
		if (object == null) {
			return true;
		}
		return false;
	}

	/**
	 * @param toCheck
	 *            long
	 * @return boolean true if Number is positive and not zero
	 */
	public static boolean isPositiveNonZeroNumber(final long toCheck) {
		return toCheck > 0;
	}

	/**
	 * @param toCheck
	 *            {@link Number}
	 * @return boolean true if Number is non null, positive and not zero
	 */
	public static boolean isPositiveNonZeroNumber(final Number toCheck) {
		if (toCheck == null) {
			return false;
		}
		return toCheck.doubleValue() > 0;
	}

}
