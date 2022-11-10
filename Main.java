import java.util.Scanner;

import javax.sound.sampled.LineUnavailableException;

public class Main {

    public static void main(String[] args) throws LineUnavailableException {
        Game games = new Game();
        System.out.println("Selamat datang di permainan Tebak Bom");
        // System.out.println("Masukan nomor anda");
        // Scanner input = new Scanner(System.in);
        // int nomor = input.nextInt();
        games.startGame();

        try (Scanner scan = new Scanner(System.in)) {
            while (games.loop) {
                games.cheat();
                games.printPanel();
                System.out.print("Masukan nomor anda: ");
                String nextIntString = scan.nextLine();
                int nomor = Integer.parseInt(nextIntString);
                games.checkPanel(nomor);
                System.out.println("");
            }
        }

    }

}