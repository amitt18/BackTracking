# Backtracking Classical Problems

This repository contains implementations of classical **backtracking algorithms** in Java. The focus is on solving common algorithmic problems using the **backtracking technique**, which is widely used in combinatorial search, constraint satisfaction, and puzzle solving.

---

## 📂 Contents

- `nqueen.java` – Solve the N-Queens problem using backtracking.  
- `Backtracking Problems` – Collection of classical backtracking problems implemented in Java:  

### Top 15 Classical Backtracking Problems
1. **N-Queens Problem** – Place N queens on an N×N chessboard.  
2. **Rat in a Maze** – Find paths for a rat from start to finish in a maze.  
3. **Sudoku Solver** – Fill a 9×9 Sudoku grid correctly.  
4. **Word Search** – Search a word in a 2D grid of letters.  
5. **Knight’s Tour** – Move a knight to visit all squares of a chessboard exactly once.  
6. **Combination Sum** – Find all combinations of numbers that sum to a target.  
7. **Permutations** – Generate all permutations of a given array or string.  
8. **Subsets (Power Set)** – Generate all subsets of a set.  
9. **Palindrome Partitioning** – Partition a string such that every substring is a palindrome.  
10. **M-Coloring Problem** – Color a graph with M colors such that no adjacent nodes have the same color.  
11. **Hamiltonian Path/Cycle** – Find a path or cycle visiting every vertex exactly once.  
12. **Maze with Multiple Paths** – Print all possible paths from start to finish.  
13. **Expression Add Operators** – Add operators (+, −, *) to digits to reach a target value.  
14. **Crossword Puzzle Solver** – Fill a crossword grid with given words.  
15. **Subset Sum Problem** – Check if a subset sums to a given number.

---

## 💡 What is Backtracking?

Backtracking is a **recursive algorithmic technique** for solving problems incrementally by trying **partial solutions** and then abandoning them if they are not suitable. Key points:

1. Place a solution element (like a queen in a chessboard).  
2. Recurse to solve the next step.  
3. If a step fails, **backtrack** by removing the last placed element and trying the next option.  

It’s often used for:
- N-Queens problem  
- Sudoku solver  
- Maze solving  
- Word search puzzles  
- Subset and permutation generation  

---

## 📝 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/amitt18/BackTracking.git
