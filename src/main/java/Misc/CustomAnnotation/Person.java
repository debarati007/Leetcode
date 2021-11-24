package Misc.CustomAnnotation;

@JsonSerializable
public class Person {
    private String firstName;
    private String lastName;
    @JsonElement(key = "personAge")
    private String personAge;

    public Person(String firstName, String lastName, String age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personAge = age;
    }

    @Init
    private void initNames() {
        this.firstName = this.firstName.substring(0, 1).toUpperCase()
                + this.firstName.substring(1);
        this.lastName = this.lastName.substring(0, 1).toUpperCase()
                + this.lastName.substring(1);
    }

}
