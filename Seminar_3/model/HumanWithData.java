package Seminar_3.model;

public class HumanWithData extends HumanName {

    private String dateOfBirth;
    private long telephoneNumber;
    private char gender;
    private int countParams = 6;

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

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setTelephoneNumber(long telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getCountParams() {
        return countParams;
    }

    public String getsurname() {
        return super.surnameString;
    }
}
