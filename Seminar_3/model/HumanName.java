package Seminar_3.model;

public abstract class HumanName {

    protected String surnameString;
    protected String nameString;
    protected String patronymicString;

    public HumanName(String surnameString, String nameString, String patronymicString) {
        this.surnameString = surnameString;
        this.nameString = nameString;
        this.patronymicString = patronymicString;
    }

    @Override
    public String toString() {
        return surnameString + " " + nameString + " " + patronymicString;
    }
}
