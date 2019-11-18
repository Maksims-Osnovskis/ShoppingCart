package com.company;
import java.util.Scanner;

public class ShoppingCart {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final String[] choice = new String[5];
        int input;


        do {
            System.out.println();
            System.out.println("+----------------------+");
            System.out.println("|       Welcome        |");
            System.out.println("|          to          |");
            System.out.println("|     Shopping Car     |");
            System.out.println("+----------------------+");
            System.out.println("1 - Add Element");
            System.out.println("2 - Remove Element");
            System.out.println("3 - Show All Elements");
            System.out.println("4 - Show Cart Free Space");
            System.out.println("5 - Show Menu");
            System.out.println("6 - Exit Program");
            System.out.println();
            System.out.print("Please select an option: ");
            input = in.nextInt();

            switch (input) {

                case 1:
                    String add = new String();

                    for(int a = 0; a < choice.length; a++) {
                        if(choice[a] != null && a == choice.length - 1){
                            System.out.println("Sorry shopping cart is full!!!");
                            break;
                        }
                        if (choice[a] == null) {
                            System.out.print("ADD item to shopping cart: ");
                            add = in.next();
                            choice[a] = add;
                            System.out.println("Product ** " + add + " ** sucessfully added to shopping cart!");
                            break;
                        }
                    }
                    break;

                case 2:
                    int u = 0;
                    int o = 0;
                    String del = new String();
                    System.out.print("DELETE item from shopping cart: ");
                    del = in.next();

                    for(int a = 0; a < choice.length; a++) {
                        if (del.equals(choice[a])) {
                            choice[a] = null;
                            u++;
                        }
                        o++;
                        if (o == choice.length) {

                            if (u == 1) {
                                System.out.println("1 product succesfully deleted!!!");
                                break;
                            } else if (u > 1){
                                System.out.println(u + " products succesfully deleted!!!");
                            }
                            else{
                                System.out.println("There is no such product in shopping cart!!!");
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("Shopping cart contains following products: ");
                    for (int i = 0; i < choice.length; i++){

                        if (choice[i] == null) {
                            System.out.println((i + 1) + " - -----");
                        } else {
                            System.out.println((i + 1) + " - " + choice[i]);
                        }
                    }
                    break;

                case 4:
                    int p = 0;
                    for (int i = 0; i < choice.length; i++){
                        if (choice[i] == null){
                            p++;
                        }
                    }
                    if (p == 0){
                        System.out.println("Shopping cart is full!!!");
                        break;
                    }
                    else if (p == 1){
                        System.out.println("Shopping cart contains 1 free space!!!");
                        break;
                    }
                    else if (p > 1){
                        System.out.println("Shopping cart contains " + p + " free spaces!!!");
                        break;
                    }
                    break;

                case 5:
                    continue;

            }
        }while (input != 6);

    }
}
