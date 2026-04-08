class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        // a와 b가 같은 경우
        if (a == b) {
            answer = a; // a와 b가 같은 경우 a 반환
        // a가 b보다 작은 경우
        } else if (a < b) {
            for(int i = a; i <= b; i++) { // a부터 b까지 1씩 증가
                answer += i; // 각 값을 누적해서 더함 
            }
        // a가 b보다 큰 경우
        } else {
            for(int i = b; i <= a; i++) { // b부터 a까지 1씩 증가
                answer += i; // 각 값을 누적해서 더함 
            }
        }
        
        return answer;
    }
}
