package Test03;

public class Test06 {

	public static void main(String[] args) {
		//�����ά����
				int[][] arr={{1,2,3,4},{4,5,6,7},{7,8,9,10}};
				
				//��ά�����е�һά����������ά������[����]
				//arr[0]	��ʵ���Ƕ�ά�����еĵ�һ��һά���������
				//arr[1]	��ʵ���Ƕ�ά�����еĵڶ���һά���������
				//arr[2]	��ʵ���Ƕ�ά�����еĵ�����һά���������
				
		//��һ��һά�����Ԫ��
				for(int x=0;x<arr[0].length;x++){
					System.out.println(arr[0][x]);
				}
				//�ڶ���һά�����Ԫ��
				for(int x=0;x<arr[1].length;x++){
					System.out.println(arr[1][x]);
				}
				//������һά�����Ԫ��
				for(int x=0;x<arr[2].length;x++){
					System.out.println(arr[2][x]);
				}
				
				
				//�Ľ����룬��ά����ĳ���
				for(int y=0;y<arr.length;y++){
					for(int x=0;x<arr[y].length;x++){
						System.out.println(arr[y][x]);
					}
				}
				System.out.println("---------------");
				
				System.out.println("hello");
				System.out.println("world");
				System.out.print("hello");
				System.out.print("world");
				System.out.println();
				System.out.println("hello");
				System.out.println("world");
				
				System.out.println("---------------");
				
				//���ոĽ�
				for(int y=0;y<arr.length;y++){
					for(int x=0;x<arr[y].length;x++){
						System.out.print(arr[y][x]+" ");
					}
					System.out.println();
				}
//x=4 y=3

         }
   }