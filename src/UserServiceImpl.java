public class UserServiceImpl implements UserService
{
    @Override
    public boolean register(User user)
    {
        return true;
    }

    @Override
    public boolean register(User user, DeliveryAddress deliveryAddress)
    {
        UserDao userDao=new UserDaoMySQL();
        AddressDao addressDao=new AddressDaoImpl();
        boolean correctRegister = user.isAdult();
        if(correctRegister)
        {
            userDao.save(user);
            addressDao.save(deliveryAddress);
            return true;
        }
        else
        {
            System.out.println("You are too young");
            return false;
        }
    }

}
