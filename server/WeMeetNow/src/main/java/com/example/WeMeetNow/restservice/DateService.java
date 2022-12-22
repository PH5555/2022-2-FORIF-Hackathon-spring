package com.example.WeMeetNow.restservice;

import com.example.WeMeetNow.Repository.AvailableDateRepository;
import com.example.WeMeetNow.Repository.RoomRepository;
import com.example.WeMeetNow.Repository.UserRepository;
import com.example.WeMeetNow.Repository.UserRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class DateService {

    private final AvailableDateRepository adRepo;
    private final RoomRepository rRepo;
    private final UserRepository uRepo;
    private final UserRoomRepository urRepo;

    @Autowired
    public DateService(
            AvailableDateRepository adRepo,
            RoomRepository rRepo,
            UserRepository uRepo,
            UserRoomRepository urRepo) {
        this.adRepo = adRepo;
        this.rRepo = rRepo;
        this.uRepo = uRepo;
        this.urRepo = urRepo;
    }

    public Boolean enterRoom(
            String roomName,
            String username
    ) {
        Boolean result = findOneRoom(roomName);

        if (result) {
            insertOneRoom(roomName, username);
        }

        return result;
    }

    public Map<Integer, String> loadAvailableDate(
        String roomName,
        String username
    ) {
        Map<Integer, String> date_username = new Map<Integer, String>;

        Integer date = null;
        ArrayList<String> presentUsers = null;

        for (user in presentUsers) {

        }
        //SELECT Room:

        return date_username;
    }

    public Map<Integer, ArrayList<String>> calculateAvailableDate(
            String roomName
    ) {

        Map<Integer, ArrayList<String>> AvailableDate = null;

        return AvailableDate;
    }

    public void deletePreviousDates(
            String roomName,
            String username,
            ArrayList<Integer> availableDate) {


        // roomName과 userName을 통해 rId 와 uId를 구한다.
        Integer rId = findOneRIdByName(roomName);
        Integer uId = findOneUIdByName(username);

        // rId 와 uId를 통해 List<date>를 찾는다.  여러 date 를 조회한다. 없으면 null
        List<Integer> dates = findManyDateByRIdAndUId(rId, uId);

        // rId 와 uId 로 해당되는 모든 행 삭제
        public boolean deleteByRIdAndUId(rId, uId);
    }
}
