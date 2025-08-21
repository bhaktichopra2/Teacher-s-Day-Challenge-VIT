from typing import List

class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        if not grid:
            return 0
            
        count = 0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] == '1':
                    self.dfs(grid, i, j)
                    count += 1
        return count

    def dfs(self, grid: List[List[str]], i: int, j: int):
        # Base case: stop if we're out of bounds or on water/visited land
        if i < 0 or j < 0 or i >= len(grid) or j >= len(grid[0]) or grid[i][j] != '1':
            return
        
        # Mark the current cell as visited
        grid[i][j] = '#'
        
        # Recursively visit all four neighbors
        self.dfs(grid, i + 1, j)
        self.dfs(grid, i - 1, j)
        self.dfs(grid, i, j + 1)
        self.dfs(grid, i, j - 1)

# --- Code to run and test the solution in VS Code ---
if __name__ == "__main__":
    # 1. Create an instance of the Solution class
    sol = Solution()

    # 2. Define a sample grid to test with
    grid = [
        ["1", "1", "0", "0", "0"],
        ["1", "1", "0", "0", "0"],
        ["0", "0", "1", "0", "0"],
        ["0", "0", "0", "1", "1"]
    ]

    # 3. Call the numIslands method
    number_of_islands = sol.numIslands(grid)

    # 4. Print the result
    print(f"Number of islands: {number_of_islands}") # Expected output: 3
