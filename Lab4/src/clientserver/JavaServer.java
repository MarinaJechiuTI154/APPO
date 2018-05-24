//package clientserver;
//
//
//
//import goodversion.Hello;
//import goodversion.Help;
//import goodversion.Horoscope;
//import goodversion.Time;
//
//import java.io.*;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.text.BreakIterator;
//import java.text.SimpleDateFormat;
//import java.util.*;
//
//
//public class JavaServer {
//
//    static List<String> parsedString;
//
//
//    public static void main(String[] args) throws ClassNotFoundException {
//        int portNumber = 1234;
//        OutputStream clientOut;
//        PrintWriter pw;
//        HashMap<String, ? exte> map = new HashMap<>();
//        map.put("help", new Help());
//        map.put("horoscope", new Horoscope());
//        map.put("hello", new Hello());
//        map.put("random", new Random());
//        map.put("time", new Time());
//        ServerSocket server = null;
//
//
//        try {
//            server = new ServerSocket(portNumber);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//        while (true) {
//            try {
//                //Listent for a connection to be made to this socket
//                //and accepts it. The method blocks until a connection is made
//                System.out.println("Waiting for connect request...");
//                Socket client = server.accept();
//
//                System.out.println("Connection established...");
//                String clientAddress = client.getInetAddress().getHostAddress();
//                int port = client.getPort();
//                System.out.println("Client addres: [" + clientAddress + "]\nCliet port: [" + port + "]");
//
//                InputStream clientIn = client.getInputStream();
//                BufferedReader br = new BufferedReader(new InputStreamReader(clientIn));
//                String clientMessage = br.readLine();
//                System.out.println("Mesage received: " + clientMessage);
//                parsedString = parseString(clientMessage.toLowerCase());
//                 System.out.println(parsedString.get(0));
//                for ( String key : map.keySet() ) {
//                    if(key.equalsIgnoreCase(parsedString.get(0))){
//                        Object o = map.get(key);
//
//                    }
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }
//
//
//
//        }
//
//
//
//    public static List<String> parseString (String sentence) {
//        List<String> words = new ArrayList<>();
//        BreakIterator breakIterator = BreakIterator.getWordInstance();
//        breakIterator.setText(sentence);
//        int lastIndex = breakIterator.first();
//        while (BreakIterator.DONE != lastIndex) {
//            int firstIndex = lastIndex;
//            lastIndex = breakIterator.next();
//            if (lastIndex != BreakIterator.DONE && Character.isLetterOrDigit(sentence.charAt(firstIndex))) {
//                words.add(sentence.substring(firstIndex, lastIndex));
//            }
//        }
//        return words;
//    }
//}
//
//
//
//
//
