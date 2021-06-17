package observer;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Publication publication = new Publication();

		System.out.println("What is username?");
		Scanner scan = new Scanner(System.in);
	    String name = scan.nextLine();

        Observer bud1 = (Observer) new Buddy("Dimo ");
        Observer bud2 = (Observer) new Buddy("Simeon ");
        publication.subscribe(bud1);
        publication.subscribe(bud2);

        publication.setPublication("the new publication of " + name + ": Hi guys"); 
        publication.setPublication("the new publication of " + name + ": How are you?");
        publication.setPublication("the new publication of " + name + ": Have a good day!" ); 

	}
}
