#include <stdio.h>

int main() { 
    int num;
    scanf("%d", &num);
    int arr[num];
    for (int i = 0; i < num; i++)
    {
        scanf("%d", &arr[i]);
    }


    for (int i = 1; i < num; i++) {
        int key = arr[i];
        int j = i - 1;

        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }

        arr[j + 1] = key;
    }

    for (int i = 0; i < ; i++) {
        printf("%d ", arr[i]);
    }

    return 0;
}