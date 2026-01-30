package date_format;

import java.time.LocalDate;

public class InvoiceGenerator {

    public static void main(String[] args) {

        LocalDate invoiceDate = LocalDate.now();

        System.out.println(DateFormatUtil.formatDate(invoiceDate, "dd-MM-yyyy"));
        System.out.println(DateFormatUtil.formatDate(invoiceDate, "yyyy/MM/dd"));
        System.out.println(DateFormatUtil.formatDate(invoiceDate, "dd MMM yyyy"));
    }
}

