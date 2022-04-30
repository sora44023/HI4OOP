class Entry {
	private String word;     // 英単語
	private String meaning;	 // 意味
	
	Entry(String word, String meaning) {
		this.word = word;
		this.meaning = meaning;
	}
	String getWord() {
		return word;
	}
	String getMeaning() {
		return meaning;
	}
	@Override
	public String toString() {
		return word + ": " + meaning;
	}
}
