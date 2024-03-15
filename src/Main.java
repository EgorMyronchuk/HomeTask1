import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Result(scan, Start(scan));

    }
    public static String Start(Scanner scan) {
        System.out.println("Let the game begin!\nWhat is your name ?");
        String HumanName = scan.nextLine();
        String name = HumanName;
        return name;
    }

    public static int TrigerNumber() {
        Random rnd = new Random();
        int RandomNumber = rnd.nextInt(101);
        return RandomNumber;
    }

    public static void Result(Scanner scan, String name) {
        System.out.println("Try to guess a number from 0 to 100.");
        boolean stop = true;
        ArrayList<Integer> Numbers = new ArrayList<>(); // В тз без використання інтерфейсу List,але як використати Array ,
        //якщо я не знаю з якої спроби вгадає людина.Я трошки не розумію
        int temp = 0;
        int check = TrigerNumber();
        while (stop) {
            String number = scan.nextLine();
            Numbers.add(Integer.parseInt(number));

            if (Integer.parseInt(number) > check) {
                System.out.println("Your number is too big. Please, try again.");
            } else if (Integer.parseInt(number) < check) {
                System.out.println("Your number is too small. Please, try again.");
            } else {
                System.out.printf("Congratulations, %s \nYour numbers were : ", name);
                Collections.sort(Numbers, Collections.reverseOrder());
                for (int i = 0; i < Numbers.size(); i++) {
                    System.out.printf("%d ", temp = Numbers.get(i));
                }
                stop = false;
            }
        }
    }

}
