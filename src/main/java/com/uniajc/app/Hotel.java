package com.uniajc.app;

import com.uniajc.interfaces.States;
import com.uniajc.models.Room;
import java.util.Scanner;

public class Hotel {

    public static void main(String[] args){
        System.out.println("Hotel app");
        States room = new Room("cuarto 101", false);

        Scanner scanner = new Scanner(System.in);
        char option;
        String optionsMessage = "Realizar acción: " +
                "a) ver estado del cuarto, b) check-in, c) check-out d) salir";
        boolean running = true;

        while(running){
            System.out.println(optionsMessage);
            option = scanner.next().charAt(0);
            switch (option){
                case 'a': room.viewState(); break;
                case 'b': room.checkIn(); break;
                case 'c': room.checkOut(); break;
                case 'd': running=false; break;
                default: System.err.println("Opcion no valida "); break;
            }
        }
    }
}