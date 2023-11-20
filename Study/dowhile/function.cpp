#include <stdio.h>

void foo() {
	printf("æ»≥Á«œººø‰\n");
}

int foo2(int a) {
	return a;
}
int foo3(int a, int b) {
	return a + b;
}
/*int main()
{



	void (*pointer)(void) = foo;
	int (*pointer2)(int) = foo2;
	int (*pointer3)(int, int) = foo3;
	printf("%d", pointer2(5));

	printf(" %d", pointer3(3, 5));

	pointer();
}
*/

