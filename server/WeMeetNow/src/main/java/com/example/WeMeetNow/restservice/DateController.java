package com.example.WeMeetNow.restservice;

import com.example.WeMeetNow.Repository.RoomRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class DateController {
    DateService dateService;

    public void DateController(DateService dateService) {
        this.dateService = dateService;
    }

    // 특정 Room에 들어간다.
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
        DateService.createUser(username);

        return;
    }

    @PostMapping("saveAvailableDateOnRoom")
    public void saveAvailableDateOnRoom(
        String roomName,
        String username,

        // 그 유저가 그 방에서 참석 가능한 날들(Integer)의 리스트
        ArrayList<Integer> availableDate
    ) {

        // 특정 User가 특정 Room에서 이미 기록한 Date들이 있으면, 그 먼저 있던 Date들을 삭제한다.
        dateService.deletePreviousDates(roomName, username, availableDate);

        // 주어진 roomName과 username을 통해 Available한 Date를 저장한다.

        return;
        }
    }

    @GetMapping("/loadAvailableDate")
    public HashMap<String, String> createRoom(
            @RequestParam(value = "roomName")
            String roomName,
            @RequestParam(value = "userName")
            String userName
    ) {
        return dateService.loadAvailableDate();
    }

    @GetMapping("/calculateAvailableDate")
    public HashMap<Integer, ArrayList<String>> calculateAvailableDate(
            @RequestParam(value = "roomName")
            String roomName
    ) {
        return dateService.calculateAvailableDate(roomName);
    }

}
