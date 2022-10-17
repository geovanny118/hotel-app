package com.uniajc.app;

import com.uniajc.interfaces.RoomStatus;
import com.uniajc.models.*;
import java.util.Scanner;

public class Hotel {

    private static RoomStatus _room_101;
    public static void main(String[] args){
        System.out.println("Hotel app");
        _room_101 = new Room("cuarto 101", false);

        Scanner scanner = new Scanner(System.in);
        char option;
        String optionsMessage = "Realizar acción: " +
                "a) ver estado del cuarto, b) check-in, c) check-out d) salir";
        boolean running = true;

        while(running){
            System.out.println(optionsMessage);
            option = scanner.next().charAt(0);
            switch (option){
                case 'a': _room_101.viewState(); break;
                case 'b': _room_101.checkIn(); break;
                case 'c': _room_101.checkOut(); break;
                case 'd': running=false; break;
                default: System.err.println("Opcion no valida "); break;
            }
        }
    }
}