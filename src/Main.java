import java.util.Scanner;

public class Main
{
    private static int id = 1;
    private static User user;
    private static DeliveryAddress deliveryAddress;

    public static void main(String []args)
    {
        user=getUserData();
        UserService userService=new UserServiceImpl();
        if(userService.register(user,deliveryAddress))
        {
            System.out.println("Successful");
            id++;
        }
        else
            System.out.println("Register failed");
    }

    private static User getUserData()
    {
        //Validator class is necessary
        Scanner input = new Scanner(System.in);
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Password: ");
        String pass = input.nextLine();
        System.out.print("Firstname: ");
        String name = input.nextLine();
        System.out.print("Lastname: ");
        String surname = input.nextLine();
        System.out.print("Month of birth: ");
        int birthMonth = input.nextInt();
        System.out.print("Day of birth: ");
        int birthDay = input.nextInt();
        System.out.print("Year of birth: ");
        int birthYear = input.nextInt();
        deliveryAddress=getDeliveryData();
        return new User(id,email,pass,birthDay,birthMonth,birthYear,name,surname,deliveryAddress);
    }

    private static DeliveryAddress getDeliveryData()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Line1: ");
        String line1 = input.nextLine();
        System.out.print("Line2: ");
        String line2 = input.nextLine();
        System.out.print("Zipcode: ");
        String zip = input.nextLine();
        System.out.print("City: ");
        String city = input.nextLine();
        System.out.print("Country: ");
        String country = input.nextLine();
        return new DeliveryAddress(line1,line2,zip,city,country);
    }
}
