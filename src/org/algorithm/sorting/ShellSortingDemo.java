package org.algorithm.sorting;

/*
 * Copyright [2015-2019] [泥瓦匠BYSocket]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import java.util.Arrays;

/**
 * 哈希排序案例
 * <p>
 * Created by 泥瓦匠@bysocket.com on 19/5/21.
 */
public class ShellSortingDemo {
    
    /**
     * 哈希排序（二分插入排序）
     *
     * @param arr 能比较的对象数组
     * @param <T> 已排序的对象数组
     */
    public static <T extends Comparable> void shellSort(T[] arr) {
        int j;
    
        for (int gap = arr.length / 2 ; gap > 0; gap /= 2) {
            // 从数组第 gap 个元素开始，向前比较
            for (int p = gap; p < arr.length; p++) {
                T tmp = arr[p];
                // 循环，向前依次比较
                // 如果比前面元素小，交换位置
                for (j = p; (j >= gap) && (tmp.compareTo(arr[j - gap]) < 0); j-= gap) {
                    arr[j] = arr[j - gap];
                }
                // 如果比前面元素大或者相等，那么这就是元素的位置，交换
                arr[j] = tmp;
            }
        }
    }
    
    public static void main(String[] args) {
        Integer[] intArr = new Integer[] {2, 3, 1, 4, 3};
    
        System.out.println(Arrays.toString(intArr));
        shellSort(intArr);
        System.out.println(Arrays.toString(intArr));
    }
}
