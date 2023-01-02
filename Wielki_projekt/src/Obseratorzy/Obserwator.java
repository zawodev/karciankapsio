package Obseratorzy;
import Obserwowani.Obserwowany;
import PakietWydarzenie.Wydarzenie;

public interface Obserwator {
    public void uaktualnijDane(Wydarzenie nowe_wydarzenie);
}
