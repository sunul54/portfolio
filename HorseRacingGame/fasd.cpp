#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <time.h>
#include <windows.h>
#include <cstring>
#include "fasd.h"

void printMap();

void doGameAlgorithm(int  horsePosition[4], int  ranking[4]);

char gameArena[4][22]; // 게임 경기장


void gameInitialize()
{
    /// 함수 구역 1 : 배열에 경기장 저장
    srand(time(NULL));

     // 게임 경기장

    for (int i = 0; i < 4; i++)
    {
        strcpy(gameArena[i], "*--------------------");
    }
    printf("\n");
}

void printMap()
{
    for (int j = 0; j < 4; j++)
    {
        for (int i = 0; i < 21; i++)
        {
            printf("%c", gameArena[j][i]);
        }
        printf("\n");


    }
}

void clearWindow()
{
    printf("\n");
    Sleep(1000);
    system("cls");
}

void rankCopy(int  copyRank[4], int  ranking[4])
{
    for (int i = 0; i < 4; i++)
    {
        copyRank[i] = ranking[i];
    }
}

void sortArray(int  copyRank[4])
{
    int temp;
    for (int i = 4; i > 0; i--)
    {
        for (int j = 0; j < 3; j++)
        {
            if (copyRank[j] < copyRank[j + 1])
            {
                temp = copyRank[j + 1];
                copyRank[j + 1] = copyRank[j];
                copyRank[j] = temp;
            }
        }
    }
}

void printRnak(int  ranking[4], int  copyRank[4])
{
    for (int i = 0; i < 4; i++)
    {
        for (int j = 0; j < 4; j++)
        {
            if (ranking[i] == copyRank[j])
            {
                printf("%d등: %d번\n", i + 1, j + 1);

                ranking[i] = 0;
            }

        }

    }
}

void calcRank(int  copyRank[4], int  ranking[4])
{
    rankCopy(copyRank, ranking);
    // 함수 구역 4 : 복사한 배열을 높은순으로 정렬
    sortArray(copyRank);
    // 함수 구역 5: 등수 출력
    printRnak(ranking, copyRank);
}

int main()
{   
   
    int ranking[] = { 0,0,0,0 }; //등수
    int copyRank[4]; // 등수 복사
    int horsePosition[] = { 0,0,0,0 }; //말 위치
    gameInitialize();
    // 함수 구역 2-3 :기본 경기장 출력
    printMap();
    clearWindow();
    //함수 구역 2 : 배열 생성
    
    doGameAlgorithm(horsePosition, ranking);
    // 함수 구역 3 : 등수를 다른 배열에 복사
    
    calcRank(copyRank, ranking);;

}

void addHorsePosition(int  horsePosition[4], int  ranking[4])
{
    for (int i = 0; i < 4; i++)
    {
        int randomMovingDistance = (rand() % 5) + 1; //랜덤 이동거리 
        gameArena[i][horsePosition[i]] = '-';
        horsePosition[i] += randomMovingDistance;

        if (horsePosition[i] >= 20)
        {
            horsePosition[i] = 20;
            ranking[i]++;
        }
    }
}

void addHorsesArena(int  horsePosition[4])
{
    for (int i = 0; i < 4; i++)
    {
        gameArena[i][horsePosition[i]] = '*';
    }
}


void stopGame(int  horsePosition[4], int& retflag)
{
    retflag = 1;
    if (horsePosition[0] >= 20 && horsePosition[1] >= 20 && horsePosition[2] >= 20 && horsePosition[3] >= 20)
    {
        { retflag = 2; return; };
    }

    clearWindow();
}
int isFinish(int horsePosition[4])
{
    return horsePosition[0] >= 20 && horsePosition[1] >= 20 && horsePosition[2] >= 20 && horsePosition[3] >= 20;
    
}

void doGameAlgorithm(int  horsePosition[4], int  ranking[4])
{
    while (true)
    {

        // 함수 구역 2-1: 랜덤 거리를 말위치에 더한다
        addHorsePosition(horsePosition, ranking);

        // 함수 구역 2-2: 경기장 배열에 말 추가
        addHorsesArena(horsePosition);


        // 함수 구역 2-3: 말이 추가된 경기장 출력
        printf("\n");
        printMap();


        // 함수 구역 2-4 : 모든 말이 끝까지 도착하면 정지 
        if (isFinish(horsePosition))
        {
            break;
        }
        clearWindow();
    }
}

