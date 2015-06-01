package org.fatcatsolutions.utils.strings;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

@SuppressWarnings("static-method")
public final class StringUtilsTest {

	@Test(timeout = 100L)
	public void constants() {
		assertThat(StringUtils.EMPTY_STRING, equalTo(""));
		assertThat(StringUtils.EMPTY_CHARSEQUENCE.toString(), equalTo(""));
	}

	@Test(timeout = 100L)
	public void defaultToEmptyIfBlank() {
		final CharSequence toTest = "";
		assertThat(StringUtils.defaultToEmptyIfBlank(toTest), equalTo(""));
		assertThat(StringUtils.defaultToEmptyIfBlank("   "), equalTo(""));
		assertThat(StringUtils.defaultToEmptyIfBlank(null), equalTo(""));
		assertThat(StringUtils.defaultToEmptyIfBlank("some string"), equalTo("some string"));
	}

	@SuppressWarnings({ "boxing" })
	@Test(timeout = 100L)
	public void isBlank() {
		assertThat(StringUtils.isBlank(""), is(true));
		assertThat(StringUtils.isBlank("     "), is(true));
		assertThat(StringUtils.isBlank(null), is(true));
		assertThat(StringUtils.isBlank(new StringBuilder("this. is a string")), is(false));
		assertThat(StringUtils.isBlank("another string"), is(false));
	}

	@SuppressWarnings({ "boxing" })
	@Test(timeout = 100L)
	public void isNotBlank() {
		assertThat(StringUtils.isNotBlank(""), is(false));
		assertThat(StringUtils.isNotBlank("     "), is(false));
		assertThat(StringUtils.isNotBlank(null), is(false));
		assertThat(StringUtils.isNotBlank(new StringBuilder("this. is a string")), is(true));
		assertThat(StringUtils.isNotBlank("another string"), is(true));
	}

}
