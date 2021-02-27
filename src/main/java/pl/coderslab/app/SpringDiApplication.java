package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.EmailService;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.beans.MessageSender;

public class SpringDiApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.printMessage();
       EmailService emailService =
                context.getBean("emailService", EmailService.class);
       emailService.send();
        MessageSender messageSender =
                context.getBean("messageSender", MessageSender.class);
        messageSender.sendMessage();
        messageSender.sendMessageFromProperty();
        context.close();
    }
}
//Zadanie 1 - rozwiązywane z wykładowcą
//W uprzednio utworzonym projekcie dodaj plik konfiguracyjny Springa o nazwie beans.xml.
//Utwórz pakiety pl.coderslab.beans oraz pl.coderslab.app.
//Utwórz klasę SpringDiApplication z metodą main w pakiecie pl.coderslab.app.
//W metodzie main klasy SpringDiApplication utwórz obiekt kontekstu na podstawie konfiguracji.
//Uruchom i sprawdź działanie aplikacji.