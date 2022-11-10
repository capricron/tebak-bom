import java.util.Random;

public class Game {

    Random random = new Random();
    Object[][] panel = new Object[2][2];
    Boolean bom = false;
    Boolean loop = true;
    int y = 1;

    public void startGame() {
        int k = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                Boolean randoms = random.nextBoolean();
                if (randoms == true) {
                    if (bom == true) {
                        panel[i][j] = false;
                    } else {
                        panel[i][j] = true;
                        bom = true;
                    }
                } else if (bom == false && k == 4) {
                    panel[i][j] = true;
                    bom = true;
                } else {
                    panel[i][j] = false;
                }

                k++;
            }
        }

    }

    public void printPanel() {
        int k = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (this.panel[i][j].equals(true) || this.panel[i][j].equals(false)) {
                    System.out.print(k + " ");
                } else {
                    System.out.print("X");
                }
                k++;
            }
            System.out.println("");
        }
    }

    public void cheat() {
        // print looping panel
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(panel[i][j]);
            }
            System.out.println("");
        }
    }

    public void checkPanel(int nomor) {
        int k = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (k == nomor) {
                    if (this.panel[i][j].equals(true)) {
                        System.out.println("Anda kalah");
                        loop = false;
                    } else {
                        this.panel[i][j] = "X";
                    }
                }
                k++;
            }
        }
        if (this.y == 3 && loop == true) {
            System.out.println("Anda menang");
            loop = false;
        }
        this.y++;

    }

}