package my.p;

import java.util.Scanner;

public class UserInterface {
    private static final Scanner scanner= new Scanner(System.in);

    public static void init (){
        display();
    }

    public static void display() {
        int mainMenuCommand;
        do {
            System.out.println("\n=+=+Welcome to Turtle Paint!=+=+=");
            System.out.println("1) Add Shape");
            System.out.println("2) Save Image");
            System.out.println("0) Exit");
            System.out.print("choice:");
            mainMenuCommand=scanner.nextInt();
            switch (mainMenuCommand){
                case 1:
                    addShape();
                    break;
                case 2:
                    saveImage();
                    break;
                case 0:
                    System.out.println("Exiting Program...");
                    break;
                default:
                    System.out.println("Invalid Entry! Try Again");
            }
        }while(mainMenuCommand!=0);
    }

    private static void addShape() {
        int shapeMenuCommand;
        do{
            System.out.println("\n+++++Which Shape Would You Like To Draw?+++++");
            System.out.println("1) Square");
            System.out.println("2) Circle");
            System.out.println("3) Triangle");
            System.out.println("0) Back to Main Menu");
            System.out.println("Choice:");
            shapeMenuCommand=scanner.nextInt();
            switch (shapeMenuCommand){
                case 1:
                    square();
                    break;
                case 2:
                    circle();
                case 3:
                    triangle();
                    break;
                case 0:
                    System.out.println("Going Back to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid Input! try again");
            }
        }while(shapeMenuCommand!=0);
    }

    private static void square() {
        System.out.println("What is the width of the border?");
        System.out.println("What is the color?");
        System.out.println("What is the location of the shape(x,y)?");

    }

    private static void circle() {
        System.out.println("What is the radius?");
        System.out.println("What is the width of the border?");
        System.out.println("What is the color?");
        System.out.println("What is the location of the shape(x,y)?");
    }

    private static void triangle() {
        System.out.println("What is the width of the border?");
        System.out.println("What is the color?");
        System.out.println("What is the location of the shape(x,y)?");
    }

    private static void saveImage() {
    }
}
