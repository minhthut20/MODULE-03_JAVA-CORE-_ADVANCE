package Exam_B2;

import java.util.Scanner;
import java.time.Year;

public class Student {
    String studentId, studentName;
    int age;
    String sex;
    String phone, address;
    float html, css, js, avgMark;

    public Student() {
    }

    public Student(String studentId, String studentName, int age, String sex, String phone, String address, float html, float css, float js, float avgMark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
        this.address = address;
        this.html = html;
        this.css = css;
        this.js = js;
        this.avgMark = avgMark;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setHtml(float html) {
        this.html = html;
    }

    public void setCss(float css) {
        this.css = css;
    }

    public void setJs(float js) {
        this.js = js;
    }

    public void setAvgMark(float avgMark) {
        this.avgMark = avgMark;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public float getHtml() {
        return html;
    }

    public float getCss() {
        return css;
    }

    public float getJs() {
        return js;
    }

    public float getAvgMark() {
        return avgMark;
    }

    public void calAvgMark() {
        avgMark = (html+css+2*js)/4;
    }

    public void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nh???p v??o m?? sinh vi??n : ");
        this.setStudentId(input.nextLine());
        System.out.print("Nh???p v??o t??n sinh vi??n : ");
        this.setStudentName(input.nextLine());
        System.out.print("Nh???p v??o tu???i sinh vi??n : ");
        this.setAge(input.nextInt());
        input.nextLine();
        System.out.print("Nh???p v??o gi???i t??nh sinh vi??n : ");
        this.setSex(input.nextLine());
        System.out.print("Nh???p v??o s??? ??i???n tho???i c???a sinh vi??n : ");
        this.setPhone(input.nextLine());
        System.out.print("Nh???p v??o ?????a ch??? c???a sinh vi??n : ");
        this.setAddress(input.nextLine());
        System.out.print("Nh???p v??o ??i???m HTML : ");
        this.setHtml(input.nextFloat());
        System.out.print("Nh???p v??o ??i???m CSS : ");
        this.setCss(input.nextFloat());
        System.out.print("Nh???p v??o ??i???m JavaScript : ");
        this.setJs(input.nextFloat());
    }

    public void displayData() {
        calAvgMark();
        int currentYear = Year.now().getValue();
        int birthYear = currentYear - getAge();
        System.out.printf("%-20s%-20s%-20s%-20s\n" +
                        "%-20s%-20d%-20s%-20s%-20s%-20s\n" +
                        "%-40s%-40s%-20s%-20.2f",
                "M?? sinh vi??n: ", getStudentId(), "T??n sinh vi??n: ", getStudentName(),
                "N??m sinh: ", birthYear, "Gi???i t??nh: ", getSex(), "??i???n tho???i: ", getPhone(),
                "?????a ch???: ", getAddress(), "??i???m trung b??nh: ", getAvgMark());
    }
}
