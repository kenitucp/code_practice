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
//				������������е�Ԫ�غʹ洢��һ�γ��ֵ�Ԫ�ص��������Ԫ��һ������ô���洢
//				��������ȡ��һ��Ԫ��
//				���һ������Ԫ�ش���������
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
			a[str[i]] ++;//��������
			if (a[str[i]] == 1)//��һ�γ��ִ�ӡ���������ͬ��Ԫ�ز���ӡ
				printf("%c", str[i]);
		}
		printf("\n");
	}
	return 0;
}