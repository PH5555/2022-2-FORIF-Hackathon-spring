package com.example.WeMeetNow.restservice;

import com.example.WeMeetNow.Repository.RoomRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
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
        RoomRepository.save(roomName);
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

        // 그 유저가 그 방에서 참석 가능한 날들(Integer)의 리스트
        ArrayList<Integer> availableDate
    ) {


        dateService.deletePreviousDates(roomName, username, availableDate);

        return;

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

    @GetMapping("/calculateAvailableDate")
    public Map<Integer, ArrayList<String>> calculateAvailableDate(
            @RequestParam(value = "roomName")
            String roomName
    ) {
        return dateService.calculateAvailableDate(roomName);
    }

}
