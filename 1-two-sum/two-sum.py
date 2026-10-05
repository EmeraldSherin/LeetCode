class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        result=dict()
        for i in range(len(nums)):
            comple=target-nums[i]
            if comple in result:
                return [result.get(comple),i]
            result[nums[i]]=i

        return [-1,-1]