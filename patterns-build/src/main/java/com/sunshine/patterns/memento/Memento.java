package com.sunshine.patterns.memento;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/30.
 * 备忘录模式——备忘录
 */
public class Memento {
    private String piece;
    private Integer x;
    private Integer y;

    public Memento(String piece, Integer x, Integer y) {
        this.piece = piece;
        this.x = x;
        this.y = y;
    }

    public String getPiece() {
        return piece;
    }

    public void setPiece(String piece) {
        this.piece = piece;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}
