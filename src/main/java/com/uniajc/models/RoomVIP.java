package com.uniajc.models;

import com.uniajc.interfaces.RoomStatus;

import java.util.Arrays;
import java.util.List;

public class RoomVIP implements RoomStatus {
    private String _number_room;
    private boolean _state;

    public RoomVIP(String number_room, boolean state){
        this._number_room = number_room;
        this._state = state;
    }

    @Override
    public void checkOut() {
        if(this._state) {
            List<String> message = Arrays.asList("telefono: desactivado", "temperatura: estandar", "electricidad: desconectada", "5G: desactivado");
            this._state = false;
            message.stream().forEach(System.out::println);
        } else {
            this.viewState();
        }
    }

    @Override
    public void checkIn() {
        if(!_state){
            List<String> message = Arrays.asList("telefono: activado", "temperatura: 21º", "electricidad: conectada", "5G: activado");
            this._state = true;
            this.viewState();
            message.stream().forEach(System.out::println);
        } else {
            this.viewState();
        }

    }

    @Override
    public void viewState() {
        StringBuilder message = new StringBuilder();
        if(this._state){
            message.append(this._number_room).append(" state: ").append("CHECK-IN");
        } else {
            message.append(this._number_room).append(" state: ").append("CHECK-OUT");
        }
        System.out.println(message.toString());
    }
}