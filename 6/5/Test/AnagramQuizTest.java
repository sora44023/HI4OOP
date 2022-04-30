class AnagramQuizTest {
	public static void main(String[] args) {
		// Entry ent = new Entry("cup", "a small open container usually used for drinking");
        Entry ent = new Entry("immediately", "without delay or hesitation");
		Quiz q = new AnagramQuiz(ent);
		System.out.println("<問題>");
		q.show();
		System.out.print("<回答>\nAnswer?: ");
		boolean isCorrect = q.ask();
		if (isCorrect)
			System.out.println("Correct!");
		else
			System.out.println("Wrong..");
	}
}
