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
 * Arrays.sort 排序案例
 * <p>
 * Created by 泥瓦匠@bysocket.com on 19/5/28.
 */
public class ArraysSortDemo {
    
    public static void main(String[] args) {
    
        Integer[] intArr = new Integer[] {2, 3, 1, 4, 3};
    
        System.out.println(Arrays.toString(intArr));
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
    }
}
