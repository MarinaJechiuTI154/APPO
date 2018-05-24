package goodversion;

import java.util.ArrayList;

public class Help extends InterpretareComanda {
    @Override
    public String raspuns(ArrayList<String> comanda) {
       return "[/hello name] - Show the Name" + "\t" +
                "[/help] - Show available commands" + "\t" +
                "[/horoscope sign] - Horoscope for current date" + "\t" +
                "[/random Number1 Number2] - Random a number between Number1 and Number2" + "\t" +
                "[/time] - Show Current Time";
    }
}
