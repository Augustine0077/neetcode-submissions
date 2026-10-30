class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        tempset= set()
        for n in nums:
            if n in tempset:
                return True
            tempset.add(n)
        return False