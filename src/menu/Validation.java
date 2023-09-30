
package menu;

import java.util.Scanner;

public class Validation {

    private final static Scanner sc = new Scanner(System.in);

    public int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int check = Integer.parseInt(sc.nextLine().trim());
                if (check < min || check > max) {
                    throw new Exception();
                } else {
                    return check;
                }
            } catch (Exception e) {
                System.out.println("Please input number in range [" + min + ", " + max + "]!");
                System.out.println("Enter again: ");
            }
        }
    }

    public String checkInputString(String mess) {
        System.out.println(mess);
        while (true) {
            String string = sc.nextLine().trim();
            if (string.isEmpty()) {
                System.out.println("Not allowed empty!");
                System.out.println("Enter again: ");
            } else {
                return string;
            }
        }
    }

    public int checkInt(String mess) {
        System.out.println(mess);
        return sc.nextInt();
    }

    public Double checkInputDouble(String mess) {
        System.out.println(mess);
        return sc.nextDouble();
    }

    public boolean checkInputYesNo() {
        while (true) {
            String result = checkInputString("Do you want to continue (Y/N)? Choose Y to continue, N to return main screen ");
            if (result.equalsIgnoreCase("Y")) {
                return true;
            } else if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.out.println("Please input y/Y or n/N.");
            System.out.println("Enter again: ");
        }
    }
// viết chương trình nhập vào chương trình một số hợp lệ 

    public double checkNumber(String mess) {
        System.out.println(mess);
        double a = 0;
        Boolean check = false;
        while (!check) {
            try {
                
                a = sc.nextDouble();
                check=true;
            } catch (Exception e) {
                System.out.println(" number khong hop le , vui long  nhap lai");
                sc.nextLine();
            }
        }
        return a;
    }
    public void even(double x){
        if(x%2==0){
            System.out.println("so chan "+x);
        }
        else {
            System.out.println("so le:"+x);
        }
        for(int i=1;i<x;i++){
            if(x==Math.pow(i, 2))
                System.out.println("so chinh phuong"+x);
        }
        
    }
}
