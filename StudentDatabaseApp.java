package StudentDatabaseApp;
import java.util.Scanner;
public class StudentDatabaseApp {

	public static void main(String[] args) {
		// fragen, wie viele Nutzer wir hinzufügen wollen
		System.out.println("Wie viele Studenten gibt es?");
		Scanner eingabe = new Scanner(System.in);
		int studentNum = eingabe.nextInt();
		Student[] students = new Student[studentNum];
		
		// n neue Studenten schaffen
		for(int i = 0; i<studentNum; i++) {
			students[i] = new Student();	
			students[i].einschreibenKurs();
			students[i].bezahlenBeitrag();	
		}
		

		
		
		System.out.print(students[2].zeigenInformationen());

	}

}
