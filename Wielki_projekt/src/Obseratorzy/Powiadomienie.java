package Obseratorzy;

import Obserwowani.Obserwowany;
import PakietWydarzenie.Wydarzenie;

import java.util.ArrayList;

public class Powiadomienie implements Obserwator{

    private Wydarzenie nowe_wydarzenie;
    private Obserwowany kalendarz;

    public Powiadomienie(Obserwowany kalendarz){
        this.kalendarz = kalendarz;
        this.kalendarz.zarejestrujObserwatora(this);
    }
    @Override
    public void uaktualnijDane(Wydarzenie nowe_wydarzenie) {
        this.nowe_wydarzenie = nowe_wydarzenie;
        // tutaj dac metode ktora wysyla nowe wydarzenie
        wyslijPowiadomienie();
    }
    public void wyslijPowiadomienie(){
        // napisac metode wysylajaca powiadomieni
    }

}
