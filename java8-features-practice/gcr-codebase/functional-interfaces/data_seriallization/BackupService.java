package data_seriallization;

public class BackupService {

    public static void processBackup(Object obj) {

        if (obj instanceof BackupSerializable) {
            System.out.println("Backing up object: " + obj);
        } else {
            System.out.println("Backup not allowed for this object");
        }
    }
}

