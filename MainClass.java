import java.util.Random;
import java.util.Scanner;

public class MainClass {
    Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


//                    GuessNumber(scanner);
                    GuessFruit();
    }


    public static void GuessNumber(Scanner scanner){
        do {
            int numb = new Random().nextInt(10);
            int i;
            System.out.println("Угадайте число от 0 до 9 с трёх попыток, Желаем Удачи!");
            for ( i = 0; i < 3; i++) {
                System.out.printf("Введите ваше число #%d: ", i);
                int Vvod=scanner.nextInt();
                if (numb > Vvod) {
                    System.out.println("Не верно, Ваше число Меньше!");
                } else if (numb<Vvod){
                    System.out.println("Мимо,Ваше число Больше");
                }else {
                    System.out.println(" Вы Угадали! ");
                    break;
                }

            }
            if(i == 3) {
                System.out.println("Вы проиграли, ваши попытки закончились...(");
            }
            System.out.println("Хотите сыграть еще раз? 1 - ДА, хочу, 0 - Нет, мне и так весело)");
        } while (scanner.nextInt()==1);
    }


    ////////////////////////////

    private static void GuessFruit() {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};

        int ZWord = random.nextInt(words.length - 1);
        String word = words[ZWord];
        int DlWord = word.length();
        System.out.println("Мы загадали слово,  отгадайте его");
        System.out.println(word);
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("Ващ ответ: (для выхода из игры, нажмите Enter)");
            String answer = scanner.nextLine();

            if (answer.equals("")) break;
            else if (word.equals(answer)) {
                System.out.println("Вы угадали!!!");
                break;
            }

            char[] charsAnswer = answer.toCharArray();
            for (int i = 0; i < DlWord; i++) {
                if (i >= charsAnswer.length) break;
                if (word.charAt(i) != charsAnswer[i]) charsAnswer[i] = '*';
            }
            StringBuilder comment = new StringBuilder(String.valueOf(charsAnswer));
            for (int i = comment.length(); i < 15; i++) comment.append("*");
            System.out.println(comment);
        }
        while (true);
    }







    //////////////////////////////////////////////Второе задание
//        public static String GuessWord(String a1, String a2) {
//
//         int minDl = Math.min(a1.length(), a2.length ());
//            for (int i = 0; i < minDl ; i++) {
//            if (a1.charAt(i) == a2.charAt(i)){
//                System.out.print(a1.charAt(i));
//            } else{
//                System.out.print("*");
//            }
//
//        }
//            for (int i = minDl; i < 15; i++) {
//                System.out.print("*");
//
//            }
//            return a1;
//    }

}


