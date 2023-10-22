package by.ratkevich.library;

public interface UserService {
    boolean authorisation (String userName, String password, boolean isAdmin);
    boolean registration (String userName, String password, boolean isAdmin);
}
