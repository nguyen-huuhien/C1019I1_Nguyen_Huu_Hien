package CaseStudyModule2.Models;

public class Room extends Services {
    //Dịch vụ miễn phí đi kèm
    private String includesfreeservice;

    public Room(String id, String servicesName, double areaUsed, double rentalCosts, int maximumPeoPleUsed, String typeRents, String includesfreeservice) {
        super(id, servicesName, areaUsed, rentalCosts, maximumPeoPleUsed, typeRents);
        this.includesfreeservice = includesfreeservice;
    }

    public Room() {
    }

    public String getIncludesfreeservice() {
        return includesfreeservice;
    }

    public void setIncludesfreeservice(String includesfreeservice) {
        this.includesfreeservice = includesfreeservice;
    }

    @Override
    public String showInfo() {
        return "Room \n"+ "1.ID : " + super.getId() + "\n" +
                "2.ServicesName : " + super.getServicesName() + "\n" +
                "3.AreaUsed : " + super.getAreaUsed() + "\n" +
                "4.RentalCosts : " + super.getRentalCosts() + "\n" +
                "5.MaximumPeoPleUsed : " + super.getMaximumPeoPleUsed() + "\n" +
                "6.typeRents : " + super.getTypeRents() + "\n" +
                "7.Includesfreeservice : "  + includesfreeservice + "\n";
    }
}
