package Class3;

public class Runner {
    public static void main(String[] args){
        Book book1 = new Book("Pandora", "Anush",299);
        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getPrice());

    }
}
