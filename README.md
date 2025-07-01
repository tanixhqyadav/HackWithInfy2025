# 🚀 HackWithInfy– Day 1

Welcome to **Day 1** of the **Greedy Algorithm Mastery Series**!  
Greedy algorithms make the most optimal choice at each step, hoping that this leads to a globally optimal solution.

This day focuses on foundational greedy problems to get you comfortable with the strategy. Each problem involves making decisions step-by-step to optimize a result.

---

## 📚 Problem List

### 1. 🍪 [Assign Cookies](https://leetcode.com/problems/assign-cookies/description/)  
**Platform:** LeetCode #455  
**Difficulty:** Easy  
**Concepts:** Sorting, Two Pointer, Greedy Matching  
**Description:**  
Assign cookies to children based on their greed factor such that the maximum number of content children is achieved.  
**Greedy Insight:**  
Sort both the greed and cookie size arrays and try to assign the smallest possible cookie to each child.  

---

### 2. 🍫 [Buy Two Chocolates](https://leetcode.com/problems/buy-two-chocolates/)  
**Platform:** LeetCode #2706  
**Difficulty:** Easy  
**Concepts:** Sorting, Minimum Selection  
**Description:**  
You are given an array of chocolate prices and a certain amount of money. Your task is to buy the two cheapest chocolates and return the money left (or the same amount if not enough).  
**Greedy Insight:**  
Sort the array and always choose the two lowest-priced chocolates.

---

### 3. 🕒 [Activity Selection](https://www.geeksforgeeks.org/problems/activity-selection-1587115620/)  
**Platform:** GeeksforGeeks  
**Difficulty:** Medium  
**Concepts:** Interval Scheduling, Greedy by Finish Time  
**Description:**  
You are given `n` activities with start and end times. Select the maximum number of non-overlapping activities.  
**Greedy Insight:**  
Sort activities by finish time and always select the next activity whose start time is after or equal to the finish time of the last selected activity.

---

### 4. 💰 [Minimum Number of Coins](https://www.geeksforgeeks.org/problems/-minimum-number-of-coins4426/)  
**Platform:** GeeksforGeeks  
**Difficulty:** Easy  
**Concepts:** Coin Change, Indian Currency, Greedy  
**Description:**  
Given a value `V`, find the minimum number of Indian coins/notes required to sum up to `V`.  
**Greedy Insight:**  
Start with the largest coin/note and use as many of it as possible before moving to the next smaller denomination.

---

### 5. 🔗 [Maximum Length of Pair Chain](https://leetcode.com/problems/maximum-length-of-pair-chain/description/)  
**Platform:** LeetCode #646  
**Difficulty:** Medium  
**Concepts:** Greedy Chain Building, Sorting by End  
**Description:**  
Given pairs of integers, build the longest chain where each pair `(a, b)` is followed by a pair `(c, d)` such that `b < c`.  
**Greedy Insight:**  
Sort by the second element of the pairs and greedily pick the next non-overlapping pair.

---

## 📌 Summary Table

| # | Problem                           | Type   | Greedy Technique                  |
|---|-----------------------------------|--------|-----------------------------------|
| 1 | Assign Cookies                    | Easy   | Min-fit matching using sorting    |
| 2 | Buy Two Chocolates                | Easy   | Choose smallest two items         |
| 3 | Activity Selection                | Medium | Maximize count of non-overlaps    |
| 4 | Minimum Number of Coins           | Easy   | Use largest coin values first     |
| 5 | Maximum Length of Pair Chain      | Medium | Greedy chaining based on end-time |

---

## 🧠 Key Takeaways

- Greedy algorithms do **not always guarantee** the optimal solution — but in these structured problems, they **do** due to the **greedy choice property** and **optimal substructure**.
- Focus on **sorting the input** appropriately and using simple **iterative logic**.
- Ideal problems to master for **coding rounds and interviews**!

---

## ✅ Day 1 Goals

- [x] Practice and solve all 5 problems.
- [x] Identify the greedy decision at each step.
- [x] Understand why the greedy approach works in each case.
- [x] Analyze time complexity.

Happy Learning 💡  
Stay Consistent! 💪
