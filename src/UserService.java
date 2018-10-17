public interface UserService
{
    boolean register(User user);

    boolean register(User user,DeliveryAddress deliveryAddress);
}
