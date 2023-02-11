package java_gb.lecture2;

import java.io.IOException;
import java.util.logging.*;

public class logging4 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(logging2.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("log.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.log(Level.WARNING, "Тестовое логирование");
        logger.info("Тестовое логирование");
    }
}