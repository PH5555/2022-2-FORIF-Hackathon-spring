package com.example.WeMeetNow.Repository;

import java.util.HashMap;
import java.util.List;

public interface AvailableDateRepository {
    // 하나의 일정(하나의 날짜)를 저장, 성공 시 true 아니면 false.
    public boolean save(int rId, int uId, int date);

    // rId 와 uId 로 여러 date 를 조회한다. 없으면 null
    public List<Integer> findManyDateByRIdAndUId(Integer rId, Integer uId);

    // rId 와 uId 로 해당되는 모든 행 삭제
    public boolean deleteByRIdAndUId(Integer rId, Integer uId);

    // roomName 에 해당하는 모든 (날짜, 유저이름) 쌍을 리턴. 없으면 null
    public List<HashMap<Integer, String>> findManyPairByRoomName(String roomName);

    // rId에 해당하는 (uId, date) 쌍을 전부 가져온다. 없으면 null
    public List<HashMap<Integer, Integer>> findManyPairByRId(Integer rId);
}