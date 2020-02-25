package hevenko.kpaDrava;

import javax.persistence.*;

@Entity
public class Category {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "name")
    String name;

    @Column(name = "description")
    String description;

    Category() {}

    public Category(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
