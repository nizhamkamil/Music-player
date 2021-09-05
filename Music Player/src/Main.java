import java.util.*;

public class Main {
    public static void main(String[] args) {
        Headset headset = new Headset();
        App app = new App();
        Scanner playApp = new Scanner(System.in);
        System.out.println("Apakah mau menggunakan app music player ? (Y/N)");

        String play = playApp.nextLine();

        if (play.equals("Y") || play.equals("y") ){
            app.startApp();
            String playedMusic = app.playMusic();
            headset.currentMusicPlayed(playedMusic);
        }
        else {
            System.out.println("App tidak digunakan");
        }
    }
}
