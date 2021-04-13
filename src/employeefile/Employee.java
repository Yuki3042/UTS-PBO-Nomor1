package employeefile;

public class Employee {
    private String name;
    private int idNumber;
    private String departement;
    private String position;
    
    public Employee (String nama, int idnum,String dprtn, String pstn){
        name = nama;
        idNumber = idnum;
        departement = dprtn;
        position = pstn;
    }
    
    public Employee(String nama,int idnum){
        name = nama;
        idNumber = idnum;
        departement = "";
        position = "";
    }
    
    public Employee (){
        name = "";
        idNumber = 0;
        departement = "";
        position = "";
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getIdNumber(){
        return idNumber;
    }
    
    public void setIdNumber(int idnumber){
        this.idNumber = idnumber;
    }
    
    public String getDerpartement(){
        return departement;
    }
    
    public void setDepartement(String departement){
        this.departement = departement;
    }
    
    public String getPosition(){
        return position;
    }
    
    public void setPosition(String position){
        this.position = position;
    }
}

