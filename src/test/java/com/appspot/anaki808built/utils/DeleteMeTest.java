/**
 *
 */
package com.appspot.anaki808built.utils;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

/**
 * @author andi
 *
 */
public class DeleteMeTest {

	private DeleteMe dm;

	@Before
	public void setUp() {
		this.dm = new DeleteMe();
	}

	@Test
	public void constructor() {
		assertNotNull(this.dm);
	}

}
