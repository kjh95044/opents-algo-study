class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        // 방향(가로/세로)을 무시하고 큰값, 작은값으로 비교
        int wallet_min = Math.min(wallet[0], wallet[1]);
        int wallet_max = Math.max(wallet[0], wallet[1]);
        int bill_min = Math.min(bill[0], bill[1]);
        int bill_max = Math.max(bill[0], bill[1]);
        
        while(true) {
            if (bill_max > wallet_max || bill_min > wallet_min) {
                    bill_max = bill_max / 2;
                    answer++;
                }
            
            // 접을 수 있는 지폐 부분이 남아있으면 값 바꿔서 접기
            // swqp
            if(bill_min > bill_max) {
                int tmp = bill_max;
                bill_max = bill_min;
                bill_min = tmp;
            }
            
            // 지폐 min, max 크기가 지갑의 크기보다 같거나 작으면 종료
            if(bill_min <= wallet_min && bill_max <= wallet_max) {
                break;
            }
        }
        
        return answer;
    }
}
