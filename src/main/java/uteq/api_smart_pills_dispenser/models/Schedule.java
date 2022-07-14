package uteq.api_smart_pills_dispenser.models;

import javax.persistence.*;

@Entity
@Table(name = "schedule")
public class Schedule {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
	
	@Column(name = "quantity")
    private int quantity;
	
	@Column(name = "state")
    private boolean state;
	
	@Column(name="description")
    private String description;
	
	@ManyToOne
    @JoinColumn(name = "id_patient")
    private Patient patient;
	
	@ManyToOne
    @JoinColumn(name = "id_pill")
    private Pill pill;
}
