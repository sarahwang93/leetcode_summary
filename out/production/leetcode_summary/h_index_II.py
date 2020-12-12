class hIndex:
 def hIndex(self, citations: List[int]) -> int:
        if not citations:
            return 0
        right = len(citations) - 1
        left  = -1
        while right - left >1:
            mid = (right + left)//2
            if citations[mid]  >= len(citations) - mid:
                right = mid;
            else:
                left = mid;
        return min(len(citations)-right, citations[right]);
