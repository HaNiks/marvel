package by.han.marvel.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Description {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String director;
    private String genre;
    private String mainHero;
    private int budget;
    private int marketing;
    private int feesWorld;
    private int feesRussia;
    private int feesUSA;
    private String slogan;
}
