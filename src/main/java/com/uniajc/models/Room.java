package com.uniajc.models;

import com.uniajc.interfaces.States;

import java.util.Arrays;
import java.util.List;

public class Room implements States {
    private String _number_room;
    private boolean _state;

    public Room(String number_room, boolean state){
        this._number_room = number_room;
        this._state = state;
    }

    @Override
    public void checkOut() {
        List<String> message = Arrays.asList("telefono: desactivado", "temperatura: estandar", "electricidad: desconectada");
        this._state = false;
        message.stream().forEach(System.out::println);
    }

    @Override
    public void checkIn() {
        List<String> message = Arrays.asList("telefono: activado", "temperatura: 21º", "electricidad: conectada");
        this._state = true;
        message.stream().forEach(System.out::println);
    }

    @Override
    public void viewState() {
        StringBuilder message = new StringBuilder();
        if(this._state){
            message.append(this._number_room).append(" state: ").append("ON");
        } else {
            message.append(this._number_room).append(" state: ").append("OFF");
        }
        System.out.println(message.toString());
    }
}