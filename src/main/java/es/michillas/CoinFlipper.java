package es.michillas;

import java.io.*;
import java.time.LocalTime;

public class CoinFlipper {
    private static CoinFlipper instance; // patrón Singleton (yo hago patrones Singleton pa hacerme el chulo)

    private boolean inGame = true;

    private int flipAmount = 2;

    private CoinFlipper() {
        // Llama al método donde está main loop del juego
        this.gameLoop();
    }

    public static CoinFlipper getInstance() {
        if (instance == null) {
            instance = new CoinFlipper();
        }
        return instance;
    }

    public void gameLoop() {
        while (inGame) {
            System.out.println("     ██ ██    ██ ███████ ████████     ███████ ██      ██ ██████      ██ ████████ \n" +
                               "     ██ ██    ██ ██         ██        ██      ██      ██ ██   ██     ██    ██    \n" +
                               "     ██ ██    ██ ███████    ██        █████   ██      ██ ██████      ██    ██    \n" +
                               "██   ██ ██    ██      ██    ██        ██      ██      ██ ██          ██    ██    \n" +
                               " █████   ██████  ███████    ██        ██      ███████ ██ ██          ██    ██    \n" +
                               "                                                                                 \n" +
                               "                                                                                 ");
            System.out.println("                                     ██████  \n" +
                               "                                    ██  ████ \n" +
                               "                                    ██ ██ ██ \n" +
                               "                                    ████  ██ \n" +
                               "                                     ██████  \n" +
                               "                                             \n" +
                               "                                             ");
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                System.out.println("Press enter to flip the coin");

                // Para que el código no continue hasta que el usuario pulse enter.
                reader.read();

            } catch (IOException e) {
                e.printStackTrace();
            }

            for (int i = 0; i <= flipAmount; i++) {
                this.flipAnimation();
            }

            this.winnerWinnerChickenDinner(); // Como en el PUBG :0

            inGame = false;
        }
    }

    public void flipAnimation() {
        int wait = 350;

        System.out.println("                                     ██████  \n" +
                           "                                    ██  ████ \n" +
                           "                                    ██ ██ ██ \n" +
                           "                                    ████  ██ \n" +
                           "                                     ██████  \n" +
                           "         \n" +
                           "         ");
        try {
            Thread.sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("         \n" +
                           "         \n" +
                           "                                    ████████ \n" +
                           "         \n" +
                           "         \n" +
                           "         \n" +
                           "         \n");
        try {
            Thread.sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("                                     ██    \n" +
                           "                                      ██   \n" +
                           "                                       ██  \n" +
                           "                                        ██ \n" +
                           "                                         ██\n" +
                           "       \n" +
                           "   ");
        try {
            Thread.sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("                                       ██ \n" +
                           "                                       ██ \n" +
                           "                                       ██ \n" +
                           "                                       ██ \n" +
                           "                                       ██ \n" +
                           "   \n");
        try {
            Thread.sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("                                        ██ \n" +
                           "                                       ██  \n" +
                           "                                      ██   \n" +
                           "                                     ██    \n" +
                           "                                    ██     \n" +
                           "       \n");
        try {
            Thread.sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("         \n" +
                           "                                    ████████ \n" +
                           "         \n" +
                           "         \n" +
                           "         \n");
        try {
            Thread.sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("                                     ██████  \n" +
                           "                                    ██    ██ \n" +
                           "                                    ██    ██ \n" +
                           "                                    ██    ██ \n" +
                           "                                     ██████  \n" +
                           "         \n" +
                           "         ");
        try {
            Thread.sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("         \n" +
                           "         \n" +
                           "                                    ████████ \n" +
                           "         \n" +
                           "         \n" +
                           "         \n");
        try {
            Thread.sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("                                     ██    \n" +
                           "                                      ██   \n" +
                           "                                       ██  \n" +
                           "                                        ██ \n" +
                           "                                         ██\n" +
                           "       \n" +
                           "   ");
        try {
            Thread.sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("                                       ██ \n" +
                           "                                       ██ \n" +
                           "                                       ██ \n" +
                           "                                       ██ \n" +
                           "                                       ██ \n" +
                           "   \n");
        try {
            Thread.sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("                                        ██ \n" +
                           "                                       ██  \n" +
                           "                                      ██   \n" +
                           "                                     ██    \n" +
                           "                                    ██     \n" +
                           "       \n");
        try {
            Thread.sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("         \n" +
                           "                                    ████████ \n" +
                           "         \n" +
                           "         \n" +
                           "         \n");
        try {
            Thread.sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void winnerWinnerChickenDinner() {
        int number = LocalTime.now().getSecond();
        if (number % 2 == 0) {
            System.out.println("Heads! // Cara!");
            System.out.println("                                     ██████  \n" +
                               "                                    ██    ██ \n" +
                               "                                    ██    ██ \n" +
                               "                                    ██    ██ \n" +
                               "                                     ██████  \n" +
                               "         \n" +
                               "         ");
        } else {
            System.out.println("Tails! // Cruz!");
            System.out.println("                                     ██████  \n" +
                               "                                    ██  ████ \n" +
                               "                                    ██ ██ ██ \n" +
                               "                                    ████  ██ \n" +
                               "                                     ██████  \n" +
                               "         \n" +
                               "         ");
        }
    }
}