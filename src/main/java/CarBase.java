public class CarBase {
    public static void main(String[] args) {
        CarQueue car1 = new CarQueue("Audi","Mersedes","BMW","Lada");
        CarQueue car2 = new CarQueue("RollsRoys","Pagani","Infinity","Mini");

        System.out.println("Запуск потоков");
        car1.start();
        car2.start();

    }
}
