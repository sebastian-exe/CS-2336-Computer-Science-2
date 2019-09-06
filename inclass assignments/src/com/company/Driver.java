package com.company;

//this is the driver for the main program.
public class Driver {

    public static void main(String[] args) {
        //
        Board board1 = new Board();
        board1.print();

        Board board2 = new Board(2, 4, "2*4 board");
        board2.printTest();

    }

}



