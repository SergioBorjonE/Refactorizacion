package com.generation;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        petdat();
    }

    public static void petdat(){
        String oper= " ";
        String option="";

        for(int i=1; i<=4; i++){
            if (i==1){
                option="addition";
                oper="+";
            }else if (i==2){
                option="substraction";
                oper="-";
            }else if (i==3){
                option="multiplication";
                oper="*";
            } else{
                option="division";
                oper="/";
            }
            Scanner console = new Scanner( System.in);
            System.out.print("Enter " + option + " number 1  ");
            int num1 = console.nextInt();
            System.out.print("Enter "+option+" number 2  ");
            int num2 = console.nextInt();
            System.out.println( num1+oper+num2+" = " +funcion(option,num1,num2));
        }
    }

    public static float funcion(String option,int num1,int  num2){
        if (option.equals("addition")) {
            return num1 + num2;
        }else if(option.equals("substraction")){
            return num1-num2;
        }else if(option.equals("multiplication")) {
            return num1 * num2;
        }else{
            return (float) num1/num2;
        }

    }

}


