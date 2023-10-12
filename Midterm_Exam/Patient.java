public class Patient extends Person{
    //Variables
    String admissionDate;
    String allergies;
    String diagnosis;

    //Constructor
    public Patient(String firstname, String lastname){
        super(firstname, lastname);

    }

    //Behaviours
    public void set_date(String date){
        this.admissionDate = date;

    }



    public void set_allergy(String allergy){
        this.allergies = allergy;

    }



    public void set_diag(String diag){
        this.diagnosis = diag;

    }


    //Display
    public void display_pati_info(){
        System.out.println("\n");
        System.out.println(firstname + " " + lastname + " admission date is " + admissionDate + " with " + allergies + " and a diagnosis of " + diagnosis + ".");
    }
}
