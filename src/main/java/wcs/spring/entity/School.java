package wcs.spring.entity;

public class School {

    // déclaration de variables d'instance
    private Long id;
    private String name;
    private Long capacity;
    private String country;

    // constructeur sans paramètre

    public School() {
    }

    // méthodes getter et setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}