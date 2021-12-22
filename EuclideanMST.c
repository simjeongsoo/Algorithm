//
//  EuclideanMST.c
//  Algo_TeamProj
//
//  Created by 심정수 on 2021/12/22.
//

//멀티 센터 문제
// 100 x 100 줄과 줄이 교차하는 지점에 정점들이 n개 존재한다. 그 점들로부터 Euclidean MST를 구할 수 있다. 그렇게 트리 //T를 구하도록 하자. 이제 T 에서 c개의 센터로 어느정점이든 센터중 하나로의 거리가 최소가 되도록 하는 정점 c를 구하는 //문제 그리고 각 정점 마다 어느센터가 가장 가까운지 나와야 함 (그래픽으로 구현)

#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <math.h>
#define MAX_VERTICES 10

//=========================================================

// 간선을 나타내는 구조체
struct Edge{
    int start, end , weight;
};

// 정점의 좌표값을 저장하기위한 구조체 배열
struct XYroom{
    int x;
    int y;
};

int room[MAX_VERTICES][MAX_VERTICES]; // 100 x 100 2차원 배열
//int verArr[MAX_VERTICES][MAX_VERTICES];


//======================== main =================================

int main(){
    
    
    printf("10 x 10 배열 생성 \n");
    int col = sizeof(room[0]) / sizeof(int);
    int row = sizeof(room) / sizeof(room[0]);
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            room[i][j] = 0;
            printf("%d", room[i][j]);
        }
        printf("\n");
    }
    printf("=======================\n");
    
    srand(time(NULL));
    
    // 생성할 정점의 갯수 입력받음
    int vertex;
    
    printf("정점의 갯수를 입력 : ");
    scanf("%d",&vertex);
    int edgeNum = vertex*(vertex-1)/2;
    
    // 입력받은 정점의 갯수만큼 랜덤위치에 생성
    struct XYroom p[vertex];
    for (int i = 0; i<vertex; i++) {
        
        //난수 생성
        int ranNumX = rand()%10;
        int ranNumY = rand()%10;
        printf("x %d  y %d\n",ranNumX,ranNumY);
    
        //구조체 배열에 정점 좌표 저장
        p[i].x = ranNumX;
        p[i].y = ranNumY;
        printf("%d %d\n", p[i].x, p[i].y);
    
        //랜덤 생성된 좌표에 정점 찍기
        room[ranNumX][ranNumY] = 0;

    }
    
    //test.delete
    printf("\n");
    printf("p[0].x = %d p[0].y = %d\n", p[0].x, p[0].y);
    printf("p[1].x = %d p[1].y = %d\n", p[1].x, p[1].y);
    printf("p[2].x = %d p[2].y = %d\n", p[2].x, p[2].y);
    printf("p[3].x = %d p[3].y = %d\n", p[3].x, p[3].y);
    //test.delete
    for (int i = 0; i < row; i++)    // 2차원 배열의 세로 크기만큼 반복
    {
        for (int j = 0; j < col; j++)    // 2차원 배열의 가로 크기만큼 반복
        {
            printf("%d", room[i][j]); // 2차원 배열의 인덱스에 반복문의 변수 i, j를 지정
        }
        printf("\n");                // 가로 요소를 출력한 뒤 다음 줄로 넘어감
    }
    printf("=======================\n");
    
    
    //정점간 가중치를 구하기 위한 피타고라스 정리

    //int a = p[0].x - p[1].x;    // 선 a의 길이
    //int b = p[0].y - p[1].y;    // 선 b의 길이
    //edge 에 start , end , weight 들어가야됌
    //start 노드 = p[0].x,p[0].y
    //end 노드 = p[1].x,p[1].y
    //가중치 c
  //  double c = sqrt((a * a) + (b * b));    // (a * a) + (b * b)의 제곱근을 구함
    //    printf("가중치 = %f\n", c);
    
    int a = 0;
    int b = 0;
    double weight[edgeNum][edgeNum];
    
    
   
    //가중치 반복문
    //간선 갯수는 n(n-1)/2 개
    for (int i = 0; i<vertex; i++) {
        for (int j = 0; j<vertex; j++) {
            
            //자기 자신 제거 0,0
            if (i != j) {
               // printf("continue : i = %d j = %d\n",i,j);
                
                
                 a = p[i].x - p[j].x;    // 선 a의 길이
                 b = p[i].y - p[j].y;    // 선 b의 길이
                
                double c = sqrt((a * a) + (b * b));
                weight[i][j] = c;
                //printf("weight : i = %d j = %d\n",i,j);
                
                // 무방향 그래프 중복거리 제거
                if (weight[i][j] != weight[j][i]) {
                    printf("정점p[%d] p[%d] 가중치 :  %f\n\n",i,j,weight[i][j]);
                }
            }
        }
    
    }
    

    
    return 0;
}









