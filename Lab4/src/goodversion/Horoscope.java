package goodversion;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Horoscope extends InterpretareComanda {
    @Override
    public String raspuns(ArrayList<String> comanda) {
        String zodie = comanda.get(1) + ".txt";
        String content = null;
        try {
            content = readFile(zodie);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (content == null || comanda.size() > 2) {
            return "Incorrect Format [/horoscope sign]";
        } else {
            return content;
        }
    }

    public static String readFile(String filename) throws IOException {
        String content = null;
        File file = new File(filename); // For example, foo.txt
        FileReader reader = null;
        try {
            reader = new FileReader(file);
            char[] chars = new char[(int) file.length()];
            reader.read(chars);
            content = new String(chars);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
        System.out.println(content);
        return content;
    }
}
