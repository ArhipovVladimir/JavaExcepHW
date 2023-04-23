//Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный
// одномерный массив.
// Метод должен пройтись по каждому элементу и проверить что он не равен null.
//А теперь реализуйте следующую логику:
//Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
//Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”


public class Main {

    public static void main(String[] args) {
        Integer [] array = {1,0,0,null,1,null,0,1};

        int res = checkArray(array);
        try {
            if (res > 0) {
                throw new RuntimeException("Имеет элемент null");
            }
        } finally {
            System.out.printf("элементов null %d", res);
            System.out.println();
        }


    }

    public static Integer checkArray(Integer[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==null){
                count++;
                System.out.printf("индекс null %d", i);
                System.out.println();
            }
        }
        return count;
    }


}