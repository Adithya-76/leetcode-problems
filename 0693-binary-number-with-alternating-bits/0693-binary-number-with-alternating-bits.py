class Solution:
    def hasAlternatingBits(self, n: int) -> bool:
        num = bin(n)
        for i in range(len(num)-1):
           if num[i] == num[i+1]:
                return False
        return True