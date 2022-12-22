package com.example.WeMeetNow.restservice;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class DateService {

    public Boolean enterRoom(String roomName, String username) {

        Boolean result = findOneRoom(roomName);

        if (result) {
            insertOneRoom(roomName, username);
        }

        return result;
    }

    public Map<String, String> loadAvailableDate() {
        Map<String, String> date_username = new Map<Integer, String>;

        return date_username;
    }
}
