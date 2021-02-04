package com.company;


public class Bees implements Runnable{
    @Override
    public void run() {

        int numberofbees = 10;
        double honey = 0;
        for(int i = 0 ;i  < numberofbees ;i++){
            honey += 0.5;
            if(i == numberofbees - 1){
                Bear bear = new Bear(honey);
                bear.run();
            }

        }
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
