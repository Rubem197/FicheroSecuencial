import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File fichero = new File("palabras.txt");
        File ficheroSalida = new File("Arrelgado.txt");
        FileReader fr= new FileReader(fichero);
        FileWriter fw = new FileWriter(ficheroSalida);

        int i;

        char palabras[] = new char[5];

        while ((i = fr.read(palabras)) != -1){
            fw.write(palabras);
            fw.append("\n");
        }

        fr.close();
        fw.close();

    }
}