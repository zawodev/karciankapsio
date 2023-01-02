package PakietWydarzenie;
import PakietProjektowy.Uzytkownik;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Wydarzenie {
    String nazwa_wydarzenia;
    LocalDateTime data_wydarzenia;
    Uzytkownik dodajacy_wydarzenie;
    String opis_wydarzenia;

    public Wydarzenie(String nazwa_wydarzenia, LocalDateTime data_wydarzenia, Uzytkownik dodajacy_wydarzenie, String opis_wydarzenia) {
        this.nazwa_wydarzenia = nazwa_wydarzenia;
        this.data_wydarzenia = data_wydarzenia;
        this.dodajacy_wydarzenie = dodajacy_wydarzenie;
        this.opis_wydarzenia = opis_wydarzenia;
    }
}
