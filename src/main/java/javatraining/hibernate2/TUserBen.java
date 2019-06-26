package javatraining.hibernate2;

/**
 * Created by cq86zod on 25/06/2019.
 */
class TUserBen {

    private Integer id;

    private String firstName;

    private String lastName;

    TUserBen() {

    }

    public TUserBen(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Getters and setters are omitted for brevity
}
