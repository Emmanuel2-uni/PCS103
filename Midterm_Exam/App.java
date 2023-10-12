public class App {
    public static void main(String[] args) throws Exception {
        Patient tom = new Patient("Tom", "Holland");
        Physician mark = new Physician("Mark", "Escueta");

        //functions/behaviours below are from the Patient class
        tom.set_allergy("Skin");
        tom.set_date("September 10, 2019");
        tom.set_diag("Skin Asthma");
        tom.display_pati_info();

        //functions/behaviours below are from the Physician class
        mark.set_specialty("Dermatology");
        mark.set_department("Aesthetics");
        mark.set_office("R1547");
        mark.display_phys_info();
    }
}
