import java.util.Scanner;
import entities.Patient;
public class GesRvVue {
private static Scanner scanner=new Scanner (System.in);
public static Patient saisiePatient(){
    Patient Patient=new Patient();
       System.out.printLn(x:"Entrer Le nomComplet");
       Patient.setNomComplet(scanner.nextLine());
       System.out.println[x:"Entrer le telephone");
       Patient.setTelephone (scanner.nextLine());
       return Patient;
    }

    public static rendez-vous saisieRendez-vous(){
        rendez-vous Rv=new rendez-vous();
           System.out.printLn(x:"Entrer Le date du rendez-vous");
           Rv.setDate(scanner.nextLine());
           return Rv;
        }


public static int showMenu()
       System.out-println(x:"1-Ajouter Patient"):
       System.out-println(x:"2-Lister Patient");
       System.out-println(x:"3-Ajouter rendez-vous");
       System.out-println(x:"4-Lister tous les rendez-vous");
       System.out. println(x:"5-Lister les rendez-vous d'un client");
       System.out.println(x:"6-Quitter");
       return scanner.nextInt();
    }
}
