import math

def solution(n, m):
    answer = []
    
    a = n
    b = m
    
    while (b>0):
        a, b = b, a % b
    
    answer.append(a)            # 최대공약수
    answer.append((n * m) // a) # 최소공배수 = 두 수의 곱을 최대공약수로 나눈 몫
    
    return answer
