import java.util.Scanner;

public class CountCharInStr {
    public static void main(String[] args) {
        String str = "What are you truly desire?";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ký tự cần tìm: ");
        char findChar = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(findChar==str.charAt(i)){
                count++;
            }
        }
        System.out.println("\nChuỗi cho trước là: "+ str);
        System.out.println("Số lần ký tự xuất hiện trong chuỗi là: "+ count);
    }
}
