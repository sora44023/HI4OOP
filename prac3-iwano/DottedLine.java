class DottedLine extends Line {
	private int interval;

	DottedLine(char ch, int len, int interval) {
		super(ch, len);
		this.interval = interval;
	}

	@Override
	void draw(){
		for(int i=0; i<getLen(); i++){
			if((i+1)%interval==0){
				System.out.print(".");
			}else{
				System.out.print(getCh());
			}
		}
		System.out.println();
	}

}
