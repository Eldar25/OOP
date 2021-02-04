package com.company;

public class Rock extends Piece {
    private String p1;
    private String p2;
    private String R = "R";
    public Rock(){

    }

    public boolean isLegalMove(String p1 , String p2){
        if(Board.isL(p2)== true) {
            return true;
        }else if(Board.isL(p2) == false){
            return false;
        }
        return true;
    }

}
