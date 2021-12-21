//
//  DynamicProgramming_Tiling.c
//  DynamicProgramming
//
//  Created by 심정수 on 2021/11/03.

/*
//=========================================================================================
//  백준 11726번
//  2xn 타일링
//
//  2xn 크기의 직사각형을 1x2 2x1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.

//  입력 : 첫째 줄에 n이 주어진다. (1 <= n <= 1000)
//  출력 : 첫째 줄에 2xn 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.

//  점화식 : D[i] = D[i - 1] + D[i - 2]
//  d[n-1] + 1x2 조합 하나가 d[n]을 구성하는 조합중 하나가 되고,
//  d[n-2] + 2x1 2개 조합 하나가 d[n]을 구성하는 두번째 조합이 된다.
//  두 조합은 오른쪽 모양이 다르기 때문에 서로 중복되지 않고, 두 조합의 갯수는 오른쪽은 고정이니 각각 d[n-1],d[n-2]
//  와 같아서 D[n] = D[n - 1] + D[n - 2]가 된다.



#include <stdio.h>

//n 이 최대 1000개가 들어 올 수 있기 때문에 공간할당
int d[1001];

int dp(int x){
    if (x == 1) return 1;
    if (x == 2) return 2;
    if (d[x] != 0) return d[x];
    //오버플로우 방지용 10007 나머지 구하기
    return d[x] = (dp(x - 1) + dp(x - 2) % 10007);
}

int main(){
    
    int x;
    printf("input : ");
    scanf("%d",&x);
    printf("output : %d\n",dp(x));
    
    return 0;
}
//=========================================================================================
*/

/*
//=========================================================================================
//  백준 11727번 문제
//  2xn 타일링2
//  2xn 직사각형을 2x1과 2x2 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오

//  입력 : 첫째줄에 n이 주어진다. (1 <= n <= 1000)
//  출력 : 첫째 줄에 2xn 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.

//  점화식 : D[n] = D[n-1] + 2xD[n-2]

#include <stdio.h>

//n 이 최대 1000개가 들어 올 수 있기 때문에 공간할당
int d[1001];

int dp(int x){
    if (x == 1) return 1;
    //n이 2일때는 3가지 경우의 수가 생기기 때문에 return 3을 해줌
    if (x == 2) return 3;
    if (d[x] != 0) return d[x];
    //오버플로우 방지용 10007 나머지 구하기
    return d[x] = (dp(x - 1) + 2 * dp(x - 2) % 10007);
}

int main(){
    
    int x;
    printf("input : ");
    scanf("%d",&x);
    printf("output : %d\n",dp(x));
    
    return 0;
}

*/


//=========================================================================================
//  백준 2133번
//  타일채우기
//  3xn 크기의 벽을 2x1, 1x2크기의 타일로 채우는 경우의 수를 구해보자
//  점화식 : D[n] = 3*D[n-2] + (2*D[n-4]+2*D[n-6]+...2*D[0])
//  기본적인 점화식은 3*D[n-2]이지만 n이 짝수가 될때마다 특정 경우의 수가 2가지씩 생기기 때문에 고려를 해야함
//  그래서 n이 0이 될때까지 반복

/*
#include <stdio.h>

int d[1001];

int dp(int x){
    //n이 0일경우
    if (x == 0) return 1;
    //n이 1일경우 경우의수 없음 0 return
    if (x == 1) return 0;
    //n이 2일 경우 경우의수 3가지 3 return
    if (x == 2) return 3;
    
    //특정한 번째의 값을 구한적이 있다면 (구한적 없다면 d[n]이 0임) 저장된 값 return
    if (d[x] !=0) return d[x];
    
    // 점화식의 기본값을 가져올 수 있도록 result변수에 저장
    int result = 3 * dp(x-2);
    
    // 짝수만큼 전진해서 2씩 추가적인 경우의 수가 발생하는 것 계산
    for (int i=0; i <= x; i++) {
        // 짝수번째 경우에
        if (i % 2 == 0) {
            //2를 곱한 값을 더해줌
            result += 2* dp(x-i);
        }
    }
    return d[x] = result;
    
}

int main(){
    
    int x;
    printf("input : ");
    scanf("%d",&x);
    printf("output : %d\n\n",dp(x));
    
    
    return 0;
}

//  입력 : 첫째 줄에 N(1<=N<=30) 이 주어진다
//  출력 :
*/

#include <stdio.h>

#include <stdlib.h>



int main(void)

{

    int i,j,input,*p;

    printf("input : ");
    scanf("%d",&input);

    if(input%2!=0){

        printf("0");

        return 0;

    }

    p = (int*)malloc(sizeof(int)*(input/2));

    p[0]=3;

    for(i=3;i<input;i+=2){

        p[i/2]=3*p[(i-2)/2]+2;

        for(j=1;j<i-2;j+=2){

            p[i/2]+=2*p[j/2];

        }

    }

    printf("output : %d\n",p[input/2-1]);

    

 

    return 0;

}

