class Solution:
    def toLowerCase(self, s: str) -> str:
        return s.lower()

if __name__ == "__main__":
    sol = Solution()
    test_inputs = ["Hello", "here", "LOVELY"]
    for test in test_inputs:
        print(f"Input: {test} -> Output: {sol.toLowerCase(test)}")
