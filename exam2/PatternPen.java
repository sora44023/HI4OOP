class PatternPen extends Pen{
	private int blockLen;
	private char separator;

	PatternPen(char character, int blockLen, char separator){
		super(character);
		this.blockLen = blockLen;
		this.separator = separator;
	}

	@Override
	void draw(int len){
		for(int i=1; i<=len; i++){
			if( i%(blockLen+1) == 0 ){
				System.out.print(separator);
			}else{
				System.out.print(getCharacter());
			}
		}
		System.out.println();
	}

	@Override
	public String toString(){
		return "PatternPen:" + getCharacter() + "," + blockLen  + "," + separator;
	}
}
