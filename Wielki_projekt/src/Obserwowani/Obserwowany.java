package Obserwowani;

import Obseratorzy.Obserwator;

public interface Obserwowany {
    public void zarejestrujObserwatora(Obserwator obserwator);
    public void usunObserwatora(Obserwator obserwator);
    public void powiadomObserwatorow();
}
