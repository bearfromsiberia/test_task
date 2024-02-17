package Hotel_System.test_project.Repositories;

import Hotel_System.test_project.Models.Guests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuestsRepository extends JpaRepository<Guests, Long> {

    public List<Guests> findGuestsByGender(Boolean gender);

}