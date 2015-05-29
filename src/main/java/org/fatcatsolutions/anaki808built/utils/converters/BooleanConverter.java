/**
 * Jun 10, 2013
 */
package org.fatcatsolutions.anaki808built.utils.converters;

import org.fatcatsolutions.anaki808built.utils.Assertive;

/**
 * @author andi Jun 10, 2013 A null safe converter for booleans
 */
public final class BooleanConverter {

	private BooleanConverter() {
		// hide utility class
	}

	public static int convertBooleanToInt(final Boolean toConvert) {
		if (Assertive.isNull(toConvert)) {
			return 0;
		}
		if (toConvert.booleanValue()) {
			return 1;
		}
		return 0;
	}

	public static String convertBooleanToTF(final Boolean toConvert) {
		if (Assertive.isNull(toConvert)) {
			return "F";
		}
		if (toConvert.booleanValue()) {
			return "T";
		}
		return "F";
	}

	/**
	 * @param toConvert
	 *            boolean
	 * @return "true" if boolean is true otherwise false
	 */
	public static String convertBooleanToTrueFalse(final Boolean toConvert) {
		if (Assertive.isNull(toConvert)) {
			return "false";
		}
		if (toConvert.booleanValue()) {
			return "true";
		}
		return "false";
	}

	public static String convertBooleanToYesNo(final Boolean toConvert) {
		if (Assertive.isNull(toConvert)) {
			return "no";
		}
		if (toConvert.booleanValue()) {
			return "yes";
		}
		return "no";
	}

	/**
	 * @param toConvert
	 *            {@link Boolean}
	 * @return 'Y' for true 'N' for anything else
	 */
	public static String convertBooleanToYN(final Boolean toConvert) {
		if (Assertive.isNull(toConvert)) {
			return "N";
		}
		if (toConvert.booleanValue()) {
			return "Y";
		}
		return "N";
	}

	/**
	 * @param toConvert
	 *            {@link CharSequence}
	 * @return true for y, Y, t, T, true, TRUE, yes, YES, 1. false for all else
	 */
	public static boolean convertToBoolean(final CharSequence toConvert) {
		if (Assertive.isNull(toConvert)) {
			return false;
		}
		final String toConvertString = toConvert.toString();
		if ("Y".equalsIgnoreCase(toConvertString)) {
			return true;
		}
		if ("YES".equalsIgnoreCase(toConvertString)) {
			return true;
		}
		if ("T".equalsIgnoreCase(toConvertString)) {
			return true;
		}
		if ("TRUE".equalsIgnoreCase(toConvertString)) {
			return true;
		}
		if ("1".equals(toConvertString)) {
			return true;
		}
		return false;
	}

	/**
	 * @param toConvert
	 *            int
	 * @return true for 1 false for all else
	 */
	public static boolean convertToBoolean(final int toConvert) {
		return convertToBoolean(String.valueOf(toConvert));
	}
}
