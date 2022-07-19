package uteq.api_smart_pills_dispenser.models;

import javax.persistence.*;

@Entity
@Table(name = "pill")
public class Pill {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
	
	@Column(name = "name")
    private String name;
	
	@Column(name="description")
    private String description;
}
