package linkedin;

import java.util.List;
import java.util.Map;

public class LinkedInServices {

    private static LinkedInServices instance;
    Map<String,User> userList;

    public synchronized static LinkedInServices getInstance(){
        if(instance == null){
            instance = new LinkedInServices();
        }
        return instance;
    }

    public void registerUser(User user){
        if(!userList.containsKey(user.getUserId())) {
            userList.put(user.getName(), user);
        }else {
            System.out.println("User name already present please choose another user name.");
        }

    }

    public synchronized boolean login(String userName, String password) {
        if (userList.containsKey(userName)) {
            User loggedInUser = userList.get(userName);
            return loggedInUser.getName() == userName && loggedInUser.getPassword() == password;
        } else {
            System.out.println("User " + userName + " not present. First register then login");
            return false;
        }
    }

    public synchronized void updateProfile(String userName, Profile profile){
        if(userList.containsKey(userName)){
            User user = userList.get(userName);
            user.setProfile(profile);
            userList.put(userName,user);
        }else {
            System.out.println("User not available to update profile.");
        }
    }

    public synchronized void sendConnection(String userName, Connection connection){
        if(userList.containsKey(connection.getUserid())){
            User user = userList.get(userName);
            List<Connection> connectionList = userList.get(userName).getConnectionList();
            connectionList.add(connection);
            user.setConnectionList(connectionList);
            userList.put(userName,user);
        }else {
            System.out.println(" UserId " + connection.getUserid() + " Not available for sent connection.");
        }
    }




}
