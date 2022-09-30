package LIST;

import java.util.Scanner;

/**
 *  Laboratory work 1
 *  <p>
 *  the program creates a container class based on a singly linked list
 * @author Julia Zyrianova
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        List list;
        list= new List();
        int choice;
        boolean var = true;
        String order;
        Scanner sc= new Scanner(System.in);
        System.out.println("menu");
        System.out.println("0. Exit From menu ");
        System.out.println("1. add To Head ");
        System.out.println("2. delete From Head ");
        System.out.println("3. add To Tail ");
        System.out.println("4. delete From Tail ");
        System.out.println("5. find elem in the list ");
        System.out.println("6. Print List ");
        System.out.println(" Enter choice (0-6) ");

        do {
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(" Enter number ");
                    int n = sc.nextInt();
                    list.addToHead(n);
                    list.print();
                    System.out.println("________________");
                    break;
                case 2:
                    list.deleteFromHead();
                    list.print();
                    System.out.println("________________");
                    break;
                case 3:
                    System.out.println(" Enter number ");
                    int k = sc.nextInt();
                    list.addToEnd(k);
                    list.print();
                    System.out.println("________________");
                    break;
                case 4:
                    list.deleteFromEnd();
                    list.print();
                    System.out.println("________________");
                    break;
                case 5:
                    System.out.println(" Enter number which you want to find ");
                    int k1 = sc.nextInt();
                    int f=list.find_elem(k1);
                    if(f==-1)
                        System.out.println("No elem in the list");
                    else
                        System.out.println("Elem located on the "+ f + " position");
                    System.out.println("________________");
                    break;
                case 6:
                    list.print();
                    System.out.println("________________");
                    break;
                default:
                    order = "not in menu";
            }
            if (choice == 0)
                var = false;
        } while (var);

    }
}
