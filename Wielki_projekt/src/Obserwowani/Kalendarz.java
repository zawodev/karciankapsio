package Obserwowani;

import Obseratorzy.Obserwator;
import PakietWydarzenie.Wydarzenie;

import java.util.ArrayList;

public class Kalendarz implements Obserwowany{

    // lista obserwatorow
    ArrayList<Obserwator> lista_obserwatorow = new ArrayList<>();

    // stan obiektu obserwowanego
    private ArrayList<Wydarzenie> lista_wydarzen;
    @Override
    public void zarejestrujObserwatora(Obserwator obserwator) {
        lista_obserwatorow.add(obserwator);
    }

    @Override
    public void usunObserwatora(Obserwator obserwator) {
        lista_obserwatorow.remove(obserwator);
    }

    @Override
    public void powiadomObserwatorow() {
        for(int i = 0; i<lista_obserwatorow.size(); i++){
            lista_obserwatorow.get(i).uaktualnijDane(lista_wydarzen.get(lista_wydarzen.size()-1));
        }
    }
}
