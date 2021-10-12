import java.util.Scanner; // impoterer scanner
public class Nummer {

      public static void main(String[] args) {

            int Random_Nummer;
			int guess;
            Random_Nummer = (int) (Math.random() * 100 + 1);   // Random nummer fra 1 til 100
       //   System.out.println(Random_Nummer); //for at tjekke hvad er tallet, man skal gaette 
			Scanner keyboard = new Scanner(System.in);  // læse scanner
            System.out.print("Skrive det nummer du taenker pa: ");
            guess = keyboard.nextInt();

            System.out.println("Dit gaet" + guess);

            if (guess == Random_Nummer)  // hvis det er gaettet sa skal den print korrekt

                  System.out.println("Dit gaet er: "+guess +" korrekt, Random Nummer er: "+Random_Nummer);

            else if (guess < Random_Nummer)

                  System.out.println("Dit gaet er mindre end random nummer.");

            else if (guess > Random_Nummer)

                  System.out.println("Dit gaet er højere end random nummer.");

      }

}