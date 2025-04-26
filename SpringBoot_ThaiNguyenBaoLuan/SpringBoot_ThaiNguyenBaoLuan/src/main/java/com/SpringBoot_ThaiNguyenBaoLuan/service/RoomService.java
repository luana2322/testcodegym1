package com.SpringBoot_ThaiNguyenBaoLuan.service;

import com.SpringBoot_ThaiNguyenBaoLuan.model.Room;

import java.util.List;

public interface RoomService {
    List<Room> getAllRooms();
    Room getRoomById(Long id);
    Room createRoom(Room room);
    void deleteRoom(Long id);
}
