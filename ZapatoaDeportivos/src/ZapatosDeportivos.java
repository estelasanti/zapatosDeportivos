import java.util.Scanner;

public class ZapatosDeportivos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la actividad física del chico o chica (baloncesto, running, etc.): ");
        String actividadFisica = input.nextLine();

        System.out.println("Ingrese el estilo personal del chico o chica (minimalista, colorido, etc.): ");
        String estiloPersonal = input.nextLine();

        if (actividadFisica.equals("baloncesto")) {
            System.out.println("La diferencia en los zapatos deportivos está en el soporte lateral y la amortiguación.");
        } else if (actividadFisica.equals("running")) {
            System.out.println("La diferencia en los zapatos deportivos está en la pisada y el tipo de entrenamiento.");
        } else {
            System.out.println("No se puede determinar la diferencia en los zapatos deportivos sin conocer la actividad física.");
        }

        if (estiloPersonal.equals("minimalista")) {
            System.out.println("La diferencia en los zapatos deportivos está en el diseño sencillo y sin adornos.");
        } else if (estiloPersonal.equals("colorido")) {
            System.out.println("La diferencia en los zapatos deportivos está en el diseño llamativo y con colores vivos.");
        } else {
            System.out.println("No se puede determinar la diferencia en los zapatos deportivos sin conocer el estilo personal.");
        }

        input.close();
    }
}
