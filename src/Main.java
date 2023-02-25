import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> arrayList = new ArrayList<>();
        arrayList.add(new User("Ani", 14));
        arrayList.add(new User("Bob", 49));
        arrayList.add(new User("Babken", 88));
        arrayList.add(new User("Artur", 38));
        arrayList.add(new User("Karen", 24));
        arrayList.add(new User("Liana", 68));
        arrayList.add(new User("Lilit", 74));
        arrayList.add(new User("Davit", 89));
        System.out.println(UserServise.maxAgeUser(arrayList));
        System.out.println(UserServise.secondMaxAgeUser(arrayList));
        System.out.println(UserServise.maxUserDigite(arrayList));
        System.out.println(UserServise.min50User(arrayList));
        System.out.println(UserServise.max50User(arrayList));
        System.out.println(UserServise.findName(arrayList));
        System.out.println(arrayList.indexOf(UserServise.findName(arrayList)));


    }

}