import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class User
{
    private int id;
    private String email;
    private String password;
    private LocalDate birthDate;
    private String name;
    private String surname;
    private List<DeliveryAddress> deliveryAddresses;

    public User(int id, String email, String password, int birthDay,
                int birthMonth, int birthYear, String name, String surname,DeliveryAddress deliveryAddress)
    {
        this.id=id;
        this.email=email;
        this.password=password;
        this.birthDate=LocalDate.of(birthYear,birthMonth,birthDay);
        this.name=name;
        this.surname=surname;
        this.deliveryAddresses=new ArrayList<>();
        deliveryAddresses.add(deliveryAddress);
    }

    public boolean isAdult(LocalDate localDate)
    {
        return ChronoUnit.YEARS.between(birthDate, LocalDate.now())>=18;
    }

}
