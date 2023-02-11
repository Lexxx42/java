package java_gb.lecture2;

import java.util.logging.*;

public class logging2 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(logging2.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);
        logger.log(Level.WARNING, "Тестовое логирование");
        logger.info("Тестовое логирование");
    }
}
