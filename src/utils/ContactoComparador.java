package utils;

import java.util.Comparator;

import Models.Contacto;

public class ContactoComparador implements Comparator<Contacto>{

    @Override
    public int compare(Contacto o1, Contacto o2) {
        //primero comparo por el apellido alfabeticamente
        int resultComparacionApellido = o1.getApellido().compareToIgnoreCase(o2.getApellido());
        if (resultComparacionApellido!=0) {
            return resultComparacionApellido;
        }

        //si los apellidos son iguales comparar el nombre
        int resultComparacionNombre = o1.getNombre().compareToIgnoreCase(o2.getNombre());
        return resultComparacionNombre;

    }
    
}
