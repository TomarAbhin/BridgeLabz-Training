package data_seriallization;

public class BackupApp {

    public static void main(String[] args) {

        UserData user = new UserData("abhinav", "abhinav@mail.com");
        TempSession session = new TempSession("SESSION123");

        BackupService.processBackup(user);
        BackupService.processBackup(session);
    }
}

