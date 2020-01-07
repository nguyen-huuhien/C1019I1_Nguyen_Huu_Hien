package b6_CauTrucDuLieuVaGiaiThuatCoBan.BT.TrienKhaiCacPhuongThucCuaArrayListTheoThuVienJaVa_ulti_arrlist;

public class TestMyArrList {
    public static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Student() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


    }

    public static void main(String[] args) {
        Student a = new Student(135,"Tuan");
        Student b = new Student(125,"Dung");
        Student c = new Student(158,"Manh");
        Student d = new Student(551,"Lien");
        Student e = new Student(156,"Can");
        Student g = new Student(888,"Death");

        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(a);
        studentMyList.add(b);
        studentMyList.add(c);
        studentMyList.add(d);
        studentMyList.add(e);
        studentMyList.add(g,2);


        for (int i = 0; i < studentMyList.size() ; i++) {
            Student student = (Student) studentMyList.elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());
        }

    }
}
