def solution(x):
    answer = True
    
    temp = x
    sum = 0
    
    while(temp!=0):
        sum += temp%10
        temp=temp//10
    
    if(x%sum != 0):
        answer = False
    
    return answer
