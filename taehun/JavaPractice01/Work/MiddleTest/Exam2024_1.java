package JavaPractice01.Work.MiddleTest;

public class Exam2024_1 {
    private static void printArray(int[] arr){
        for(int item : arr){
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {41, 22, 10, 33, 1, 61, 88};
        int[] arr2 = {14, 42, 21, 73, 3, 86, 8};

        Sortable bubbleSort = new BubbleSort();
        System.out.println("<<Bubble Sort>>");
        System.out.print("sorting하기 전 : ");
        printArray(arr1);
        bubbleSort.sort(arr1);
        System.out.print("sorting한 후 : ");
        printArray(arr1);
        //Sortable static Method 이용
        System.out.println("최대값 : " + Sortable.getMax(arr1));
        System.out.println("최소값 : " + Sortable.getMin(arr1));

        Sortable selectionSort = new SelectionSort();
        System.out.println("<<Selection Sort>>");
        System.out.print("sorting하기 전 : ");
        printArray(arr2);
        selectionSort.sort(arr2);
        System.out.print("sorting한 후 : ");
        printArray(arr2);
        System.out.println("최대값 : " + Sortable.getMax(arr2));
        System.out.println("최소값 : " + Sortable.getMin(arr2));

    }
}
