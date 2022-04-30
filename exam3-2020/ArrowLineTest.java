class ArrowLineTest{
	public static void main(String[] args){
		ArrowLine aline1 = new ArrowLine('-', 3, true);
		aline1.draw();
		aline1.changeDirection();
		aline1.draw();
		ArrowLine aline2 = new ArrowLine('-', 1, false);
		aline2.draw();
		aline2.changeDirection();
		aline2.draw();
	}
}
