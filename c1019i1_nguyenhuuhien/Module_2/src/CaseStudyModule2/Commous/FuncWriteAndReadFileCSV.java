package CaseStudyModule2.Commous;

import CaseStudyModule2.Models.House;
import CaseStudyModule2.Models.Room;
import CaseStudyModule2.Models.Villa;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class FuncWriteAndReadFileCSV {
    // the delimiter to use for separating entries
    private static final char DEFAULT_SEPARATOR = ',';
    // the character to use for quoted elements
    private static final char DEFAULT_QUOTE = '"';
    //path file Villa.csv
    private static final String pathVilla = "E:\\CODE GYM\\codegymProject\\c1019i1_nguyenhuuhien\\Module_2\\src\\CaseStudyModule2\\Data\\Villa.csv";
    //path file House.csv
    private static final String pathHouse = "E:\\CODE GYM\\codegymProject\\c1019i1_nguyenhuuhien\\Module_2\\src\\CaseStudyModule2\\Data\\House.csv";
    //path file Room.csv
    private static final String pathRoom = "E:\\CODE GYM\\codegymProject\\c1019i1_nguyenhuuhien\\Module_2\\src\\CaseStudyModule2\\Data\\Room.csv";
    //XEM LẠI ĐƯỜNG DẪN TƯƠNG ĐỐI UNDER.
    //header Villa.csv
    private static String[]headerRecordingVilla = new String[]{"id","servicesName","areaUsed","rentalCosts","maximumPeoPleUsed","typeRents","roomStandard","othersConvenient","poolArea","numberOfFloors"};
    //header House.csv
    private static String[]headerRecordingHouse = new String[]{"id","servicesName","areaUsed","rentalCosts","maximumPeoPleUsed","typeRents","roomStandard","othersConvenient","numberOfFloors"};
    //header Room.csv
    private static String[]headerRecordingRoom = new String[]{"id","servicesName","areaUsed","rentalCosts","maximumPeoPleUsed","typeRents","includesfreeservice"};

    //function write Villa to file CSV
    public static void writeVillaToFileCSV(ArrayList<Villa> arrayList) {
        try(Writer writer = new FileWriter(pathVilla);
            CSVWriter csvWriter = new CSVWriter(writer,
                    CSVWriter.DEFAULT_SEPARATOR,
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END)
        ){
            csvWriter.writeNext(headerRecordingVilla);
            for (Villa villa : arrayList) {
                        csvWriter.writeNext(new String[]{
                        villa.getId(), villa.getServicesName(),
                        String.valueOf(villa.getAreaUsed()),
                        String.valueOf(villa.getRentalCosts()),
                        String.valueOf(villa.getMaximumPeoPleUsed()),
                        villa.getTypeRents(),villa.getRoomStandard(),
                        villa.getOthersConvenient(),
                        String.valueOf(villa.getPoolArea()),
                        String.valueOf(villa.getNumberOfFloors())

                });
            }
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    //function write House to file csv
    public static void writeHouseToFileCSV(ArrayList<House> arrayList) {
        try(Writer writer = new FileWriter(pathHouse);
        CSVWriter csvWriter = new CSVWriter(writer,
                CSVWriter.DEFAULT_SEPARATOR,
                CSVWriter.DEFAULT_QUOTE_CHARACTER,
                CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                CSVWriter.DEFAULT_LINE_END)
        ){
            csvWriter.writeNext(headerRecordingHouse);
            for (House house : arrayList) {
                csvWriter.writeNext(new String[]{
                        house.getId(),
                        house.getServicesName(),
                        String.valueOf(house.getAreaUsed()),
                        String.valueOf(house.getRentalCosts()),
                        String.valueOf(house.getMaximumPeoPleUsed()),
                        house.getTypeRents(),
                        house.getRoomStandard(),
                        house.getOthersConvenient(),
                        String.valueOf(house.getNumberOfFloors())
                });
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    //function write Room to file csv
    public static void writeRoomToFileCSV(ArrayList<Room> arrayList) {
        try(Writer writer = new FileWriter(pathRoom);
            CSVWriter csvWriter = new CSVWriter(writer,
                    CSVWriter.DEFAULT_SEPARATOR,
                    CSVWriter.DEFAULT_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END)
        ){
            csvWriter.writeNext(headerRecordingRoom);
            for (Room room : arrayList) {
                csvWriter.writeNext(new String[]{
                        room.getId(),
                        room.getServicesName(),
                        String.valueOf(room.getAreaUsed()),
                        String.valueOf(room.getRentalCosts()),
                        String.valueOf(room.getMaximumPeoPleUsed()),
                        room.getTypeRents(),
                        room.getIncludesfreeservice()
                });
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

    }

    //funtion read file Villa
    public static void readFileFromVillaCSV(ArrayList<Villa> arrayList) {


    }

    //funtion read file House

    //funtion read file Room

}
