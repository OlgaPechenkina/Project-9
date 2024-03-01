public class Post {

    public String name;
    public String passport;
    public String patronymic;
    public String phone;
    public String surname;
    public String subscription = "subscription :true";
    public FormDate birthday;
    public int month;
    public int year;


    public static class FormDate {
        public int day;
    }
}


