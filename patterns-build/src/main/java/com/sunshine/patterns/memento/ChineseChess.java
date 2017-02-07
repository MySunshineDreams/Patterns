package com.sunshine.patterns.memento;

import java.util.Stack;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/30.
 * 备忘录模式——原发器
 */
public class ChineseChess {
    private String piece;
    private Integer x;
    private Integer y;

    public ChineseChess(String piece, Integer x, Integer y) {
        this.piece = piece;
        this.x = x;
        this.y = y;
    }

    public String getPiece() {
        return piece;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Memento move() {
        return new Memento(this.piece, this.x, this.y);
    }

    public void undo(Memento memento) {
        this.piece = memento.getPiece();
        this.x = memento.getX();
        this.y = memento.getY();
    }
}
