package Controllers;

import java.util.Set;
import java.util.TreeSet;

import Models.Contacto;
import utils.ContactoComparador;

public class ContactoController {
    public ContactoController(){
        runTreeContacto();
        runTreeContactoNumeros();
        runTreeContactoHash();
    }

    public void runTreeContacto(){
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparador());
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Gonzalez", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));

        for(Contacto contacto : agenda){
            System.out.println(contacto);
        }
    }

    public void runTreeContactoNumeros(){
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparador());
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Gonzalez", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));

        for(Contacto contacto : agenda){
            System.out.println(contacto);
        }
    }

    public void runTreeContactoHash(){
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparador());
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Gonzalez", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));

        for(Contacto contacto : agenda){
            System.out.println(contacto);
        }
    }
}
