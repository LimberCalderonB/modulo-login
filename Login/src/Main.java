import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Estudiante limber = new Estudiante("limber", "Calderon", "Bernabe", "9465590", 29/4/1999, "Villa Satelite", 75497941, 123456789, "limbercitoyto@gmail.com", "LIMBER", "123456789QW", "666");

        Docente javier = new Docente("javier", "sander", "","789456123", 15/7/1975, "zona pro", 78451298, 784512325, "#######","javier", "7894512",4000);

        Persona persona1 = limber;
        Persona persona2 = javier;
        Usuario usuario1 = limber;
        Persona usuario2 = javier;

        Estudiante estudiante1 = (Estudiante) persona1;
        Estudiante estudiante2 = (Estudiante) persona2;


        Calendar calendario = Calendar.getInstance();
        calendario.set(Calendar.HOUR_OF_DAY, 5);
        final Date time = calendario.getTime();
    }
}
