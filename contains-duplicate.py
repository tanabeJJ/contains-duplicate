from typing import *

class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        # ここにコードを書いてください
        return False


print("スタート")
assert Solution().containsDuplicate([1,2,3,1]) == True
assert Solution().containsDuplicate([1,2,3,4]) == False
assert Solution().containsDuplicate([1,1,1,3,3,4,3,2,4,2]) == True
print("コンプリート!本番テストへ")
