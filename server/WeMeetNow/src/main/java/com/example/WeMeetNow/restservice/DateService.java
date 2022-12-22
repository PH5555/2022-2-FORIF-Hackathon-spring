package com.example.WeMeetNow.restservice;

import com.example.WeMeetNow.Repository.AvailableDateRepository;
import com.example.WeMeetNow.Repository.RoomRepository;
import com.example.WeMeetNow.Repository.UserRepository;
import com.example.WeMeetNow.Repository.UserRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

        // 만약 찾았다면 rId를, 못찾았다면 false를 return한다.
        try {
            System.out.format("enterRoom -> findOneRIdByName이 성공했습니다.");
            return findOneRIdByName(roomName);

        } catch (Exception e){
            System.out.println("enterRoom -> findOneRIdByName이 실패했습니다.");
            return false;
        }

    }

    // username을 받아서 User를 생성한다.
    public void createUser(
        String username
    ) {
        UserRepository.save(username);
        return;
    }

    // 각 User의 Available Date들을 캘린더에 띄워준다.
    public HashMap<Integer, List<String>> loadAvailableDate(
        String roomName
    ) {

        // roomName 에 해당하는 모든 (날짜, 유저이름) 쌍을 리턴. 없으면 null
        // [날짜 : "kim"]
        HashMap<Integer, String> pairs = AvailableDateRepository.findManyPairByRoomName(roomName);

        // 날짜 : ["kim", "lee"] 형태로 만든다. -> sortedPairs에 저장한다. 
        HashMap<Integer, List<String>> sortedPairs;

        // 아래 for loop를 위해 date, username를 생성
        Integer date;
        String username;

        for (HashMap<Integer, String> pair : pairs) {
            // 각 pair의 key와 value를 가져오기
            pair.forEach((key, value) -> {
                Integer date = key;
                String username = value;
            });

            // if 이미 그 날짜가 sortedPairs에 key로 존재하면, value에 username을 추가
            if (sortedPairs.containsKey(date)) {
                sortedPairs.put(date, sortedPairs.get(date).add(value));

            } else {
                // else 만약 그 날짜가 sortedPairs에 key로 존재하지 않는, 즉 새로운 날짜면, date:username으로 저장.
                sortedPairs.put(date, username);
            }

        }

        HashMap<Integer, List<String>> date_username = new HashMap<Integer, List<String>>;

        // 날짜 : ["kim", "lee"]
        return date_username;
    }


    // 특정한 Room에서 각자의 가능한 Date들 중 가장 빠른 것을 찾는다.
    public HashMap<Integer, ArrayList<String>> calculateAvailableDate(
            //
            String roomName
    ) {
        HashMap<Integer, ArrayList<String>> AvailableDate = null;

        AvailableDateRepository.save(int rId, int uId, int date);

        return AvailableDate;
    }


    // 특정 User가 특정 Room에서 이미 기록한 Date들이 있으면, 그 먼저 있던 Date들을 삭제한다.
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
