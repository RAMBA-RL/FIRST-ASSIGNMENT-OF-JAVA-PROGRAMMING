/**GROUP MEMBERS NAME & REG NUMBER
RAMBA Rwibutso Leonore                    223011322
TUYISHIMIRE Vedaste                       223010552
CYEZAMUTIMA Emeraude                      223023054
NAMARA Jolly                              223015547
MPUMURE Esperance                         223013760
IRADUKUNDA Epiphanie                      223015618
IRASUBIZA Benyse                          223013344 
**/

package qn.six;

public class LibraryManagementSystem {

	public static void main(String[] args) {
		Book book1 = new Book("Java Programming", "James Gosling");
        Book book2 = new Book("Data Structures", "Robert Lafore");
        Book book3 = new Book("Database Systems", "C.J. Date");
        Book book4=new Book("Human Resources Managment","Kogan Page");

      
        Book[] library = { book1, book2, book3,book4};

        book1.borrowBook(); // Borrow Java Programming
        book2.borrowBook(); // Borrow Data Structures
        book2.borrowBook(); // Try borrowing again (should fail)
        book1.returnBook(); // Return Java Programming
        book1.returnBook(); // Try returning again (should warn)

        System.out.println("\nAvailable books in the library:");
        for (Book book : library) {
            if (book.isAvailable()) {
                System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
            }

        }}}
        



	
