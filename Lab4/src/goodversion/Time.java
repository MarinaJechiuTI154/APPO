package goodversion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Time extends  InterpretareComanda {
    @Override
    public String raspuns(ArrayList<String> comanda) {
        if (comanda.size() > 1) {
            return "Incorrect Format [/time]";

        } else {
            String serverMessage;
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            serverMessage = sdf.format(cal.getTime());
            return serverMessage;
        }
    }
}
