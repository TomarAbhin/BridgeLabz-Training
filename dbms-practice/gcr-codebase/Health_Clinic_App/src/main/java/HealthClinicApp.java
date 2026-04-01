import dao.AppointmentDao;
import dao.DoctorDao;
import dao.PatientDao;
import dao.PrescriptionDao;
import dao.VisitDao;
import dao.BillDao;
import model.Patient;
import util.DbConnection;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class HealthClinicApp {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        PatientDao dao = new PatientDao();
        DoctorDao doctorDao = new DoctorDao();
        AppointmentDao appointmentDao = new AppointmentDao();
        VisitDao visitDao = new VisitDao();
        PrescriptionDao prescriptionDao = new PrescriptionDao();
        BillDao billDao = new BillDao();

        Connection con = DbConnection.getConnection();

        while (true) {
            System.out.println("\n===== HEALTH CLINIC SYSTEM =====");
            System.out.println("1.Register Patient");
            System.out.println("2.Update Patient");
            System.out.println("3.Search Patient");
            System.out.println("4.View Visit History");
            System.out.println("5.Delete Patient");
            System.out.println("6.Add Doctor");
            System.out.println("7.Book Appointment");
            System.out.println("8.Record Visit");
            System.out.println("9.Add Prescription");
            System.out.println("10.Generate Bill");
            System.out.println("11.Show Bill");
            System.out.println("12.Pay Bill");
            System.out.println("13.Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Enter name:");
                    String name = sc.nextLine();

                    System.out.println("Enter DOB (yyyy-mm-dd):");
                    LocalDate dob = LocalDate.parse(sc.nextLine());

                    System.out.println("Enter contact:");
                    String contact = sc.nextLine();

                    if (!contact.matches("\\d{10}")) {
                        System.out.println("Invalid contact number");
                        break;
                    }

                    System.out.println("Enter address:");
                    String address = sc.nextLine();

                    System.out.println("Enter blood group:");
                    String bg = sc.nextLine();

                    Patient p = new Patient(0, name, dob, contact, address, bg);

                    if (dao.registerPatient(p))
                        System.out.println("Patient Registered Successfully");
                    else
                        System.out.println("Patient already exists");
                    break;

                case 2:
                    System.out.println("Enter patient ID:");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter new address:");
                    String newAddress = sc.nextLine();

                    System.out.println("Enter new blood group:");
                    String newBg = sc.nextLine();

                    if (dao.updatePatient(id, newAddress, newBg))
                        System.out.println("Patient Updated");
                    else
                        System.out.println("Patient not found");
                    break;

                case 3:
                    System.out.println("Enter name or contact:");
                    String keyword = sc.nextLine();
                    List<Patient> list = dao.searchPatient(keyword);
                    list.forEach(System.out::println);
                    break;

                case 4:
                    System.out.println("Enter patient ID:");
                    int pid = sc.nextInt();
                    dao.viewVisitHistory(pid);
                    break;

                case 5:
                    System.out.println("Enter patient ID:");
                    int deleteId = sc.nextInt();

                    if (dao.deletePatient(deleteId))
                        System.out.println("Patient Deleted");
                    else
                        System.out.println("Patient not found");
                    break;

                case 6:
                    System.out.println("Doctor name:");
                    String dname = sc.nextLine();

                    System.out.println("Specialty ID:");
                    int sid = sc.nextInt(); sc.nextLine();

                    System.out.println("Contact:");
                    String dcontact = sc.nextLine();

                    System.out.println("Fee:");
                    double fee = sc.nextDouble(); sc.nextLine();

                    doctorDao.addDoctor(dname, sid, dcontact, fee);
                    break;

                case 7:
                    System.out.println("Patient ID:");
                    int pid2 = sc.nextInt();

                    System.out.println("Doctor ID:");
                    int did = sc.nextInt(); sc.nextLine();

                    System.out.println("Date (YYYY-MM-DD):");
                    String date = sc.nextLine();

                    System.out.println("Time (HH:MM:SS):");
                    String time = sc.nextLine();

                    appointmentDao.bookAppointment(pid2, did, date, time);
                    break;

                case 8:
                    System.out.println("Appointment ID:");
                    int aid = sc.nextInt(); sc.nextLine();

                    System.out.println("Diagnosis:");
                    String diag = sc.nextLine();

                    System.out.println("Notes:");
                    String notes = sc.nextLine();

                    visitDao.recordVisit(aid, diag, notes);
                    break;

                case 9:
                    System.out.println("Visit ID:");
                    int vid = sc.nextInt(); sc.nextLine();

                    System.out.println("Medicine:");
                    String med = sc.nextLine();

                    System.out.println("Dosage:");
                    String dosage = sc.nextLine();

                    System.out.println("Duration days:");
                    int days = sc.nextInt();

                    prescriptionDao.addPrescription(vid, med, dosage, days);
                    break;

                case 10:
                    System.out.println("Enter Visit ID:");
                    int visitId = sc.nextInt();
                    billDao.generateBill(con, visitId);
                    break;

                case 11:
                    System.out.println("Enter Visit ID:");
                    int visitId2 = sc.nextInt();
                    billDao.showBill(con, visitId2);
                    break;

                case 12:
                    System.out.println("Enter Bill ID:");
                    int billId = sc.nextInt(); sc.nextLine();

                    System.out.println("Payment Mode:");
                    String mode = sc.nextLine();

                    billDao.payBill(con, billId, mode);
                    break;

                case 13:
                    System.out.println("System Closed");
                    return;
            }
        }
    }
}
