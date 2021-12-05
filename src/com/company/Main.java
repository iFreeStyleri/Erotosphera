package com.company;

public class Main {

    public static void main(String[] args) {
        Boolean[] mass = new Boolean[120];

        //Вычисление "Решето Эратосфена"
        for(int i = 0; i < mass.length; ++i){
            if(i % 2 == 0 && i != 2){
                mass[i] = true;
            }
            if(i % 3 == 0 && i != 3){
                mass[i] = true;
            }
            if(i % 5 == 0 && i != 5){
                mass[i] = true;
            }
            if(i % 7 == 0 && i != 7){
                mass[i] = true;
            }
            if(mass[i] == null)
                mass[i] = false;
            printMass(i,mass[i]);
        }

        System.out.println();
        printSolution(mass);
    }

    private static void printMass(Integer index,Boolean detect){

        if(index == 0 || index == 1)
            return;

        if(detect){

            if(index % 10 == 0)
                System.out.println("X");
            else{
                System.out.print("X" + " ");
            }
        }
        else{

            if(index % 10 == 0)
                System.out.println(index);
            else{
                System.out.print(index + " ");
            }
        }
    }
    private static void printSolution(Boolean[] mass){

        System.out.println("Решено!");
        String str = "Все оставшиеся простые числа до 120:\n";

        for(int i = 0; i < mass.length; ++i){
            if(mass[i] == false && i != 1){
                str += " " + i;
            }
        }

        System.out.println(str);
    }
}
