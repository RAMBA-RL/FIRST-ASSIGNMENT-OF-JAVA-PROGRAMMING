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

public class Book {
	    private String title;
	    private String author;
	    private boolean available;

	    public Book(String title, String author) {
	        this.title = title;
	        this.author = author;
	        this.available = true; 
	    }

	  
	    public boolean borrowBook() {
	        if (available) {
	            available = false;
	            System.out.println("You have borrowed the book called: " + title);
	            return true;
	        } else {
	            System.out.println("Sorry, the book \"" + title + "\" is already borrowed.");
	            return false;
	        }
	    }

	    public void returnBook() {
	        if (!available) {
	            available = true;
	            System.out.println("You have returned: " + title);
	        } else {
	            System.out.println("The book \"" + title + "\" was not borrowed.");
	        }
	    }

	    public boolean isAvailable() {
	        return available;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }
	}







