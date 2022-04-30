class ArgCalc {
	public static void main(String[] args){
		if(args.length < 3){
			System.out.println("引数が不足しています。");
			System.exit(0);
		}
		try{
			int opr1 = Integer.parseInt(args[0]);
			int opr2 = Integer.parseInt(args[2]);
			Calculator c = new Calculator(opr1, args[1], opr2);
			c.printCalculation();
		}catch(NumberFormatException e){
			System.out.println("整数に変換できませんでした。");
			System.exit(0);
		}
	}
}
