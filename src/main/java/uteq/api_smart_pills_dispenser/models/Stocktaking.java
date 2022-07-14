package uteq.api_smart_pills_dispenser.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "stocktaking")

public class Stocktaking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name ="id_patient")
    private  Patient id_patient;

    @ManyToOne
    @JoinColumn(name = "id_carer")
    private  Carer id_carer;

    @Column(name = "date")
    private Date date;
}
