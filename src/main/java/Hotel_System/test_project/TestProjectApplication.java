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
public class TestProjectApplication {

	@Autowired
	GuestsRepository guestRepository;

	@Autowired
	RoomRepository roomRepository;

	@Autowired
	RoomService roomService;

	public static void main(String[] args) {
		SpringApplication.run(TestProjectApplication.class, args);
	}

}
