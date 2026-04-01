package data_export;

public interface DataExporter {

    void export();

    default void exportToJSON() {
        System.out.println("Exporting data in JSON format using default implementation");
    }
}
