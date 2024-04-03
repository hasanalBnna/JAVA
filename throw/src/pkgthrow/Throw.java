package pkgthrow;

import java.util.*;

class Throw {

    public static void main(String args[]) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("entr an age:");
            int i = sc.nextInt();

            if (i < 18) {
                throw new ArithmeticException("\nnot valid");
            } else {
                System.out.println("wellcom");
            }

        } catch (ArithmeticException e) {
            System.out.println(e);
        }

    }
}
