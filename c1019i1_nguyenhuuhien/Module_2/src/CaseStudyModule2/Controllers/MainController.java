package CaseStudyModule2.Controllers;

import CaseStudyModule2.Commous.FuncValidation;
import CaseStudyModule2.Commous.FuncWriteAndReadFileCSV;
import CaseStudyModule2.Models.House;
import CaseStudyModule2.Models.Room;
import CaseStudyModule2.Models.Services;
import CaseStudyModule2.Models.Villa;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class MainController {
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
                + "5. Exit.");
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
                System.exit(0);
                break;
            default:
                System.out.println("\nError. Back to menu.");
                backMainmenu();
        }

    }

    public static void addNewCustomer() {

    }

    public static void showCustomers() {

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
                "4. Back To Menu. \n" +
                "5. Exit");
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
                backMainmenu();
                break;
            case 5:
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
        ArrayList<Villa> listVilla = FuncWriteAndReadFileCSV.getVillaFromCSV();
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
        ArrayList<House> listHouse = FuncWriteAndReadFileCSV.getHouseFromCSV();
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
        ArrayList<Room> listRoom = FuncWriteAndReadFileCSV.getRoomFromCSV();
        listRoom.add((Room) room);
        FuncWriteAndReadFileCSV.writeRoomToFileCSV(listRoom);
        System.out.println("\nAdd Room : " + room.getServicesName() + " Successfully!");
        sc.nextLine();
        backMainmenu();

    }


}
