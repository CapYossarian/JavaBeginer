package bookpack;

public class BookDemo {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("Java для начинающих", "Герберт Шилдт", 2018);
        books[1] = new Book("Java: полное руководство, 10-е издание", "Герберт Шилдт", 2018);
        books[2] = new Book("Искусство программирования на Java", "Герберт Шилдт", 2015);
        books[3] = new Book("Красный шторм поднимается", "Том Клэнси", 2006);
        books[4] = new Book("B дороге", "Джек Керуак", 2006);

        for(int i=0;i<books.length;i++){
            System.out.println(i);
            books[i].showBook();
            System.out.println();
        }


    }
}
