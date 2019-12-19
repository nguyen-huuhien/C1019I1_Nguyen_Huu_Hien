package CaseStudyModule2.Controllers;

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
                + "3. exit");
        int chooseMainmenu = sc.nextInt();

        switch (chooseMainmenu) {
            case 1:
                addNewService();
                break;
            case 2:
                showServices();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("\nError. Back to menu.");
                backMainmenu();
        }

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


    }

    public static void showAllHouse() {

    }

    public static void showAllRoom() {

    }


    private static Services addNewService(Services services) {
        services.setId(UUID.randomUUID().toString().replace("-", ""));
        //enter name
        sc.nextLine();
        System.out.println("Enter Name Services : ");
        services.setServicesName(sc.nextLine());
        //enter area used
        System.out.println("Enter AreaUsed : ");
        services.setAreaUsed(sc.nextDouble());
        //enter Rental costs
        System.out.println("Enter Rental Costs");
        services.setRentalCosts(sc.nextDouble());
        //enter maxnumber of People used
        System.out.println("Enter Maxnumber of user");
        services.setMaximumPeoPleUsed(sc.nextInt());
        //Enter type rents
        sc.nextLine();
        System.out.println("Enter type rents :");
        services.setTypeRents(sc.nextLine());
        return services;


    }

    public static void addNewVilla() {
        Services villa = new Villa();
        villa = addNewService(villa);

        //Enter Room Standard
        System.out.println("Enter Room Standard : ");
        ((Villa) villa).setRoomStandard(sc.nextLine());
        //Enter Others Convenient (dịch vụ đi kèm)
        System.out.println("Enter Others Convenient : ");
        ((Villa) villa).setOthersConvenient(sc.nextLine());
        //Enter poolArea
        System.out.println("Enter pool Area : ");
        ((Villa) villa).setPoolArea(sc.nextDouble());
        //Enter Number Of Floors (Nhập số tầng)
        System.out.println("Enter Number Of Floors : ");
        ((Villa) villa).setNumberOfFloors(sc.nextInt());
        //writefile

        ArrayList<Villa> listVilla = new ArrayList<Villa>();
        listVilla.add((Villa) villa);
        FuncWriteAndReadFileCSV.writeVillaToFileCSV(listVilla);
        System.out.println("\nAdd Villa: " + villa.getServicesName() + " Successfully!");
        sc.nextLine();
        backMainmenu();


    }

    public static void addNewHouse() {
        Services house = new House();
        house = addNewService(house);

        //Enter Room Standard
        System.out.println("Enter Room Standard : ");
        ((House) house).setRoomStandard(sc.nextLine());
        //Enter othersConvenient
        System.out.println("Enter othersConvenient : ");
        ((House) house).setOthersConvenient(sc.nextLine());
        //Enter number of Floors
        System.out.println("Enter number of floors : ");
        ((House) house).setNumberOfFloors(sc.nextInt());
        //write file
        ArrayList<House> listHouse = new ArrayList<>();
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

        //write file
        ArrayList<Room> listRoom = new ArrayList<>();
        listRoom.add((Room) room);
        FuncWriteAndReadFileCSV.writeRoomToFileCSV(listRoom);
        System.out.println("\nAdd Room : " + room.getServicesName() + " Successfully!");
        sc.nextLine();
        backMainmenu();

    }


}
