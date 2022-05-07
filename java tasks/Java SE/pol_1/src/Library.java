import javax.imageio.plugins.bmp.BMPImageWriteParam;

public class Library {
    private String name;
    private String city;
    private String country;
    private Book[] books = new Book[100]; //Для данного массива не создавайте геттер и сеттер
    private int sizeOfBooks = 0; //Для данного типа не создавайте геттер и сеттер

    public Library() {
    }

    public Library(String name, String city, String country, Book[] books, int sizeOfBooks) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.books = books;
        this.sizeOfBooks = sizeOfBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public void addBook(Book b){
        books[sizeOfBooks]=b;
        sizeOfBooks++;

    }
    public void printLibraryData(){
            for (int i=0;i<books.length;i++){
                System.out.println(books[i]);
            }
    }
}
