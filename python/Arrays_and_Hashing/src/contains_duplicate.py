class Solution:
    def containsDuplicate(self, nums: list[int]) -> bool:
        """
        Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
        """
        seen = set()
        duplicates = set()
        for num in nums:
            if num in seen:
                duplicates.add(num)
                return True
            else:
                seen.add(num)
        return False

    def containsNearbyDuplicate(self, nums: list[int], k: int) -> bool:
        """
        Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
        """

        seen = {}
        for idx, num in enumerate(nums):
            if num in seen and idx - seen[num] <= k:
                return True
            seen[num] = idx
        return False
