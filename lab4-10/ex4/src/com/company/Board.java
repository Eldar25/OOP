package com.company;

public class Board {
    public static int cnt = 0 ;
    public static boolean t  = true;
    public static String[][] chessBoard = new String[8][8];
    static String[][] chessBoard2 = new String[8][8];
    public Board(){
    }

    public static void test(){
        if(t == true){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    public static void show(){
        chessBoard[0][0] = "1a";chessBoard[0][1] = "1b";chessBoard[0][2] = "1c";chessBoard[0][3] = "1d";chessBoard[0][4] = "1e";chessBoard[0][5] = "1f";chessBoard[0][6] = "1g";chessBoard[0][7] = "1h";
        chessBoard[1][0] = "2a";chessBoard[1][1] = "2b";chessBoard[1][2] = "2c";chessBoard[1][3] = "2d";chessBoard[1][4] = "2e";chessBoard[1][5] = "2f";chessBoard[1][6] = "2g";chessBoard[1][7] = "2h";
        chessBoard[2][0] = "3a";chessBoard[2][1] = "3b";chessBoard[2][2] = "3c";chessBoard[2][3] = "3d";chessBoard[2][4] = "3e";chessBoard[2][5] = "3f";chessBoard[2][6] = "3g";chessBoard[2][7] = "3h";
        chessBoard[3][0] = "4a";chessBoard[3][1] = "4b";chessBoard[3][2] = "4c";chessBoard[3][3] = "4d";chessBoard[3][4] = "4e";chessBoard[3][5] = "4f";chessBoard[3][6] = "4g";chessBoard[3][7] = "4h";
        chessBoard[4][0] = "5a";chessBoard[4][1] = "5b";chessBoard[4][2] = "5c";chessBoard[4][3] = "5d";chessBoard[4][4] = "5e";chessBoard[4][5] = "5f";chessBoard[4][6] = "5g";chessBoard[4][7] = "5h";
        chessBoard[5][0] = "6a";chessBoard[5][1] = "6b";chessBoard[5][2] = "6c";chessBoard[5][3] = "6d";chessBoard[5][4] = "6e";chessBoard[5][5] = "6f";chessBoard[5][6] = "6g";chessBoard[5][7] = "6h";
        chessBoard[6][0] = "7a";chessBoard[6][1] = "7b";chessBoard[6][2] = "7c";chessBoard[6][3] = "7d";chessBoard[6][4] = "7e";chessBoard[6][5] = "7f";chessBoard[6][6] = "7g";chessBoard[6][7] = "7h";
        chessBoard[7][0] = "8a";chessBoard[7][1] = "8b";chessBoard[7][2] = "8c";chessBoard[7][3] = "8d";chessBoard[7][4] = "8e";chessBoard[7][5] = "8f";chessBoard[7][6] = "8g";chessBoard[7][7] = "8h";


        for(int i = 0 ; i < 8 ; i++){
            for (int j = 0 ; j < 8 ; j++){
                System.out.print(chessBoard[i][j]);
            }
            System.out.println();
        }
        for(int i = 0 ; i < 2; i++){
            System.out.println();
        }
        for(int i = 0 ; i < 8 ; i++){
            for (int j = 0 ; j < 8 ; j++){
                //if(chessBoard2[i][j].equals("")){
                  //  System.out.println("*");
                //}else {
                    System.out.print(chessBoard2[i][j]);
                //}
            }
            System.out.println();
        }

    }

    public static boolean isL(String p2){
        int dI,dJ;
        for(int i = 0 ; i < 8 ; i++){
            cnt++;
            for (int j = 0 ; j < 8 ; j++){
                if(chessBoard2[i][j].equals(p2)){
                    dI = i ;
                    dJ = j;
                }
                }
            }
        for(int i  = 0 ; i < 8 ; i++){
            for (int j = 0 ; j < 8 ; j++){
                if(i == dI && j == dJ){
                }
                System.out.print("*");
            }
        }
        return false;
        }


    }

