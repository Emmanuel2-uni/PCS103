public class Physician extends Person{
    //Variables
    String specialty;
    String department;
    String office;

    //Constructor
    public Physician(String firstname, String lastname){
        super(firstname, lastname);
    }

    //Behaviours
    public void set_specialty(String specialty){
        this.specialty = specialty;

    }


    public void set_department(String department){
        this.department = department;

    }

    public void set_office(String office){
        this.office = office;

    }

    //Display
    public void display_phys_info(){
        System.out.println("\n");
        System.out.println(firstname + " " + lastname + " is a doctor that specializes in " + specialty + " under the department of " + department + " and their office number is " + office + ".");
        
    }

}
