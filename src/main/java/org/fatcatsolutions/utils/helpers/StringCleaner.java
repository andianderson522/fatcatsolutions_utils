package org.fatcatsolutions.utils.helpers;

import java.text.Normalizer;
import java.text.Normalizer.Form;

import org.apache.commons.lang3.StringEscapeUtils;
import org.fatcatsolutions.utils.Assertive;

/**
 * @author andi Jul 22, 2013 Some general helper methods for cleaning up Strings
 */
public final class StringCleaner {

	private StringCleaner() {
		// hide utility class
	}

	/**
	 * @param toPretty
	 *            {@link CharSequence}
	 * @return String toPretty cleaned up for use in a URL ie chars converted to
	 *         ascii spaces and punctuation replaced with '-'
	 */
	public static String makePrettyURL(final CharSequence toPretty) {
		if (Assertive.isEmptyCharSequence(toPretty)) {
			return "";
		}
		return Normalizer.normalize(unescapeHTMLEncoding(toPretty).toString().toLowerCase(), Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "").replaceAll("[^\\p{Alnum}]+", "-");
	}

	/**
	 * @param toUnescape
	 *            {@link CharSequence}
	 * @return HTML escaped entities to thier actual character representations
	 */
	public static CharSequence unescapeHTMLEncoding(final CharSequence toUnescape) {
		if (Assertive.isEmptyCharSequence(toUnescape)) {
			return "";
		}
		return StringEscapeUtils.unescapeHtml4(toUnescape.toString());
	}
}
