package com.company;

public class StarTriangl {
    int width;
    public  StarTriangl(int width){
        this.width = width;
    }
      public String  toString(){
        String s = "[*]";
        for(int i = 0; i < width ;i++){
            for (int j = 0; j < width; j++){
                if(j - i <= 0){
                   //return s;
                    System.out.print(s);
               }
            }
            System.out.println();

        }
         return "";
    }
}
