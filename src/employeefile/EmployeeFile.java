package employeefile;

public class EmployeeFile {

    public static void main(String[] args) {
        Employee first = new Employee ("Susan Meyers",47899,"Accounting","Vice President");
        Employee second = new Employee ("Mark Jones",39119,"IT","Programmer");
        Employee third = new Employee ("Joy Rogers",81774, "Manufacturing","Engineer");
        System.out.println(" "+first.getName()+ ", "+first.getIdNumber()+ ". "+first.getDerpartement()+ ", "+first.getPosition());
        System.out.println(" "+second.getName()+ ", "+second.getIdNumber()+ ", "+second.getDerpartement()+ ", "+second.getPosition());
        System.out.println(" "+third.getName()+ ", "+third.getIdNumber()+ ", "+third.getDerpartement()+ ", "+third.getPosition());
    }
    
}
