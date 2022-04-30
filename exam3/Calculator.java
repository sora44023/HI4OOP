class Calculator {
	private int opr1;
	private int opr2;
	private String opcode;

	// Add your code
	Calculator(int opr1, String opcode, int opr2){
		this.opr1 = opr1;
		this.opr2 = opr2;
		this.opcode = opcode;
	}
	void printCalculation(){
		try{
			if(opcode.equals("/"))
				System.out.println(opr1/opr2);
			if(opcode.equals("%"))
				System.out.println(opr1%opr2);
		}catch (ArithmeticException e){
			System.out.println("算術計算で問題が発生しました。");
		}
	}

	@Override
	public String toString(){
		return opr1 + opcode + opr2;
	}
}
