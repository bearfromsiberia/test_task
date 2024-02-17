package Hotel_System.test_project.Models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "room")
@Data
public class Room {
    @Id
    long id;

    @Column
    int floor;

    @Column
    int room_num;

    @Column
    boolean typeofroom;

    @Column
    String typeofcomfort;

    @Column
    int space;

    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Date dateofcreating;

    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Date dateofupdating;

    @OneToMany(mappedBy = "roomid",fetch=FetchType.EAGER)
    Set<Guests> guests;

    public Room() {

    }

    public Room(int id, int floor, int room_num, boolean type_of_room, String type_of_comfort,
                int space, Date date_of_creating, Date date_of_updating) {
        this.id = id;
        this.floor = floor;
        this.room_num = room_num;
        this.typeofroom = type_of_room;
        this.typeofcomfort = type_of_comfort;
        this.space = space;
        this.dateofcreating = date_of_creating;
        this.dateofupdating = date_of_updating;
    }
}
