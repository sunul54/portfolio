#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
#include <stdlib.h>


void action(void (*function)(void))
{
	printf("동물은 움직입니다");
	function();
	printf("동물이 밥을 먹습니다.");

}


void Bark()
{
	printf("멍멍");
}

void Meow() {
	printf("야옹");
}
int main()
{
	printf("동물을 입력하세요:");
	printf("1 : 강아지");
	printf("2 : 고양이");
	int kind;
	scanf("%d", &kind);
	if (kind == 1)
	{
		action(Bark);
	}
	else if (kind == 2)
	{
		action(Meow);
	}

	
}