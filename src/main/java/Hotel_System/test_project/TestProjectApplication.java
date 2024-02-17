package Hotel_System.test_project;

import Hotel_System.test_project.Models.Guests;
import Hotel_System.test_project.Models.Room;
import Hotel_System.test_project.Repositories.GuestsRepository;
import Hotel_System.test_project.Repositories.RoomRepository;
import Hotel_System.test_project.Services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.sql.Date;
@EnableJpaRepositories
@SpringBootApplication
public class TestProjectApplication implements CommandLineRunner {

	@Autowired
	GuestsRepository guestRepository;

	@Autowired
	RoomRepository roomRepository;

	@Autowired
	RoomService roomService;

	public static void main(String[] args) {
		SpringApplication.run(TestProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		Room room = new Room(1,2,3,true,"комфорт",5,
				Date.valueOf("2025-10-20"),Date.valueOf("2025-10-20"));
		roomRepository.save(room);
		roomService.deleteRoom(room);
		roomService.addRoom(new Room(2,4,5,true,"комфорт",5,
				Date.valueOf("2026-10-20"),Date.valueOf("2026-10-20")));
		guestRepository.save(new Guests(1,1,"Ломтев","Илья","Константинович",
				true,Date.valueOf("2025-10-20"),Date.valueOf("2025-10-20")));
		System.out.println(roomService.findAllRoom());
	}

}
