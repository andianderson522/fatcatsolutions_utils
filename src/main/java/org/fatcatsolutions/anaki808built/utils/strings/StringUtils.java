package org.fatcatsolutions.anaki808built.utils.strings;

public final class StringUtils {

	public static final String EMPTY_STRING = "";
	public static final CharSequence EMPTY_CHARSEQUENCE = EMPTY_STRING;

	private StringUtils() {
		// hide utility class
	}

	/**
	 * @param toTest
	 *            {@link CharSequence} to default if is blank
	 * @return {@link StringUtils#EMPTY_STRING} if CharSequence is null, blank or only contains spaces
	 */
	public static String defaultToEmptyIfBlank(final CharSequence toTest) {
		if (isBlank(toTest)) {
			return EMPTY_STRING;
		}
		return toTest.toString();
	}

	/**
	 * @param toCheck
	 *            {@link CharSequence} to check
	 * @return boolean whether or not the given CharSequence is null, blank or only contains spaces
	 */
	public static boolean isBlank(final CharSequence toCheck) {
		return org.apache.commons.lang3.StringUtils.isBlank(toCheck);
	}

}
