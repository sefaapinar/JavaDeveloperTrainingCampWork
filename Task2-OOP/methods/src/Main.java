public class Main {
    public static void main(String[] args) {
        findNumber();
    }

    public static void findNumber() {
        int[] number = new int[]{1, 2, 5, 7, 9, 0};
        int search = 5;
        boolean isExist = false;
        for (int i : number) {
            if (search == i) {
                isExist = true;
                System.out.println(isExist);
                break;
            }

        }
        if (isExist) {
            message("Number is available " + search);
        } else {
            message("Number is not available " + search);
        }
    }

    public static void message(String message) {
        System.out.println(message);
    }

    //camelcase - fonksiyon isimleri bu standartta yazılır.
    //pascalcase - class isimleri bu şekilde yazılır.
}
