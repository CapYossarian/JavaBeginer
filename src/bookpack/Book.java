package bookpack;

public class Book { // при шлось вынести в отдельный файл Book.java чтоб можно было объявить как public
    private String title;
    private String author;
    private int pubDate;

    public Book(String t, String a, int p) { //пришлось объявить public, чтоб было видно из другого пакета
        title = t;
        author = a;
        pubDate = p;
    }

    public void showBook() {
        System.out.println("title:" + title);
        System.out.println("author:" + author);
        System.out.println("pubDate:" + pubDate);

    }
}
