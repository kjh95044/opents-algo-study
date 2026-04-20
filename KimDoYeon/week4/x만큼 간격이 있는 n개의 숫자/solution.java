class Solution {
    public long[] solution(int x, int n) {
        // 배열로 설정
        long[] answer = new long[n];
        
        // 배열 자릿수만큼 반복
        for(int i=0; i < n; i++) {
            // 0 인덱스부터 대입
            answer [i] = (long) (i+1) *x;
        }
        return answer;
    }
}
