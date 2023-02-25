package ku.menu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

import java.util.UUID;

@Data
@ToString
@Entity
public class Menu {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private double price;
    private String category;
}
