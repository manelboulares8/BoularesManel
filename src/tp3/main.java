package tp3;
import java.util.Scanner;
public class main {
	public static  void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        tp3 date =new tp3(22,4,2002);
		tp3 date1=new tp3(1,10,2004);
		tp3 date2=new tp3(17,5,2022);
		tp3 date3=new tp3(2024);
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		System.out.println(date1.getJours());
		System.out.println(date2.getMois());
		date.setAnnee(2000);
		System.out.println(date);
		int choix;

	     do {
	            System.out.println("\nMenu des opérations sur la date :");
	            System.out.println("1. Ajouter un jour");
	            System.out.println("2. Ajouter plusieurs jours");
	            System.out.println("3. Ajouter un mois");
	            System.out.println("4. Ajouter une année");
	            System.out.println("5. Afficher la date actuelle");
	            System.out.println("6. Quitter");
	            System.out.print("Veuillez choisir une option (1-6) : ");
	            
	            choix = scanner.nextInt();

	            switch (choix) {
	                case 1:
	                    date.ajouterUnJour();
	                    System.out.println(" Nouvelle date : " + date);
	                    break;
	                case 2:
	                    System.out.print("Combien de jours vous voulez ajouter ? ");
	                    int joursAAjouter = scanner.nextInt();
	                    date.ajouterPlusieursJours(joursAAjouter);
	                    System.out.println(" Nouvelle date : " + date);
	                    break;
	                case 3:
	        
	                    if (date.getMois()<12) { 
	                        date.setMois(date.getMois() + 1);
	                    }
	                    else {
	                    	date.setMois(1);}
	                    System.out.println("Nouvelle date : " + date);
	                    break;
	                case 4:
	                    date.setAnnee(date.getAnnee() + 1); 
	                    System.out.println(" Nouvelle date : " + date);
	                    break;
	                case 5:
	                    System.out.println("Date actuelle : " + date);
	                    break;
	                case 6:
	                    System.out.println("Au revoir !");
	                    break;
	                default:
	                    System.out.println("Choix invalide, veuillez réessayer.");
	            }
	        } while (choix != 6);

	        scanner.close();
	    }


}

