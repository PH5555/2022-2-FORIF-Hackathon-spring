package com.example.WeMeetNow.Repository;

import java.util.HashMap;

public interface RoomRepository {
    // 성공적으로 저장하면 true, 아니면 false 반환
    public boolean save(String roomName);

    // 이름으로 방 id를 유일하게 검색, 없다면 null
    public Integer findOneRIdByName(String name);

    // id로 방 이름을 유일하게 검색, 없다면 null
    public String findOneRoomNameById(int id);
}