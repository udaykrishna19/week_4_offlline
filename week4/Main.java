public class Main {
    public static void main(String [] args){
         Author author = new Author("Jordan peterson","jordanpeterson@hotmail.com","male");

         Book book = new Book("12 rules for life",author,15000,1400);

         System.out.println("book details:");
         System.out.println("tile: "+book.getName());
          System.out.println("Author name "+ book.getAuthour().getName());
           System.out.println("Authour email "+ book.getAuthour().getEmail());
            System.out.println("Author gender "+book.getAuthour().getGender());
             System.out.println("Book price "+ book.getprice());
              System.out.println("book quantity "+ book.getqtyinstock());
    }

}

class Author{
    private String name,email;
    private String gender;
    Author(String name, String email, String gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getGender(){
        return gender;
    }
}

class Book{
    private String name;
    private Author author;
    private double price;
    private int qtyinstock;

    Book(String name, Author author, double price, int qtyinstock){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyinstock = qtyinstock;
    }

    public String getName(){
        return name;
    }
    public Author getAuthour(){
        return author;
    }

    public double getprice(){
        return price;
    }
    public int getqtyinstock(){
        return qtyinstock;
    }

}

