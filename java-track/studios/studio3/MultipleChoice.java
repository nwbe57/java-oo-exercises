package studio3;

public class MultipleChoice extends Question{
	
	
	public MultipleChoice(String question, String riteAnswer, String[] answerChoices){
		super(question, riteAnswer);		
	}

	public static void main(String[] args) {
		String[] Q1answers = new String[]{"July","August","May","November"};
		MultipleChoice Q1 = new MultipleChoice("What month is U.S. independence day?", "July",Q1answers);
		
		Question Q2 = new Question("What year was the attack on Pearl Harbor?", "1941");
		
		Q1.setUserResponse("july");
		System.out.println(Q1.getQuestion());
		System.out.println(Q1.getuserResponse());
		System.out.println(Q1.getRiteAnswer());
		System.out.println(Q1.isCorrect());
		
		Q2.setUserResponse("1942");
		System.out.println(Q2.getQuestion());
		System.out.println(Q2.getuserResponse());
		System.out.println(Q2.getRiteAnswer());
		System.out.println(Q2.isCorrect());
		
		
	}

}
