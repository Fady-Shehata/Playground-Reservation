package playground;

import java.util.Scanner;

class Client {
    public String Email, Password, Name;
    public int ClientId;
    public int VerificationCode;
    public boolean verified;
    public static int ClientCount = 1;
    public static int ClientType;
    static Scanner scanner = new Scanner(System.in);

    public Client(String email, String password, String name, int verificationCode, int clientType) {
        Email = email;
        Password = password;
        Name = name;
        ClientId = ClientCount;
        ClientCount++;
        VerificationCode = verificationCode;
        verified = false;
        ClientType = clientType;
    }

    public void verify(int vf)
    {
        if(vf == VerificationCode)
            verified = true;
        else
            System.out.println("wrong verification code");
    }
}
