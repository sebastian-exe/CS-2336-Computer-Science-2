package com.company;
//Sebastian Moreno, SXS130107, CS2336.006
//this is the driver for the main program.
public class Driver {

    public static void main(String[] args) {
        //prints out the board info
        Board board1 = new Board();
        board1.print();

        Board board2 = new Board(2, 4, "2*4 board");
        board2.printTest();

    }

}



