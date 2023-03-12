package com.personal.scripts.gen.print_args;

final class AppStartPrintArguments {

	private AppStartPrintArguments() {
	}

	public static void main(
			final String[] args) {

		System.out.println("arguments: " + String.join(", ", args));
	}
}
