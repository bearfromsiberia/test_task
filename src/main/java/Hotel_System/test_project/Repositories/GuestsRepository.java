package Hotel_System.test_project.Repositories;

import Hotel_System.test_project.Models.Guests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestsRepository extends JpaRepository<Guests, Long> {
}
