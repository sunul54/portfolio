#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>



struct Person {
	char name[20];
	int age;
	char address[100];

};

void InputData(struct Person* p)
{
	int age;
	char name[100];
	char address[100];

	scanf("%d", &age);
	scanf("%s", name);
	scanf("%s", &address);
	p->age = age;

	strcpy(p->address, address);
	strcpy(p->name, name);



	

}
/*int main()
{

	struct Person person;
	strcpy(person.name, "홍길동");
	person.age = 20;
	strcpy(person.address, "경기도");


	InputData(&person);

	printf("이름 : %s\n", person.name);
	printf("나이 : %d\n", person.age);
	printf("주소 : %s\n", person.address);

	return 0;

}
*/