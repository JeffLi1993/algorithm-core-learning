package org.algorithm.comparable;

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
 * 字符串按字典顺序排序案例
 *
 * Created by bysocket on 19/5/9.
 */
public class StringComparisonDemo {
    
    public static void main(String[] args) {
        String foo = "ABC";
        
        // 前面和后面每个字符完全一样，返回 0
        String bar01 = "ABC";
        System.out.println(foo.compareTo(bar01));
        
        // 前面每个字符完全一样，返回：后面就是字符串长度差
        String bar02 = "ABCD";
        String bar03 = "ABCDE";
        System.out.println(foo.compareTo(bar02)); // -1 (前面相等,foo 长度小 1)
        System.out.println(foo.compareTo(bar03)); // -2 (前面相等,foo 长度小 2)
        
        // 前面每个字符不完全一样，返回：出现不一样的字符 ASCII 差
        String bar04 = "ABD";
        String bar05 = "aABCD";
        System.out.println(foo.compareTo(bar04)); // -1  (foo 的 'C' 字符 ASCII 码值为 67，bar04 的 'D' 字符 ASCII 码值为 68。返回 67 - 68 = -1)
        System.out.println(foo.compareTo(bar05)); // -32 (foo 的 'A' 字符 ASCII 码值为 65，bar04 的 'a' 字符 ASCII 码值为 97。返回 65 - 97 = -32)
    }
}
