package Hotel_System.test_project.Models;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "guests")
@Data
public class Guests {

    @Id
    int id;

    @Column
    int roomid;

    @Column
    String surname;

    @Column
    String name;

    @Column
    String fathername;

    @Column
    boolean gender;

    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Date dateofarriving;

    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Date dateofupdating;


    public Guests() {
    }

    public Guests(int id, int room_id, String surname, String name, String father_name, boolean gender, Date date_of_arriving, Date date_of_updating) {
        this.id = id;
        this.roomid = room_id;
        this.surname = surname;
        this.name = name;
        this.fathername = father_name;
        this.gender = gender;
        this.dateofarriving = date_of_arriving;
        this.dateofupdating = date_of_updating;
    }
}
