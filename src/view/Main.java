
package view;

import Controller.ManagerNumber;


public class Main {
    public static void main(String[] args) {
         String td ="Menu";
         String[] mc = {"ptb1","ptb2","exit"};
         ManagerNumber v = new ManagerNumber(td, mc);
         v.run();
    }
}
