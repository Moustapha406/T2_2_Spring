package sn.tp_2.com.domain;

import javax.persistence.*;

@Entity
@Table(name = "articles")
public class Articles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Reference", length = 50)
    private String reference;

    @Column(name = "Designation", length = 100)
    private String designation;

    @Column(name = "Description", length = 255)
    private String description;

    @Column(name = "prix")
    private double prix;
}
