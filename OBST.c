//
//  OBST.c
//  Algo_TeamProj
//
//  Created by 심정수 on 2021/12/22.
//
//input 
//p = 0.1, 0.09, 0.06, 0.05, 0.05, 0.04, 0.03
//q = 0.7, 0.12, 0.07, 0.07, 0.06, 0.05, 0.08, 0.06

//Optimal BST
#include <stdio.h>
#include <stdlib.h>

#define N 7
#define ARRAY_LENGTH 8  // 배열길이

void p_input(double *p);
void q_input(double *q);
void print_pq(double *p, double *q);  // 배열 p, q 의 출력 함수
void wc_reset(double(*w)[ARRAY_LENGTH], double(*c)[ARRAY_LENGTH], double *q);  // weight, cost 초기화 함수
double minimum(int i, int j, double(*c)[ARRAY_LENGTH], double(*w)[ARRAY_LENGTH], int(*r)[ARRAY_LENGTH]);
// 최소의 cost깂을 계산 및 그에 따른 root값을 구하는 함수
void print_table(int(*root)[ARRAY_LENGTH], double(*cost)[ARRAY_LENGTH], double(*weight)[ARRAY_LENGTH]);
// root, cost, weight table을 출력하는 함수

int main(void)
{
   int i, j, l;  // 반복문 및 연산을 위한 변수 선언
   double weight[ARRAY_LENGTH][ARRAY_LENGTH] = { 0 }, cost[ARRAY_LENGTH][ARRAY_LENGTH] = { 0 };
   double p[N], q[N + 1];
   int root[ARRAY_LENGTH][ARRAY_LENGTH] = { 0 }; // root 배열 선언 및 초기화
   p_input(p);//p 입력
   q_input(q);//q 입력
   print_pq(p, q); // 배열 p, q 의 출력 함수 호출
   wc_reset(weight, cost, q); // weight, cost 배열의 초기화 함수 호출

   for (l = 1; l <= N; l++) {
      for (i = 0; i <= N - l; i++) {
         j = i + l;
         weight[i][j] = weight[i][j - 1] + p[j] + q[j]; // weight 계산
         cost[i][j] = minimum(i, j, cost, weight, root); // cost 계산 및 최소값을 구하기 위해 minimum함수 호출
      }
   }
   print_table(root, cost, weight);  // root, cost, weight table의 출력을 위해 함수 호출

   return 0;
}
//p배열 값 입력
void p_input(double *p)//배열 p 입력
{

   int i = 0;
   p[0] = 0.00;
   for (i = 1; i <= N; i++)
   {
      printf("p[%d] 입력 : ", i);
      scanf("%lf", &p[i]);
   }
   printf("\n");
}

//q배열 값 입력
void q_input(double *q)//배열 q 입력
{
   int i = 0;
   for (i = 0; i <= N; i++)
   {
      printf("q[%d] 입력 : ", i);
      scanf("%lf", &q[i]);
   }

   printf("\n");
}



//배열 p,q값 출력
void print_pq(double *p, double *q)
{

   int i;
   printf("P Table \n");
   printf("|------+------+------+------+------+------+------+------|\n");
   for (i = 0; i <= N; i++) {
      printf("|%5.2lf ", p[i]);  // 배열 p 출력
   }
   printf("|");
   fputs("\n", stdout);
   printf("|------+------+------+------+------+------+------+------|\n");
   printf("\n");
   printf("Q Table \n");
   printf("|------+------+------+------+------+------+------+------|\n");
   for (i = 0; i <= N; i++) {
      printf("|%5.2lf ", q[i]);  // 배열 q 출력
   }
   printf("|");
   fputs("\n", stdout);
   printf("|------+------+------+------+------+------+------+------|\n");
   printf("\n");
}

//weight table, cost table 초기화
void wc_reset(double(*w)[ARRAY_LENGTH], double(*c)[ARRAY_LENGTH], double *q)
{
   int i;
   for (i = 0; i <= N; i++) {
      w[i][i] = q[i];  // weight[i][i]에 q입력
      c[i][i] = 0.0;
   }
}

//cost 값 계산해서 root값 구하기
double minimum(int i, int j, double(*c)[ARRAY_LENGTH], double(*w)[ARRAY_LENGTH], int(*r)[ARRAY_LENGTH])
{
   int k, enable = 1; // 연산을 위한 변수 선언
   double result, min;  // 최소값을 구하기 위한 변수 선언
   for (k = i; k <= j; k++) {
      if (k == i)
         continue;  // 'k==i'일 때 그냥 진행, 즉 'i<k<=j'의 조건
      else {
         result = c[i][k - 1] + c[k][j] + w[i][j];  // 각각의 경우의 cost를 계산
         if (enable) {  // 비교를 위해 처음 cost값을 min으로 설정
            min = result;
            enable = 0;  // 처음에 단 한번 실행을 위해 enable값 변경
            r[i][j] = k;  // root값 설정
         }
         if (min > result) {  // 비교 후 기조의 값보다 작다면
            min = result;  // min값 변경
            r[i][j] = k;  // root값 변경
         }
      }
   }
   return min;  // min값 리턴
}

//table 값 출력
void print_table(int(*root)[ARRAY_LENGTH], double(cost[])[ARRAY_LENGTH], double(*weight)[ARRAY_LENGTH])
{
   int i, j, k;  // 반복문을 위한 변수 선언
   //weight table 출력
   fputs("Weight Talbe\n", stdout);
   printf("|------+------+------+------+------+------+------+------|\n");
   for (i = 0; i < ARRAY_LENGTH; i++) {
      for (k = 0; k < i; k++)
         printf("|      ");
      for (j = 0; j < ARRAY_LENGTH - k; j++) {
         if (i > 0)
            printf("|%6.2lf", weight[i][j + i]);
         else {

            printf("|%6.2lf", weight[i][j]);
         }
      }
      printf("|\n");
      printf("|------+------+------+------+------+------+------+------|\n");
   }
   //cost table 출력
   fputs("\nCost Table\n", stdout);
   printf("|------+------+------+------+------+------+------+------|\n");
   for (i = 0; i < ARRAY_LENGTH; i++) {
      for (k = 0; k < i; k++)
         printf("|      ");
      for (j = 0; j < ARRAY_LENGTH - k; j++) {
         if (i > 0)
            printf("|%6.2lf", cost[i][j + i]);
         else {

            printf("|%6.2lf", cost[i][j]);
         }
      }
      printf("|\n");
      printf("|------+------+------+------+------+------+------+------|\n");
   }
   //root table 출력
   fputs("\nRoot Table\n", stdout);
   printf("|------+------+------+------+------+------+------+------|\n");
   for (i = 0; i < ARRAY_LENGTH; i++) {
      for (k = 0; k < i; k++)
         printf("|      ");
      for (j = 0; j < ARRAY_LENGTH - k; j++) {
         if (i > 0)
            printf("|%6d", root[i][j + i]);
         else {

            printf("|%6d", root[i][j]);
         }
      }
      printf("|\n");
      printf("|------+------+------+------+------+------+------+------|\n");
   }
}
