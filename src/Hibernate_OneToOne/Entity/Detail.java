package Hibernate_OneToOne.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "details")
public class Detail {

@OneToOne(mappedBy = "empDetail", cascade = CascadeType.ALL)
    private Employee employee;

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "city")
    private String city;

    @Column(name = "phone_number")
    private String phonenumber;

    @Column(name = "email")
    private String email;

    public Detail(String city, String phonenumber, String email) {
        this.city = city;
        this.phonenumber = phonenumber;
        this.email = email;
    }

    public Detail() {
    }

    @Override
    public String toString() {
        return "Detail{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getEmail() {
        return email;
    }
}
