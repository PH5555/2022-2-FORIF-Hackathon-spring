package com.example.WeMeetNow.Repository;

import java.util.List;

public interface UserRoomRepository {
    // 각각 id 받아서 유저가 방에 들어감, 실패 시 false
    public boolean save(int uId, int rId);

    // 유저 아이디로 여러 방 아이디를 검색
    List<Integer> findManyByRId(int rId);

    // 방 아이디로 여러 유저 아이디를 검색
    List<Integer> findManyByUId(int uId);
}
