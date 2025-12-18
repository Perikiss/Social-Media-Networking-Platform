public class Profile {
    private String username;//открывайм variables
    private String fullName;
    private int followers;

    public Profile(String username, String fullName, int followers) {
        this.username = username;
        this.fullName = fullName;
        this.followers = followers;//меншіктеу
    }

    public String getUsername() {
        return username;//возвращаем юз
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void follow(Profile other){
        other.setFollowers(other.getFollowers() +1);
        System.out.println(this.username +" " + "followed" + " " + other.username);
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public void display() {
        System.out.println("Profile: " + " "+ fullName +" " +" (@" + username + "),  Followers: " +" " +followers);
    }
}

