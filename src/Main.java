public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1!");
        int deposit = 15000;
        int total = 0;
        int mont = 0;
        while ( total<= 2_459_000) {
            mont++;
            total = total + total / 100;
            total = total + deposit;
            System.out.println(" Месяц " + mont + " сумма накоплений равна " + total);
        }
        System.out.println("Задание 2");
        int num = 0;
        while(num != 10 ){
            num++;
            System.out.print(num + " ");

        }
        System.out.println();
        for ( num =10; num !=0; num--){
            System.out.print(num + " ");
        }

        System.out.println("Задание 3");
        int totalPeople = 12_000_000;
        int birthPeople = totalPeople/1000*8;
        int deathPeople = totalPeople/1000*8;
        int years = 2022;
        while(years!=2032){
            years++;
            totalPeople=totalPeople+birthPeople-deathPeople;
            System.out.println("Год " + years + " Население составляет " + totalPeople);
        }



    }
}