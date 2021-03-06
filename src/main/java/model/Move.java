package model;

import java.io.Serializable;

public class Move implements Serializable {
    public static final long serialVersionUID = 1L;
    private int x;
    private int y;
    private int player;

    public Move(int x, int y, int player){
        this.x = x;
        this.y = y;
        this.player = player;
    }

    public Move(){

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getPlayer() {
        return player;
    }

    public void setPlayer(int player) {
        this.player = player;
    }
}
