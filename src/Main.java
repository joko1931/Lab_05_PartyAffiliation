import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your party affiliation [D, R, I]: ");

        if (in.hasNextLine())
        {
            String party = in.nextLine();
            in.nextLine();

            if (party.equals("D"))
            {
                System.out.println("You get a Democratic Donkey!");
            }
            else if (party.equals("R"))
            {
                System.out.println("You get a Republican Elephant!");
            }
            else if (party.equals("I"))
            {
                System.out.println("You get an Independent man!");
            }
            else
            {
                System.out.println("You get a... wait... I don't know this party, so you get a high five!!");
            }
        }
    }
}