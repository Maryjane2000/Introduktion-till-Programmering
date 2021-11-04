package Inlämning;


import java.util.Scanner;

public class Lines {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Count yourText = new Count();

        System.out.println("Hello! Please write a text and I'll count the lines until you say ´´stop``!");
        String text = scan.nextLine();
        yourText.IsThereStop(text);


        while (!yourText.getStop()) {


            yourText.SaveLines();
            yourText.SaveCharacters(text);
            text = scan.nextLine();
            yourText.IsThereStop(text);

        }
        //Repeater
        System.out.println(yourText.NumberOfCharacters());
        System.out.println(yourText.NumberOfLines());

    }
}


















