package Hotel_System.test_project.Services;

import Hotel_System.test_project.Models.Guests;
import Hotel_System.test_project.Models.Room;
import Hotel_System.test_project.Repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class RoomService {

    @Autowired
    RoomRepository roomRepository;

    public List<Room> findAllRoom(){
        return roomRepository.findAll();
    }

    public List<Room> findByTypeOfRoom(Boolean type){
        return roomRepository.findRoomByTypeofroom(type);
    }

    public List<Room> findAvailable(){
        return roomRepository.findAll().stream().
                filter(room -> room.getGuests().size() < room.getRoom_num()).collect(Collectors.toList());
    }

    public List<Room> findByTypeOfComfort(String typeofcomfort){
        return roomRepository.findRoomByTypeofcomfortIgnoreCase(typeofcomfort);
    }

    public Set<Guests> findGuestsByRoom(long id){
        if (roomRepository.findById(id).isPresent())
            return roomRepository.findById(id).get().getGuests();
        return null;
    }

    public Set<Guests> findGuestsByTypeOfComfort(String typeofcomfort){
        Set<Guests> guests = new HashSet<>();
        roomRepository.findRoomByTypeofcomfortIgnoreCase(typeofcomfort).stream().
                forEach(room -> guests.addAll(room.getGuests()));
        return guests;
    }

    public void addRoom(Room room){
        roomRepository.save(room);
    }

    public void deleteRoom(Room room){
        try{roomRepository.delete(room);}
        catch (Exception ex){
            System.out.println("В комнате кто-то есть");
        }
    }
}
