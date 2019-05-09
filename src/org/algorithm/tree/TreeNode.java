package org.algorithm.tree;
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
 * 节点
 */
class TreeNode {

    /**
     * 节点值
     */
    int value;

    /**
     * 左节点
     */
    TreeNode left;

    /**
     * 右节点
     */
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
        left  = null;
        right = null;
    }
}
