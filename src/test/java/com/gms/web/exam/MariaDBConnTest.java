package com.gms.web.exam;

import static org.junit.Assert.*;

import org.junit.Test;

public class MariaDBConnTest {

	@Test
	public void test() {
		MariaDBConn m = new MariaDBConn();
		assertEquals("승태", m.exam());
	
	}

}
