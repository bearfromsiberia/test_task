package Hotel_System.test_project.Services;

import Hotel_System.test_project.Models.Room;
import Hotel_System.test_project.Repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RoomService {

    @Autowired
    RoomRepository roomRepository;

    public ArrayList<Room> findAllRoom(){
        return (ArrayList<Room>) roomRepository.findAll();
    }

    public ArrayList<Room> findByTypeOfRoom(Boolean type){
        return (ArrayList<Room>) roomRepository.findRoomByTypeofroom(type);
    }
}
