class QuizSetTest {	
	public static void main(String[] args) {
		QuizSet qset = new QuizSet("fruit");
		qset.add(new Quiz(new Entry("apple",
				"fruit with red or yellow or green skin and sweet to tart crisp whitish flesh")));
		qset.add(new Quiz(new Entry("grape",
				"any of various juicy fruit of the genus Vitis with green or purple skins")));
		qset.add(new Quiz(new Entry("strawberry",
				"sweet fleshy red fruit ")));
		
		qset.shuffle();
		
		System.out.println("Quiz set: " + qset);
		System.out.println();
		for (int i = 0; i < qset.getSize(); i++)
			qset.getNextQuiz().show();
	}
}
