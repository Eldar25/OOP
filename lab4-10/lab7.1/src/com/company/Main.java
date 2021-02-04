package com.company;

public class Main implements Moveable,Returnable{

	// write your code here
    static int place=0;
    @Override
    public int move() {
        place--;
        return 0;
    }

    @Override
    public int move(int a) {
        place+=a;
        return 0;
    }
        public static void main(String[] args)  {
            Main d = new Main();
            d.move(6);
            d.move();
            d.move();
            d.move();
            d.move();
            System.out.print(place);
        }
    }


