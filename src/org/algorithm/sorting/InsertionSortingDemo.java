package org.algorithm.sorting;

import java.util.Arrays;

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


/**
 * 插入排序案例
 * <p>
 * Created by 泥瓦匠@bysocket.com on 19/5/15.
 */
public class InsertionSortingDemo {
    
    /**
     * 插入排序
     *
     * @param arr 能比较的对象数组
     * @param <T> 已排序的对象数组
     */
    public static <T extends Comparable> void insertionSort(T[] arr) {
        int j;
        
        // 从数组第二个元素开始，向前比较
        for (int p = 1; p < arr.length; p++) {
            T tmp = arr[p];
            // 循环，向前依次比较
            // 如果比前面元素小，交换位置
            for (j = p; (j > 0) && (tmp.compareTo(arr[j - 1]) < 0); j--) {
                arr[j] = arr[j - 1];
            }
            // 如果比前面元素大或者相等，那么这就是元素的位置，交换
            arr[j] = tmp;
        }
    }
    
    public static void main(String[] args) {
        Integer[] intArr = new Integer[] {2, 3, 1, 4, 3};
        
        System.out.println(Arrays.toString(intArr));
        insertionSort(intArr);
        System.out.println(Arrays.toString(intArr));
    }
}
