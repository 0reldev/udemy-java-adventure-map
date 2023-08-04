package dev.lpa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String myLocations = """
                lake,at the edge of Lak Tim,E:ocean,W:forest,S:well house,N:cave
                ocean,on Tim's beach before an angry sea,W:lake
                cave, at the mouth of Tim's bat cave,E:ocean,W:ocean,W:forest,S:lake
                """;

        AdventureGame game = new AdventureGame(myLocations);
//        hill:Location[description=on top of hill with a view in all directions, nextPlaces={N=forest, E=road}]
//        well house:Location[description=inside a well house for a small springs, nextPlaces={N=lake, W=road, S=stream}]
//        forest:Location[description=at the edge of a thick dark forest, nextPlaces={E=lake, S=road}]
//        road:Location[description=at the end of the road, nextPlaces={N=forest, E=well house, W=hill, S=valley}]
//        stream:Location[description=near a stream with a rocky bed, nextPlaces={N=well house, W=valley}]
//        valley:Location[description=in a forest valley beside a tumbling stream, nextPlaces={N=road, E=stream, W=hill}]
//        lake:Location[description=by an alpine lake surrounded by wildflowers, nextPlaces={W=forest, S=well house}]

        game.play("road");
//          *** You're standing at the end of the road ***
//              From here, you ca see:
//              - A forest to the North (N)
//              - A well house to the East (E)
//              - A hill to the West (W)
//              - A valley to the South (S)
//          Select your Compass (Q to quit) >>

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String direction = scanner.nextLine().trim().toUpperCase().substring(0, 1);
            if (direction.equals("Q")) break;
            game.move(direction);
        }
    }
}
