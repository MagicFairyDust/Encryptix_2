import java.util.Random;
import java.util.Scanner;

public class proj2{
	public static void numberGame() { 
		int n=5,guess,i,num, again;
		Scanner sc = new Scanner(System.in);
		Random r= new Random();
		num = r.nextInt(100);
		System.out.println("A random number is choosen between 1 and 100. Guess the number. You have 5 trials.");
		for(i=0;i<5;i++) {
			System.out.println("Enter your guess:");
			guess = sc.nextInt();
			if(guess== num) {System.out.println("Correct!!"); break;}
			else if((num-guess)>=40 && i<n-1) {
				System.out.println("Your guess is too low!!");
			}
			else if(num>guess && i<n-1) {
				System.out.println("Your guess is low! Try higher.");
			}
			else if((guess-num)>=40 && i<n-1) {
				System.out.println("Your guess is too high!!");
			}
			else if(num<guess && i<n-1) {
				System.out.println("Your guess is high! Try lower.");
			}
		}
	    if(i==n) {
			System.out.println("You have used all your trials!!");
			System.out.println("The number was:"+num);}
			System.out.println("Want to play again? press 1.");
			again= sc.nextInt();
			if(again==1)numberGame();
			else System.out.println("Thank you for playing!!!! :)");
    }	  
	public static void main(String arg[]) {
		numberGame();
	}
}