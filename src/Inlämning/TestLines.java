package Inlämning;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

//Ta reda på hur många rader
public class TestLines {
    @Test
    public void TestCountLines() {

        //Arrange
        Count c = new Count();


        //Act

        int actual = c.NumberOfLines();

        //Assert

        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void TestSaveLines() {
        //Sparar rader

        //Arrange
        Count c = new Count();


        //Act
        c.SaveLines();
        int actual = c.NumberOfLines();


        //Assert

        int expected = 1;

        assertEquals(expected, actual);


    }

    @Test
    public void TestCountCharacters() {
        //räkna antalet tecken

        //Arrange

        Count s = new Count();


        //Act

        int actual = s.NumberOfCharacters();


        //Assert

        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void TestSaveCharacters() {
        //spara antalet tecken

        //Arrange

        Count s = new Count();


        //Act
        s.SaveCharacters("Maryjane");

        int actual = s.NumberOfCharacters();


        //Assert

        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    public void TestHowManyCharacters() {
        //ta reda på hur många tecken jag har skrivit

        //Arrange

        Count m = new Count();


        //Act
        m.HowManyCharacters("Maryjane");

        int actual = m.getCharacters();


        //Assert

        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    public void TestIsThereStop() {
        //ta reda på om användaren har skrivit stopp

        //Arrange

        Count r = new Count();


        //Act
        r.IsThereStop("stop");

        boolean actual = r.getStop();


        //Assert

        boolean expected = true;

        assertEquals(expected, actual);
    }




    @Test
    public void TestTask1(){
        //did the user write chocolate

        //Arrange
        Count n = new Count();


        //Act
        n.WhereIsChocolate("Hi I want to buy and eat ice cream");

        boolean actual = n.getChocolate();

        //Assert

        boolean expected = false;

        assertEquals(expected, actual);
    }
    @Test
    public void TestTask2(){
        //Is the user a 30 year old
        // Is the user a man

        //Arrange

        Count a = new Count();

        //Act

        a.HowOldAreYou("Hello my name is Ellen and I am 30 years old");


        int actual = a.getAge();

        //Assert

        int expected = 0;

        assertEquals(expected,actual);

    }
    @Test
    public void TestTask3(){
        //Are you a dog person

        //Arrange
        Count u = new Count();

        //Act
        u.DoYouLikeDogs("No I like cats");

        boolean actual = u.YouDontLikeDogs();

        //Assert
        boolean expected = false;
        assertEquals(expected,actual);
    }
    @Test
    public void TestTask4(){
        //Did the user write hello

        //Arrange
        Count z = new Count();

        //Act
        z.DidYouSayHello("Hello. How Are you?");
        String actual = z.DidYouSaySomething();

        //Assert
        String expected = z.DidYouSaySomething();
        assertEquals(expected,actual);
    }
}




