class LineTest{
	public static void main(String[] args){
		DottedLine dline1 = new DottedLine('#', 7, 3);
		dline1.draw();
		DottedLine dline2 = new DottedLine('-', 10, 2);
		dline2.draw();
		DottedLine dline3 = new DottedLine('~', 3, 5);
		dline3.draw();
	}
}
