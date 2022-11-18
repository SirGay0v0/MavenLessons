public class PeopleBase{
    public static void main(String[] args) {
        PeopleQueue queue1 = new PeopleQueue("Ivan", "Kolya", "Petya", "Masha");
        PeopleQueue queue2 = new PeopleQueue("Dasha", "Danya", "Kirill", "Serezha");

        System.out.println("Запуск потоков");
        queue1.start();
        queue2.start();

    }
}
