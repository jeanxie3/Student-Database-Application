package StudentDatabaseApp;

import java.util.Scanner;

public class Student {
	private String vorName, nachName, studentId;
	private String kurse = "" ;
	private int jahrgang; 
	private int balance = 0;
	private static int id = 1000;
	private static int kostenfuerKurs = 600;
	// Konstructor:Aufforderung zur Eingabe von Name und Jahr des Studnets
	public Student() {
		Scanner eingabe = new Scanner(System.in);
		System.out.print("Geben Sie der Vorname des Studenten ein: ");
		this.vorName = eingabe.nextLine();
		
		System.out.print("Geben Sie der Nachname des Studenten ein: ");
		this.nachName = eingabe.nextLine();
		
		System.out.print("Geben Sie der Jahrgang ein: ");
		this.jahrgang = eingabe.nextInt();
		setStudentId();
		//System.out.print("Name: " + vorName + " " + nachName + " " + "\nJahrgang: " + jahrgang + "\nStudentID: "+ studentId+"\n");
			
		
	}
	
	// ein ID erzeugen
	private void setStudentId() {
		//Jahrgang + Id
		id++;
		this.studentId = jahrgang + " " + id;
	}
	
	// Kurse einschreiben
	public void einschreibenKurs() {
		do {
			System.out.println("Geben Sie die Kurse ein: (E fuer Ende)");
			Scanner eingabe = new Scanner(System.in);
			String kurs = eingabe.nextLine();
			if(!kurs.equals("E")) {
			kurse = kurse + " " +kurs;	
			balance = balance + kostenfuerKurs;
			}else {
				break;
			}
		}while(1!=0);
		//System.out.println( "Kurse:" + kurse + "\nGesamtkosten: " + balance);
		
	}
	// Balance anzeigen 
	public void zeigenBalance() {
		System.out.println("Ihre Balance ist: "+ balance + " Euro.");
	}
	// Beitrag zahlen
	public void bezahlenBeitrag() {
		zeigenBalance();
		Scanner eingabe = new Scanner(System.in);
		System.out.print("Geben Sie Ihre Bezahlung in Euro ein ");
		int bezahlung = eingabe.nextInt();
		balance = balance - bezahlung;
		System.out.println("Danke fuer Ihre Bezahlung: " + bezahlung + " Euro.");
		zeigenBalance();
	}
	// Status anzeigen
	public String zeigenInformationen() {
		return "Name: " + vorName + " " + nachName +
				"\nStudentId: " + studentId +
				"\nJahrgang: " + jahrgang +
				"\nEingeschriebene Kurse: " + kurse + 
				"\nBalance: " + balance + " Euro.";
	}
	
}
