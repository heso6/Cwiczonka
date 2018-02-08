package Klasy.Zad9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<User> userList = new ArrayList<User>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("wpisz liczbę Graczy: ");
        int player = Integer.parseInt(sc.nextLine());

        String name;
        String surname;
        String userName;
        String password;

        for (int i = 1; i <= player; i++) {
            System.out.print("Wpisz name: ");
            name = sc.nextLine();

            System.out.print("Wpisz surname: ");
            surname = sc.nextLine();


            System.out.print("Wpisz userName: ");
            userName = sc.nextLine();


            System.out.print("Wpisz password: ");
            password = sc.nextLine();

            userList.add(new User(name, surname, userName, password));
        }

        System.out.println("Lista graczy: ");
        getAll();

    }

    private static void getAll() {
        for (User allUsers : userList) {
            System.out.println(allUsers);
        }

    }

}
