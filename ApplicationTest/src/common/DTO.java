package common;

public class DTO {
    public class UserDTO {
        private int student_id;
        private String student_name;
        private String student_class;
        private String student_addr;
        private String student_tel;
        private int student_kor;
        private int student_eng;
        private int student_math;

        public UserDTO(int student_id, String student_name, String student_class, String student_addr, String student_tel, int student_kor, int student_eng, int student_math) {
            this.student_id = student_id;
            this.student_name = student_name;
            this.student_class = student_class;
            this.student_addr = student_addr;
            this.student_tel = student_tel;
            this.student_kor = student_kor;
            this.student_eng = student_eng;
            this.student_math = student_math;
        }

        // Getters and Setters

        public int getStudent_id() {
            return student_id;
        }

        public void setStudent_id(int student_id) {
            this.student_id = student_id;
        }

        public String getStudent_name() {
            return student_name;
        }

        public void setStudent_name(String student_name) {
            this.student_name = student_name;
        }

        public String getStudent_class() {
            return student_class;
        }

        public void setStudent_class(String student_class) {
            this.student_class = student_class;
        }

        public String getStudent_addr() {
            return student_addr;
        }

        public void setStudent_addr(String student_addr) {
            this.student_addr = student_addr;
        }

        public String getStudent_tel() {
            return student_tel;
        }

        public void setStudent_tel(String student_tel) {
            this.student_tel = student_tel;
        }

        public int getStudent_kor() {
            return student_kor;
        }

        public void setStudent_kor(int student_kor) {
            this.student_kor = student_kor;
        }

        public int getStudent_eng() {
            return student_eng;
        }

        public void setStudent_eng(int student_eng) {
            this.student_eng = student_eng;
        }

        public int getStudent_math() {
            return student_math;
        }

        public void setStudent_math(int student_math) {
            this.student_math = student_math;
        }
    }
}