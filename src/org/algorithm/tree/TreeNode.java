package org.algorithm.tree;

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
