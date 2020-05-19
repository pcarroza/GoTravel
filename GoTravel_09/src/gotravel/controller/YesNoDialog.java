package gotravel.controller;

public class YesNoDialog {
    
    private String[] ARRAY_OF_POSSIBLE_ANSWERS = {"y", "Y", "N", "n"};

    public boolean isIncludes(String character) {
        assert character != null;
        for (String characters : ARRAY_OF_POSSIBLE_ANSWERS) {
            if (characters.equals(character)) {
                return true;
            }
        }
        return false;
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
