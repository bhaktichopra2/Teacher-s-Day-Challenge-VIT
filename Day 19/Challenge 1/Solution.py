from typing import List

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        l, r = 0, 1 
        maxPro = 0

        while r != len(prices):
            if prices[l] < prices[r]:                
                prof = prices[r] - prices[l]
                maxPro = max(prof, maxPro)
            else:                
                l = r
            r += 1
        return maxPro


if __name__ == "__main__":
   
    prices = [7, 1, 5, 3, 6, 4] 
    solution = Solution()
    result = solution.maxProfit(prices)
    print("Max Profit:", result)
