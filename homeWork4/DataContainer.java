package HomeWork.homeWork4;


import java.util.Arrays;
import java.util.Comparator;

public class DataContainer <T>{

    private T[] data;
    private int counter = 0;

    public DataContainer(T[] data){
    this.data = data;
    }

    /** Возвращает индекс добваленного элемента и добовляет новый элемент в массив,
     *  испульзуя метод Arrays.copyOf
     *
     * @param item объект которое добовляем
     * @return индекс добавленного элемента, если item равен null то -1
     */
    public int add(T item){
        if(item == null){
            return -1;
        }
        if(counter < data.length){
            data[counter] = item;
            return counter++;
        }
        if (counter == data.length) {
            int length = counter++;
            data = Arrays.copyOf(data, ++length);
            data[--length] = item;
            return length;
        }
        return 0;
    }

    /** Возвращает обощенный тип Т, элемент под индексом который дан в парамаетрах метода
     *
     * @param index индекс элемента который нужно вернуть
     * @return элемент который находится под индексом переданный в параметрах
     */
    public T get(int index){
        if (index < data.length){
            return data[index];
        }else
            return null;
    }

    /**
     * @return массив обобщенного типа Т
     */
    public T[] getItems(){
        return data;
    }

    /** Возвращает булевое выражение, удаление происходит с ячейкой вместе
     *
     * @param index элемент под индексом который нужно удалить
     * @return  true если элемент удален а если нет то false
     */
    public boolean delete(int index){
        if(index < data.length){
            data[index] = null;
            for (int i = index + 1; i < data.length; i++) {
                data[i-1] = data[i];
                data[i] = null;
            }
            data = Arrays.copyOf(data, data.length -1);
            return true;
        }else {
            return false;
        }
    }

    /** Возвращает булевое выражение, удаляет элемент переданный в параметрах,
     *      удаление происходит с ячейкой вместе
     * @param item элемент который нужно удалить
     * @return  true если элемент удален, false если элемента нет
     */

    public boolean delete(T item){
        for (int i = 0; i < data.length; i++) {
            if(item == data[i]){
                data[i] = null;
            for (int j = i+1; j < data.length; j++) {
                data[j-1] = data[j];
                data[j] = null;
                }
            data = Arrays.copyOf(data, data.length-1);
            return true;
            }
        }
        return false;
    }

    /**
     *  присваевает всем элементам массива null
     * @return  Возвращает строковое представление содержимого указанного массива
     */
    @Override
    public String toString() {
        Arrays.fill(data, null);
        return Arrays.toString(data);
    }

    /**
     *  Сортирует с помошью Компоратора
     * @param comporator   реализованный компоратор
     */
    public void sort(Comparator<T> comporator){
       Arrays.sort(data, comporator);
    }

    public static void sort(DataContainer<? extends Comparable> dataContainer){   //за решение этого метода не уверен
        Arrays.sort(dataContainer.data);
    }

}
