package JavaPractice01.Work.MiddleTest;

public interface Sortable {
    void sort(int[] arr);
    static int getMax(int[] arr){
        return arr[arr.length-1];
    }
    static int getMin(int[] arr){
        return arr[0];
    }

}
