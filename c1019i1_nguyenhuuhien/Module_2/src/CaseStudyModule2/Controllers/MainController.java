package CaseStudyModule2.Controllers;

import CaseStudyModule2.Commous.FuncValidation;
import CaseStudyModule2.Commous.FuncWriteAndReadFileCSV;
import CaseStudyModule2.Commous.SortName;
import CaseStudyModule2.Models.*;

import javax.sound.midi.Soundbank;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.*;

public class MainController {

    private static ArrayList<Customers> listCustomers = FuncWriteAndReadFileCSV.getFileCSVToListCustomers();
    private static ArrayList<Villa> listVilla = FuncWriteAndReadFileCSV.getVillaFromCSV();
    private static ArrayList<House> listHouse = FuncWriteAndReadFileCSV.getHouseFromCSV();
    private static ArrayList<Room> listRoom = FuncWriteAndReadFileCSV.getRoomFromCSV();
    private static ArrayList<Customers> listBooking = FuncWriteAndReadFileCSV.getBookingFromCSv();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        displayMainmenu();

    }


    public static void displayMainmenu() {
        System.out.println("Main Menu. \n"
                + "1. Add New Services. \n"
                + "2. Show Services. \n"
                + "3. Add New Customer. \n"
                + "4. Show Information Customers.\n"
                + "5. Add New Booking Resort. \n"
                + "6. Show information Customer.\n"
                + "7. Show Customers Booking 4D.\n" +
                "8. Exit.");
        int chooseMainmenu = sc.nextInt();

        switch (chooseMainmenu) {
            case 1:
                addNewService();
                break;
            case 2:
                showServices();
                break;
            case 3:
                addNewCustomer();
                break;
            case 4:
                showCustomers();
                break;
            case 5:
                addNewBookingResort();
                break;
            case 6:
                showInfomationCustomers();
            case 7:
                showCustomersBooking4D();
            case 8:
                System.exit(0);
                break;
            default:
                System.out.println("\nError. Back to menu.");
                backMainmenu();
        }

    }

    private static void showCustomersBooking4D() {
        Customers customer1 = new Customers("Thanh Nam", 987444562);
        Customers customer2 = new Customers("Weboo", 1234566);
        Customers customer3 = new Customers("Hong Son", 88855541);
        Customers customer4 = new Customers("KO MOT AI", 543573541);
        Customers customer5 = new Customers("Thanh Nam", 987444562);

        Queue<Customers> customerBooking4D = new LinkedList<>();
        customerBooking4D.add(customer1);
        customerBooking4D.add(customer2);
        customerBooking4D.add(customer3);
        customerBooking4D.add(customer4);
        customerBooking4D.add(customer5);
        System.out.println("List book 4D :7");
        while (true) {
            Customers customer = customerBooking4D.poll();
            if (customer == null) {
                break;
            }
            System.out.println(customer.showBook4D());

        }
        sc.nextLine();
        backMainmenu();
    }

    private static void showInfomationCustomers() {
        Map<Integer, Employee> employeeMap = new HashMap<>();
        //crearte employee
        Employee employee1 = new Employee("Nguyen Huu Hien", 28, "Quang Nam");
        Employee employee2 = new Employee("Trung Son", 15, "Ha Noi");
        Employee employee3 = new Employee("Wjbu", 16, "Japan");
        Employee employee4 = new Employee("Onii-chan", 16, "Kyoto");
        Employee employee5 = new Employee("Senpai", 35, "Russia");
        Employee employee6 = new Employee("Tukak", 28, "United Kingdom");
        Employee employee7 = new Employee("Nguyen Den Den", 66, "HuE");
        Employee employee8 = new Employee("Nguyen", 25, "Asia");
        Employee employee9 = new Employee("Nguyen Chung Chung", 22, "Unknown");
        Employee employee10 = new Employee("Tran Tri Tue", 30, "Do Thai");
        //add employe to map
        employeeMap.put(1, employee1);
        employeeMap.put(2, employee2);
        employeeMap.put(3, employee3);
        employeeMap.put(4, employee4);
        employeeMap.put(5, employee5);
        employeeMap.put(6, employee6);
        employeeMap.put(7, employee7);
        employeeMap.put(8, employee8);
        employeeMap.put(9, employee9);
        employeeMap.put(10, employee10);
        //show map
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            System.out.println("=================================");
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        sc.nextLine();
        backMainmenu();
    }

    public static void addNewBookingResort() {
        listCustomers = FuncWriteAndReadFileCSV.getFileCSVToListCustomers();
        listCustomers.sort(new SortName());
        int i = 1;
        for (Customers customer : listCustomers) {
            System.out.println("-------------------");
            System.out.println("No. " + i);
            System.out.println(customer.showInfo());
            System.out.println("-------------------");
            i++;
        }
        System.out.println("Choose Customer Booking : ");
        Customers customer = listCustomers.get(sc.nextInt() - 1);
        System.out.println("\n1. Booking Villa.\n" +
                "2. Booking House.\n" +
                "3. Booking Room.\n" +
                "4. Back To Menu.");
        System.out.println("Choose Services Booking ");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                i = 1;
                listVilla = FuncWriteAndReadFileCSV.getVillaFromCSV();
                for (Villa villa : listVilla) {
                    System.out.println("-------------------");
                    System.out.println("No. " + i);
                    System.out.println(villa.showInfo());
                    System.out.println("-------------------");
                    i++;
                }
                System.out.println("Choose Villa Booking ");
                Villa villa = listVilla.get(sc.nextInt() - 1);
                customer.setServices(villa);
                break;
            case 2:
                i = 1;
                listHouse = FuncWriteAndReadFileCSV.getHouseFromCSV();
                for (House house : listHouse) {
                    System.out.println("-------------------");
                    System.out.println("No. " + i);
                    System.out.println(house.showInfo());
                    System.out.println("-------------------");
                    i++;
                }
                System.out.println("Choose House Booking ");
                House house = listHouse.get(sc.nextInt() - 1);
                customer.setServices(house);
                break;
            case 3:
                i = 1;
                listRoom = FuncWriteAndReadFileCSV.getRoomFromCSV();
                for (Room room : listRoom) {
                    System.out.println("-------------------");
                    System.out.println("No. " + i);
                    System.out.println(room.showInfo());
                    System.out.println("-------------------");
                    i++;
                }
                System.out.println("Choose Room Booking ");
                Room room = listRoom.get(sc.nextInt() - 1);
                customer.setServices(room);
                break;
            case 4:
                backMainmenu();
                break;
            default:
                backMainmenu();
                break;
        }
        listBooking = FuncWriteAndReadFileCSV.getBookingFromCSv();
        listBooking.add(customer);
        FuncWriteAndReadFileCSV.writeBookingtofileCSV(listBooking);
        System.out.println("\nAdd Booking for : " + customer.getName() + " Successfully!!");
        sc.nextLine();
        backMainmenu();


    }

    public static void addNewCustomer() {
        String content = "";
        String errMes = "";
        Customers customer = new Customers();
        //set id customer
        customer.setId(UUID.randomUUID().toString().replace("-", ""));
        //enter fix
        sc.nextLine();
        //enter name customer
        System.out.println("Enter name customer : ");
        customer.setName(sc.nextLine());
        while (!FuncValidation.checkNameSerVice(customer.getName())) {
            System.out.println("Customer name is inValid. \nCustomer Name must capitalize the first character in each word.\nPls try again!");
            System.out.println("Enter name customer : ");
            customer.setName(sc.nextLine());
        }
        //enter birthday customer
        System.out.println("Enter birthday customer : ");
        customer.setBirthday(sc.nextLine());
        while (!FuncValidation.checkBirthDay(customer.getBirthday())) {
            System.out.println("Birth day customer is inValid.\n" +
                    "Type - Must be dd/mm/yyyy!!!");
            System.out.println("Enter birthday customer : ");
            customer.setBirthday(sc.nextLine());
        }
        //enter Gender
        System.out.println("Enter Gender of customer : ");
        customer.setGender(sc.nextLine());
        String gender = customer.getGender();
        gender = gender.substring(0, 1).toUpperCase() + gender.substring(1).toLowerCase();
        System.out.println(gender);
        while (!FuncValidation.checkGender(gender)) {
            System.out.println("Gender is not found!");
            System.out.println("Enter Gender of customer : ");
            customer.setGender(sc.nextLine());
            gender = customer.getGender();
            gender = gender.substring(0, 1).toUpperCase() + gender.substring(1).toLowerCase();
            System.out.println(gender);
        }
        //enter cmnd
        content = "Enter CMND number of customer : ";
        errMes = "CMND NUMBER IS OUT OF VALUE! PLS TRY AGAIN!";
        customer.setCmndNumber(FuncValidation.checkValidNumberInteger(content, errMes));
        while (customer.getCmndNumber() < 100000000 || customer.getCmndNumber() > 999999999) {
            System.out.println(errMes);
            customer.setCmndNumber(FuncValidation.checkValidNumberInteger(content, errMes));
        }
        //Enter Phone Numer
        content = "Enter the phone number of customer: ";
        errMes = "The phone number is inValid.Must have 6-10 number \nPls try again.";
        customer.setPhoneNumber(FuncValidation.checkValidNumberDouble(content, errMes));
        while (customer.getPhoneNumber() < 100000 || customer.getPhoneNumber() > 999999999) {
            System.out.println(errMes);
            customer.setPhoneNumber(FuncValidation.checkValidNumberDouble(content, errMes));
        }
        //Enter email
        System.out.println("Enter Email of customer : ");
        customer.setEmail(sc.nextLine());
        while (!FuncValidation.checkEmail(customer.getEmail())) {
            System.out.println("Email is inValid. Pls try again!!");
            customer.setEmail(sc.nextLine());
        }
        //Enter type customer
        System.out.println("Enter type Customer : ");
        customer.setTypeCustomer(sc.nextLine());
        //enter address of customer
        System.out.println("Enter address of customer : ");
        customer.setAddress(sc.nextLine());
        //lấy array list cũ
        listCustomers = FuncWriteAndReadFileCSV.getFileCSVToListCustomers();
        listCustomers.add(customer);
        FuncWriteAndReadFileCSV.writeCustomerToFileCSV(listCustomers);
        System.out.println("Add new customer complete ");
        backMainmenu();

    }

    public static void showCustomers() {
        listCustomers.sort(new SortName());
        for (Customers customer : listCustomers) {
            System.out.println("----------");
            System.out.println("1. id : " + customer.getId());
            System.out.println("2. name : " + customer.getName());
            System.out.println("3. birthday : " + customer.getBirthday());
            System.out.println("4. gender : " + customer.getGender());
            System.out.println("5. CMND : " + customer.getCmndNumber());
            System.out.println("6. phone : " + customer.getPhoneNumber());
            System.out.println("7. email : " + customer.getEmail());
            System.out.println("8. typeCustomer : " + customer.getTypeCustomer());
            System.out.println("9. address : " + customer.getAddress());
            System.out.println("----------");
        }
        sc.nextLine();
        backMainmenu();
    }

    private static void backMainmenu() {
        System.out.println("\nEnter to continue...");
        sc.nextLine();
        System.out.println("-----------------------");
        displayMainmenu();
    }


    public static void addNewService() {
        System.out.println("-----------------------");
        System.out.println("\nAdd New Services. \n"
                + "1. Add New Villa. \n"
                + "2. Add New House. \n"
                + "3. Add New Room \n"
                + "4. Back To Menu \n"
                + "5. Exit" +
                "\nPlease select one function below:");
        switch (sc.nextInt()) {
            case 1:
                addNewVilla();
                break;
            case 2:
                addNewHouse();
            case 3:
                addNewRoom();
                break;
            case 4:
                displayMainmenu();
                System.out.println("-----------------------");
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("\nError back to menu.");
                backMainmenu();
        }
    }

    public static void showServices() {
        System.out.println("ShowServices : \n" +
                "1. Show All Villa.\n" +
                "2. Show All House. \n" +
                "3. Show All Room. \n" +
                "4. Show All Name Villa Not Duplicate. \n" +
                "5. Show All Name House Not Duplicate.\n" +
                "6. Show All Name Room Not Duplicate. \n" +
                "7. Back To Menu.\n" +
                "8. Exit.");
        switch (sc.nextInt()) {
            case 1:
                showAllVilla();
                break;
            case 2:
                showAllHouse();
                break;
            case 3:
                showAllRoom();
                break;
            case 4:
                showAllNameVillaNotDuplicate();
                break;
            case 5:
                showAllNameHouseNotDuplicate();
                break;
            case 6:
                showAllNameRoomNotDuplicate();
                break;
            case 7:
                backMainmenu();
                break;
            case 8:
                System.exit(0);
            default:
                System.out.println("\nError back to menu.");
                backMainmenu();
        }
    }


    public static void showAllVilla() {
        ArrayList<Villa> listVilla = FuncWriteAndReadFileCSV.getVillaFromCSV();
        for (Villa villa : listVilla) {
            System.out.println("\n----------------");
            System.out.println(villa.showInfo());
            System.out.println("----------------");
        }
        sc.nextLine();
        backMainmenu();

    }

    private static void showAllNameVillaNotDuplicate() {
        String pathVilla = "E:\\CODE GYM\\codegymProject\\c1019i1_nguyenhuuhien\\Module_2\\src\\CaseStudyModule2\\Data\\Villa.csv";
        Path path = Paths.get(pathVilla);
        if (!Files.exists(path)) {
            System.out.println("File Villa does not Exists! ");
        } else {
            TreeSet<String> listVillsTreeset = FuncWriteAndReadFileCSV.getAllnameServiceFromCSV(pathVilla);
            System.out.println("\nList Name Service Villa Not Duplicate ");
            for (String str : listVillsTreeset) {
                System.out.println("----------------");
                System.out.println(str);
                System.out.println("----------------");
            }
        }
        sc.nextLine();
        backMainmenu();
    }

    private static void showAllNameHouseNotDuplicate() {
        String pathHouse = "E:\\CODE GYM\\codegymProject\\c1019i1_nguyenhuuhien\\Module_2\\src\\CaseStudyModule2\\Data\\House.csv";
        Path path = Paths.get(pathHouse);
        if (!Files.exists(path)) {
            System.out.println("File Home does not exists !");
        } else {
            TreeSet<String> listHouseTreeset = FuncWriteAndReadFileCSV.getAllnameServiceFromCSV(pathHouse);
            System.out.println("List name service House is not duplicate !");
            for (String str : listHouseTreeset) {
                System.out.println("----------------");
                System.out.println(str);
                System.out.println("----------------");
            }
        }
        sc.nextLine();
        backMainmenu();
    }

    private static void showAllNameRoomNotDuplicate() {
        String pathRoom = "E:\\CODE GYM\\codegymProject\\c1019i1_nguyenhuuhien\\Module_2\\src\\CaseStudyModule2\\Data\\Room.csv";
        Path path = Paths.get(pathRoom);
        if (!Files.exists(path)) {
            System.out.println("File Room does not exists !");
        } else {
            TreeSet<String> listRoomTreeset = FuncWriteAndReadFileCSV.getAllnameServiceFromCSV(pathRoom);
            System.out.println("List name service House is not duplicate !");
            for (String str : listRoomTreeset) {
                System.out.println("----------------");
                System.out.println(str);
                System.out.println("----------------");
            }
        }
        sc.nextLine();
        backMainmenu();
    }


    public static void showAllHouse() {
        ArrayList<House> listHouse = FuncWriteAndReadFileCSV.getHouseFromCSV();
        for (House house : listHouse) {
            System.out.println("\n----------------");
            System.out.println(house.showInfo());
            System.out.println("----------------");
        }
        sc.nextLine();
        backMainmenu();

    }

    public static void showAllRoom() {
        ArrayList<Room> listRoom = FuncWriteAndReadFileCSV.getRoomFromCSV();
        for (Room room : listRoom) {
            System.out.println("\n----------------");
            System.out.println(room.showInfo());
            System.out.println("----------------");
        }
        sc.nextLine();
        backMainmenu();

    }


    private static Services addNewService(Services services) {
        String content = "";
        String errMes = "";
        services.setId(UUID.randomUUID().toString().replace("-", ""));
        //enter name
        sc.nextLine();
        System.out.println("Enter Name Services : ");
        services.setServicesName(sc.nextLine());
        while (!FuncValidation.checkNameSerVice(services.getServicesName())) {
            System.out.println("Name Services is invalid. Pls try again!");
            System.out.println("Enter Name Of Service : ");
            services.setServicesName(sc.nextLine());
        }
        //enter area used
        content = "Enter Area Used :";
        errMes = "Area Used is inValid (Area  > 30 and must be a Double) Pls try again! ";
        services.setAreaUsed(FuncValidation.checkValidNumberDouble(content, errMes));
        while (services.getAreaUsed() <= 30) {
            System.out.println(errMes);
            services.setAreaUsed(FuncValidation.checkValidNumberDouble(content, errMes));
        }
        //enter Rental costs
        content = "Enter Rental costs :";
        errMes = "Rental costs is inValid (Rental costs  > 0 and must be a Double) Pls try again! ";
        services.setRentalCosts(FuncValidation.checkValidNumberDouble(content, errMes));
        while (services.getRentalCosts() <= 0) {
            System.out.println(errMes);
            services.setRentalCosts(FuncValidation.checkValidNumberDouble(content, errMes));
        }
        //enter maxnumber of People used
        content = "Enter maxnumber of People used :";
        errMes = "maxnumber of People used is inValid (20 > Number Used  > 0 and must be a int) Pls try again! ";
        services.setMaximumPeoPleUsed(FuncValidation.checkValidNumberInteger(content, errMes));
        while (services.getMaximumPeoPleUsed() <= 0 || services.getMaximumPeoPleUsed() >= 20) {
            System.out.println(errMes);
            services.setMaximumPeoPleUsed(FuncValidation.checkValidNumberInteger(content, errMes));
        }
        //Enter type rents

        System.out.println("Enter type rents :");
        services.setTypeRents(sc.nextLine());
        while (!FuncValidation.checkNameSerVice(services.getTypeRents())) {
            System.out.println("Type Rent is invalid. Pls try again !");
            System.out.println("Enter Type rent :");
            services.setTypeRents(sc.nextLine());
        }
        return services;
    }

    public static void addNewVilla() {
        String content = "";
        String errMes = "";
        Services villa = new Villa();
        villa = addNewService(villa);

        //Enter Room Standard
        System.out.println("Enter Room Standard : ");
        ((Villa) villa).setRoomStandard(sc.nextLine());
        while (!FuncValidation.checkNameSerVice(((Villa) villa).getRoomStandard())) {
            System.out.println("Room Standard is inValid. Pls try again !");
            System.out.println("Enter Room Standard : ");
            ((Villa) villa).setRoomStandard(sc.nextLine());
        }
        //Enter Others Convenient (dịch vụ đi kèm)
        System.out.println("Enter Others Convenient : ");
        ((Villa) villa).setOthersConvenient(sc.nextLine());
        while (!FuncValidation.checkOthersConvenient(((Villa) villa).getOthersConvenient())) {
            System.out.println("Convenient must be : massage, karaoke, food, drink, car");
            System.out.println("Enter Others Convenient ");
            ((Villa) villa).setOthersConvenient(sc.nextLine());
        }
        //Enter poolArea
        content = "Enter Pool Area :";
        errMes = "Area pool is inValid (Area  > 30 and must be a Double) Pls try again! ";
        ((Villa) villa).setPoolArea(FuncValidation.checkValidNumberDouble(content, errMes));
        while (((Villa) villa).getPoolArea() <= 30) {
            System.out.println(errMes);
            ((Villa) villa).setPoolArea(FuncValidation.checkValidNumberDouble(content, errMes));
        }
        //Enter Number Of Floors (Nhập số tầng)
        content = "Enter Number Of Floors :";
        errMes = "Number Of Floors is inValid (Enter Number Of Floors  > 0, and must be a int) Pls try again! ";
        ((Villa) villa).setNumberOfFloors(FuncValidation.checkValidNumberInteger(content, errMes));
        while (((Villa) villa).getNumberOfFloors() <= 0) {
            System.out.println(errMes);
            ((Villa) villa).setNumberOfFloors(FuncValidation.checkValidNumberInteger(content, errMes));
        }
        //writefile
        //- lấy ra toàn bộ từ list
        listVilla = FuncWriteAndReadFileCSV.getVillaFromCSV();
        //thêm vào danh sách villa đó
        listVilla.add((Villa) villa);
        //trả về lại list
        FuncWriteAndReadFileCSV.writeVillaToFileCSV(listVilla);
        System.out.println("\nAdd Villa: " + villa.getServicesName() + " Successfully!");
        backMainmenu();
    }

    public static void addNewHouse() {
        String content = "";
        String errMes = "";
        Services house = new House();
        house = addNewService(house);

        //Enter Room Standard
        System.out.println("Enter Room Standard : ");
        ((House) house).setRoomStandard(sc.nextLine());
        while (!FuncValidation.checkNameSerVice(((House) house).getRoomStandard())) {
            System.out.println("Room Standard is inValid. Pls try again !");
            System.out.println("Enter Room Standard : ");
            ((House) house).setRoomStandard(sc.nextLine());
        }
        //Enter Others Convenient (dịch vụ đi kèm)
        System.out.println("Enter Others Convenient : ");
        ((House) house).setOthersConvenient(sc.nextLine());
        while (!FuncValidation.checkOthersConvenient(((House) house).getOthersConvenient())) {
            System.out.println("Convenient must be : massage, karaoke, food, drink, car");
            System.out.println("Enter Others Convenient ");
            ((House) house).setOthersConvenient(sc.nextLine());
        }

        //Enter Number Of Floors (Nhập số tầng)
        content = "Enter Number Of Floors :";
        errMes = "Number Of Floors is inValid (Enter Number Of Floors  > 0, and must be a int) Pls try again! ";
        ((House) house).setNumberOfFloors(FuncValidation.checkValidNumberInteger(content, errMes));
        while (((House) house).getNumberOfFloors() <= 0) {
            System.out.println(errMes);
            ((House) house).setNumberOfFloors(FuncValidation.checkValidNumberInteger(content, errMes));
        }
        //write file
        listHouse = FuncWriteAndReadFileCSV.getHouseFromCSV();
        listHouse.add((House) house);
        FuncWriteAndReadFileCSV.writeHouseToFileCSV(listHouse);
        System.out.println("\nAdd House : " + house.getServicesName() + " Successfully!");
        sc.nextLine();
        backMainmenu();

    }

    public static void addNewRoom() {
        Services room = new Room();
        room = addNewService(room);
        //enter Dịch vụ miễn phí đi kèm includesfreeservice
        System.out.println("Enter  includesfreeservice (Dịch vụ miễn phí đi kèm ) : ");
        ((Room) room).setIncludesfreeservice(sc.nextLine());
        while (!FuncValidation.checkNameSerVice(((Room) room).getIncludesfreeservice())) {
            System.out.println("Dịch vụ miễn phí đi kèm includesfreeservice is invalid. Pls try again ");
            System.out.println("Enter includesfreeservice :");
            ((Room) room).setIncludesfreeservice(sc.nextLine());
        }

        //write file
        listRoom = FuncWriteAndReadFileCSV.getRoomFromCSV();
        listRoom.add((Room) room);
        FuncWriteAndReadFileCSV.writeRoomToFileCSV(listRoom);
        System.out.println("\nAdd Room : " + room.getServicesName() + " Successfully!");
        sc.nextLine();
        backMainmenu();

    }

}
