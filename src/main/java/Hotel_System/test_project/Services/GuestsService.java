package Hotel_System.test_project.Services;

import Hotel_System.test_project.Models.Guests;
import Hotel_System.test_project.Models.Room;
import Hotel_System.test_project.Repositories.GuestsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestsService {
    @Autowired
    GuestsRepository guestsRepository;

    public List<Guests> findAll(){
        return guestsRepository.findAll();
    }

    public List<Guests> findByGender(Boolean gender){
        return guestsRepository.findGuestsByGender(gender);
    }





}
