package com.SpringBoot_ThaiNguyenBaoLuan.service.serviceImpl;

import com.SpringBoot_ThaiNguyenBaoLuan.model.Room;
import com.SpringBoot_ThaiNguyenBaoLuan.repository.RoomRepository;
import com.SpringBoot_ThaiNguyenBaoLuan.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl  implements RoomService {

    @Autowired
    private RoomRepository roomRepository;

    @Override
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    @Override
    public Room getRoomById(Long id) {
        return roomRepository.findById(id).orElse(null);
    }

    @Override
    public Room createRoom(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public void deleteRoom(Long id) {
        roomRepository.deleteById(id);
    }
}
