import java.net.*;
import java.io.*;
import java.util.*;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;


public class Client {

    public static String encrypt(String password, String key){
        try {
            byte [] keyData = (key).getBytes();
            SecretKeySpec secretKeySpec = new SecretKeySpec(keyData, "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte [] hasil = cipher.doFinal(password.getBytes());
            return new String(Base64.getEncoder().encode(hasil));
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static String decrypt(String string, String key){
        try {
            byte [] keyData = (key).getBytes();
            SecretKeySpec secretKeySpec = new SecretKeySpec(keyData, "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
            byte [] hasil = cipher.doFinal(java.util.Base64.getDecoder().decode(string));
            return new String(hasil);
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static String ceasar_en(String text, int key){
        String c_cipher = "";
        char letter;

        for(int i = 0; i<text.length(); i++){

            letter = text.charAt(i);

            if((int)letter >= 32 && (int)letter <= 126){

                if((int)letter + key > 126 || (int)letter + key < 32){
                    letter = (char)(letter + 32 - 126 - 1);
                }
                else{
                    letter = (char)(letter + key);
                }
            }
            c_cipher = c_cipher + letter;
        }

        return c_cipher;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String pstr, gstr, Astr;
            String serverName = "localhost";
            int port = 8088;

            // Declare p, g, and Key of client
            int p = 23;///
            int g = 5;/// Private key =(g^b)modp
            int a = 6;///Public key=(g^a)modp
            double Adash, serverB;

            // Established the connection
            System.out.println("Connecting to " + serverName
                    + " on port " + port);
            Socket client = new Socket(serverName, port);
            System.out.println("Just connected to "
                    + client.getRemoteSocketAddress());

            // Sends the data to client
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);

            pstr = Integer.toString(p);
            out.writeUTF(pstr); // Sending p

            gstr = Integer.toString(g);
            out.writeUTF(gstr); // Sending g

            double A = ((Math.pow(g, a)) % p); // calculation of A
            Astr = Double.toString(A);
            out.writeUTF(Astr); // Sending A

            // Client's Private Key
            System.out.println("From Client : Private Key = " + a);

            // Accepts the data
            DataInputStream in = new DataInputStream(client.getInputStream());

            serverB = Double.parseDouble(in.readUTF());
            System.out.println("From Server : Public Key = " + serverB);

            Adash = (int)((Math.pow(serverB, a)) % p); // calculation of Adash


            int ses_key = (int)Adash;

            System.out.println("Secret Key to perform Symmetric Encryption = " + ses_key);
            System.out.println("Enter a codeword: ");
            String codeword = sc.next();
            out.writeUTF(codeword);

            StringBuffer sb = new StringBuffer(ceasar_en(codeword, ses_key));
            String s_key = sb.toString();



            System.out.println("Enter a message: ");
            String mes = sc.next();
            mes = encrypt(mes, s_key);
            out.writeUTF(mes);
            String mes_2 = in.readUTF();
            mes_2 = decrypt(mes_2, s_key);

            System.out.println("Server responces: " + mes_2);

            client.close();

        } catch (UnknownHostException unknownHostException) {
            unknownHostException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }
}