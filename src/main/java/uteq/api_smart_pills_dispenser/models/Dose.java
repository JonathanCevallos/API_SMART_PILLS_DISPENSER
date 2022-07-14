package uteq.api_smart_pills_dispenser.models;

import java.sql.Time;
import javax.persistence.*;

@Entity
@Table(name = "dose")
public class Dose {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
	
	@Column(name = "hour")
    private Time hour;
	
	@Column(name = "state")
    private boolean state;
	
	@ManyToOne
    @JoinColumn(name = "id_schedule")
    private Schedule schedule;
}
