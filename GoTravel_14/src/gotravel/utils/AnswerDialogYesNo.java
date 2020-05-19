package gotravel.utils;

public class AnswerDialogYesNo {
    
    private static String[] ARRAY_OF_POSSIBLE_ANSWERS = {"Y", "y", "N", "n"};
    
    private static AnswerDialogYesNo answerDialogYesNo = null;

    private ClosedInterval closedInterval;

    private AnswerDialogYesNo() {
        closedInterval = new ClosedInterval(ARRAY_OF_POSSIBLE_ANSWERS.length - 1);
    }
    
    public static AnswerDialogYesNo instance() {
    	if (answerDialogYesNo == null) {
    		answerDialogYesNo = new AnswerDialogYesNo();
    	}
    	return answerDialogYesNo; 
    }
    
    public boolean isIncludes(String character) {
        assert character != null;
        boolean found = false;
        int index = 0;
        assert found == false && index == 0;
        do {
            if (ARRAY_OF_POSSIBLE_ANSWERS[index].equals(character)) {
                found = true;
            } else {
                index = index + 1;
            }
        } while (!found && closedInterval.isInclued(index));
        return found;
    }

    public boolean isYes(String character) {
        assert character != null;
        return "Y".equals(character) || "y".equals(character);
    }
    
    public boolean isNo(String character) {
        assert character != null;
        return "N".equals(character) || "n".equals(character);
    }

    @Override
    public String toString() {
        return "[y | n]";
    }
}
