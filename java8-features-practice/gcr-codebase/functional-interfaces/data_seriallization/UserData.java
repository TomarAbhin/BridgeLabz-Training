package data_seriallization;

public class UserData implements BackupSerializable {

    private String username;
    private String email;

    public UserData(String username, String email) {
        this.username = username;
        this.email = email;
    }

    @Override
    public String toString() {
        return username + " - " + email;
    }
}
