package me.krios2146.easy;

import me.krios2146.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumDepthOfBinaryTreeTest {

    private final MinimumDepthOfBinaryTree test = new MinimumDepthOfBinaryTree();

    @Test
    void minDepth_ShouldReturn4() {
        TreeNode node11 = new TreeNode(11, null, null);
        TreeNode node10 = new TreeNode(10, null, null);
        TreeNode node8 = new TreeNode(8, null, node11);
        TreeNode node9 = new TreeNode(9, node10, null);
        TreeNode node7 = new TreeNode(7, node9, node8);
        TreeNode root = new TreeNode(2, node7, null);

        assertEquals(4, test.minDepth(root));
    }

    @Test
    void minDepth_ShouldReturn5() {
        TreeNode node6 = new TreeNode(6, null, null);
        TreeNode node5 = new TreeNode(5, null, node6);
        TreeNode node4 = new TreeNode(4, null, node5);
        TreeNode node3 = new TreeNode(3, null, node4);
        TreeNode root = new TreeNode(2, null, node3);

        assertEquals(5, test.minDepth(root));
    }

    @Test
    void minDepth_ShouldReturn2() {
        TreeNode node7 = new TreeNode(10, null, null);
        TreeNode node15 = new TreeNode(8, null, null);
        TreeNode node20 = new TreeNode(7, node15, node7);
        TreeNode node9 = new TreeNode(9, null, null);
        TreeNode root = new TreeNode(3, node9, node20);

        assertEquals(2, test.minDepth(root));
    }
}