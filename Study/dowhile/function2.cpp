#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
#include <stdlib.h>


void action(void (*function)(void))
{
	printf("������ �����Դϴ�");
	function();
	printf("������ ���� �Խ��ϴ�.");

}


void Bark()
{
	printf("�۸�");
}

void Meow() {
	printf("�߿�");
}
int main()
{
	printf("������ �Է��ϼ���:");
	printf("1 : ������");
	printf("2 : �����");
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