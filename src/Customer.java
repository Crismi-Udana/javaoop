public class Customer {
    private int cusId = 100;
    private String name = "unkown";
    private String nic;
    private String address;

    public Customer() {
    }

    public Customer(int cusId, String name, String nic, String address) {
        this.cusId = cusId;
        this.name = name;
        this.nic = nic;
        this.address = address;
    }

    public Customer(int cusId) {
        this.cusId = cusId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCusId() {
        return cusId;
    }
    public void setCusId(int id){
        this.cusId = id;
    }
    public String getNic(){
        return nic;
    }
    public void setNic(String nic){
        this.nic = nic;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cusId=" + cusId +
                ", name='" + name + '\'' +
                ", nic='" + nic + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
