package Objects;

import java.util.Arrays;

public class World {

    char[][] world = new char[15][15];
    int GoblinStartX = (int) Math.floor(Math.random() * (14 - 1) + 1);
    int GoblinStartY = (int) Math.floor(Math.random() * (14 - 1) + 1);
    int HumanStartX = (int) Math.floor(Math.random() * (14 - 1) + 1);
    int HumanStartY = (int) Math.floor(Math.random() * (14 - 1) + 1);
    boolean combat = false;

    public World() {

        for (int i = 0; i < 15; i++) {
            Arrays.fill(world[i], '~');
            world[i][0] = '|';
            world[i][14] = '|';
        }
        for (int h = 0; h < 15; h++) {
            world[0][h] = '-';
            world[14][h] = '-';
        }
        world[GoblinStartX][GoblinStartY] = 'G';
        world[HumanStartX][HumanStartY] = 'P';
        if(world[GoblinStartX][GoblinStartY] == world[HumanStartX][HumanStartY])
        {
            new World();
        }
        DrawTheBoard();
        while (!combat) {
            var NewPos = Movement.Direction(new int[]{HumanStartX, HumanStartY}, Movement.MoveCharacter());
            HumanMove(NewPos[0], NewPos[1]);
        }
    }
    public void HumanMove(int playerX, int playerY) {
        world[HumanStartX][HumanStartY] = '~';
        world[playerX][playerY] = 'P';
        HumanStartX = playerX;
        HumanStartY = playerY;
        if(world[playerX][playerY] == world[GoblinStartX][GoblinStartY])
        {
            combat = true;
            Fighting fight = new Fighting();
            fight.Fighting();
        }
        DrawTheBoard();
    }
    public void DrawTheBoard() {
        for (int x = 0; x < 15; x++) {
            for (int y = 0; y < 15; y++) {
                System.out.print(world[x][y]);
            }
            System.out.println();
        }
    }
}

