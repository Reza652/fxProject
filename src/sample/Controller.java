package sample;

public class Controller {
    private String myName;

    public void nameValidation(String theName) {
        String regex = "^[a-zA-Z]+$";
        if(theName.matches(regex))
            setMyName(theName);
    }
    void setMyName(String theName) {
        myName = theName;
    }

    String getMyName() {
        return myName;
    }

}
