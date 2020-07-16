package sort;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {56, 43, 9, 876, 567, 5221, 12, 3, 1, 8020};
        arr = HeapSort.heapSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    // 声明全局变量，用于记录数组array的长度；
    static int len;

    public static int[] heapSort(int[] array) {
        len = array.length;
        if (len < 1)
            return array;
        // 1.构建一个最大堆
        buildMaxHeap(array);
        // 2.循环将堆首位（最大值）与末位交换，然后在重新调整最大堆
        while (len > 0) {
            swap(array, 0, len - 1);
            len--;
            adjustToMaxHeap(array, 0);
        }
        return array;
    }

    public static void buildMaxHeap(int[] array) {
        // 从最后一个非叶子节点开始向上构造最大堆
        // for循环这样写会更好一点：i的左子树和右子树分别2i+1和2(i+1)
        for (int i = (len / 2 - 1); i >= 0; i--) {
            adjustToMaxHeap(array, i);
        }
    }

    public static void adjustToMaxHeap(int[] array, int i) {
        int maxIndex = i;
        // 如果有左子树，且左子树大于父节点，则将最大指针指向左子树
        if (i * 2 < len && array[i * 2] > array[maxIndex])
            maxIndex = i * 2; // 感谢网友矫正，之前是i*2+1
        // 如果有右子树，且右子树大于父节点，则将最大指针指向右子树
        if (i * 2 + 1 < len && array[i * 2 + 1] > array[maxIndex])
            maxIndex = i * 2 + 1; // 感谢网友矫正，之前是i*2+2
        // 如果父节点不是最大值，则将父节点与最大值交换，并且递归调整与父节点交换的位置。
        if (maxIndex != i) {
            swap(array, maxIndex, i);
            adjustToMaxHeap(array, maxIndex);
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

//	将一个数组（二叉树）调整成一个大顶堆
	public static void heapSortV2(int arr[]) {
//		将无序数列构造成一个大顶堆
		int temp = 0;
		for (int i = arr.length / 2 - 1; i >= 0; i--) {
			adjustHeap(arr, i, arr.length);
		}

		for (int j = arr.length - 1; j > 0; j--) {
			temp = arr[j];
			arr[j] = arr[0];
			arr[0] = temp;
//			调整完毕了
//			之后要不断adjust
			adjustHeap(arr, 0, j);
		}
		System.out.println(Arrays.toString(arr));
	}

	/**
	 * 完成将以i对应的非叶子节点的树调整成大顶堆
	 *
	 * @param arr待调整的数组
	 * @param i表示非叶子节点在数组中索引
	 * @param length         表示对多少个元素继续调整
	 */
	public static void adjustHeap(int arr[], int i, int length) {
		int temp = arr[i];
//		开始调整
		for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {
			if (arr[k] < arr[k + 1]) {// 说明左子节点的值小于右子节点
				k++;
			}
			if (arr[k] > temp) {
				arr[i] = arr[k];
				i = k;
			} else {
				break;
			}
		}
//		当for循环结束后，已经将以i为父节点的树的最大值放在了局部的顶部
		arr[i] = temp;
	}

}
