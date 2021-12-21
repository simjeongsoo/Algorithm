//
//  main.c
//  DynamicProgramming
//
//  Created by 심정수 on 2021/11/03.
//
//  피보나치 수열의 Dynamic Programming
//  피보나치 수열의 점화식 = D[i] = D[i+1] + D[i-2]
//  기본적인 피보나치 수열의 시간복잡도 = O(2^n)
//  Dynamic Programming 으로 구현한 피보나치 수열의 시간 복잡도 = O(n)
//
//  DP 문제는 규칙성을 찾아 먼저 점화식을 세우는게 중요



#include <stdio.h>

//Memoization 사용
int d[100];

int dp(int x){
    //재귀함수 종료 조건
    if (x == 1) return 1;
    if (x == 2) return 1;
    
    //이미 구한 값이라면 구한 값 자체를 반환
    if (d[x] != 0) return d[x];
    
    //x번째 값을 구하기 위해, 이전값과 두번째 전 값을 구해 합을 리턴
    // 구한적이 없는 값은 0, 구할수있도록 d[x] 에 저장
    return d[x] = dp(x - 1) + dp(x -2);
}

int main(int argc, const char * argv[]) {
    // insert code here...
    
    printf("%d\n\n",dp(30));
    
    
    return 0;
}
