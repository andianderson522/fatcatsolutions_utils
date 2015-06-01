/**
 *
 */
package org.fatcatsolutions.anaki808built.utils;

import org.apache.commons.lang3.StringUtils;

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
		return org.fatcatsolutions.anaki808built.utils.strings.StringUtils.isNotBlank(toTest);
	}

	/**
	 * @param toTest
	 *            {@link CharSequence}
	 * @return true if toTest is not null and contains characters besides spaces
	 */
	public static boolean isNonEmptyCharSequence(final CharSequence toTest) {
		return StringUtils.isNotBlank(toTest);
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

}
