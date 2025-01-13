def heightChecker(heights: List[int]) -> int:
    sorted_heights = sorted(heights)
    counter = 0
    for x in range(len(heights)):
        if sorted_heights[x] != heights[x]:
            counter += 1
    return counter        