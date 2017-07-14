package sk.bsc.main;

import com.sun.xml.internal.messaging.saaj.util.FinalArrayList;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.List;
import java.nio.file.*;

/**
 * Created by PCJAKM02 on 14. 7. 2017.
 */
public class Currencies {

    private List<String> currencies;

    public Currencies() {
        try {
//            ClassLoader classLoader = getClass().getClassLoader();
//            File file = new File(classLoader.getResource("currencies.txt").getFile());
//            String path = file.getPath();
//            System.out.println("PATH IS : " + path);

//            currencies=Files.readAllLines(Paths.get(getClass().getClassLoader().getResource("currencies.txt")), Charset.forName("UTF-8"));
            currencies=Files.readAllLines(Paths.get(ClassLoader.getSystemResource("currencies.txt").toURI()), Charset.forName("UTF-8"));
//            currencies=Files.readAllLines(Paths.get("C:\\Users\\PCJAKM02\\Documents\\PayTrack\\out\\production\\PayTrack\\currencies.txt"), Charset.forName("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public List<String> getCurrencies() {
        return currencies;
    }
}
