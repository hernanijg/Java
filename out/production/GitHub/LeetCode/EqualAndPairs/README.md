# 🔢 Equal Pairs Counter - LeetCode Solution

## 🎯 Problem Overview
Counts all pairs of equal elements in an array where the product of their indices is divisible by `k`.

## 🧠 Key Features
- **Nested Loop Logic**: Efficiently checks all possible pairs
- **Dual Condition Check**: Validates both value equality and index product
- **Optimal Performance**: O(n²) time complexity for thorough checking

## 💡 Example Cases
| Input Array | k | Valid Pairs | Explanation |
|-------------|---|-------------|-------------|
| [1,2,3,4]  | 1 | 0 | No equal pairs |
| [1,1,1,1]  | 2 | 3 | All pairs satisfy (i*j)%2==0 |

## ⚙️ How It Works
1. Iterates through all possible pairs (i,j)
2. Checks if `nums[i] == nums[j]`
3. Validates if `(i * j) % k == 0`
4. Counts all valid pairs

## 🚀 Performance Metrics
| Complexity | Value | Notes |
|------------|-------|-------|
| Time | O(n²) | Nested loops |
| Space | O(1) | Constant extra space |

## 🛠 Usage Example
```java
int[] numbers = {3,1,2,2,2,1,3};
int k = 2;
int pairs = Solution.countPairs(numbers, k); // Returns 4