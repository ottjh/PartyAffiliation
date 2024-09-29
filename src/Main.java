import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        //declare String partyAffil as ""
        //output "What political party do you associate with? Democrat, Republican, Independent, or an other party? [DRI or custom entry]: "
        //input partyAffil
        //test for ignores case D, R, I, then else into other
        //output for each after testing correctly
        Scanner in = new Scanner(System.in);
        String partyAffil = "";

        System.out.print("Please enter your political party affiliation [DRI or custom]: ");
        partyAffil = in.nextLine();

        if (partyAffil.equalsIgnoreCase("D"))
        {
            System.out.println("You chose D. You get a democrat Donkey");
        }
        else if (partyAffil.equalsIgnoreCase("R"))
        {
            System.out.println("You chose R. You get a Republican Elephant");
        }
        else if (partyAffil.equalsIgnoreCase("I"))
        {
            System.out.println("You chose I. You get an independent man");;
        }
        //THIS LAST LINE IS A NIGHTMARE. I did things nearly exactly as Professor Wulf did, yet it is rebelling.
        //It thinks that any else needs an if at the end despite it seeming to work like that for Professor Wulf.
        //I hope this works in the mean time, but it is a very terrible work-around.
        //NVM... It started working after I nearly deleted the whole line???
        else
        {
            System.out.println("You chose the custom answer: " + partyAffil + ". I hope you enjoy that.");
        }
    }
}