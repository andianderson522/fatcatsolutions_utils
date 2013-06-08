/**
 * 
 */
package com.appspot.anaki808built.utils;

/**
 * @author andi
 */
public final class Assertive {

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
