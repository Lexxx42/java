package java_gb.lecture2;

import java.util.logging.*;

public class logging3 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(logging3.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        XMLFormatter xml = new XMLFormatter();
        ch.setFormatter(xml);
        logger.log(Level.WARNING, "Тестовое логирование");
        logger.info("Тестовое логирование");
    }
}