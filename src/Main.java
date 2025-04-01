import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Kniha kniha;

        ArrayList<Kniha> seznamKnih = new ArrayList();
        boolean pravda= true;

        while(pravda){
            Scanner sc = new Scanner(System.in);
            System.out.println("Chceš přidat knihu? Ano/Konec");
            String decision = sc.nextLine();
            if (decision.equals("Ano") || decision.equals("ano")){
                System.out.println("Jmeno knihy?");
                String jmeno = sc.nextLine();
                System.out.println("Rok vydání knihy??");
                int rok = sc.nextInt();
                sc.nextLine();
                System.out.println("Autor knihy?");
                String autor = sc.nextLine();
                seznamKnih.add(new Kniha(jmeno,rok,autor));
            }
            else if (decision.equals("Konec") || decision.equals("konec")){
                System.out.println("Konec");
                pravda=false;
            }
            else {
                System.out.println("Konec");
                pravda=false;
            }
        }

        for (int i = 0; i < seznamKnih.size(); i++) {
            seznamKnih.get(i).info();
            }

        boolean pravda2 = true;

        while(pravda2){
            Scanner sc = new Scanner(System.in);
            System.out.println("Chceš odebrat knihu? Ano/Konec");
            String decision = sc.nextLine();
            if (decision.equals("Ano") || decision.equals("ano")){
                System.out.println("Číslo knihy?");
                System.out.println("Vyber z čísla 1 až "+ seznamKnih.size());
                int cislo = sc.nextInt()-1;
                seznamKnih.remove(cislo);
            }
            else if (decision.equals("Konec") || decision.equals("konec")){
                System.out.println("Konec");
                pravda2 = false;
            }
            else {
                System.out.println("Konec");
                pravda2 = false;
            }
        }

        for (int i = 0; i < seznamKnih.size(); i++) {
            seznamKnih.get(i).info();
        }

        boolean pravda3 = true;

        while(pravda3){
            Scanner sc = new Scanner(System.in);
            System.out.println("Chceš změnit název knihy? Ano/Konec");
            String decision = sc.nextLine();
            if (decision.equals("Ano") || decision.equals("ano")){
                System.out.println("Číslo knihy?");
                System.out.println("Vyber z čísla 1 až "+ seznamKnih.size());
                int cislo = sc.nextInt()-1;
                seznamKnih.get(cislo).zmenNazev();
            }
            else if (decision.equals("Konec") || decision.equals("konec")){
                System.out.println("Konec");
                pravda3 = false;
            }
            else {
                System.out.println("Konec");
                pravda3 = false;
            }
        }

        for (int i = 0; i < seznamKnih.size(); i++) {
            seznamKnih.get(i).info();
        }

        boolean pravda4 = true;

        while(pravda4){
            Scanner sc = new Scanner(System.in);
            System.out.println("Chceš vidět knihy od přesného autora? Ano/Konec");
            String decision = sc.nextLine();
            if (decision.equals("Ano") || decision.equals("ano")){
                System.out.println("Jméno autora?");
                String hledej = sc.nextLine();
                for (int i = 0; i < seznamKnih.size(); i++) {
                    if (seznamKnih.get(i).getAutor().equals(hledej)){
                        seznamKnih.get(i).info();
                    }

                }

            }
            else if (decision.equals("Konec") || decision.equals("konec")){
                System.out.println("Konec");
                pravda4 = false;
            }
            else {
                System.out.println("Konec");
                pravda4 = false;
            }
        }




    }
}