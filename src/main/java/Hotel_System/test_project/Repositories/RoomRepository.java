package Hotel_System.test_project.Repositories;

import Hotel_System.test_project.Models.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room,Long> {

    public List<Room> findRoomByTypeofroom(Boolean type_of_room);
}
