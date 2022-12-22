package com.example.WeMeetNow.Repository;

import java.util.List;

public interface UserRepository {
    // 성공적으로 저장하면 true, 아니면 false 반환
    public boolean save(String roomName);

    // 이름으로 유저 id를 유일하게 검색, 없다면 null
    public Integer findOneUIdByName(String name);

    // id로 유저 이름을 유일하게 검색, 없다면 null
    public String findOneUsernameById(int id);

    // id 리스트로, 그것에 속하는 name 을 리턴, 없다면 null
    public List<String> findManyByUIdList(List<Integer> l);
}