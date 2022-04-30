class Pen{
	private char character;

	Pen(char character){
		this.character = character;
	}

	// (1)
	Pen(){
		character = '#';
	}

	// (2)
	void setCharacter(char c){
		character = c;
	}


	// (3)
	void draw(int len){
		for(int i=0; i<len; i++){
			System.out.print(character);
		}
		System.out.println();
	}

	// (4)
	void draw(){
		System.out.println(character);
	}

	char getCharacter(){
		return character;
	}

	// (5)
	@Override
	public String toString(){
		return "Pen:" + character ;
	}
}
