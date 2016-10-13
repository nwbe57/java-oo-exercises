package studio3;

public class Question {
	
	protected String userResponse;
	protected String question;
	protected String riteAnswer;
	protected boolean isCorrect;
	
	public Question(String question, String riteAnswer){
		this.question = question;
		this.riteAnswer = riteAnswer;
		this.isCorrect = false;
	}
	
	public String getQuestion() {
		return question;
	}

	public String getRiteAnswer() {
		return riteAnswer;
	}
	
	public String getuserResponse() {
		return userResponse;
	}

	public void setUserResponse(String userResponse) {
		this.userResponse = userResponse;
	}
	
	public boolean isCorrect(){
		
		this.userResponse = getuserResponse();
		this.riteAnswer = getRiteAnswer();
		
		if(this.userResponse.equalsIgnoreCase(this.riteAnswer)){
			return true;
		}
		return false;
	}




	public static void main(String[] args) {
		
		

	}

}
