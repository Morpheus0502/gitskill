import java.util.Scanner;

public class PasswordEncryption {
    
    public static void main(String[] args) {
        
        int choice;
        int num;
        
        Scanner input = new Scanner(System.in);
        
        do {//循环
            System.out.println("请选择操作：");
            System.out.println("1. 加密");
            System.out.println("2. 解密");
            System.out.println("3. 退出");
            choice = input.nextInt();
            
            switch (choice) {//根据用户选择的操作执行相应的方法
                case 1:
                    System.out.println("请输入要加密的数字密码：");
                    num = input.nextInt();
                    System.out.println("加密后的密码为：" + encrypt(num));
                    break;//如果用户选择加密操作，则执行加密方法，并输出加密后的密码
                case 2:
                    System.out.println("请输入要解密的数字密码：");
                    num = input.nextInt();
                    System.out.println("解密后的密码为：" + decrypt(num));
                    break;
                case 3:
                    System.out.println("感谢使用，再见！");
                    break;
                default:
                    System.out.println("无效的操作选择！");
                    break;
            }
        } while (choice != 3);//如果用户没有选择退出操作，则继续循环
    }
    
    public static int encrypt(int num) {//加密
        int encryptedNum = 0;
        
        while (num > 0) {
            int digit = num % 10;
            int newDigit = (digit + 5) % 10;
            encryptedNum = encryptedNum * 10 + newDigit;
            num = num / 10;
        }
        
        return encryptedNum;//返回加密后的数字密码
    }
    
    public static int decrypt(int num) {//解密
        int decryptedNum = 0;
        
        while (num > 0) {
            int digit = num % 10;
            int newDigit = (digit - 5) % 10;
            decryptedNum = decryptedNum * 10 + newDigit;
            num = num / 10;
        }
        
	return decryptedNum;//返回解密后的数字密码
   }
}