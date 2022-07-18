package oop.inheritance.example;

public class Hero extends Player{

    public Hero(int x, int y) {
        super(x, y);
    }

    //Method overriding, just as example, of course it's not the best way to implement this
    public boolean attack(Player enemy) {
        int deltaX = Math.abs(this.x - enemy.x);
        int deltaY = Math.abs(this.y - enemy.y);

        if((deltaX == 0 || deltaX == 1) && (deltaY == 0 || deltaY == 1)) {
            enemy.hp -= 20;
            return true;
        }
        return false;
    }
}
