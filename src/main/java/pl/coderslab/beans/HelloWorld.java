package pl.coderslab.beans;

public class HelloWorld {
    private String message;

    public HelloWorld(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void printMessage() {
    }
}
//Zadanie 2 - rozwiązywane z wykładowcą
//Utwórz klasę HelloWorld w pakiecie pl.coderslab.beans z atrybutem typu String oraz nazwie message.
//Utwórz konstruktor ustawiający pole message, zdefiniuj gettery i settery.
//Utwórz ziarno w konfiguracji xml o nazwie helloWorld klasy pl.coderslab.beans.HelloWorld.
//Uzupełnij konfigurację ziaren, tak by wstrzyknąć za pomocą konstruktora do klasy HelloWorld dla atrybutu message wartość Witaj Spring.
//Pobierz ziarno w metodzie main a następnie wywołaj na nim metodę getMessage.