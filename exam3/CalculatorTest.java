class CalculatorTest {
	public static void main(String[] args) {
		Calculator c1 = new Calculator(12, "/", 4);
		System.out.println(c1);
		c1.printCalculation();
		System.out.println();
		
		Calculator c2 = new Calculator(2, "/", 0);
		System.out.println(c2);
		c2.printCalculation();
		System.out.println();
		
		Calculator c3 = new Calculator(32, "%", 5);
		System.out.println(c3);
		c3.printCalculation();
		System.out.println();

		Calculator c4 = new Calculator(7, "%", 0);
		System.out.println(c4);
		c4.printCalculation();
	}
}
