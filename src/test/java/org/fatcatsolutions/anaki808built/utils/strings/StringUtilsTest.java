package org.fatcatsolutions.anaki808built.utils.strings;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.fatcatsolutions.anaki808built.utils.strings.StringUtils;
import org.junit.Test;

public final class StringUtilsTest {

	@SuppressWarnings("static-method")
	@Test(timeout = 100L)
	public void constants() {
		assertThat(StringUtils.EMPTY_STRING, equalTo(""));
		assertThat(StringUtils.EMPTY_CHARSEQUENCE.toString(), equalTo(""));
	}

	@SuppressWarnings("static-method")
	@Test(timeout = 100L)
	public void defaultToEmptyIfBlank() {
		final CharSequence toTest = "";
		assertThat(StringUtils.defaultToEmptyIfBlank(toTest), equalTo(""));
		assertThat(StringUtils.defaultToEmptyIfBlank("   "), equalTo(""));
		assertThat(StringUtils.defaultToEmptyIfBlank(null), equalTo(""));
		assertThat(StringUtils.defaultToEmptyIfBlank("some string"), equalTo("some string"));
	}

	@SuppressWarnings({ "boxing", "static-method" })
	@Test(timeout = 100L)
	public void isBlank() {
		assertThat(StringUtils.isBlank(""), is(true));
		assertThat(StringUtils.isBlank("     "), is(true));
		assertThat(StringUtils.isBlank(null), is(true));
		assertThat(StringUtils.isBlank(new StringBuilder("this. is a string")), is(false));
		assertThat(StringUtils.isBlank("another string"), is(false));
	}

}
