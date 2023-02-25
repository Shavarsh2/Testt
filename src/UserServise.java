import java.util.ArrayList;

public class UserServise {
    private static int i = 0;

    public static User findName(ArrayList<User> list) {
        String st = "babken";
        User user = null;
        for (int j = 0; j < list.size(); j++) {
            if (st.equals(list.get(j).getName().toLowerCase())) {
                user = list.get(j);
            }
        }
        return user;
    }

    public static ArrayList<User> max50User(ArrayList<User> list) {
        ArrayList<User> arrayList = new ArrayList<>();
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j).getAge() > 50) {
                arrayList.add(list.get(j));
            }
        }
        return arrayList;
    }

    public static ArrayList<User> min50User(ArrayList<User> list) {
        ArrayList<User> arrayList = new ArrayList<>();
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j).getAge() < 50) {
                arrayList.add(list.get(j));
            }
        }
        return arrayList;
    }

    public static User maxAgeUser(ArrayList<User> list) {
        User user = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (user.getAge() < list.get(i).getAge()) {
                user = list.get(i);
            }
        }
        return user;
    }

    public static User secondMaxAgeUser(ArrayList<User> list) {
        User user = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge() > user.getAge() && list.get(i).getAge() != maxAgeUser(list).getAge()) {
                user = list.get(i);
            }
        }
        return user;
    }

    private static int sumDigite(ArrayList<User> list) {
        int sum = 0;
        for (; i < list.size(); ) {
            int num = list.get(i).getAge();
            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }
            i++;
            break;
        }
        if (sum == 0) {
            try {
                throw new sumExeption("no user ");
            } catch (sumExeption e) {
                System.err.println(e.getMessage());
                //return -1;
            }
        }
        return sum;
    }

    public static User maxUserDigite(ArrayList<User> list) {
        int[] arr = new int[list.size()];
        User user = list.get(0);
        for (int j = 0; j < list.size(); j++) {
            int sum = sumDigite(list);
            arr[j] = sum;
        }
        int max = arr[0];
        for (int j = 0; j < list.size(); j++) {
            if (max < arr[j]) {
                max = arr[j];
                user = list.get(j);
            }
        }

        return user;
    }
}
