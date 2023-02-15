package bigO;

/**
 * 선택 정렬 알고리즘 분석을 위한 클래스
 * 1. 주어진 리스트에서 최솟값을 찾는다.
 * 2. 최솟값을 맨 앞 자리의 값과 교환한다.
 * 3. 맨 앞 자리를 제외한 나머지 값들 중 최솟값을 찾아 위와 같은 방법으로 반복한다.
 */
public class SelectionSort {
    /**
     * i와 j의 위치에 있는 값을 바꿉니다.
     */
    public static void swapElements(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * start로부터 시작하는 최솟값의 위치를 찾고(start 포함)
     * 배열의 마지막 위치로 갑니다.
     */
    public static int indexLowest(int[] array, int start) {
        int lowIndex = start;
        for (int i = start; i < array.length; i++) {
            if (array[i] < array[lowIndex]) {
                lowIndex = i;
            }
        }
        return lowIndex;
    }

    /**
     * 선택 정렬을 사용하여 요소를 정렬합니다.
     */
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int j = indexLowest(array, i);
            swapElements(array, i, j);
        }
    }
}
