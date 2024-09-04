package com.walcker.logicchallange.areSymetric

fun main() {
    val tree1 = TreeNode(
        5,
        listOf(
            TreeNode(
                8,
                listOf(
                    TreeNode(1)
                )
            ),
            TreeNode(
                2,
                listOf(
                    TreeNode(
                        7,
                        listOf(
                            TreeNode(6)
                        )
                    ),
                    TreeNode(
                        9,
                        listOf(
                            TreeNode(3),
                            TreeNode(0)
                        )
                    )
                )
            )
        )
    )

    val tree2 = TreeNode(
        5,
        listOf(
            TreeNode(
                8,
                listOf(
                    TreeNode(1)
                )
            ),
            TreeNode(
                2,
                listOf(
                    TreeNode(
                        7,
                        listOf(
                            TreeNode(6)
                        )
                    ),
                    TreeNode(
                        9,
                        listOf(
                            TreeNode(3),
                            TreeNode(0)
                        )
                    )
                )
            )
        )
    )

    val result = areSymmetric(tree1, tree2)
    println(result)
}
/*
* 5
* 8 2
* 1 7 9
* 6 3 0
 */

private fun areSymmetric(root1: TreeNode?, root2: TreeNode?): Boolean {
    if (root1 == null && root2 == null) return true
    if (root1 == null || root2 == null) return false
    if (root1.dad != root2.dad) return false
    if (root1.children.size != root2.children.size) return false

    for (i in root1.children.indices) {
        if (!areSymmetric(root1.children[i], root2.children[i])) {
            return false
        }
    }

    return true
}

data class TreeNode(
    var dad: Int,
    var children: List<TreeNode?> = listOf()
)