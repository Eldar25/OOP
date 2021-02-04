package com.company;

public abstract class Piece {
    private String pos_a,pos_b;
    public Piece(){}
    public Piece(String a , String b){

    }
   abstract public boolean isLegalMove(String p1 , String p2);
}
