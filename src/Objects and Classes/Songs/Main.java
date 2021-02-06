package Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Song> songList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("_");
            Song song = new Song(input[0], input[1], input[2]);
            songList.add(song);
        }

        String typeList = scan.nextLine();

        if(typeList.equals("all")) {
            for (int i = 0; i < songList.size(); i++) {
                Song song = songList.get(i);
                System.out.println(song.getTypeList());
            }
        }
        else {
            for (int i = 0; i < songList.size(); i++) {
                Song song = songList.get(i);
                if (songList.get(i).getTypeList().equals(typeList)) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}