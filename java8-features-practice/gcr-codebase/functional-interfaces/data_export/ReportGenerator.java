package data_export;

public class ReportGenerator {

    public static void main(String[] args) {

        DataExporter csv = new CsvExporter();
        DataExporter pdf = new PdfExporter();
        DataExporter json = new JsonExporter();

        csv.export();
        csv.exportToJSON();

        pdf.export();
        pdf.exportToJSON();

        json.export();
        json.exportToJSON();
    }
}

