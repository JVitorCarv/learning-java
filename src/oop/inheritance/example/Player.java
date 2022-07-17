package oop.inheritance.example;

public class Player {
    int x;
    int y;
    int hp = 100;

    boolean attack(Player enemy) {
        int deltaX = Math.abs(this.x - enemy.x);
        int deltaY = Math.abs(this.y - enemy.y);

        if((deltaX == 0 || deltaX == 1) && (deltaY == 0 || deltaY == 1)) {
            enemy.hp -= 10;
            return true;
        }
        return false;
    }

    boolean walk(Direction direction) {
        switch (direction) {
            case NORTH:
                y--;
                break;
            case EAST:
                x++;
                break;
            case SOUTH:
                y++;
                break;
            case WEST:
                x--;
                break;
        }
        return true;
    }
}
