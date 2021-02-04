package com.company;

public class Cat extends Animals{
    public Cat(Color color){
        super(color);
    }
    @Override
    public void voise(){
        for(int i = 0 ; i < 2; i++) {
            System.out.print('-');
            System.out.print("Мяу");
        }
    }
    public void move(int dX){
        if(color == Color.White){
            for (int j = 0 ; j < dX; j++) {
                System.out.print(" ");
            }
            System.out.print("(^.^)");
            voise();
        }else{
            for (int j = 0 ; j < dX; j++) {
                System.out.print(" ");
            }
            System.err.print("(^.^)");
            voise();
        }
    }
    public void move(int dX,int dY){
                if (color == Color.White) {
                    for(int i = 0; i < dY ; i++) {
                        System.out.println();
                    }
                    for (int j = 0 ; j < dX; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("(^.^)");
                    voise();
                } else {
                    for(int i = 0; i < dY ; i++) {
                        System.out.println();
                    }
                    for (int j = 0 ; j < dX; j++) {
                        System.out.print(" ");
                    }
                    System.err.print("(^.^)");
                    voise();
                }
    }
}
