import java.time.LocalDate;
import java.util.Locale;

public class PersonConstructor {
    private String fullName;
    private LocalDate birthDay;

    public PersonConstructor(String fullName, LocalDate birthDay) {
        this.fullName = fullName;
        this.birthDay = birthDay;
    }

    public String getFullName() {
        return fullName.substring(0, 1).toLowerCase() + fullName.substring(1, fullName.length());
    }

    public void setFullName(String fullName) {

    }

}
