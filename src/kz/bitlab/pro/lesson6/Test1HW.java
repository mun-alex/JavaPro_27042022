package kz.bitlab.pro.lesson6;

public class Test1HW {
    public static void main(String[] args) {
        Users user1 = new Users("John", "Smith");
        Users user2 = new Users("Sarah", "Connor");
        Users user3 = new Users("Harry", "Potter");
        Users user4 = new Users("Christiano", "Ronaldo");
        Users user5 = new Users("Kolobok", "Baursakov");

        Users[] users = new Users[]{
                user1,
                user2,
                user3,
                user4,
                user5
        };

        UsersBeanImp usersBeanImp = new UsersBeanImp(users);
        usersBeanImp.getUsersByName("Kolobok");
    }
}

class Users {
    private String name;
    private String surname;

    public Users() {
    }

    public Users(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

interface UserBean {
    void getAllUsers();
    void getUsersByName(String name);
    void getUsersBySurname(String surname);
}

class UsersBeanImp implements UserBean {
    private Users[] users;

    public UsersBeanImp() {
    }

    public UsersBeanImp(Users[] users) {
        this.users = users;
    }

    public Users[] getUsers() {
        return users;
    }

    public void setUsers(Users[] users) {
        this.users = users;
    }


    @Override
    public void getAllUsers() {
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].toString());
        }
    }

    @Override
    public void getUsersByName(String name) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getName().equals(name))
                System.out.println(users[i].toString());
        }
    }

    @Override
    public void getUsersBySurname(String surname) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getSurname().equals(surname))
                System.out.println(users[i].toString());
        }
    }
}
