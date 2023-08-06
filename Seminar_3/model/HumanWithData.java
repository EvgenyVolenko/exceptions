package Seminar_3.model;

public class HumanWithData extends HumanName {

    private String dateOfBirth;
    private long telephoneNumber;
    private char gender;

    public HumanWithData(String surnameString, String nameString, String patronymicString, String dateOfBirth,
            long telephoneNumber, char gender) {
        super(surnameString, nameString, patronymicString);
        this.dateOfBirth = dateOfBirth;
        this.telephoneNumber = telephoneNumber;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return super.toString() + " " + dateOfBirth + " " + telephoneNumber + " " + gender;
    }
}
