import java.time.LocalDate;
import java.util.Locale;
import java.util.Objects;

public class Passport {
    private  String number;
    private  String name;
    private  String surName;
    private LocalDate birthday;

    public Passport(String number, String name, String surName, LocalDate birthday) {
        this.number = number;
        this.name = name;
        this.surName = surName;
        this.birthday = birthday;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(number, passport.number) && Objects.equals(name, passport.name) && Objects.equals(surName, passport.surName) && Objects.equals(birthday, passport.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name, surName, birthday);
    }
}
