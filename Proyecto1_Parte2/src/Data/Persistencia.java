package Data;

import java.io.*;
import java.util.List;

public class Persistencia {
	public static void guardar(String ruta, Object objeto) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta))) {
            out.writeObject(objeto);
        }
    }

    public static Object cargar(String ruta) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(ruta))) {
            return in.readObject();
        }
    }
}
