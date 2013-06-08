/**
 * 
 */
package com.appspot.anaki808built.utils;

/**
 * @author andi
 * 
 */
public final class Assertive {

	public static boolean isNotNull(final Object object) {
		return !isNull(object);
	}

	public static boolean isNull(final Object object) {
		if (object == null) {
			return true;
		}
		return false;
	}

}
