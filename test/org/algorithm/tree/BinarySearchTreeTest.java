package org.algorithm.tree;
/*
 * Copyright [2015-2019] [Jeff Lee]
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
 * 二叉搜索树(BST)测试案例 {@link BinarySearchTree}
 *
 * Created by bysocket on 16/7/10.
 */
public class BinarySearchTreeTest {

    public static void main(String[] args) {
        BinarySearchTree b = new BinarySearchTree();
        b.insert(3);b.insert(8);b.insert(1);b.insert(4);b.insert(6);
        b.insert(2);b.insert(10);b.insert(9);b.insert(20);b.insert(25);

        // 打印二叉树
        b.toString(b.root);
        System.out.println();

        // 是否存在节点值10
        TreeNode node01 = b.search(10);
        System.out.println("是否存在节点值为10 => " + node01.value);
        // 是否存在节点值11
        TreeNode node02 = b.search(11);
        System.out.println("是否存在节点值为11 => " + node02);

        // 删除节点8
        TreeNode node03 = b.delete(8);
        System.out.println("删除节点8 => " + node03.value);
        b.toString(b.root);


    }
}
