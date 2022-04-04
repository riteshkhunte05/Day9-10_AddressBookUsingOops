package address_book;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.ListIterator;
	import java.util.Scanner;

	public class  EditContactUC3 {
		public static void main(String[] args) {
			System.out.println("Welcome to the address book system");
			List<Contact> collection = new ArrayList<Contact>();
			Scanner sc = new Scanner(System.in);
			Scanner sc1 = new Scanner(System.in);
			int choice;
			do {
				System.out.println("1.Add Contact");
				System.out.println("2.Display Contact");
				System.out.println("3.Update contact ");
				System.out.println("Enter your choice");
				choice = sc.nextInt();

				switch (choice) {
				case 1:
					System.out.print("Enter First Name: ");
					String firstName1 = sc1.nextLine();
					System.out.print("Enter last Name: ");
					String lastName = sc1.nextLine();
					System.out.print("Enter your address: ");
					String address = sc1.nextLine();
					System.out.print("Enter your city: ");
					String city = sc1.nextLine();
					System.out.print("Enter your state: ");
					String state = sc1.nextLine();
					System.out.print("Enter zip code : ");
					int zip = sc.nextInt();
					System.out.print("Enter phone number: ");
					String phoneNumber = sc1.nextLine();
					System.out.print("Enter your emailID: ");
					String emailId = sc1.nextLine();
					Contact contacts = new Contact(firstName1, lastName, address, city, state, zip, phoneNumber, emailId);
					collection.add(contacts);
					break;
				case 2:
					System.out.println(collection);
					break;
				case 3:
					boolean found = false;
					System.out.println("Enter first name of the person for update ");
					firstName1 = sc1.nextLine();
					System.out.println("------------------------------------");

					ListIterator<Contact> listIterator = collection.listIterator();


					while (listIterator.hasNext()) {
						contacts = listIterator.next();

						if (contacts.getFirstName().equals(firstName1)) { // entering the condition if fname matches

							System.out.print("Enter new first Name: ");
							firstName1 = sc1.nextLine();
							System.out.print("Enter new last Name: ");
							lastName = sc1.nextLine();
							System.out.print("Enter your new address: ");
							address = sc1.nextLine();
							System.out.print("Enter your new city: ");
							city = sc1.nextLine();
							System.out.print("Enter your state: ");
							state = sc1.nextLine();
							System.out.print("Enter zip code : ");
							zip = sc.nextInt();
							System.out.print("Enter phone number: ");
							phoneNumber = sc1.nextLine();
							System.out.print("Enter your eMail ID: ");
							emailId = sc1.nextLine();
							listIterator.set(
									new Contact(firstName1, lastName, address, city, state, zip, phoneNumber, emailId));
							found = true;
						}
					}
					System.out.println("_____________________________________");

					if (!found) {
						System.out.println("Record not found");// o/p for mismatch first name
					} else {
						System.out.println("Record is updated successfully");
					}
					System.out.println("_______________________________________");
					break;
				default:
					System.out.println("default");
				}
			} while (choice != 0);

	}

}
