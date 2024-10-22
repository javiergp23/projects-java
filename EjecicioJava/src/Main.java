import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre del personaje principal");
        String nombrePersonaje = teclado.nextLine();
        System.out.println("Por favor ingresse el nombre del pueblo");
        String pueblo = teclado.nextLine();

        String cuento = "Había una vez, en un pequeño pueblo llamado "+ pueblo +" rodeado de montañas, un joven llamado "+ nombrePersonaje +". Desde que era niño, "+ nombrePersonaje +" tenía un sueño muy claro: construir una máquina que pudiera volar sin necesidad de alas ni hélices. Todos en el pueblo lo conocían como el \"soñador\", pero muchos también se reían de sus ideas. \"Eso es imposible\", le decían. \"Si no es un avión ni un globo, ¿cómo va a volar?\"\n" +
                "\n" +
                "Pero "+ nombrePersonaje +" no se desanimaba. Había pasado años estudiando libros de física y mecánica en la biblioteca local, y su imaginación volaba cada vez que veía las nubes pasar sobre su cabeza. Un día, decidió que era el momento de intentar hacer realidad su sueño. Con la poca maquinaria que tenía y piezas viejas que había encontrado en talleres y basureros, empezó a construir su máquina en secreto en el granero de su abuelo.\n" +
                "\n" +
                "Después de meses de trabajo, ajustes y un sinfín de fracasos, "+ nombrePersonaje +" creó algo que parecía sacado de una historia de ciencia ficción: una esfera metálica brillante, con engranajes que giraban suavemente en su interior y paneles que se abrían para dejar escapar pequeños destellos de luz. Era su \"Esfera del Aire\", como él la llamó, una máquina que funcionaba aprovechando las corrientes de energía magnética de la tierra y el cielo.\n" +
                "\n" +
                "El día de la prueba llegó, y aunque "+ nombrePersonaje +" sabía que podía fallar, estaba listo para intentarlo. Al amanecer, llevó la Esfera del Aire a la cima de una colina, encendió los interruptores y esperó. Por un momento, no pasó nada, y pensó que todo había sido en vano. Pero entonces, la esfera empezó a elevarse suavemente, como si fuera empujada por una mano invisible.\n" +
                "\n" +
                "La gente del pueblo miraba desde lejos con asombro mientras la máquina de "+ nombrePersonaje +" se elevaba más y más, flotando en el aire sin esfuerzo. Algunos corrieron a ver, otros no podían creer lo que estaban viendo. "+ nombrePersonaje +" rió de pura alegría y se dejó caer en el suelo, mirando cómo su creación surcaba el cielo por primera vez.\n" +
                "\n" +
                "Desde ese día, "+ nombrePersonaje +" ya no fue visto como el \"soñador\" que perseguía imposibles, sino como el joven que había logrado hacer volar sus sueños. La Esfera del Aire no solo cambió su vida, sino que inspiró a todos en el pueblo a creer que lo imposible, con esfuerzo y pasión, podría convertirse en realidad.";

        System.out.println(cuento);
    }
}