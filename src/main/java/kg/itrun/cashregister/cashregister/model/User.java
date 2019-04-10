package kg.itrun.cashregister.cashregister.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int id;
    private String name;
    private String address;

}
