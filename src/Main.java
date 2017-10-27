import java.util.Scanner;

public class Main {
 public static void main(String args[]) {


     Scanner scnr = new Scanner(System.in);
     Scanner scnr2 = new Scanner(System.in);
     int menuNum = 1;
     int numPokemon;

     System.out.println("Welcome to your new PokeDex!");
     System.out.print("How many Pokemon are in your region: ");
     numPokemon = scnr.nextInt();
     System.out.println();
     System.out.println("Your new Pokedex can hold " + numPokemon + " Pokemon. Let's start using it!");

     // does it matter that the 30 isnt next to region?

     while(menuNum != 6);

     System.out.println();
     System.out.println("1. List Pokemon");
     System.out.println("2. Add Pokemon");
     System.out.println("3. Check a Pokemon's Stats");
     System.out.println("4. Evole Pokemon");
     System.out.println("5. Sort Pokemon");
     System.out.println("6. Exit");
     System.out.println();
     System.out.println("What would you like to do?");
     menuNum = scnr2.nextInt();


 }
}
