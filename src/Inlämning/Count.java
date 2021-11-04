package Inlämning;

public class Count {

    private int numberOfRows;
    private int numberOfCharacters;
    private int howManyCharacters;
    private boolean stopStop;

    private boolean noChocolate;
    private int MyAge;
    private boolean Cats;
    private String Yes;
    private String text;


    public Count() {
    }

    public int NumberOfLines() {

        return numberOfRows;
    }

    public void SaveLines() {

        numberOfRows = numberOfRows + 1;
    }

    public void SaveCharacters(String myText) {

        numberOfCharacters = numberOfCharacters + myText.length();

    }

    public int NumberOfCharacters() {

        return numberOfCharacters;
    }

    public void HowManyCharacters(String myString) {

        howManyCharacters = howManyCharacters + myString.length();

    }

    public int getCharacters() {

        return howManyCharacters;
    }


    public void IsThereStop(String text) {

        stopStop = text.equals("stop");


    }

    public boolean getStop() {

        return stopStop;


    }


    public void WhereIsChocolate(String s) {
    }

    public boolean getChocolate() {
        return noChocolate = noChocolate;
    }

    public int HowOldAreYou(String myAge) {
        return MyAge = MyAge;
    }

    public int getAge() {
        return MyAge;
    }


    public boolean DoYouLikeDogs(String no_i_like_cats) {
        return Cats = Cats;
    }

    public boolean YouDontLikeDogs() {
        return Cats = Cats;
    }

    public void DidYouSayHello(String hi) {
    }

    public String DidYouSaySomething() {
        return Yes = Yes;
    }


}



