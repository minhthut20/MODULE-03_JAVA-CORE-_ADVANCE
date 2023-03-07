package Exam_B2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student[] studentList = new Student[200];
        int[]  sizeArray = {200};
        int option;
        boolean inputStatus = false;
        do {
            System.out.print("\n****************HACKATHON-JAVA-ADVANCE-1-MENU***************\n" +
                    "1. Nhập số sinh viên và nhập thông tin cho các sinh viên\n" +
                    "2. In thông tin các sinh viên đang quản lý\n" +
                    "3. Sắp xếp các sinh viên theo điểm trung bình tăng dần\n" +
                    "4. Nhập vào tên sinh viên và tìm kiếm sinh viên theo tên\n" +
                    "5. Thống kê số sinh viên nam, nữ đang quản lý\n" +
                    "6. In ra thông tin các sinh viên xếp loại giỏi và trung bình\n" +
                    "7. Thoát\n");
            System.out.print("Nhập chức năng muốn thực thi: ");
            option = input.nextInt();
            if (option != 7) {
                switch (option) {
                    case 1:
                        studentProduct(studentList,sizeArray);
                        break;
                    case 2:
                        printStudent(studentList,sizeArray);
                        break;
                    case 3:
                        shortPoint(studentList,sizeArray);
                        break;
                    case 4:
                        findName(studentList,sizeArray);
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại");
                        break;
                }
            } else {
                System.out.println("Ứng dụng sẽ được kết thúc!!!");
            }
        } while (option != 7);
    }

    //B1. Nhập số sinh viên và nhập thông tin cho các sinh viên
    public static void studentProduct(Student[] studentList, int[] sizeArray ) {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.print("Nhập độ dài của mảng : ");
            size = input.nextInt();
            if (size > 200) {
                System.out.print("Dộ dài mảng không quá 100 phần tử ");
            }
        }
        while (size > 200);
        sizeArray[0] = size;
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập vào phần tử thứ  " + (i + 1) + " :\n");
            studentList[i] = new Student();
            studentList[i].inputData();
        }
        System.out.println("Đã nhập thành công ");
    }

    //B2.  In thông tin các sinh viên đang quản lý
    public static void printStudent(Student[] studentList, int[] sizeArray) {
        Scanner input = new Scanner(System.in);
        int size = sizeArray[0];
        System.out.println("Các phần tử trong mảng : ");
        for (int i = 0; i < size; i++) {
            System.out.println("\nThông tin sinh viên thứ " + (i + 1) + " :\n");
            studentList[i].displayData();
        }
    }

    //B3. Sắp xếp các sinh viên theo điểm trung bình tăng dần
    public static void shortPoint(Student[] studentList, int[] sizeArray) {
        int size = sizeArray[0];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (studentList[j].getAvgMark()>studentList[i].getAvgMark()){
                    Student temp = studentList[j];
                    studentList[j] = studentList[i];
                    studentList[i] = temp;
                }
            }
        }
        printStudent(studentList,sizeArray);
    }

    //B4. Nhập vào tên sinh viên và tìm kiếm sinh viên theo tên
    public static void findName(Student[] studentList, int[] sizeArray) {
        Scanner input = new Scanner(System.in);
        int size = sizeArray[0];
        System.out.print("Nhập vào tên sinh viên cần tìm kiếm : ");
        String searchValue = input.nextLine();
        for (int i = 0; i < size; i++) {
            if (studentList[i].getStudentName().equals(searchValue)){
                studentList[i].displayData();
            }
        }
    }


}
