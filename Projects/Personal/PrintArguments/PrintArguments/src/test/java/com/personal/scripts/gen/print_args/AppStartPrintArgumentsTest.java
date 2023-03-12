package com.personal.scripts.gen.print_args;

import org.junit.jupiter.api.Test;

class AppStartPrintArgumentsTest {

	@Test
	void testMain() {

		final String[] args = { "arg1", "arg2", "arg3" };
		AppStartPrintArguments.main(args);
	}
}
