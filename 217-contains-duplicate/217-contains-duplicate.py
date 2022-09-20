class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        se=set(nums)
        l=len(se)
        return True if len(nums)>l else False