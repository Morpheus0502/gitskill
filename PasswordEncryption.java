import java.util.Scanner;

public class PasswordEncryption {
    
    public static void main(String[] args) {
        
        int choice;
        int num;
        
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.println("请选择操作：");
            System.out.println("1. 加密");
            System.out.println("2. 解密");
            System.out.println("3. 退出");
            choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("请输入要加密的数字密码：");
                    num = input.nextInt();
                    System.out.println("加密后的密码为：" + encrypt(num));
                    break;
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
        } while (choice != 3);
    }
    
    public static int encrypt(int num) {
        int encryptedNum = 0;
        
        while (num > 0) {
            int digit = num % 10;
            int newDigit = (digit + 5) % 10;
            encryptedNum = encryptedNum * 10 + newDigit;
            num = num / 10;
        }
        
        return encryptedNum;
    }
    
    public static int decrypt(int num) {
        int decryptedNum = 0;
        
        while (num > 0) {
            int digit = num % 10;
            int newDigit = (digit - 5) % 10;
            decryptedNum = decryptedNum * 10 + newDigit;
            num = num / 10;
        }
        
	return decryptedNum;
   }
}