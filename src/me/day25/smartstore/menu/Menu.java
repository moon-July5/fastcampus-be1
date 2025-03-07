package me.day25.smartstore.menu;

import me.day25.smartstore.exception.InputRangeException;
import me.day25.smartstore.util.Message;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    /////////////////////////////////////////
    ////////////// singleton ////////////////
    private static Menu menu;

    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }
    /////////////////////////////////////////
    /////////////////////////////////////////


    protected Scanner scanner = new Scanner(System.in);

    public int dispMenu(String[] menus) {
        while (true) {
            try {
                System.out.println("\n==============================");
                for (int i = 0; i < menus.length; i++) {
                    System.out.printf(" %d. %s\n", i + 1, menus[i]);
                }
                System.out.println("==============================");
                System.out.print("Choose One: ");
                int choice = Integer.parseInt(scanner.next());
                if (choice >= 1 && choice <= menus.length) {
                    return choice;
                }
                throw new InputRangeException();
            } catch (NumberFormatException e) {
                System.out.println(Message.ERR_MSG_INVALID_INPUT_FORMAT);
            } catch (InputRangeException e) {
                System.out.println(Message.ERR_MSG_INVALID_INPUT_RANGE);
            }

        }
    }


//    public int dispMainMenu() {
//        while (true) {
//            try {
//                System.out.println();
//                System.out.println("==============================");
//                System.out.println(" 1. Parameter");
//                System.out.println(" 2. Customer Data");
//                System.out.println(" 3. Classification Summary");
//                System.out.println(" 4. Quit");
//                System.out.println("==============================");
//                System.out.print("Choose One: ");
//                int choice = Integer.parseInt(scanner.next());
//                if (choice >= 1 && choice <= 4) {
//                    return choice;
//                }
//
//                throw new InputRangeException();
//            } catch (NumberFormatException e) {
//                System.out.println(Message.ERR_MSG_INVALID_INPUT_FORMAT);
//            } catch (InputRangeException e) {
//                System.out.println(Message.ERR_MSG_INVALID_INPUT_RANGE);
//            }
//
//        }
//    }

}
