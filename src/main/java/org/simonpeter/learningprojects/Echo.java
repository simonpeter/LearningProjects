package org.simonpeter.learningprojects;

public class Echo {

	public static void main(String[] args) {
		boolean minusNFlag = false;
		int argCount = args.length;
		int firstArg = 0;

		if (argCount == 0) {
			System.out.println("");
		} else {
			if ("-n".equals(args[0])) {
				minusNFlag = true;
				firstArg = 1;
			}
			for (int i = firstArg; i < argCount; i++) {
				if (i > firstArg) {
					System.out.print(" ");
				}
				System.out.print(args[i]);
			}
			if (!minusNFlag) {
				System.out.println("");
			}
		}
	}

}
