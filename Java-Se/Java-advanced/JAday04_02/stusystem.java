package JAday04_02;

public class stusystem extends StudentDao{

	public  static void main(String[] args)  {
//		Student stu = new Student("1005", "wym", "24", "M", "address");
//		StudentDao.addStudent(stu);
//		StudentDao.deStudent("1005");
//		stu = new Student("1001", "zj", "25", "m", "address");
//		StudentDao.upStudent(stu);
		
//		StudentDao.findAll();
		StudentDao sd=new StudentDao();
		sd.seStudent("1001");
	}

}
