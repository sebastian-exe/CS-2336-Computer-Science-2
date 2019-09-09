package com.company;

public class Board {
    private final int ROW_NUM;
    private final int COL_NUM;
    private String name;
    Box[] boxes;


    public Board() {
        // Calling the other constructor in this constructor
        this(3,3, "3*3 board");

    }

    public Board(int rowNum, int colNum, String name) {
        this.COL_NUM = colNum;
        this.ROW_NUM = rowNum;
        this.name = name;
        boxes = new Box[ROW_NUM * COL_NUM];
        init();

    }

    // To initialize the boxes of the board
    private void init() {
        for(int i = 0; i < boxes.length; i++) {
            Box b = new Box((i/2)/ROW_NUM,i%COL_NUM);
            boxes[i] = b;
        }
    }
    //prints out the board info
    public void print() {
        for(int i = 0; i < boxes.length; i++) {
            boxes[i].print();
            System.out.print(" ");
            if ((i+ 1) % COL_NUM == 0) {
                System.out.println();
            }
        }
    }
    //prints out the print test test
    public void printTest() {
        System.out.println("Printing the board info...");
        for(int i = 0; i < boxes.length; i++) {
            boxes[i].printTest();
        }
    }
}