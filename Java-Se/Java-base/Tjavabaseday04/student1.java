package Tjavabaseday04;

public class student1 {

	/**
	 * @ClassName: Student
	 * @Description: ѧ����
	 * @date 2017��11��10�� ����5:14:25 Company www.igeekhome.com
	 * 
	 *       ͨ������ֱ�ӷ��ʳ�Ա��������������ݰ�ȫ���� ���ʱ�����Ǿ����ܲ��ܲ������Ķ���ֱ�ӷ��ʳ�Ա�����أ� �ܣ� ���ʵ���أ�
	 *       private�ؼ���
	 * 
	 *       private�� ��һ��Ȩ�����η��� �������γ�Ա(��Ա�����ͳ�Ա����) ��private���εĳ�Աֻ���ڱ����в��ܷ��ʡ�
	 * 
	 *       ���private���εĳ�Ա���������ǻ���Ӧ���ṩgetXxx()��setXxx()���ڻ�ȡ�����ó�Ա������ֵ��������public����
	 */

		/**
		 * @Fields name : ����
		 */
		String name;
		/**
		 * @Fields age : ����
		 */
		// int age;
		private int age;

		/**
		 * @Title: setAge
		 * @Description: ��������
		 * @param a
		 */
		public void setAge(int a) {
			if (a < 0 || a > 200) {
				System.out.println("�������������");
			} else {
				age = a;
			}
		}

		/**
		 * @Title: getAge
		 * @Description: ��ȡ����
		 * @return
		 */
		public int getAge() {
			return age;
		}

		/**
		 * @Title: show
		 * @Description: ��ʾѧ����Ϣ
		 */
		public void show() {
			System.out.println("�����ǣ�" + name + "�������ǣ�" + age);
		}
	}

