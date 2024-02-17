package Hotel_System.test_project.Controllers;

import Hotel_System.test_project.Models.Guests;
import Hotel_System.test_project.Models.Room;
import Hotel_System.test_project.Services.GuestsService;
import Hotel_System.test_project.Services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController("/")
public class Controller {
    @Autowired
    RoomService roomService;
    @Autowired
    GuestsService guestsService;

    @GetMapping("/rooms")
    public List<Room> getAllRoom(){
        return roomService.findAllRoom();
    }

    @GetMapping("/rooms/gender")
    public List<Room> getRoomsByGender(@RequestBody Boolean gender){
        return roomService.findByTypeOfRoom(gender);
    }

    @GetMapping("/rooms/available")
    public List<Room> getAvailableRooms(){
        return roomService.findAvailable();
    }

    @GetMapping("/rooms/comfort")
    public List<Room> getRoomsByTypeOfComfort(@RequestBody String type){
        return roomService.findByTypeOfComfort(type);
    }

    @GetMapping("/guests")
    public List<Guests> getAllGuests(){
        return guestsService.findAll();
    }

    @GetMapping("/guests/gender")
    public List<Guests> getGuestsByGender(@RequestBody Boolean gender){
        return guestsService.findByGender(gender);
    }

    @GetMapping("/guest/room/{id}")
    public Set<Guests> getGuestsByRoom(@PathVariable Long id){
        return roomService.findGuestsByRoom(id);
    }

    @GetMapping("/guest/comfort")
    public Set<Guests> getGuestsByComfort(@RequestBody String comfort){
        return roomService.findGuestsByTypeOfComfort(comfort);
    }

    @PutMapping("/rooms")
    public void addRoom(@RequestBody Room room){
        roomService.addRoom(room);
    }

    @PutMapping("/guests")
    public void addGuest(@RequestBody Guests guests){
        guestsService.addGuest(guests);
    }

    @PostMapping("/rooms")
    public void updateRoom(@RequestBody Room room){
        roomService.updateRoom(room);
    }

    @PostMapping("/guests")
    public void updateGuests(@RequestBody Guests guests){
        guestsService.updateGuest(guests);
    }

    @DeleteMapping("/rooms")
    public void deleteRoom(@RequestBody Room room){
        roomService.deleteRoom(room);
    }

    @DeleteMapping("/guests")
    public void deleteRoom(@RequestBody Guests guests){
        guestsService.delete(guests);
    }

}