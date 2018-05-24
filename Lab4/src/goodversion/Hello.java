package goodversion;

import java.util.ArrayList;

public class Hello extends InterpretareComanda {
    @Override
    public String raspuns(ArrayList<String> comanda) {
        String serverMessage = "";
        for (int i = 1; i < comanda.size(); i++) {
            serverMessage += comanda.get(i) + " ";
        }
        return serverMessage;
    }
}
