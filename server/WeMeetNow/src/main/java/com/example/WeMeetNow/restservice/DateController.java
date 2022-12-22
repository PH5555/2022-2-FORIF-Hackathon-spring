package com.example.WeMeetNow.restservice;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;

@RestController
public class DateController {
    DateService dateService;

    public void DateController(DateService dateService) {
        this.dateService = dateService;
    }

    @GetMapping("/room")
    public Boolean enterRoom(
            @RequestParam(value = "roomName")
            String roomName,
            @RequestParam(value = "roomName")
            String username
    ) {
        return dateService.enterRoom(roomName, username);
    }

    @PostMapping("/roomCreation")
    public void roomCreation(
            @RequestBody
            String roomName
    ) {
        Room room = new Room(roomName);

        //CREATE Room

        return;
    }

    @PostMapping("userCreation")
    public void userCreation(
            @RequestBody
            String username
    ) {

        //CREATE User
        return;
    }

    @PostMapping("saveAvailableDateOnRoom")
    public void saveAvailableDateOnRoom(
        String roomName,
        String username,
        ArrayList<Integer> availableUsers) {

        //SELECT를 통해서 기존의 같은 roomName, username의 정보가 있으면 True, 없으면 False
            if (SELECT()) {
                //roomName, username를 가진 AVAILABLE_DATE를 모두 삭제

            }

    }

    @GetMapping("/loadAvailableDate")
    public Map<String, String> createRoom(
            @RequestParam(value = "roomName")
            String roomName,
            @RequestParam(value = "userName")
            String userName
    ) {
        return dateService.loadAvailableDate();
    }


}
