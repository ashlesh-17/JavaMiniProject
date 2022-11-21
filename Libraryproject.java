package librarymanagement;

import java.util.Scanner;

public class Libraryproject {

	public static void main(String[] args) {
		
	char option;
	do {
		System.out.println("**************************Library Management System**************************");
		System.out.println("Press 1 to add book.");
		System.out.println("Press 2 to issue a book.");
		System.out.println("Press 3 to return book.");
		System.out.println("Press 4 to print complete issue details.");
		System.out.println("Press 5 to exit.");
		Scanner enter = new Scanner(System.in);

		System.out.println("Enter any no.");
		int number = enter.nextInt();

		switch (number) 
		{
		case 1:
			Library a = new Library();
			a.add();
			break;

		case 2:
			Library b = new Library();
			b.issue();
			break;

		case 3:
			Library c = new Library();
			c.return_book();
			break;

		case 4:
			Library d = new Library();
			d.detail();
			break;

		case 5:
			Library e = new Library();
			e.exit();
			break;

		default:
			System.out.println("Invalid Number..!");
			break;
		}
	
		
		System.out.println("Do you want to select next option? Press Y/N");
		 option =enter.next().charAt(0);
	}
		while(option == 'y' || option == 'Y');
		if(option == 'n' || option == 'N') {
			Library z = new Library();
			z.exit();
		}
		
	
		
	}
	}


class Library {
	static String name;
	static String iss_date;
	static String ret_date;
	static int id;
	static int total;

	void add() {
		System.out.println("Enter book Name, Prize and Book_no");
		Scanner book = new Scanner(System.in);
		name = book.nextLine();
		Double prize = book.nextDouble();
		int book_no = book.nextInt();
		System.out.println("Your details is : " + name + "   " + prize + "   " + book_no);
	}

	void issue() {
		Scanner book1 = new Scanner(System.in);
		System.out.println("Book Name : ");
		name = book1.nextLine();

		System.out.println("Book Id : ");
		id = book1.nextInt();
		book1.nextLine();

		System.out.println("Issue Date : ");
		iss_date = book1.nextLine();

		System.out.println("Total no. of book issue : ");
		total = book1.nextInt();
		book1.nextLine();

		System.out.println("Return book date");
		ret_date = book1.nextLine();
	}

	int get_id() {
		return id;
	}

	void return_book() {
		System.out.println("Enter Student_Name & book_id ");
		Scanner ret = new Scanner(System.in);
		String Sname = ret.nextLine();
		int bookid = ret.nextInt();

		if (id == bookid) {
			System.out.println("Total Details");
			System.out.println("Book Name :: " + Library.name);
			System.out.println("Book Id :: " + Library.id);
			System.out.println("Book Issue Date :: " + Library.iss_date);
			System.out.println("Total Book Issue:: " + Library.total);
			System.out.println("Book Return Date:: " + Library.ret_date);
		} else {
			System.out.println("Wrong Id, please enter correct id...!");
		}
	}

	void detail() {
		System.out.println("Book Name :: " + Library.name);
		System.out.println("Book Id :: " + Library.id);
		System.out.println("Issue Date :: " + Library.iss_date);
		System.out.println("Total Book Issue:: " + Library.total);
		System.out.println("Return Date:: " + Library.ret_date);
	}

	void exit() {
		System.exit(0);
	}

}