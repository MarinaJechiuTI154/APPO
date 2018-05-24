package goodversion;

import java.io.PrintWriter;
import java.util.ArrayList;

public class Random extends InterpretareComanda {
    @Override
    public String raspuns(ArrayList<String> comanda) {
        if (comanda.size() == 3) {
            String serverMessage;
            if (isInteger(comanda.get(1)) && isInteger(comanda.get(2)) && (Integer.parseInt(comanda.get(1)) <= Integer.parseInt(comanda.get(2)))) {
                java.util.Random r = new java.util.Random();
                int high = Integer.parseInt(comanda.get(2));
                int low = Integer.parseInt(comanda.get(1));
                int result = r.nextInt(high - low + 1) + low;
                serverMessage = String.valueOf(result);
                return serverMessage;
            } else {
                return "Incorrect Format [/random Number1 Number2]";

            }
        } else {
            return "Incorrect Format [/random Number1 Number2]";

        }
    }

    public static boolean isInteger(Object object) {
        if (object instanceof Integer) {
            return true;
        } else {
            String string = object.toString();

            try {
                Integer.parseInt(string);
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }
}
