package CaseStudyModule2.Models;

public class House extends Services {
    // tiêu chuẩn phòng
    private String roomStandard;
    //mô tả tiện nghi khác
    private String othersConvenient;
    //số tầng
    private int numberOfFloors;

    public House(String id, String servicesName, double areaUsed, double rentalCosts, int maximumPeoPleUsed, String typeRents, String roomStandard, String othersConvenient, int numberOfFloors) {
        super(id, servicesName, areaUsed, rentalCosts, maximumPeoPleUsed, typeRents);
        this.roomStandard = roomStandard;
        this.othersConvenient = othersConvenient;
        this.numberOfFloors = numberOfFloors;
    }

    public House() {
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getOthersConvenient() {
        return othersConvenient;
    }

    public void setOthersConvenient(String othersConvenient) {
        this.othersConvenient = othersConvenient;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String showInfo() {
        return "House : "+super.getServicesName()+" \n" +"1.ID : " + super.getId() + "\n" +
                "2.ServicesName : " + super.getServicesName() + "\n" +
                "3.AreaUsed : " + super.getAreaUsed() + "\n" +
                "4.RentalCosts : " + super.getRentalCosts() + "\n" +
                "5.MaximumPeoPleUsed : " + super.getMaximumPeoPleUsed() + "\n" +
                "6.typeRents : " + super.getTypeRents() + "\n" +
                "7.RoomStandard : " + roomStandard + "\n" +
                "8.OthersConvenient : " + othersConvenient + "\n" +
                "9.NumberOfFloors : " + numberOfFloors + "\n";
    }
}
