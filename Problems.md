# 1.  Longest Substring Without Repeating Characters
## Problem Statement

Given a string s, find the length of the longest substring without duplicate characters.

```
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
```

[Link to Solution](src/LengthOfLongestSubstring.java)

`Sliding Window`

---
# 2.  Minimum Size Subarray Sum
## Problem Statement

Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. 
If there is no such subarray, return 0 instead.
```
Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.

Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
```
[Link to Solution](src/MinSubArrayLength.java)

`Sliding Window`

# 3 Longest Repeating Character Replacement
## Problem Statement
You are given a string s and an integer k. 
You can choose any character of the string and change it to any other uppercase English character. 
You can perform this operation at most k times.
Return the length of the longest substring containing the same letter you can get after performing the above operations.

```
Example 1:

Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.
Example 2:

Input: s = "AABABBA", k = 1
Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
There may exists other ways to achieve this answer too.
```

[Link to Solution](src/LongestRepeatingCharReplacement.java)

`Sliding Window`