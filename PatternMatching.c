//
//  main.c
//  PatternMatchingProblem
//
//  Created by 심정수 on 2021/10/29.
//
/*
 Prove the correctness of the following pattern-matching algorithm. The input consists of a string S[1..n], and a pattern P[0..m -1], where 1 <=m<=n.
 The algotrthm locates the first contiguous occurance of the pattern P in the string S,
 that is, L = p if S[p..p + m -1] = P, and L = n-m+1 if the pattern P does occur at all in the string S.
 */
#include <stdio.h>
#include <stdbool.h>
#include <string.h>

int Stringmatch(char *P, char *S);

int main()
{
   int check; // 리턴받은 주소 위치값을 저장 할 변수
   char *text = "abcbacbaa"; // 본 문자열 S 값
   char *pattern = "aa"; // 패턴 문자열 P 값
   char *Npattern = "ca"; // 일치 하지 않았을 때의 패턴 P 값


   if ((check = Stringmatch(pattern, text)) != 8)
   {
      printf("[ String [%s] exists from address (%d) ]\n",pattern ,check);
   }
   if ((check = Stringmatch(Npattern, text)) == 8)
   {
      printf("[ String [%s] searched up to address (%d) of the string, but does not exist. ]\n",Npattern ,check);
   }
   return 0;
}

int Stringmatch(char *P, char *S)
{
   // 패턴P의 길이를 구한 값을 저장할 m
   int m = strlen(P);

   // 본 문자열S 의 길이를 구한 값을 저장할 n
   int n = strlen(S);

   // 문자열 S와 패턴P의 위치정보를 저장할 변수
   int l = 0, r = 0;

   bool matched = false;

   while ((l <= n - m) && !matched)
   {
      l = l + 1;
      r = 0;
      matched = true;

      while ((r < m) && matched)
      {
         matched = matched && (P[r] == S[l + r]);
         r = r + 1;
      }
   }
   return l;
}
