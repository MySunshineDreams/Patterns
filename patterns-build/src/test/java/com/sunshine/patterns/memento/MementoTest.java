package com.sunshine.patterns.memento;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/6/21.
 * 备忘录模式测试
 */
public class MementoTest {
    public static void main(String[] args) {
        Responsibility responsibility = new Responsibility();
        ChineseChess chineseChess = new ChineseChess("炮", 1, 5);
        display(chineseChess);
        responsibility.setMemento(chineseChess.move());
        chineseChess = new ChineseChess("车", 2, 9);
        display(chineseChess);
        responsibility.setMemento(chineseChess.move());
        chineseChess.undo(responsibility.getMemento());
        display(chineseChess);
    }

    private static void display(ChineseChess chineseChess) {
        System.out.println(String.format("棋子：%s，第%s行，第%s列", chineseChess.getPiece(), chineseChess.getX(), chineseChess.getY()));
    }
}
