package switch_case;

import java.util.*;

public class Switch_case {

    public static void main(String[] args) {
        Stack<Float> stk = new Stack<>();
        stk.push(1.1f);
        stk.push(2.1f);
        stk.push(3.1f);
        stk.push(4.1f);
        stk.push(5.1f);
        boolean a = true;
        while (a) {
            System.out.println("enter 1: push a new data");

            System.out.println("enter 2: pop data ");
            System.out.println("enter 3: show all the data");
            System.out.print("enter a number: ");

            int num;

            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.print("push a new data :");
                    Scanner sc1 = new Scanner(System.in);
                    float f1 = sc1.nextFloat();

                    stk.push(f1);
                    System.out.println("total data" + stk);
                    break;
                case 2:
                    System.out.println("pop data :" + stk.peek());
                    stk.pop();
                    System.out.println("show all data after pop:" + stk);
                    break;
                case 3:
                    //stk.pop();
                    System.out.println("show new data:" + stk);
                    break;
                case 4:
                    a = false;
                default:
            }

        }

    }
}
