class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int num = x;
        int sum = 0;
        
        // 숫자의 각 자리수를 하나씩 꺼내서 더하기
        while(num > 0) {
            // 마지막 자리 숫자 꺼내기
            sum += num % 10;
            // 마지막 자리 제거하기
            num /= 10;
        }
        
        // 하샤드 수 확인
        // sum 값에 x를 나눈 나머지가 0이 아니면 false
        if(x % sum != 0) {
            answer = false;
        }
        
        return answer;
    }
}
