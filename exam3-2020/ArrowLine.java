class ArrowLine extends Line{
	private boolean leftward;

	ArrowLine(char ch, int len, boolean leftward){
		super(ch, len);
		this.leftward = leftward;
	}

	void changeDirection(){
		leftward = !leftward;
	}
	@Override
	void draw(){
		if(leftward)
			System.out.print('<');
		for(int i=0; i<getLen()-1; i++)
			System.out.print(getCh());
		if(!leftward)
			System.out.print('>');
		System.out.println();
	}
}
