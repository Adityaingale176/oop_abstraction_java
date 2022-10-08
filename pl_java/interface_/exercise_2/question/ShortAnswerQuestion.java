package pl_java.interface_.exercise_2.question;

public class ShortAnswerQuestion extends Question{
    /*
    * Attributes
    */
    private String shortAnswer;


    /*
    * Constructors
    */
    public ShortAnswerQuestion(String questionText) {
        setQuestionType(QuestionType.SHORT_ANSWER);
        setQuestionText(questionText);
    }

    /*
    * Getters
    */

    public String getShortAnswer() {
        return shortAnswer;
    }


    /*
    * Setters
    */
    public void setShortAnswer(String shortAnswer) {
        // Perform Input Validations
        /*
        * 
        */
        this.shortAnswer = shortAnswer;
    }
}
