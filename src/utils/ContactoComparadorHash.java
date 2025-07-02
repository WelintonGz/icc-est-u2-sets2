package utils;

import java.util.Comparator;

import Models.Contacto;

public class ContactoComparadorHash implements Comparator<Contacto>{
    @Override
    public int compare(Contacto o1, Contacto o2) {
        return Integer.compare(o1.hashCode(), o2.hashCode());
    }
    
}
