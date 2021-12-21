//
//  NapsackAlgotrthm.c
//  DynamicProgramming
//
//  Created by 심정수 on 2021/11/04.
//

/*
#include <stdio.h>
#include <stdbool.h>

int t[100][100];

int Napsack(int S1,int S2,int S3,int S4,int S5,int S){
    int n = 5;
    t[0][0] = true;
    
    for (int j = 1; j<=S; j++) {
        t[0][j] = false;
    }
    for (int i = 1; i<=n; i++) {
        for (int j = 0; j <=S; j++) {
            t[i][j] = t[i-1][j];
            if (j-) {
                <#statements#>
            }
        }
    }
    
    
    
}



int main(){
    
    
    
    
    return 0;
}

*/

#include<stdio.h>
int max(int a, int b) { return (a > b)? a : b; }

int knapSack(int W, int wt[], int val[], int n)
{
   int i, w;
   int K[n+1][W+1];
   for (i = 0; i <= n; i++)
   {
       for (w = 0; w <= W; w++)
       {
           if (i==0 || w==0)
               K[i][w] = 0;
           else if (wt[i-1] <= w)
                 K[i][w] = max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]);
           else
                 K[i][w] = K[i-1][w];
       }
   }
   return K[n][W];
}
int main()
{
    int i, n, val[20], wt[20], W;
    
    printf("Enter number of items : ");
    scanf("%d", &n);
    
    printf("Enter value and weight of items : ");
    for(i = 0;i < n; ++i){
     scanf("%d%d", &val[i], &wt[i]);
    }
 
    printf("Enter. size of knapsack : ");
    scanf("%d", &W);
    
    printf("%d", knapSack(W, wt, val, n));
    return 0;
}
