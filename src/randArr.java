 class randArr {

     public static void main(String[] args){
         MinMaxElem elem = new MinMaxElem();
         MinMaxElem elem2 = new MinMaxElem();
         int[] array = new int[20];
         elem.random(array);
         elem.maxNegativeElem(array);
         elem2.minPositiveElem(array);

     }

}

class MinMaxElem {
    int index = -1;
    //метод поиска наибольшего отрицательного элелемента в массиве
    void maxNegativeElem(int[] array) {
        for (int i = 0; i < 20; i++) {
            if (array[i] < 0 && index == -1)
                index = i;
            else if (array[i] < 0 && array[i] > array[index])
                index = i;
        }
        System.out.println("Индекс: " + index + " Макс.Отриц.Элемент = " + array[index]);
    }
    //метод поиска наименьшего положительного элелемента в массиве
     void minPositiveElem(int[] array) {
         for (int i = 0; i < 20; i++) {
             if (array[i] > 0 && index == -1)
                 index = i;
             else if (array[i] > 0 && array[i] < array[index])
                 index = i;
         }
         System.out.println("Индекс: " + index + " Мин.Положит.Элемент = " + array[index]);
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