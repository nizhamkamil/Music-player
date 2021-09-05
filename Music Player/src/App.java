import java.util.*;

public class App {
    public ArrayList<String> musics = new ArrayList<String>();
    private boolean isClosed;

    private void musicList() {
        musics.add("Moon Halo");
        musics.add("Bury The Light");
        musics.add("Warriors");
        musics.add("Legends Never Die");
        musics.add("As We Fall");
    }

    private void displayMusic() {
        System.out.println("Music List : ");
        for (String music : musics) {
            System.out.println(music);
        }
    }

    private void addMusicList() {
        Scanner musicName = new Scanner(System.in);
        System.out.println("Tulis nama lagu yang ingin ditambahkan");
        String title = musicName.nextLine();
        musics.add(title);
    }

    private void removeMusic() {
        Scanner musicName = new Scanner(System.in);
        System.out.println("Ketik nama lagu yang ingin dihapus");
        String title = musicName.nextLine();
        musics.remove(title);
    }

    private int getUserAction() {
        Scanner action = new Scanner(System.in);
        System.out.println("");
        System.out.println("Tekan Tombol untuk :  ");
        System.out.println("1. Menambahkan music kedalam list ");
        System.out.println("2. Mendelete music dari list ");
        System.out.println("3. menampilkan music yang ada dalam list ");
        System.out.println("4. Memainkan music dari list ");
        System.out.println("");
        int actionNum = action.nextInt();
        return actionNum;
    }

    public String playMusic() {
        Scanner play = new Scanner(System.in);
        System.out.println("Pilih nomor lagu yang ingin di mainkan dari list");
        int playIndex = play.nextInt() - 1;
        String playedMusic = musics.get(playIndex);
        return playedMusic;
    }

    public void startApp() {
        int action;
        displayMusic();
        musicList();
        while (!isClosed) {
            action = getUserAction();
            if (action == 1) {
                addMusicList();
            }
            if (action == 2) {
                removeMusic();
            }
            if (action == 3) {
                displayMusic();
            }
            if (action == 4) {
                isClosed = true;
            }
            else {
                System.out.println("Input yang anda masukan salah");
            }
        }
    }
}
