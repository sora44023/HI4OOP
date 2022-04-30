class QuizTest {
	public static void main(String[] args) {
		Entry ent = new Entry("cup", "a small open container usually used for drinking");
		Quiz q = new Quiz(ent);
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
