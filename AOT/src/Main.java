public class Main {
    public static void main(String[] args) {
        UPM upm = new VME(); // УПМ(VME)
        Horse titan = new UPMAdapter(upm); // Адаптер для УПМ(VME)
        Human human = new Human(); // Человек на лошади
        human.runner(titan); // Управляем титаном с помощью адаптера
    }
}