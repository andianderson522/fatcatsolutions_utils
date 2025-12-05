package org.fatcatsolutions.utils;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

/**
 * @author andi
 */
@SuppressWarnings({ "static-method", "boxing" })
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
  public void isNegativeNonZeroNumber() {
    final Number number = Long.valueOf(-1L);
    assertThat(Assertive.isNegativeNonZeroNumber(number), is(true));
    assertThat(Assertive.isNegativeNonZeroNumber(Long.valueOf(0L)), is(false));
    assertThat(Assertive.isNegativeNonZeroNumber(Double.valueOf(1d)), is(false));
    assertThat(Assertive.isNegativeNonZeroNumber(BigDecimal.valueOf(-1000L)), is(true));
  }

  @Test(timeout = 100L)
  public void isNegativeNonZeroNumberPrimitive() {
    final long number = -1L;
    assertThat(Assertive.isNegativeNonZeroNumber(number), is(true));
    assertThat(Assertive.isNegativeNonZeroNumber(0L), is(false));
    assertThat(Assertive.isNegativeNonZeroNumber(1L), is(false));
    assertThat(Assertive.isNegativeNonZeroNumber(BigDecimal.valueOf(-1000L).intValue()), is(true));
  }

  @Test(timeout = 100L)
  public void isNonEmptyCharSequence() {
    final CharSequence toTest = "ABce";
    assertTrue(Assertive.isNonEmptyCharSequence(toTest));
    assertFalse(Assertive.isNonEmptyCharSequence(null));
    assertFalse(Assertive.isNonEmptyCharSequence("   "));
  }

  @Test(timeout = 100L)
  public void isNull() {
    final Object object = new Object();
    assertFalse(Assertive.isNull(object));
    assertTrue(Assertive.isNull(null));
    assertTrue(Assertive.isNotNull(object));
    assertFalse(Assertive.isNotNull(null));
  }

  @Test(timeout = 100L)
  public void isPositiveNonZeroNumber() {
    final Number number = Long.valueOf(1L);
    assertThat(Assertive.isPositiveNonZeroNumber(number), is(true));
    assertThat(Assertive.isPositiveNonZeroNumber(Long.valueOf(0L)), is(false));
    assertThat(Assertive.isPositiveNonZeroNumber(Double.valueOf(-1d)), is(false));
    assertThat(Assertive.isPositiveNonZeroNumber(BigDecimal.valueOf(1000L)), is(true));
  }

  @Test(timeout = 100L)
  public void isPositiveNonZeroNumberPrimitive() {
    final long number = 1L;
    assertThat(Assertive.isPositiveNonZeroNumber(number), is(true));
    assertThat(Assertive.isPositiveNonZeroNumber(0L), is(false));
    assertThat(Assertive.isPositiveNonZeroNumber(-1L), is(false));
    assertThat(Assertive.isPositiveNonZeroNumber(BigDecimal.valueOf(1000L).intValue()), is(true));
  }

}
