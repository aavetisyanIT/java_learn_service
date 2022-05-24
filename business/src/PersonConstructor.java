import java.time.LocalDate;

public class PersonConstructor {
    private String fullName;
    private LocalDate birthDay;

    public PersonConstructor(String fullName, LocalDate birthDay) {
        this.fullName = fullName;
        this.birthDay = birthDay;
    }
}
