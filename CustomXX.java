import java.util.Random;
import java.util.Scanner;

public class CustomXX {
    public static final String PLAYER = "X";
    public static final String BOT = "O";
    public static final String DOT_EMPTY = "*";
    public static int aiLevel = 0;
    public static final int SIZE = 3;
    public static String[][] field = new String[SIZE][SIZE];

    public static void main(String[] args) {
        mainMenu();
    }

    public static void aiAlisa() {
        int count = 0;
        initMap();
        while (true) {
            printMap();
            userHod(PLAYER, 0);
            count++;
            if (checkWin(PLAYER)) {
                System.out.println("Вы Выйгарли!");
                printMap();
                break;
            }
            aiHod();
            count++;
            if (checkWin(BOT)) {
                System.out.println("Алиса Выйграла Вас xD!");
                printMap();
                break;
            }
            if (count == Math.pow(SIZE, 2)) {
                printMap();
                break;
            }
        }
    }

    public static void mainMenu() {
        System.out.println("ДОБРО ПОЖАЛОВАТЬ В ИГРУ X и О: ");
        System.out.println("1. НАЧАТЬ ИГРУ!");
        System.out.println("2. ВЫЙТИ");

        int i = 0;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        switch (i) {
            case 1: {
                aiLevel();
                break;
            }
            case 2: {
               System.exit(0);
                break;
            }
//
            default: {
                System.out.println("Не верное значение!");
            }
        }
    }

    public static void aiLevel() {
        System.out.println("Выберите сложность Алисы: ");
        System.out.println("1. Новичок.");
        System.out.println("2. Умная, но не PRO.");
        System.out.println("3. PRO только для ярых игроков.");
        System.out.println("4. Я передумал вернуться назад");
        System.out.println("5. Досвидания!Алиса лучшая!.");
        int i = 0;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        switch (i) {
            case 1: {
                aiLevel = 0;
                aiAlisa();
                break;
            }
            case 2: {
                aiLevel = 1;
                aiAlisa();
                break;
            }
            case 3: {
                aiLevel = 2;
                aiAlisa();
                break;
            }
            case 4: {
                mainMenu();
                break;
            }
            case 5: {
                System.exit(0);
                break;
            }
            default: {
                System.out.println("Не верное значение!");
            }
        }
    }

    public static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void userHod(String sign, int i) {
        int x = -1;
        int y = -1;
        do {
            if (i == 0) {
                System.out.println("Делайте Ваш ход  x y (1 - " + SIZE + "): ");
            } else {
                System.out.println("Игрок " + i + ". Введите координаты x y (1 - " + SIZE + "): ");
            }
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        }
        while (isCellBusy(x, y));
        field[x][y] = sign;
    }

    public static void aiHod() {
        int x = -1;
        int y = -1;
        boolean ai_win = false;
        boolean user_win = false;
        // Ищем выигрышный ход
        if (aiLevel == 2) {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (!isCellBusy(i, j)) {
                        field[i][j] = BOT;
                        if (checkWin(BOT)) {
                            x = i;
                            y = j;
                            ai_win = true;
                        }
                        field[i][j] = DOT_EMPTY;
                    }
                }
            }
        }
        // Алиса блокирует хода пользователя, до последнего хода
        if (aiLevel > 0) {
            if (!ai_win) {
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        if (!isCellBusy(i, j)) {
                            field[i][j] = PLAYER;
                            if (checkWin(PLAYER)) {
                                x = i;
                                y = j;
                                user_win = true;
                            }
                            field[i][j] = DOT_EMPTY;
                        }
                    }
                }
            }
        }
        if (!ai_win && !user_win) {
            do {
                Random rnd = new Random();
                x = rnd.nextInt(SIZE);
                y = rnd.nextInt(SIZE);
            }
            while (isCellBusy(x, y));
        }
        field[x][y] = BOT;
        System.out.println("Ничья!");

    }


    public static boolean isCellBusy(int x, int y) {
        if (x < 0 || y < 0 || x > SIZE - 1 || y > SIZE - 1) {
            return false;
        }
        return field[x][y] != DOT_EMPTY;
    }

    public static boolean checkLine(int start_x, int start_y, int dx, int dy, String sign) {
        for (int i = 0; i < SIZE; i++) {
            if (field[start_x + i * dx][start_y + i * dy] != sign)
                return false;
        }
        return true;
    }

    public static boolean checkWin(String sign) {
        for (int i = 0; i < SIZE; i++) {
            // проверка строк
            if (checkLine(i, 0, 0, 1, sign)) return true;
            // проверка столбцов
            if (checkLine(0, i, 1, 0, sign)) return true;
        }
        // проверка диагоналей
        if (checkLine(0, 0, 1, 1, sign)) return true;
        if (checkLine(0, SIZE - 1, 1, -1, sign)) return true;
        return false;
    }


}


