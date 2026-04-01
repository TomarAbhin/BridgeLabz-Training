package data_export;

public class JsonExporter implements DataExporter {

    @Override
    public void export() {
        System.out.println("Exporting data to custom JSON format");
    }

    @Override
    public void exportToJSON() {
        System.out.println("Exporting data to optimized JSON format");
    }
}
