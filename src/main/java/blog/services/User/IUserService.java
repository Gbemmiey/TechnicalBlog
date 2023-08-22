package blog.services.User;


import blog.model.User;

public interface IUserService {
    boolean authenticate(String username, String password);
    boolean registerNewUser(User user);
}
