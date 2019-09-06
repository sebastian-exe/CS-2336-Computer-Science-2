package com.company;

public class Box {
    //these are the data type declarations
    private int row;
    private int col;
    private String placeholder = "-";

    public Box(int rowNum, int colNum) {
        this.row = rowNum;
        this.col = colNum;
    }

    void printTest() {
        System.out.println("row:" + row + " " + "col:" + col + " placeholder:" + placeholder);
    }

    void print() {
        System.out.print(placeholder);
    }


}

