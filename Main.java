import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        boolean CzyJestPierwsza = true;

        if (liczba < 2) {
            CzyJestPierwsza = false;
        } else {
            for (int i = 2; i <= liczba / 2; i++)
              {
                if (liczba % i == 0) {
                    CzyJestPierwsza = false;
                    break;
                }
            }
        }

        if (CzyJestPierwsza) {
            System.out.println("Podana liczba jest liczbą pierwszą.");
        } else {
            System.out.println("Podana liczba nie jest liczbą pierwszą.");
        }
    }
}
