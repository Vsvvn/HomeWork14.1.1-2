public class Human {
    public int yearOfBirth;
    public String name;
    public String town;
    public String jobTitle;

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился(ась) в " + yearOfBirth + " году." +
                "Я работаю на должности " + jobTitle + " Будем знакомы!";
    }
}