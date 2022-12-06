public class Main {
    public static void main(String[] args) {


        Human maksim = new Human();
        maksim.name = "Максим";
        maksim.yearOfBirth = 1988;
        maksim.town = "Минск";
        maksim.jobTitle = "бренд-менеджера.";

        System.out.println(maksim);


        Human anya = new Human();
        anya.name = "Аня";
        anya.yearOfBirth = 1993;
        anya.town = "Москва";
        anya.jobTitle = "методиста образовательных программ.";

        System.out.println(anya);


        Human katya = new Human();
        katya.name = "Катя";
        katya.yearOfBirth = 1992;
        katya.town = "Калининград";
        katya.jobTitle = "продакт-менеджера.";

        System.out.println(katya);


        Human artem = new Human();
        artem.name = "Артем";
        artem.yearOfBirth = 1995;
        artem.town = "Москва";
        artem.jobTitle = "директора по развитию бизнеса.";

        System.out.println(artem);
    }
}