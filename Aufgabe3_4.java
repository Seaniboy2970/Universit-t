public class Aufgabe3_4 {
    public static void main(String[] args) {
        String pfad = "C:\\Users\\seani\\Documents\\Schule\\Semester1\\Konzepte der Programmierung\\Java\\Aufgabe3_4.java";

        int letzterTrenner = Math.max(pfad.lastIndexOf('\\'), pfad.lastIndexOf('/'));
        int letzterPunkt = pfad.lastIndexOf('.');

        String verzeichnis = pfad.substring(0, letzterTrenner);
        String dateiname = pfad.substring(letzterTrenner + 1,
                letzterPunkt > letzterTrenner ? letzterPunkt : pfad.length());
        String extension = letzterPunkt > letzterTrenner
                ? pfad.substring(letzterPunkt + 1)
                : "";

        System.out.println("Extension: " + extension);
        System.out.println("Dateiname: " + dateiname);
        System.out.println("Verzeichnis: " + verzeichnis);
    }
}
