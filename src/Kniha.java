import java.util.Scanner;

public class Kniha {

    Scanner sc = new Scanner(System.in);

    private String nazev;
    private int rokVydani;
    public String autor;

    Kniha(String nazev, int rokVydani, String autor) {
        this.nazev = nazev;
        this.rokVydani = rokVydani;
        this.autor = autor;
    }

    public void info() {
        System.out.println("Nazev: " + nazev);
        System.out.println("Rok Vydani: " + rokVydani);
        System.out.println("Autor: " + autor+"\n");
    }

    public String zmenNazev(){
        System.out.println("Jaký je nové jméno");
        String nazev = sc.nextLine();
        this.nazev = nazev;

        return nazev;
    }



}
