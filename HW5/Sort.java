package HW5;

public class Sort {
    public void sort(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) // перегруппировка
            heapify(arr, n, i);
        for (int i = n - 1; i >= 0; i--) { // извлекаем элементы
            int temp = arr[0]; // текущий в конец
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0); // на уменьшенном
        }
    }

    // Процедура для преобразования в двоичную кучу поддерева с корневым узлом i,
    // индекс в arr[]. n - размер кучи
    void heapify(int arr[], int n, int i) {
        int largest = i; // init наибольший элемент как корень
        int l = 2 * i + 1; // левый = 2*i + 1
        int r = 2 * i + 2; // правый = 2*i + 2
        if (l < n && arr[l] > arr[largest]) // если левый больше корня
            largest = l;

        if (r < n && arr[r] > arr[largest]) // если правый больше наиб в дан.момент
            largest = r;

        if (largest != i) { // если largest не корень
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest); // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
        }
    }

    /**
     * Вспомогательная функция для вывода списка
     */

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}