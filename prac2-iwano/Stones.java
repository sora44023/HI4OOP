class Stones{
	private int count;

	final static char STONE_CHAR = '@'; // 石を表す文字

	Stones(){
		count = 5;
	}

	Stones(int c){
		count = c;
	}

	void add(){
		count++;
	}

	void show(){
		System.out.print("Stones: ");
		for (int i=0; i<count; i++){
			System.out.print(STONE_CHAR);
		}
		System.out.println();
	}

	boolean take(int t){
		if(t>count){
			return false;
		}else{
			count-=t;
			return true;
		}
	}

	@Override
	public String toString(){
		return "count: "+count;
	}
}
