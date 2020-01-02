package CaseStudyModule2.Commous;

import CaseStudyModule2.Models.Customers;
import CaseStudyModule2.Models.House;
import CaseStudyModule2.Models.Room;
import CaseStudyModule2.Models.Villa;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

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
    //path file booking
    private static final String pathBooking = "E:\\CODE GYM\\codegymProject\\c1019i1_nguyenhuuhien\\Module_2\\src\\CaseStudyModule2\\Data\\Booking.csv";
    //XEM LẠI ĐƯỜNG DẪN TƯƠNG ĐỐI UNDER.
    //header Villa.csv
    private static String[] headerRecordingVilla = new String[]{"id", "servicesName", "areaUsed", "rentalCosts", "maximumPeoPleUsed", "typeRents", "roomStandard", "othersConvenient", "poolArea", "numberOfFloors"};
    //header House.csv
    private static String[] headerRecordingHouse = new String[]{"id", "servicesName", "areaUsed", "rentalCosts", "maximumPeoPleUsed", "typeRents", "roomStandard", "othersConvenient", "numberOfFloors"};
    //header Room.csv
    private static String[] headerRecordingRoom = new String[]{"id", "servicesName", "areaUsed", "rentalCosts", "maximumPeoPleUsed", "typeRents", "includesfreeservice"};
    //header Booking
    private static String[] headerBooking = new String[]{"id, name, birthday, gender, cmndNumber,phonenumber ," +
            " email, typeCustomer, address, idVilla, ServicesNameViila, AreaUsed, RentalCosts, MaximumPeoPleUsed, typeRents"};
    // the line skip readig
    private static final int NUM_OF_LINE_SKIP = 1;

    //write-------------------------
    //function write booking.
    public static void writeBookingtofileCSV(ArrayList<Customers> listBooking) {
        try (Writer writer = new FileWriter(pathBooking);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)
        ) {
            csvWriter.writeNext(headerBooking);
            for (Customers customer : listBooking) {
                csvWriter.writeNext(new String[]{
                        customer.getId(),
                        customer.getName(),
                        customer.getBirthday(),
                        customer.getGender(),
                        String.valueOf(customer.getCmndNumber()),
                        String.valueOf(customer.getPhoneNumber()),
                        customer.getEmail(),
                        customer.getTypeCustomer(),
                        customer.getAddress(),
                        customer.getServices().getId(),
                        customer.getServices().getServicesName(),
                        String.valueOf(customer.getServices().getAreaUsed()),
                        String.valueOf(customer.getServices().getRentalCosts()),
                        String.valueOf(customer.getServices().getMaximumPeoPleUsed()),
                        customer.getServices().getTypeRents()});
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //function write Villa to file CSV
    public static void writeVillaToFileCSV(ArrayList<Villa> arrayList) {
        try (Writer writer = new FileWriter(pathVilla);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)
        ) {
            csvWriter.writeNext(headerRecordingVilla);
            for (Villa villa : arrayList) {
                csvWriter.writeNext(new String[]{
                        villa.getId(), villa.getServicesName(),
                        String.valueOf(villa.getAreaUsed()),
                        String.valueOf(villa.getRentalCosts()),
                        String.valueOf(villa.getMaximumPeoPleUsed()),
                        villa.getTypeRents(), villa.getRoomStandard(),
                        villa.getOthersConvenient(),
                        String.valueOf(villa.getPoolArea()),
                        String.valueOf(villa.getNumberOfFloors())

                });
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //function write House to file csv
    public static void writeHouseToFileCSV(ArrayList<House> arrayList) {
        try (Writer writer = new FileWriter(pathHouse);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.DEFAULT_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)
        ) {
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
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //function write Room to file csv
    public static void writeRoomToFileCSV(ArrayList<Room> arrayList) {
        try (Writer writer = new FileWriter(pathRoom);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.DEFAULT_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)
        ) {
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
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }


    // read----------------------------------
    //funtion read lis vitlla form file CSV
    public static ArrayList<Villa> getVillaFromCSV() {
        Path path = Paths.get(pathVilla);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathVilla);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Villa> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Villa.class);
        strategy.setColumnMapping(headerRecordingVilla);

        CsvToBean<Villa> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Villa>(new FileReader(pathVilla))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Villa>) csvToBean.parse();

    }

    //funtion read file House
    public static ArrayList<House> getHouseFromCSV() {
        Path path = Paths.get(pathHouse);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathHouse);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<House> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(House.class);
        strategy.setColumnMapping(headerRecordingHouse);

        CsvToBean<House> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<House>(new FileReader(pathHouse))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<House>) csvToBean.parse();

    }

    //funtion read file Room
    public static ArrayList<Room> getRoomFromCSV() {
        Path path = Paths.get(pathRoom);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathRoom);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Room> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Room.class);
        strategy.setColumnMapping(headerRecordingRoom);
        CsvToBean<Room> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Room>(new FileReader(pathRoom))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Room>) csvToBean.parse();

    }

    //function write Booking
    public static ArrayList<Customers> getBookingFromCSv() {
        Path path = Paths.get(pathBooking);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathBooking);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Customers> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Customers.class);
        strategy.setColumnMapping(headerBooking);
        CsvToBean<Customers> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Customers>(new FileReader(pathBooking))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Customers>) csvToBean.parse();

    }


    //newtype-------------
    //path file
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String pathCustomer = "E:\\CODE GYM\\codegymProject\\c1019i1_nguyenhuuhien\\Module_2\\src\\CaseStudyModule2\\Data\\Customer.csv";


    //header file csv CUSTOMER
    private static final String FILE_HEADER_CUSTOMER = "id, name, birthday, gender, cmndNumber,phonenumber ," +
            " email, typeCustomer, address,";

    //Do-----------

    //ghi filecustomer
    public static void writeCustomerToFileCSV(ArrayList<Customers> listCustomers) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(pathCustomer);
            fileWriter.append(FILE_HEADER_CUSTOMER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Customers customer : listCustomers) {
                fileWriter.append(customer.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getBirthday());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getGender());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append((String.valueOf(customer.getCmndNumber())));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append((String.valueOf(customer.getPhoneNumber())));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getEmail());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getTypeCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getAddress());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();

            } catch (Exception ex) {
                System.out.println("Error  ");
            }
        }
    }

    //đọc file customer
    public static ArrayList<Customers> getFileCSVToListCustomers() {
        BufferedReader br = null;
        ArrayList<Customers> listCustomers = new ArrayList<Customers>();
        Path path = Paths.get(pathCustomer);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathCustomer);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(pathCustomer));
            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("id")) {
                    continue;
                }
                Customers customer = new Customers();
                customer.setId(splitData[0]);
                customer.setName(splitData[1]);
                customer.setBirthday(splitData[2]);
                customer.setGender(splitData[3]);
                customer.setCmndNumber(Integer.parseInt(splitData[4]));
                customer.setPhoneNumber(Double.parseDouble(splitData[5]));
                customer.setEmail(splitData[6]);
                customer.setTypeCustomer(splitData[7]);
                customer.setAddress(splitData[8]);
                listCustomers.add(customer);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return listCustomers;
    }

    //newtype--------------
    //end new type

    //tree set
    public static TreeSet<String> getAllnameServiceFromCSV(String path) {
        BufferedReader br = null;
        TreeSet<String> result = new TreeSet<String>();
        try {
            String line;
            br = new BufferedReader(new FileReader(path));
            while (br.readLine() != null) {
                line = br.readLine();
                if (getNameServicesFromFile(line).equals("servicesName")) {
                    continue;
                }
                result.add(getNameServicesFromFile(line));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    public static String getNameServicesFromFile(String csvLine) {
        String name = "";
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            name = splitData[1];
        }
        return name;
    }

}
