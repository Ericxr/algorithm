package com.eric.algorithm.test;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.List;

@Slf4j
@Data
public class Leetcode {


    public static void main(String[] args) {
        /*// 01 -两数之和
        int[] nums = {2, 7, 11, 15};
        int target = 18;
        int[] result = twoSum(nums, target);
        log.info("两数之和：target: {} , index: {}", target, result);*/

//        02 -两数相加
//        ListNode listNode = new ListNode(1);
//        listNode = getNewInstance(listNode, 1);
//        addTwoNumbers(listNode, new ListNode(1));



//        while(true){
//
//        }

//        log.info("listnode->  val: {} , next: {}", listNode.val, listNode.next.val);

    }
    public static ListNode getNewInstance(ListNode node, int i) {
        if (node != null) {
            if (node.next == null) {
                //next赋值
                i++;
                if (i < 7) {
                    node.next = new ListNode(i);
                    getNewInstance(node.next, i);
                }
            }
        }
        return node;


    }

    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
     * 示例:
     * 给定 nums = [2, 7, 11, 15], target = 9
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] resultArr = null;
        for (int i = 0; i < nums.length; i++) {
            Integer index = i;
            Integer firstNum = nums[i];
            int otherNum = target - firstNum;
            if (map.containsKey(otherNum)) {
                //有值，已经找到对应的数据
                resultArr = new int[]{map.get(otherNum), index};
                break;
            } else {
                map.put(firstNum, index);
            }
        }
        return resultArr;
    }


    /**
     * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
     * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
     * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     * 示例：
     * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
     * 输出：7 -> 0 -> 8
     * 原因：342 + 465 = 807
     */

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        while (l1 != null) {
            int i = l1.val;
            log.info("listnode -> val : {}", i);
            l1 = l1.next;
        }
        return null;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
