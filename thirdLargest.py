def thirdLargest(nums):
    first=second=third=None
    for num in nums:
        if num==first or num==second or num==third:
            continue
        if first== None or num>first:
            third=second
            second=first
            first=num
        elif second==None or num>second:
            third=second 
            second=num
        elif third== None or num>third:
            third=num 
    return  third if third is not None else first
print(thirdLargest([1,2,2,5,3,2]))