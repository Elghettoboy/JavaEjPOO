import java.util.Scanner;//libreria scanneer
import Models.Libro;// importar el modelo
public class App {// nombre de  la clase
    public static void main(String[] args) throws Exception {// metodo principal
        Libro lb = new Libro();// crear un objeto libro

        lb.cargarLibro();// llamar metodo caragrlibro

        lb.mostrarInformacion();// llamar metodomostarinformacion
    }
        
}
