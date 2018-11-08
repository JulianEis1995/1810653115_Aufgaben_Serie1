package package3;

public class Main3 {
    public static void main(String[] args) {
        // Aufgabe 3
        // Datentyp festlegen, mit Namen befüllen und ausgeben
        String name;
        name = "Julian Eisenmann";
        System.out.println(name);

        // Datentyp festlegen, mit Alter befüllen und ausgeben
        int alter;
        alter = 23;
        System.out.println(alter);

        //Aufgabe 4
        //String fachhochschuleKufsteinTirol = "Fachhochschule Kufstein Tirol";
        //Verkürzung Variablenname von fachhochschuleKufsteinTirol zu fhKufsteinTirol
        //String fhKufsteinTirol = "Fachhochschule Kufstein Tirol";
        //Verwandlung Variable in Kosntante und Umbenennung in FH_KUFSTEIN_TIROL
        final String FH_KUFSTEIN_TIROL = "Fachhochschule Kufstein Tirol";

        //Aufgabe 5
        //fi + Autovervollständigung, Str + Autovervollständigung, STRG+ALT+L -> Strichpunkt wird zurückgeschoben
        final String bezeichner;

        //Aufgabe 6
        // \" für doppelte Anführungszeichen, \' für einfache Anführungszeichen
        System.out.println("Jave verwendet für Strings \"doppelte Anführungszeichen\" " +
                           "und einzelne Anführungszeichen wie \'c\' um einzelne Zeichen zu definieren");

        // \\ für Backslash
        System.out.println("Durch \\ kann man auch den Backslash selbst beliebig oft ausgeben: \\\\\\\\");

        // \b Backspace \n Newline \t Tabulator
        System.out.println("Ich verwende den\b Backspace, die Newline\n und den \tTabulator");

        //\r überschreibt die bestehende Zeile - \f erzwingt Seitenumbruch
        System.out.println("Durch den Wagenrücklauf wird die Zeile zurückgesetzt und der Teil nach dem" +
                "\r überschreibt die bestehende Zeile. \f ist in der Konsole nicht bemerkbar" +
                ", da es einen Seitenumbruch erzwingt");
        }

}
