// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello java");

        // Veriables
          /*
           int number=20;
           String message = "Hello Java";
           System.out.println(message + " " +number);
          */

        // Conditionals
        /*
        int number = 20;
        if (number < 20)
            System.out.println("Sayı 20 den küçüktür");
        else if (number==20)
            System.out.println("Sayı 20 dir");
         else
            System.out.println("Sayı 20 den büyüktür");
         */

        /*
        int number1=10;
        int number2=20;
        int number3=6;
        int biggerNumber = number1;

        if (biggerNumber<number2)
            biggerNumber = number2;

        if (biggerNumber<number3)
            biggerNumber = number3;
         */

        /*
        char grade ='A';
        switch (grade){
            case 'A':
                System.out.println("Success");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case  'D':
                System.out.println("Good");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid");
        }
         */

        // Loops
        /*
        for (int i=1;i<=10;i++){
            System.out.println(i);
        }
         */

        /*
        int i = 12;
        while (i < 20) {
            System.out.println("Sayı 20'den küçüktür");
            i++;
        }
         */

        /*
        int j = 12;
        do {
            System.out.println("Sayı 20'den küçüktür");
            j+=2;
        } while (j < 20);
         */

        // Arrays
        /*
        String learner1 = "Mete";
        String learner2 = "Mehmet";
        String learner3 = "Ali";

        String[] learners = new String[4];
        learners[0]= "Mete";
        learners[1] = "Mehmet";
        learners[2] = "Ali";
        learners[3] = "Aylin";

        for (int i = 0; i<learners.length;i++){
            System.out.println(learners[i]);
        }

        for (String learner:learners){
            System.out.println(learner);
        }
         */

        /*
        double[] myList = {1.2,2.4,6.8};
        double total = 0;
        double max = myList[0];
        for(double number:myList){
            if (max<number){
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Toplam: " + total);
        System.out.println("En büyük sayı: " + max);
         */

        /*
        String[][] cities = new String[3][3];
        cities[0][0] = "İstanbul";
        cities[0][1] = "Yalova";
        cities[0][2] = "Bursa";
        cities[1][0] = "Kayseri";
        cities[1][1] = "Konya";
        cities[1][2] = "Ankara";
        cities[2][0] = "Diyarbakır";
        cities[2][1] = "Gaziantep";
        cities[2][2] = "Erzurum";

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.println(cities[i][j]);
            }
        }
         */

        /*String message = "Hello";
        System.out.println(message);
        System.out.println("Karakter Sayısı" + message.length());
        System.out.println("4. Eleman " + message.charAt(3) + " Harfidir");
        System.out.println(message.concat(" Mete"));
        System.out.println(message.startsWith("A"));
        System.out.println(message.endsWith("o"));
        char[] characters = new char[5];
        message.getChars(0, 2, characters, 0);
        System.out.println(characters);
        System.out.println(message.indexOf('a'));
        System.out.println(message.lastIndexOf('o'));
        System.out.println(message.replace(' ', '-'));
        System.out.println(message.substring(2));

        for (String word : message.split("")) {
            System.out.println(word);
        }
        */

        // int number = numbers(2, 3, 4, 5, 6);

        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
    }

    public static int numbers(int... number) {
        int total = 0;
        for (int num : number) {
            total += num;
        }
        return total;
    }


}