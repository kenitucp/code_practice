//#include<stdio.h>
//#include<string.h>
//#include<stdbool.h>
//bool mycmp(char* array, char i)
//{
//	for( int j = 0; j<strlen(array) - 1; j++)
//	{
//	if (array[j] == i)
//		return true;
//    }
//	return false;
//}
//int main()
//{
//	char arr1[101];
//	char arr2[101] = {0};
//	while (scanf("%s", &arr1) != EOF)
//	{
//		arr2[0] = arr1[0];
//		int  j = 1;
//		for (int i = 1; i < strlen(arr1) - 1; i++)
//		{
//			if (mycmp(&arr2, arr1[i]) !=0)
//				如果输入数组中的元素和存储第一次出现的元素的新数组的元素一样，那么不存储
//				输入数组取下一个元素
//				如果一样，把元素存入新数组
//			{
//				i++;
//			}
//			else
//			{
//				arr2[j] = arr1[i];
//				j++;
//			}
//		}
//		return arr2;
//	}
//}
#include <stdio.h>
int main()
{
	char str[101];
	while (scanf("%s", &str) != EOF)
	{
		int a[256] = { 0 };
		for (int i = 0; str[i] != '\0'; i++)
		{
			a[str[i]] ++;//基数排序
			if (a[str[i]] == 1)//第一次出现打印，后面出现同样元素不打印
				printf("%c", str[i]);
		}
		printf("\n");
	}
	return 0;
}