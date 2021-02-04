package com.company;

public class King extends Piece {
    private String p1;
    private String p2;
    private String K = "K";
    public King(String p1,String p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    public boolean isLegalMove(String p1 , String p2){
        return Board.isL(p2);
    }
}
