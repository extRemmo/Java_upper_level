public class randArray {
    public static void main(String[] args){
        int[] array;
        array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 21) - 10);
            System.out.println(array[i]);
        }

        //public static void maxNegativeElem(String[] args) {
            int index = -1;
            for (int i = 0; i < 20; i++) {
                if (array[i] < 0 && index == -1)
                    index = i;
                else if (array[i] < 0 && array[i] > array[index])
                    index = i;
            //}
                }
            System.out.println("Индекс: " + index + " Макс.Отриц.Элемент = " + array[index]);

        //public static void minPositiveElem(String[] args) {
        int index2 = -1;
        for (int i = 0; i < 20; i++) {
            if (array[i] > 0 && index2 == -1)
                index2 = i;
            else if (array[i] > 0 && array[i] < array[index2])
                index2 = i;
        //}
             }
        System.out.println("Индекс: " + index2 + " Мин.Положит.Элемент = " + array[index2]);

    }
}
