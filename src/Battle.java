import java.util.Random;
import java.util.Scanner;

public class Battle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int playerHealth = 100;
        int enemyHealth = 100;
        int playerDamage = 10; // Базовый урон игрока

        while (playerHealth > 0 && enemyHealth > 0) {
            System.out.println("Меню боя:");
            System.out.println("1. Попытаться атаковать");
            System.out.println("2. Покинуть бой");
            System.out.println("3. Использовать заклинание");
            System.out.println("4. Магазин");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int enemyDamage = random.nextInt(15) + 1;

                    enemyHealth -= playerDamage;
                    playerHealth -= enemyDamage;

                    System.out.println("Вы атаковали противника и получили урон от его ответного удара.");
                    break;
                case 2:
                    if (random.nextBoolean()) {
                        System.out.println("Вы успешно смогли покинуть бой.");
                        return;
                    } else {
                        System.out.println("Противник не дал вам уйти!");
                        break;
                    }
                case 3:
                    int spellType = random.nextInt(3) + 1;
                    int spellPower = random.nextInt(10) + 1;

                    switch (spellType) {
                        case 1:
                            playerHealth += spellPower;
                            System.out.println("Вы восстановили здоровье с помощью заклинания.");
                            break;
                        case 2:
                            enemyHealth -= spellPower;
                            System.out.println("Вы атаковали противника силой заклинания.");
                            break;
                        case 3:
                            // Логика для другого типа заклинания
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Магазин:");
                    System.out.println("1. Зелье здоровья (+20 здоровья) - 10 золота");
                    System.out.println("2. Улучшенное оружие (+10 урона) - 15 золота");

                    int itemChoice = scanner.nextInt();

                    switch (itemChoice) {
                        case 1:
                            if (playerHealth + 20 <= 100) {
                                playerHealth += 20;
                                System.out.println("Вы купили зелье здоровья.");
                            } else {
                                System.out.println("Ваше здоровье уже полное.");
                            }
                            break;
                        case 2:
                            if (playerDamage + 10 <= 30) {
                                playerDamage += 10;
                                System.out.println("Вы купили улучшенное оружие.");
                            } else {
                                System.out.println("Ваше оружие уже максимально улучшено.");
                            }
                            break;
                    }
                    break;
                default:
                    System.out.println("Некорректный ввод. Попробуйте еще раз.");
            }

            System.out.println("Здоровье игрока: " + playerHealth);
            System.out.println("Здоровье противника: " + enemyHealth);
            System.out.println();
        }

        if (playerHealth <= 0) {
            System.out.println("Вы проиграли бой.");
        } else {
            System.out.println("Вы победили противника!");
        }
    }
}
