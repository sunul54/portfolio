// ConsoleApplication2.cpp : 이 파일에는 'main' 함수가 포함됩니다. 거기서 프로그램 실행이 시작되고 종료됩니다.
//
#define _CRT_SECURE_NO_WARNINGS
#include <iostream>


#include <stdio.h>



int main()
{
    int month;
    scanf("%d", &month);

    if ((month >= 3) && (month <= 5))
    {
        printf("이것은 봄입니다");
    }
    else if ((month >= 6) && (month <= 8))
    {
        printf("이것은 여름입니다");
    }
    else if ((month >= 9) && (month <= 11))
    {
        printf("이것은 가을입니다");
    }
    else if ((month >= 12) || (month <= 2))
    {
        printf("이것은 겨울입니다");
    }


    switch (month)
    {
    case 3:case 4:case 5:
        printf("이것은 봄입니다");
        break;
    case 6:case 7:case 8:
        printf("이것은 여름입니다");
        break;
    case 9:case 10:case 11:
        printf("이것은 가을입니다");
        break;
    case 12:case 1:case 2:
        printf("이것은 겨울입니다");
        break;
    default:
        printf("존재하지 않습니다");
        break;
    }
    

    
        
    
    
    return 0;
}

