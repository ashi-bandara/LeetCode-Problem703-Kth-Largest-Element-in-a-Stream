
# LeetCode Challenge D21


## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [703.  Kth Largest Element in a Stream](https://leetcode.com/problems/kth-largest-element-in-a-stream/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement
Design a class to find the  `kth`  largest element in a stream. Note that it is the  `kth`  largest element in the sorted order, not the  `kth`  distinct element.

Implement  `KthLargest`  class:
-   `KthLargest(int k, int[] nums)`  Initializes the object with the integer  `k`  and the stream of integers  `nums`.
-   `int add(int val)`  Appends the integer  `val`  to the stream and returns the element representing the  `kth`  largest element in the stream.


**Example**

> **Input:** 
> ["KthLargest", "add", "add", "add", "add", "add"] [[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]
> 
> **Output:** [null, 4, 5, 5, 8, 8]
> 
> **Explanation** 
> KthLargest kthLargest = new KthLargest(3, [4, 5, 8, 2]); kthLargest.add(3);   // return 4 kthLargest.add(5);   // return 5
> kthLargest.add(10);  // return 5 kthLargest.add(9);   // return 8
> kthLargest.add(4);   // return 8

**Language Used**
> Java

**Difficulty**
> Easy

## Solution Overview

The `KthLargest` class is designed to efficiently find the kth largest element in a streaming set of integers. The class is initialized with an integer `k` and an initial array of integers `nums`. The primary functionality is provided by the `add` method, which appends a new integer to the streaming set and returns the kth largest element in the updated set.

`KthLargest(int k, int[] nums)`: Initializes the object with `k` indicating the desired order and an initial set of integers.

`int add(int val)`: Appends `val` to the streaming set, maintaining a sorted order. The method returns the kth largest element in the updated set.
