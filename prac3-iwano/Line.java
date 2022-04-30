class Line {
	private char ch;	// 文字
	private int len;	// 長さ
	
	public Line(char ch, int len) {
		this.ch = ch;
		this.len = len;
	}
	char getCh() {
		return ch;
	}
	int getLen() {
		return len;
	}
	void draw() {
		for (int i=0; i<len; i++)
			System.out.print(ch);
		System.out.println();	// 改行
	}
}
