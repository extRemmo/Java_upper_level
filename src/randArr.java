import java.lang.module.FindException;

class randArr {

     public static void main(String[] args){
         // объявить , выделить память и инициализировать объекты типа MinMaxElem
         MinMaxElem elem = new MinMaxElem();

         int[] array = new int[20];
         //получить сгенерированный массив
         elem.random(array);
         /*получить данные по мин/макс положительным и отрицательным числам в массиве
         записать индекс найденного элемента в переменную "а"
          */

         int a1 = elem.minPositiveElem(array);
         int a2 = elem.maxNegativeElem(array);

         //поменять указанные в задаче элементы местами
         int temp = array[a1];
         array[a1] = array[a2];
         array[a2] = temp;
         // вывести финальный массив
         for (int i:array) {
             System.out.println(i);
         }
     }

}

class MinMaxElem {

    //метод поиска наибольшего отрицательного элелемента в массиве
    int maxNegativeElem(int[] array) {
        int index = -1;
        for (int i = 0; i < 20; i++) {
            if (array[i] < 0 && index == -1)
                index = i;
            else if (array[i] < 0 && array[i] > array[index])
                index = i;
        }
        System.out.println("Индекс: " + index + " Макс.Отриц.Элемент = " + array[index]);
        return index;
    }
    //метод поиска наименьшего положительного элелемента в массиве

     int minPositiveElem(int[] array) {
         int index = -1;
         for (int i = 0; i < 20; i++) {
             if (array[i] > 0 && index == -1)
                 index = i;
             else if (array[i] > 0 && array[i] < array[index])
                 index = i;
         }
         System.out.println("Индекс: " + index + " Мин.Положит.Элемент = " + array[index]);
         return index;
     }
    //метод генерации массива от -10 до 10
    void random(int[] array) {
        //array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 21) - 10);
            System.out.println(array[i]);
        }
    }
}